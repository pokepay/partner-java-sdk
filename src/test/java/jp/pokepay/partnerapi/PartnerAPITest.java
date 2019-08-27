package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.CreateEcho;
import jp.pokepay.partnerapi.response.Echo;
import jp.pokepay.partnerapi.response.Pong;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PartnerAPITest {

    private PartnerAPI client;

    @BeforeEach
    void init() throws SSLInitializeError, P12FileNotFoundException, ProcessingError, ConfigFileNotFoundException {
        File file = Paths.get(System.getProperty("user.home")).resolve(".pokepay/config.properties").toFile();
        client = new PartnerAPI(file);
    }

    @Test
    void ping() {
        try {
            Pong pong = client.ping();
            assertEquals(pong.getPong(), "ok");
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
            assertEquals(echo.getStatus(), "ok");
            assertEquals(echo.getMessage(), "hello");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void send() {

    }
}