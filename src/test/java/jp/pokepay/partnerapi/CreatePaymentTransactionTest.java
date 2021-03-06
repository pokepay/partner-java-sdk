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
            "fbb67db6-10e0-465b-8dbb-d2cf8498e40a",
            "7fb1af35-1899-4b68-9f07-0fe627a37ec9",
            "8cb723c0-201d-4234-8223-09f6f91f3fe9",
            3202
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
            "fbb67db6-10e0-465b-8dbb-d2cf8498e40a",
            "7fb1af35-1899-4b68-9f07-0fe627a37ec9",
            "8cb723c0-201d-4234-8223-09f6f91f3fe9",
            3202
        )
                .description("2RsgmtpDzruBR2bpCJbWCsF1XOMwOMfbCbRi8MeoObjQBbD5vivOmPF0WWyAe43BTjYiVtdGDmgs4Vk2VUx2tI5N4bIOpNtWwRJ7taFGOOZNR9womkOYYXss1h0acoAUmABE9DWtANH45sfx8Sg9q1O62IQSAJ63xgskw6yfFQPcXHRn98Cc");
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
