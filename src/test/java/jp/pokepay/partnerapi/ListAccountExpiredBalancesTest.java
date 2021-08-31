// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.ListAccountExpiredBalances;
import jp.pokepay.partnerapi.request.Request;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ListAccountExpiredBalancesTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new ListAccountExpiredBalances(
            "c3851eee-c081-4e48-9428-8ce6203ac303"
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
        Request request = new ListAccountExpiredBalances(
            "c3851eee-c081-4e48-9428-8ce6203ac303"
        )
                .direction("desc");
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
        Request request = new ListAccountExpiredBalances(
            "c3851eee-c081-4e48-9428-8ce6203ac303"
        )
                .expiresAtTo("2023-10-14T06:41:08.000000Z")
                .direction("desc");
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
        Request request = new ListAccountExpiredBalances(
            "c3851eee-c081-4e48-9428-8ce6203ac303"
        )
                .expiresAtFrom("2016-02-07T14:51:43.000000Z")
                .expiresAtTo("2023-06-25T22:13:08.000000Z")
                .direction("desc");
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
        Request request = new ListAccountExpiredBalances(
            "c3851eee-c081-4e48-9428-8ce6203ac303"
        )
                .perPage(1280)
                .expiresAtFrom("2017-09-19T11:56:50.000000Z")
                .expiresAtTo("2021-05-01T09:07:44.000000Z")
                .direction("desc");
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
        Request request = new ListAccountExpiredBalances(
            "c3851eee-c081-4e48-9428-8ce6203ac303"
        )
                .page(7954)
                .perPage(183)
                .expiresAtFrom("2017-07-14T22:24:12.000000Z")
                .expiresAtTo("2018-02-10T20:24:08.000000Z")
                .direction("desc");
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
