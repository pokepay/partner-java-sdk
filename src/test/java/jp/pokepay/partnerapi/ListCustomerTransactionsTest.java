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
            "05d4da0c-f8ac-43e9-a1a8-54df0786da2d"
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
            "05d4da0c-f8ac-43e9-a1a8-54df0786da2d"
        )
                .perPage(3721);
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
            "05d4da0c-f8ac-43e9-a1a8-54df0786da2d"
        )
                .page(1673)
                .perPage(8569);
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
            "05d4da0c-f8ac-43e9-a1a8-54df0786da2d"
        )
                .to("2020-06-09T08:43:25.000000Z")
                .page(2641)
                .perPage(1403);
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
            "05d4da0c-f8ac-43e9-a1a8-54df0786da2d"
        )
                .from("2023-08-31T11:35:24.000000Z")
                .to("2021-11-27T00:17:30.000000Z")
                .page(6128)
                .perPage(9468);
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
            "05d4da0c-f8ac-43e9-a1a8-54df0786da2d"
        )
                .setModified(true)
                .from("2021-10-15T20:46:20.000000Z")
                .to("2023-11-14T17:02:46.000000Z")
                .page(8406)
                .perPage(1440);
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
            "05d4da0c-f8ac-43e9-a1a8-54df0786da2d"
        )
                .type("transfer")
                .setModified(true)
                .from("2022-03-30T21:58:48.000000Z")
                .to("2024-01-29T17:38:21.000000Z")
                .page(786)
                .perPage(2848);
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
            "05d4da0c-f8ac-43e9-a1a8-54df0786da2d"
        )
                .receiverCustomerId("476067c0-5180-472f-9748-fbe19e693314")
                .type("cashback")
                .setModified(true)
                .from("2020-07-04T11:49:13.000000Z")
                .to("2020-10-22T23:48:51.000000Z")
                .page(4783)
                .perPage(8752);
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
            "05d4da0c-f8ac-43e9-a1a8-54df0786da2d"
        )
                .senderCustomerId("d2869b53-2e22-4d40-bc23-f9d272cd44e5")
                .receiverCustomerId("03a89a91-73ea-4831-99d4-32f7b9069362")
                .type("exchange")
                .setModified(false)
                .from("2020-01-13T05:00:34.000000Z")
                .to("2020-03-01T04:56:22.000000Z")
                .page(5098)
                .perPage(7841);
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
