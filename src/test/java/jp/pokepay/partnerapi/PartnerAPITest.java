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

    @Nested
    class CreateCheckTest {
        @Test
        void accountNotFound() {
            try {
                client.send(new CreateCheck(UUID.randomUUID().toString()));
                fail();
            } catch (PartnerRequestError err) {
                assertEquals(err.getType(), "account_not_accessible");
                assertEquals(err.getMessage(), "The account is not accessible by this user");
            } catch (ConnectionError connectionError) {
                fail(connectionError.getMessage());
            } catch (ProcessingError processingError) {
                fail(processingError.getMessage());
            }
        }

        @Test
        void accountUserIsNotUserOfOrganization() {
            try {
                client.send(new CreateCheck("0909dd82-f3c9-4dff-821b-a3850479447b"));
                fail();
            } catch (PartnerRequestError err) {
                assertEquals(err.getType(), "account_user_is_not_user_of_organization");
                assertEquals(err.getMessage(), "The account user is not a user of this admin-user's organization");
            } catch (Exception ex) {
                fail(ex.getMessage());
            }
        }

        @Test
        void invalidParameters() {
            try {
                client.send(new CreateCheck("06636a0b-655f-4cf2-9eda-c14beef291b1"));
                fail();
            } catch (PartnerRequestError err) {
                assertEquals(err.getType(), "invalid_parameters");
                assertEquals(err.getMessage(), "Invalid parameters");
            } catch (Exception ex) {
                fail(ex.getMessage());
            }
        }

        @Test
        void createCheck() {
            try {
                String id = "06636a0b-655f-4cf2-9eda-c14beef291b1";
                CreateCheck request = new CreateCheck(id).amount(1);
                Check check = (Check) client.send(request);
                assertEquals(check.getAmount(), 1);
                assertEquals(check.getPointAmount(), 0);
                assertEquals(check.getMoneyAmount(), 1);
            } catch (Exception ex) {
                fail(ex.getMessage());
            }
        }
    }
}
