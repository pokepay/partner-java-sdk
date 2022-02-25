// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.ListCustomerTransactions;
import jp.pokepay.partnerapi.request.Request;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ListCustomerTransactionsTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new ListCustomerTransactions(
            "85f2802d-1ea0-4254-9b70-0ef4263d63a9"
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
        Request request = new ListCustomerTransactions(
            "85f2802d-1ea0-4254-9b70-0ef4263d63a9"
        )
                .perPage(7478);
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
        Request request = new ListCustomerTransactions(
            "85f2802d-1ea0-4254-9b70-0ef4263d63a9"
        )
                .page(3114)
                .perPage(449);
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
        Request request = new ListCustomerTransactions(
            "85f2802d-1ea0-4254-9b70-0ef4263d63a9"
        )
                .to("2020-05-01T18:03:41.000000+09:00")
                .page(7071)
                .perPage(1301);
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
        Request request = new ListCustomerTransactions(
            "85f2802d-1ea0-4254-9b70-0ef4263d63a9"
        )
                .from("2022-04-02T07:02:11.000000+09:00")
                .to("2016-08-07T11:40:56.000000+09:00")
                .page(3187)
                .perPage(5197);
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
    void test5() throws ConnectionError, ProcessingError {
        Request request = new ListCustomerTransactions(
            "85f2802d-1ea0-4254-9b70-0ef4263d63a9"
        )
                .setModified(true)
                .from("2018-03-28T06:03:19.000000+09:00")
                .to("2024-06-25T05:59:04.000000+09:00")
                .page(7848)
                .perPage(8786);
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
    void test6() throws ConnectionError, ProcessingError {
        Request request = new ListCustomerTransactions(
            "85f2802d-1ea0-4254-9b70-0ef4263d63a9"
        )
                .type("topup")
                .setModified(true)
                .from("2017-05-03T06:19:33.000000+09:00")
                .to("2017-06-28T17:46:43.000000+09:00")
                .page(2271)
                .perPage(7433);
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
    void test7() throws ConnectionError, ProcessingError {
        Request request = new ListCustomerTransactions(
            "85f2802d-1ea0-4254-9b70-0ef4263d63a9"
        )
                .receiverCustomerId("c187255b-6216-4b0a-ae54-5c8a681de4ec")
                .type("payment")
                .setModified(false)
                .from("2025-01-05T19:16:17.000000+09:00")
                .to("2023-05-21T22:56:04.000000+09:00")
                .page(1142)
                .perPage(192);
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
    void test8() throws ConnectionError, ProcessingError {
        Request request = new ListCustomerTransactions(
            "85f2802d-1ea0-4254-9b70-0ef4263d63a9"
        )
                .senderCustomerId("5d9ba4dc-7383-4a62-b7e9-cdaa36c77ba0")
                .receiverCustomerId("a1056562-96e3-4b40-b5f5-9c1610a6c8c7")
                .type("payment")
                .setModified(false)
                .from("2021-08-15T02:50:09.000000+09:00")
                .to("2016-06-26T22:13:03.000000+09:00")
                .page(3567)
                .perPage(9133);
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
