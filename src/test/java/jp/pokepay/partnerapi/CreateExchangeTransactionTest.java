// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.CreateExchangeTransaction;
import jp.pokepay.partnerapi.request.Request;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreateExchangeTransactionTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new CreateExchangeTransaction(
            "127e7540-96e5-4f7a-b8dc-87d48d84ec94",
            "2babfc75-9b75-4d73-aa4c-d07f247bd4c3",
            "c0e5e224-5158-4593-b5f1-8694495bcc11",
            9231
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
            "127e7540-96e5-4f7a-b8dc-87d48d84ec94",
            "2babfc75-9b75-4d73-aa4c-d07f247bd4c3",
            "c0e5e224-5158-4593-b5f1-8694495bcc11",
            9231
        )
                .description("q9aXt2RyxOmHZB8Yd9TYL0bkCAVqSRIdac4BtBwC2bbOKrqEvtHSmLf6gZqSXb2Lr55RtyiR");
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
