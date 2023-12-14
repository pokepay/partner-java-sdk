package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.CreateCheck;
import jp.pokepay.partnerapi.request.SendEcho;
import jp.pokepay.partnerapi.response.Check;
import jp.pokepay.partnerapi.response.Echo;
import jp.pokepay.partnerapi.response.Pong;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.io.File;
import java.nio.file.Paths;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class PartnerAPITest {
    private static PartnerAPI client;

    public static PartnerAPI getClient() {
        if (client == null) {
            try {
                init();
            } catch (SSLInitializeError sslInitializeError) {
                sslInitializeError.printStackTrace();
            } catch (P12FileNotFoundException e) {
                e.printStackTrace();
            } catch (ProcessingError processingError) {
                processingError.printStackTrace();
            } catch (ConfigFileNotFoundException e) {
                e.printStackTrace();
            }
        }
        return client;
    }

    public static String randomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        char[] s = new char[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            s[i] = characters.charAt(random.nextInt(characters.length()));
        }
        return String.valueOf(s);
    }

    @BeforeAll
    static void init() throws SSLInitializeError, P12FileNotFoundException, ProcessingError, ConfigFileNotFoundException {
        File file = Paths.get(System.getProperty("user.home")).resolve(".pokepay/config.properties").toFile();
        client = new PartnerAPI(file);
    }

    @Test
    void ping() {
        try {
            Pong pong = client.ping();
            assertEquals("ok", pong.getPong());
        } catch (ProcessingError processingError) {
            processingError.printStackTrace();
        } catch (ConnectionError connectionError) {
            connectionError.printStackTrace();
        }
    }

    @Test
    void echo() {
        try {
            Echo echo = (Echo) client.send(new SendEcho("hello"));
            assertEquals("ok", echo.getStatus());
            assertEquals("hello", echo.getMessage());
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
}
