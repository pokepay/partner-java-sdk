// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.CreateTopupTransactionWithCheck;
import jp.pokepay.partnerapi.request.Request;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreateTopupTransactionWithCheckTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new CreateTopupTransactionWithCheck(
            "b082532d-a6b8-4129-b644-6e719e6d1e41",
            "bee291c1-ec9f-4896-ab39-9a3335178622"
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
