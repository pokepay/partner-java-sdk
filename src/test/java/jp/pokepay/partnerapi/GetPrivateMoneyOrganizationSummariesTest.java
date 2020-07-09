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
            "f8a9fc55-a442-4a5a-919b-3e7d5d5e4b3f"
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
            "f8a9fc55-a442-4a5a-919b-3e7d5d5e4b3f"
        )
                .perPage(7410);
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
            "f8a9fc55-a442-4a5a-919b-3e7d5d5e4b3f"
        )
                .page(7628)
                .perPage(3874);
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
            "f8a9fc55-a442-4a5a-919b-3e7d5d5e4b3f"
        )
                .to("2017-08-28T15:00:15.000000+09:00")
                .page(4831)
                .perPage(1915);
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
            "f8a9fc55-a442-4a5a-919b-3e7d5d5e4b3f"
        )
                .from("2023-04-18T13:07:03.000000+09:00")
                .to("2023-11-10T01:55:55.000000+09:00")
                .page(4891)
                .perPage(156);
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