// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.CreateTopupTransactionWithCheck;
import jp.pokepay.partnerapi.request.Request;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreateTopupTransactionWithCheckTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new CreateTopupTransactionWithCheck(
            "5d5c460c-d03d-491d-b8a7-3fe397f37d8d",
            "800474b9-8553-43f3-a3fa-873e12259ad1"
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
        Request request = new CreateTopupTransactionWithCheck(
            "5d5c460c-d03d-491d-b8a7-3fe397f37d8d",
            "800474b9-8553-43f3-a3fa-873e12259ad1"
        )
                .requestId("e8fe6488-a7ba-46e4-8f9c-7e3293c7d38d");
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
