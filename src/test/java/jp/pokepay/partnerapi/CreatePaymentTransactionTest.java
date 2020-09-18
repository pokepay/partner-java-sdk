// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.CreatePaymentTransaction;
import jp.pokepay.partnerapi.request.Request;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreatePaymentTransactionTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new CreatePaymentTransaction(
            "156d5eb7-7a4d-476b-af36-8d2ab9a4c571",
            "09176af8-cf6c-408d-897d-8054f41d78fd",
            "8d7939a0-f115-4d67-bd08-408e9a14a861",
            1580
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
        Request request = new CreatePaymentTransaction(
            "156d5eb7-7a4d-476b-af36-8d2ab9a4c571",
            "09176af8-cf6c-408d-897d-8054f41d78fd",
            "8d7939a0-f115-4d67-bd08-408e9a14a861",
            1580
        )
                .description("sH11ZahWwt0KCw4FDQO05qLTqGDb");
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
