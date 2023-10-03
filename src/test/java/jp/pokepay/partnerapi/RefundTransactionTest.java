// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.RefundTransaction;
import jp.pokepay.partnerapi.request.Request;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RefundTransactionTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new RefundTransaction(
            "0872be14-d7bc-4da7-b080-b61946532afa"
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
        Request request = new RefundTransaction(
            "0872be14-d7bc-4da7-b080-b61946532afa"
        )
                .returningPointExpiresAt("2022-08-27T13:17:10.000000+09:00");
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
        Request request = new RefundTransaction(
            "0872be14-d7bc-4da7-b080-b61946532afa"
        )
                .description("8zHF5mnetJol0g7uhhZVwBBSB9NQuG198o4cE8ye8xiCptr8X3OQSs9cvMVMzYpfEHHq4AVCPhpFJVl2NE9OohrFLhv")
                .returningPointExpiresAt("2016-01-13T12:15:33.000000+09:00");
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
