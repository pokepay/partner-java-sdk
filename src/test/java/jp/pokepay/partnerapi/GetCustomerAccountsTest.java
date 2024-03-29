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
            "55543535-882b-44f5-9f30-80a440a9c1d9"
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
            "55543535-882b-44f5-9f30-80a440a9c1d9"
        )
                .email("Icm0Sp2Rlu@FOAx.com");
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
            "55543535-882b-44f5-9f30-80a440a9c1d9"
        )
                .tel("047-0551-2657")
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
            "55543535-882b-44f5-9f30-80a440a9c1d9"
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
            "55543535-882b-44f5-9f30-80a440a9c1d9"
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
            "55543535-882b-44f5-9f30-80a440a9c1d9"
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
            "55543535-882b-44f5-9f30-80a440a9c1d9"
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
            "55543535-882b-44f5-9f30-80a440a9c1d9"
        )
                .createdAtFrom("2021-03-24T19:42:09.000000Z")
                .createdAtTo("2023-05-02T07:02:07.000000Z")
                .setSuspended(true)
                .status("pre-closed")
                .externalId("XfPASw8jPQ0h")
                .tel("062-07305693")
                .email("xkUSOX0vTg@yFK1.com");
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
            "55543535-882b-44f5-9f30-80a440a9c1d9"
        )
                .perPage(6034)
                .createdAtFrom("2022-02-08T11:59:01.000000Z")
                .createdAtTo("2021-10-26T00:50:23.000000Z")
                .setSuspended(true)
                .status("pre-closed")
                .externalId("7pl9MWii2exAarzlUllr")
                .tel("01-1105-7098")
                .email("bZQuPYAKNL@vTyM.com");
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
            "55543535-882b-44f5-9f30-80a440a9c1d9"
        )
                .page(7048)
                .perPage(7330)
                .createdAtFrom("2022-02-14T10:49:45.000000Z")
                .createdAtTo("2023-05-04T06:41:23.000000Z")
                .setSuspended(false)
                .status("suspended")
                .externalId("LoYSz5jRHNPv9LO3MtPyt1wTnktL8AYkBvD7caRgncONv")
                .tel("085-5471-045")
                .email("87oiAkJDB6@ZsUU.com");
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
