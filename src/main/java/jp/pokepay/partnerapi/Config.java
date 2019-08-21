package jp.pokepay.partnerapi;

import java.io.*;
import java.util.Properties;

class Config {
    private static final Config config = new Config();

    public String clientID;
    public String clientSecret;
    public String baseUrl;
    public String p12File;
    public String p12Password;

    public static Config getConfig() {
        return config;
    }

    public void load(File file) throws ConfigFileNotFoundException, ProcessingError {
        Properties properties = new Properties();
        InputStream inputStream;
        try {
            inputStream = new FileInputStream(file);
        } catch (FileNotFoundException ex) {
            throw new ConfigFileNotFoundException();
        }
        try {
            properties.load(inputStream);
            inputStream.close();
        } catch (IOException ex) {
            throw new ProcessingError(ex.getMessage());
        }
        this.clientID = properties.getProperty("CLIENT_ID");
        this.clientSecret = properties.getProperty("CLIENT_SECRET");
        this.baseUrl = properties.getProperty("API_BASE_URL");
        this.p12File = properties.getProperty("PKCS12_FILE");
        this.p12Password = properties.getProperty("PKCS12_PASSWORD");
    }
}
