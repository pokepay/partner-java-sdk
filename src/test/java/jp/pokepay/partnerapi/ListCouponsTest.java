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
            "5263e2a7-d56a-40ce-8ecf-8887afc21b65"
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
            "5263e2a7-d56a-40ce-8ecf-8887afc21b65"
        )
                .perPage(5745);
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
            "5263e2a7-d56a-40ce-8ecf-8887afc21b65"
        )
                .page(9705)
                .perPage(6896);
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
            "5263e2a7-d56a-40ce-8ecf-8887afc21b65"
        )
                .availableTo("2018-01-09T12:47:45.000000+09:00")
                .page(7974)
                .perPage(9721);
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
            "5263e2a7-d56a-40ce-8ecf-8887afc21b65"
        )
                .availableFrom("2015-10-26T22:47:51.000000+09:00")
                .availableTo("2024-05-30T03:17:52.000000+09:00")
                .page(1334)
                .perPage(1815);
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
            "5263e2a7-d56a-40ce-8ecf-8887afc21b65"
        )
                .availableShopName("f1CtdnI1QY")
                .availableFrom("2020-03-06T05:31:54.000000+09:00")
                .availableTo("2016-05-01T20:23:14.000000+09:00")
                .page(374)
                .perPage(3755);
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
            "5263e2a7-d56a-40ce-8ecf-8887afc21b65"
        )
                .issuedShopName("PkFzjJ")
                .availableShopName("nFN")
                .availableFrom("2019-07-06T09:51:52.000000+09:00")
                .availableTo("2020-09-28T19:16:38.000000+09:00")
                .page(4743)
                .perPage(3565);
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
            "5263e2a7-d56a-40ce-8ecf-8887afc21b65"
        )
                .couponName("DzSYlyW2")
                .issuedShopName("GinOgcbG")
                .availableShopName("h0dZ")
                .availableFrom("2017-09-21T22:13:07.000000+09:00")
                .availableTo("2017-12-03T13:05:32.000000+09:00")
                .page(5790)
                .perPage(5303);
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
            "5263e2a7-d56a-40ce-8ecf-8887afc21b65"
        )
                .couponId("dlieCgB")
                .couponName("e")
                .issuedShopName("kXP")
                .availableShopName("QkwpMYT")
                .availableFrom("2023-08-28T04:09:27.000000+09:00")
                .availableTo("2020-12-29T06:29:32.000000+09:00")
                .page(7901)
                .perPage(867);
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
