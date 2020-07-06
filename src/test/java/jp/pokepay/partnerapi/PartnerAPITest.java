package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.CreateCheck;
import jp.pokepay.partnerapi.request.CreateEcho;
import jp.pokepay.partnerapi.response.Check;
import jp.pokepay.partnerapi.response.Echo;
import jp.pokepay.partnerapi.response.Pong;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.nio.file.Paths;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class PartnerAPITest {
    private static PartnerAPI client;

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
            Echo echo = (Echo) client.send(new CreateEcho("hello"));
            assertEquals("ok", echo.getStatus());
            assertEquals("hello", echo.getMessage());
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
}
