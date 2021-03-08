// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.GetPrivateMoneyOrganizationSummaries;
import jp.pokepay.partnerapi.request.Request;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GetPrivateMoneyOrganizationSummariesTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new GetPrivateMoneyOrganizationSummaries(
            "bed18a99-b632-45b8-b605-824416462f73"
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
        Request request = new GetPrivateMoneyOrganizationSummaries(
            "bed18a99-b632-45b8-b605-824416462f73"
        )
                .page(1687);
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
        Request request = new GetPrivateMoneyOrganizationSummaries(
            "bed18a99-b632-45b8-b605-824416462f73"
        )
                .perPage(7898)
                .page(9120);
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
        Request request = new GetPrivateMoneyOrganizationSummaries(
            "bed18a99-b632-45b8-b605-824416462f73"
        )
                .from("2022-11-01T17:15:31.000000+09:00")
                .to("2015-10-14T04:30:14.000000+09:00");
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
        Request request = new GetPrivateMoneyOrganizationSummaries(
            "bed18a99-b632-45b8-b605-824416462f73"
        )
                .from("2017-08-16T16:37:23.000000+09:00")
                .to("2025-06-30T05:56:45.000000+09:00")
                .page(6148);
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
        Request request = new GetPrivateMoneyOrganizationSummaries(
            "bed18a99-b632-45b8-b605-824416462f73"
        )
                .from("2024-08-26T09:55:46.000000+09:00")
                .to("2022-05-01T05:52:01.000000+09:00")
                .perPage(6811)
                .page(588);
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
