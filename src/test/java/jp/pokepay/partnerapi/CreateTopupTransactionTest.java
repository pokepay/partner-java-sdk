package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.CreateTopupTransaction;
import jp.pokepay.partnerapi.request.Request;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreateTopupTransactionTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new CreateTopupTransaction(
            "da2f9525-42ea-4a2d-a9ae-8e41d0be0295",
            "e6eb9b8f-c864-40e4-b090-a370205dbc6b",
            "f0bd25d2-2aa2-44be-a839-dbac2c3c9fe4"
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
        Request request = new CreateTopupTransaction(
            "da2f9525-42ea-4a2d-a9ae-8e41d0be0295",
            "e6eb9b8f-c864-40e4-b090-a370205dbc6b",
            "f0bd25d2-2aa2-44be-a839-dbac2c3c9fe4"
        )
                .description("pRjCeSENzcU8xNbRApbU7pfTscAiTxXGuILjkWTc4HjXzbIgrSeTSXAprBJYvo5tyKdr77cTTrMGvSowkqdOqrPvsD3FEdouVTl8fEsYNMRh0KBCHEmmavjrRj8lyHTibhHkLa1kHD5RYCO8fcqcCZCEC10ilQer2r9gnWvKOw7Mb4RCM8");
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
        Request request = new CreateTopupTransaction(
            "da2f9525-42ea-4a2d-a9ae-8e41d0be0295",
            "e6eb9b8f-c864-40e4-b090-a370205dbc6b",
            "f0bd25d2-2aa2-44be-a839-dbac2c3c9fe4"
        )
                .pointAmount(6784)
                .description("KhPKguMhNFJzX3kt3cfiQzCtXalXFPITmY2ooRcemxH2BmvkZiWCd9sm");
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
    void test3() throws ConnectionError, ProcessingError {
        Request request = new CreateTopupTransaction(
            "da2f9525-42ea-4a2d-a9ae-8e41d0be0295",
            "e6eb9b8f-c864-40e4-b090-a370205dbc6b",
            "f0bd25d2-2aa2-44be-a839-dbac2c3c9fe4"
        )
                .moneyAmount(4260)
                .pointAmount(9580)
                .description("DoHTHMd65OAue7bOAqeImMyd1KQqoZfQ3v5XrxYUE0VNIzCLLXUEAykU2eKxF8ElCoyklNTdmLPtgQKYIzCbPox6tBvocLujgc");
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
    void test4() throws ConnectionError, ProcessingError {
        Request request = new CreateTopupTransaction(
            "da2f9525-42ea-4a2d-a9ae-8e41d0be0295",
            "e6eb9b8f-c864-40e4-b090-a370205dbc6b",
            "f0bd25d2-2aa2-44be-a839-dbac2c3c9fe4"
        )
                .bearPointShopId("a26d777e-ac03-4bfa-b8e7-21f729de2e02")
                .moneyAmount(3436)
                .pointAmount(7583)
                .description("6UIgdpPYFYi9QyCiQHlOGxiZCmd4CXT1O1f1Rbnpux0WX8YJNcbIODLe1izSDmUKeIn4k6tj4OULwPmB9akVFgo4DuG9Qj7ut9YPLXKWvJZiXWReaJ");
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
