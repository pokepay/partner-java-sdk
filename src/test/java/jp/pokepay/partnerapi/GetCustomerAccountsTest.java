// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.GetCustomerAccounts;
import jp.pokepay.partnerapi.request.Request;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GetCustomerAccountsTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new GetCustomerAccounts(
            "e981839f-7730-40a4-9991-3f49bc7c0625"
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
        Request request = new GetCustomerAccounts(
            "e981839f-7730-40a4-9991-3f49bc7c0625"
        )
                .email("cm0Sp2RluF@OAxJ.com");
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
        Request request = new GetCustomerAccounts(
            "e981839f-7730-40a4-9991-3f49bc7c0625"
        )
                .tel("07-0551-2657")
                .email("TcJlnsa7zu@y1tu.com");
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
        Request request = new GetCustomerAccounts(
            "e981839f-7730-40a4-9991-3f49bc7c0625"
        )
                .externalId("dw")
                .tel("071-69745487")
                .email("fKkMLwrBpO@RQ9L.com");
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
        Request request = new GetCustomerAccounts(
            "e981839f-7730-40a4-9991-3f49bc7c0625"
        )
                .status("suspended")
                .externalId("lnKRmCd4n")
                .tel("045-981479")
                .email("qpn3W7S36l@34SS.com");
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
        Request request = new GetCustomerAccounts(
            "e981839f-7730-40a4-9991-3f49bc7c0625"
        )
                .setSuspended(false)
                .status("active")
                .externalId("W72gqSjd8QPzbjt0rt7UmerReZGbvGgvA")
                .tel("09215911045")
                .email("P1AnQALadF@sAzg.com");
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
        Request request = new GetCustomerAccounts(
            "e981839f-7730-40a4-9991-3f49bc7c0625"
        )
                .createdAtTo("2022-07-27T22:59:50.000000Z")
                .setSuspended(true)
                .status("pre-closed")
                .externalId("tuXgZDedIJqTHGgnOhGiwZBj5AvHdO2Atfc")
                .tel("0129-664-818")
                .email("3sP8V6IT9V@FC5b.com");
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
        Request request = new GetCustomerAccounts(
            "e981839f-7730-40a4-9991-3f49bc7c0625"
        )
                .createdAtFrom("2021-03-24T19:42:09.000000Z")
                .createdAtTo("2020-09-24T18:38:11.000000Z")
                .setSuspended(true)
                .status("active")
                .externalId("PASw8jPQ0hMJ4nPgNJOUuVI3xkUSOX0vTgyFK1F")
                .tel("002-97-992")
                .email("exAarzlUll@rgsQ.com");
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
        Request request = new GetCustomerAccounts(
            "e981839f-7730-40a4-9991-3f49bc7c0625"
        )
                .perPage(6435)
                .createdAtFrom("2022-12-18T13:21:30.000000Z")
                .createdAtTo("2022-10-28T02:45:21.000000Z")
                .setSuspended(true)
                .status("active")
                .externalId("YeKIbZQuPYAKNLvTyMcIYl")
                .tel("079352848")
                .email("Pv9LO3MtPy@t1wT.com");
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
    void test9() throws ConnectionError, ProcessingError {
        Request request = new GetCustomerAccounts(
            "e981839f-7730-40a4-9991-3f49bc7c0625"
        )
                .page(8687)
                .perPage(8494)
                .createdAtFrom("2024-02-11T20:15:48.000000Z")
                .createdAtTo("2023-10-06T20:45:00.000000Z")
                .setSuspended(true)
                .status("active")
                .externalId("Yk")
                .tel("004073-175")
                .email("ncONv8Kje2@pUTW.com");
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
