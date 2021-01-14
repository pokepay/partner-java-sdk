// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.RefundTransaction;
import jp.pokepay.partnerapi.request.Request;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RefundTransactionTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new RefundTransaction(
            "3a379f89-16cf-411d-b85f-85afeca3e139"
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
            "3a379f89-16cf-411d-b85f-85afeca3e139"
        )
                .description("OffBCzdPD5lY5ruzs73QnlHzwGBVLp2Vmg3eprOU7ktZcHWsZTpEtZX9770nlSO8H2DCl6imPJgn2XjYsZUpQvLebh65Hdtxmvs4SwxR");
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
