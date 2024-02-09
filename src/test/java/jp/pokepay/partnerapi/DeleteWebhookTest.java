// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.DeleteWebhook;
import jp.pokepay.partnerapi.request.Request;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DeleteWebhookTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new DeleteWebhook(
            "f09ba024-80a2-44cf-9a60-7e9d56f684b1"
        );
        try {
            PartnerAPITest.getClient().send(request);
        } catch (PartnerRequestError e) {
            if (e.getType().equals("invalid_parameters")) {
                System.out.println(e.getType());
                System.out.println(e.getMessage());
                System.out.println(e.getRawJson());
            }
            assertNotEquals("invalid_parameters", e.getType());
        }
    }
}
