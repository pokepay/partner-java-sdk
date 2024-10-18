package jp.pokepay.partnerapi;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import jp.pokepay.partnerapi.request.Request;
import jp.pokepay.partnerapi.request.serializer.SerializerHelper;
import jp.pokepay.partnerapi.response.Pong;
import jp.pokepay.partnerapi.response.Response;

import java.io.File;
import java.security.Security;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import java.util.Arrays;
import java.lang.reflect.Field;

public class PartnerAPI {
    private Config config;
    private HttpClient httpClient;
    private Crypto crypto;
    private GsonBuilder gsonBuilder;
    private Gson gson;
    private static final int MAX_RETRIES = 2;

    public PartnerAPI(File configFile) throws ProcessingError, ConfigFileNotFoundException,
            P12FileNotFoundException, SSLInitializeError {
        Security.setProperty("crypto.policy", "unlimited");
        config = new Config(configFile);
        httpClient = new HttpClient(config);
        crypto = new Crypto(config.clientSecret);
        gsonBuilder = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
        SerializerHelper.registerTypeAdapters(gsonBuilder);
        gson = gsonBuilder.create();
    }

    private String nowTimeString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
        return sdf.format(new Date());
    }

    private String constructContentData(String requestData) throws ProcessingError {
        JsonBuilder builder = new JsonBuilder();
        if (requestData == null) {
            builder.appendRaw("request_data", "[]");
        } else {
            builder.appendRaw("request_data", requestData);
        }
        builder.append("timestamp", nowTimeString());
        builder.append("partner_call_id", UUID.randomUUID().toString());
        return crypto.encode(builder.toString());
    }

    private String constructContent(String requestMethod, String requestData) throws ProcessingError {
        JsonBuilder builder = new JsonBuilder();
        builder.append("request_method", requestMethod);
        builder.append("partner_client_id", config.clientID);
        builder.append("data", constructContentData(requestData));
        return builder.toString();
    }

    public Pong ping() throws ProcessingError, ConnectionError {
        HttpClient.Response response = httpClient.get("/ping", null);
        return gson.fromJson(response.getBody(), Pong.class);
    }

    private boolean isRetriable(Request request) {
        String[] retriableMethods = {"GET", "PATCH"};
        if (Arrays.asList(retriableMethods).contains(request.method().toString())) {
          return true;
        }
        try {
            Field field = request.getClass().getDeclaredField("requestId");
            field.setAccessible(true);
            boolean hasRequestId = field.get(request) != null;
            field.setAccessible(false);
            return hasRequestId;
        } catch (NoSuchFieldException ex) {
        } catch (IllegalAccessException ex) { }
        return false;
    }

    public Response send(Request request) throws ProcessingError, ConnectionError, PartnerRequestError {
        Integer retry = 0;
        boolean isRetriable = isRetriable(request);
        String requestData = gson.toJson(request);
        int statusCode = 0;
        while (true) {
            try {
                HttpClient.Response response = httpClient.post(request.path(), constructContent(request.method().toString(), requestData), config.acceptLanguage);
                statusCode = response.getStatus();
                JsonResponse json = gson.fromJson(response.getBody(), JsonResponse.class);
                if (json.responseData == null) {
                    ErrorResponse errorResponse = gson.fromJson(response.getBody(), ErrorResponse.class);
                    throw new PartnerRequestError(errorResponse.type, errorResponse.message, response.getBody());
                }
                String responseData = crypto.decode(json.responseData);
                ErrorResponse errorResponse = gson.fromJson(responseData, ErrorResponse.class);
                if (!errorResponse.isValid()) {
                    return gson.fromJson(responseData, request.getResponseClass());
                } else {
                    throw new PartnerRequestError(errorResponse.type, errorResponse.message, responseData);
                }
            } catch (ConnectionError ex) {
                if (this.MAX_RETRIES <= retry || !isRetriable) {
                    throw ex;
                }
            } catch (PartnerRequestError ex) {
                if (ex.getType().equals("request_id_conflict")) {
                    throw new RequestIdConflict(ex.getType(), ex.getMessage(), ex.getRawJson());
                }
                if (!isRetriable) {
                    throw ex;
                }
                if (!(statusCode == 503 && retry < this.MAX_RETRIES)) {
                    throw ex;
                }
            }
            ++retry;
        }
    }

    private class JsonResponse {
        public String responseData;
        public String timestamp;
        public String partnerCallId;
    }

    private class ErrorResponse {
        public String type;
        public String message;

        public boolean isValid() {
            return type != null && message != null;
        }
    }
}
