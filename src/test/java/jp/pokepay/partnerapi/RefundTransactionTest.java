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
            "62845723-fd97-417f-9ddc-531e54e1d90c"
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
            "62845723-fd97-417f-9ddc-531e54e1d90c"
        )
                .returningPointExpiresAt("2023-07-21T02:15:32.000000+09:00");
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
            "62845723-fd97-417f-9ddc-531e54e1d90c"
        )
                .description("kf3AbAIdc6M35o0wJVNoZP48m0NWcrjM1l1Hc5Yse3aTWR7iiIQlDPVlYaAexXHrVjFdCVZfidE3Ay4COykOzLbsIxwTxXOKHBhxXF9Aw1Wxr9mBTv73hWU9XuozhOEBotI2h9AbHFDAbH7ljEzT28Gd")
                .returningPointExpiresAt("2020-07-23T09:54:16.000000+09:00");
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
