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
            "7e342d5f-09fd-44a5-9b9d-5a35b601648e",
            "b5e7662a-b887-4922-80e8-a88a72cf0e7e"
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