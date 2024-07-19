// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.GetShopAccounts;
import jp.pokepay.partnerapi.request.Request;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GetShopAccountsTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new GetShopAccounts(
            "e7f9bb88-8b7f-4883-b91c-43b0aea260a6"
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
        Request request = new GetShopAccounts(
            "e7f9bb88-8b7f-4883-b91c-43b0aea260a6"
        )
                .setSuspended(false);
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
        Request request = new GetShopAccounts(
            "e7f9bb88-8b7f-4883-b91c-43b0aea260a6"
        )
                .createdAtTo("2022-01-09T07:41:23.000000Z")
                .setSuspended(true);
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
        Request request = new GetShopAccounts(
            "e7f9bb88-8b7f-4883-b91c-43b0aea260a6"
        )
                .createdAtFrom("2020-10-18T03:56:04.000000Z")
                .createdAtTo("2021-07-25T03:50:36.000000Z")
                .setSuspended(true);
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
        Request request = new GetShopAccounts(
            "e7f9bb88-8b7f-4883-b91c-43b0aea260a6"
        )
                .perPage(9222)
                .createdAtFrom("2023-07-21T18:59:40.000000Z")
                .createdAtTo("2022-05-03T22:28:24.000000Z")
                .setSuspended(true);
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
        Request request = new GetShopAccounts(
            "e7f9bb88-8b7f-4883-b91c-43b0aea260a6"
        )
                .page(4807)
                .perPage(6255)
                .createdAtFrom("2023-05-11T13:18:24.000000Z")
                .createdAtTo("2020-12-31T07:17:51.000000Z")
                .setSuspended(true);
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
