package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.GetTransaction;
import jp.pokepay.partnerapi.request.Request;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GetTransactionTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new GetTransaction(
            "cf863eab-7c70-41ac-9bf7-7b117527307d"
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
