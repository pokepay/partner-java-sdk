// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.BulkCreateTransaction;
import jp.pokepay.partnerapi.request.Request;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BulkCreateTransactionTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new BulkCreateTransaction(
            "eLBlKmUuSkMPzawbAj8npe1ob",
            "ShwMQ",
            "UbNfuhAnuO9NVmvRp5bMpuBj16czy5GFgPlI"
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
        Request request = new BulkCreateTransaction(
            "eLBlKmUuSkMPzawbAj8npe1ob",
            "ShwMQ",
            "UbNfuhAnuO9NVmvRp5bMpuBj16czy5GFgPlI"
        )
                .privateMoneyId("f0bd8616-0342-4a63-a22d-34c4f8a0c4ae");
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
    void test2() throws ConnectionError, ProcessingError {
        Request request = new BulkCreateTransaction(
            "eLBlKmUuSkMPzawbAj8npe1ob",
            "ShwMQ",
            "UbNfuhAnuO9NVmvRp5bMpuBj16czy5GFgPlI"
        )
                .description("bG8sjrlMUHkYyTixoeODuLv4IfkRtldhpD9qiM64FWz594XPu4tW7fqFsiwTYtSGfbGUBc")
                .privateMoneyId("7ea9bb1e-848b-44ad-8a4c-b5338391ef32");
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
