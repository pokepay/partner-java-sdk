package jp.pokepay.partnerapi;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.*;
import java.security.cert.CertificateException;

class HttpClient {
    private Config config;
    private boolean alreadyInitialized = false;

    private boolean isHttps() {
        return !config.baseUrl.startsWith("http://");
    }

    public HttpClient(Config config) throws P12FileNotFoundException, SSLInitializeError {
        this.config = config;
        if (isHttps())
            initSSL();
    }

    private void initSSL() throws P12FileNotFoundException, SSLInitializeError {
        if (alreadyInitialized) {
            return;
        }
        alreadyInitialized = true;
        FileInputStream inputStream;
        try {
            inputStream = new FileInputStream(config.p12File);
        } catch (FileNotFoundException ex) {
            throw new P12FileNotFoundException();
        }

        KeyStore keyStore;
        try {
            keyStore = KeyStore.getInstance("PKCS12");
        } catch (KeyStoreException ex) {
            throw new SSLInitializeError(ex);
        }
        try {
            keyStore.load(inputStream, config.p12Password.toCharArray());
        } catch (IOException | NoSuchAlgorithmException | CertificateException ex) {
            throw new SSLInitializeError(ex);
        }

        KeyManagerFactory kmf;
        try {
            kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
        } catch (NoSuchAlgorithmException ex) {
            throw new SSLInitializeError(ex);
        }

        try {
            kmf.init(keyStore, config.p12Password.toCharArray());
        } catch (KeyStoreException | NoSuchAlgorithmException | UnrecoverableKeyException ex) {
            throw new SSLInitializeError(ex);
        }

        SSLContext sslContext;
        try {
            sslContext = SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException ex) {
            throw new SSLInitializeError(ex);
        }
        try {
            sslContext.init(kmf.getKeyManagers(), null, null);
        } catch (KeyManagementException ex) {
            throw new SSLInitializeError(ex);
        }

        HttpsURLConnection.setDefaultSSLSocketFactory(sslContext.getSocketFactory());
    }

    private URL ensureURL(String path) throws ProcessingError {
        try {
            return new URL(config.baseUrl + path);
        } catch (MalformedURLException ex) {
            throw new ProcessingError(ex);
        }
    }

    private Response processResponse(HttpURLConnection conn) throws IOException {
        int status = conn.getResponseCode();
        boolean success = HttpURLConnection.HTTP_OK <= status && status < HttpURLConnection.HTTP_MULT_CHOICE;
        InputStream in = success ? conn.getInputStream() : conn.getErrorStream();
        if (in == null) {
            return new Response(status, "");
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        StringBuilder buffer = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            buffer.append(line);
        }
        return new Response(status, buffer.toString());
    }

    private HttpURLConnection openConnection(URL url) throws IOException {
        return isHttps() ? ((HttpsURLConnection) url.openConnection()) : ((HttpURLConnection) url.openConnection());
    }

    public Response get(String path, String body) throws ProcessingError, ConnectionError {
        URL url = ensureURL(path);
        try {
            HttpURLConnection conn = openConnection(url);
            conn.setRequestMethod("GET");
            conn.setRequestProperty("accept", "application/json");
            conn.setRequestProperty("accept", "*/*");
            if (body != null) {
                conn.setDoOutput(true);
                conn.setRequestProperty("Accept-Language", "jp");
                conn.setRequestProperty("Content-Type", "application/json; charset=utf-8");
                conn.setRequestProperty("Content-Length", String.valueOf(body.length()));
                OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream());
                out.write(body);
                out.flush();
                out.close();
            }
            conn.connect();
            return processResponse(conn);
        } catch (IOException ex) {
            throw new ConnectionError(ex);
        }
    }

    public Response post(String path, String body, String acceptLanguage) throws ProcessingError, ConnectionError {
        URL url = ensureURL(path);
        try {
            HttpURLConnection conn = openConnection(url);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("accept", "application/json");
            conn.setRequestProperty("accept", "*/*");
            if (body != null) {
                conn.setDoOutput(true);
                conn.setRequestProperty("Accept-Language", acceptLanguage);
                conn.setRequestProperty("Content-Type", "application/json; charset=utf-8");
                conn.setRequestProperty("Content-Length", String.valueOf(body.length()));
                OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream());
                out.write(body);
                out.flush();
                out.close();
            }
            conn.connect();
            return processResponse(conn);
        } catch (IOException ex) {
            throw new ConnectionError(ex);
        }
    }

    class Response {
        private int status;
        private String body;

        public Response(int status, String body) {
            this.status = status;
            this.body = body;
        }

        public int getStatus() {
            return this.status;
        }

        public String getBody() {
            return this.body;
        }

        public boolean isSuccess() {
            return HttpURLConnection.HTTP_OK <= status && status < HttpURLConnection.HTTP_MULT_CHOICE;
        }
    }
}
