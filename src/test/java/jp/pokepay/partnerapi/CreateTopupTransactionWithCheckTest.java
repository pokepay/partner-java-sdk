package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.CreateTopupTransactionWithCheck;
import jp.pokepay.partnerapi.request.Request;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreateTopupTransactionWithCheckTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new CreateTopupTransactionWithCheck(
            "fc927ba4-6e53-4bc5-85dc-7b3a15365cd0",
            "12287e11-c28e-484f-b565-2f314500fe51"
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
