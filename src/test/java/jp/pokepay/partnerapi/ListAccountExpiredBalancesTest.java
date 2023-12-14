// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.ListAccountExpiredBalances;
import jp.pokepay.partnerapi.request.Request;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ListAccountExpiredBalancesTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new ListAccountExpiredBalances(
            "c209a92b-f33c-4ae8-bea5-9b845fca04ed"
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
            "c209a92b-f33c-4ae8-bea5-9b845fca04ed"
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
            "c209a92b-f33c-4ae8-bea5-9b845fca04ed"
        )
                .expiresAtTo("2016-11-10T12:48:19.000000+09:00")
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
            "c209a92b-f33c-4ae8-bea5-9b845fca04ed"
        )
                .expiresAtFrom("2018-08-02T03:14:45.000000+09:00")
                .expiresAtTo("2020-04-05T07:22:30.000000+09:00")
                .direction("asc");
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
            "c209a92b-f33c-4ae8-bea5-9b845fca04ed"
        )
                .perPage(1624)
                .expiresAtFrom("2023-12-20T03:33:33.000000+09:00")
                .expiresAtTo("2018-02-01T11:18:31.000000+09:00")
                .direction("asc");
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
            "c209a92b-f33c-4ae8-bea5-9b845fca04ed"
        )
                .page(9006)
                .perPage(9107)
                .expiresAtFrom("2022-12-09T18:57:54.000000+09:00")
                .expiresAtTo("2020-04-26T22:15:38.000000+09:00")
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
