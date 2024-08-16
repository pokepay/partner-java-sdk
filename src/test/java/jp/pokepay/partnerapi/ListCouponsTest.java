// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.ListCoupons;
import jp.pokepay.partnerapi.request.Request;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ListCouponsTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new ListCoupons(
            "103051c2-1c36-4d65-bcc4-55c400227d37"
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
        Request request = new ListCoupons(
            "103051c2-1c36-4d65-bcc4-55c400227d37"
        )
                .perPage(1239);
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
        Request request = new ListCoupons(
            "103051c2-1c36-4d65-bcc4-55c400227d37"
        )
                .page(2965)
                .perPage(4741);
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
        Request request = new ListCoupons(
            "103051c2-1c36-4d65-bcc4-55c400227d37"
        )
                .availableTo("2021-11-13T05:58:27.000000+09:00")
                .page(9894)
                .perPage(9554);
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
        Request request = new ListCoupons(
            "103051c2-1c36-4d65-bcc4-55c400227d37"
        )
                .availableFrom("2021-07-07T13:15:32.000000+09:00")
                .availableTo("2023-05-20T19:38:02.000000+09:00")
                .page(8282)
                .perPage(5852);
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
        Request request = new ListCoupons(
            "103051c2-1c36-4d65-bcc4-55c400227d37"
        )
                .availableShopName("uArK85")
                .availableFrom("2024-03-26T02:48:17.000000+09:00")
                .availableTo("2023-06-03T06:39:23.000000+09:00")
                .page(4857)
                .perPage(7403);
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
        Request request = new ListCoupons(
            "103051c2-1c36-4d65-bcc4-55c400227d37"
        )
                .issuedShopName("dPWslgjPCU")
                .availableShopName("jEoz")
                .availableFrom("2022-01-01T06:59:22.000000+09:00")
                .availableTo("2022-07-06T12:44:21.000000+09:00")
                .page(4149)
                .perPage(4281);
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
        Request request = new ListCoupons(
            "103051c2-1c36-4d65-bcc4-55c400227d37"
        )
                .couponName("4d6")
                .issuedShopName("EJTS0Ah")
                .availableShopName("980Jl")
                .availableFrom("2022-07-26T22:57:07.000000+09:00")
                .availableTo("2020-01-28T15:34:15.000000+09:00")
                .page(8366)
                .perPage(4293);
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
        Request request = new ListCoupons(
            "103051c2-1c36-4d65-bcc4-55c400227d37"
        )
                .couponId("9AfDs3")
                .couponName("q")
                .issuedShopName("8wpO2iRJG")
                .availableShopName("jAKVB")
                .availableFrom("2022-06-08T20:32:06.000000+09:00")
                .availableTo("2023-07-02T00:05:59.000000+09:00")
                .page(493)
                .perPage(8410);
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
