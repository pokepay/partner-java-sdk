package jp.pokepay.partnerapi;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import jp.pokepay.partnerapi.request.Request;
import jp.pokepay.partnerapi.response.Pong;
import jp.pokepay.partnerapi.response.Response;

import java.io.File;
import java.security.Security;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.UUID;

public class PartnerAPI {
    private Config config;
    private HttpClient httpClient;
    private Crypto crypto;
    private Gson gson;

    public PartnerAPI(File configFile) throws ProcessingError, ConfigFileNotFoundException,
            P12FileNotFoundException, SSLInitializeError {
        Security.setProperty("crypto.policy", "unlimited");
        config = Config.getConfig();
        config.load(configFile);
        httpClient = new HttpClient();
        crypto = new Crypto(config.clientSecret);
        gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
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

    private String constructContent(String requestData) throws ProcessingError {
        JsonBuilder builder = new JsonBuilder();
        builder.append("partner_client_id", config.clientID);
        builder.append("data", constructContentData(requestData));
        return builder.toString();
    }

    public Pong ping() throws ProcessingError, ConnectionError {
        HttpClient.Response response = httpClient.get("/ping", null);
        return gson.fromJson(response.getBody(), Pong.class);
    }

    private String parametersToJson(Map<String, Object> parameters) {
        if (parameters == null) return "";
        JsonBuilder builder = new JsonBuilder();
        for (Map.Entry<String, Object> entry : parameters.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            builder.append(key, value);
        }
        return builder.toString();
    }

    private String parametersToQuery(Map<String, Object> parameters) {
        if (parameters == null) return "";
        StringBuilder builder = new StringBuilder();
        boolean first = true;
        for (Map.Entry<String, Object> entry : parameters.entrySet()) {
            builder.append(first ? '?' : '&');
            first = false;
            String key = entry.getKey();
            Object value = entry.getValue();
            builder.append(key);
            builder.append('=');
            builder.append(value);
        }
        return builder.toString();
    }

    public Response send(Request request) throws ProcessingError, ConnectionError, PartnerRequestError {
        switch (request.method()) {
            case POST: {
                Map<String, Object> parameters = request.parameters();
                String requestData = parametersToJson(parameters);
                HttpClient.Response response = httpClient.post(request.path(), constructContent(requestData));
                JsonResponse json = gson.fromJson(response.getBody(), JsonResponse.class);
                if (json.responseData == null) {
                    ErrorResponse errorResponse = gson.fromJson(response.getBody(), ErrorResponse.class);
                    throw new PartnerRequestError(errorResponse.type, errorResponse.message);
                }
                String responseData = crypto.decode(json.responseData);
                ErrorResponse errorResponse = gson.fromJson(responseData, ErrorResponse.class);
                if (!errorResponse.isValid()) {
                    return gson.fromJson(responseData, request.getResponseClass());
                } else {
                    throw new PartnerRequestError(errorResponse.type, errorResponse.message);
                }
            }
            default:
                throw new ProcessingError(request.method() + "does not support");
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
