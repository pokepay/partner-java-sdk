package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.GetAccount;
import jp.pokepay.partnerapi.request.Request;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GetAccountTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new GetAccount(
            "c76300e6-4a9a-427e-845e-3152e44867a6"
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
