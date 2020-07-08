package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.CreateExchangeTransaction;
import jp.pokepay.partnerapi.request.Request;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreateExchangeTransactionTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new CreateExchangeTransaction(
            "9dc5e22b-7a80-434c-a029-9a1608534abf",
            "da6b7b3f-bbaf-4100-a6cb-4cbb1cc086e1",
            "46bda97d-8d56-49a5-9be4-d9eb612726aa",
            7245
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
        Request request = new CreateExchangeTransaction(
            "9dc5e22b-7a80-434c-a029-9a1608534abf",
            "da6b7b3f-bbaf-4100-a6cb-4cbb1cc086e1",
            "46bda97d-8d56-49a5-9be4-d9eb612726aa",
            7245
        )
                .description("jNCckeOQ");
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
