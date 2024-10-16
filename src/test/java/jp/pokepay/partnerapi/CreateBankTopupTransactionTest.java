// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.CreateBankTopupTransaction;
import jp.pokepay.partnerapi.request.Request;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreateBankTopupTransactionTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new CreateBankTopupTransaction(
            "eae535ff-5685-4921-bcbd-740d68355f05",
            "2d0004fa-3df9-4790-a6c3-2e4d8cb93aab",
            4420,
            "50da505b-1a2a-43b6-b234-c9da39d2185e",
            "5254fac9-c835-443a-baaf-5a67dc14e889"
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
    @Test
    void test1() throws ConnectionError, ProcessingError {
        Request request = new CreateBankTopupTransaction(
            "eae535ff-5685-4921-bcbd-740d68355f05",
            "2d0004fa-3df9-4790-a6c3-2e4d8cb93aab",
            4420,
            "50da505b-1a2a-43b6-b234-c9da39d2185e",
            "5254fac9-c835-443a-baaf-5a67dc14e889"
        )
                .receiverUserId("c581ccb9-aa16-41e2-bec4-09ae24384255");
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
