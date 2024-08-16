// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.GetPrivateMoneyOrganizationSummaries;
import jp.pokepay.partnerapi.request.Request;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GetPrivateMoneyOrganizationSummariesTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new GetPrivateMoneyOrganizationSummaries(
            "ac5edad7-b9ac-4e4a-ba18-87a89573ede0"
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
            "ac5edad7-b9ac-4e4a-ba18-87a89573ede0"
        )
                .page(6298);
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
            "ac5edad7-b9ac-4e4a-ba18-87a89573ede0"
        )
                .perPage(1513)
                .page(8989);
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
            "ac5edad7-b9ac-4e4a-ba18-87a89573ede0"
        )
                .from("2023-09-04T07:48:23.000000+09:00")
                .to("2020-05-31T13:29:32.000000+09:00");
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
            "ac5edad7-b9ac-4e4a-ba18-87a89573ede0"
        )
                .from("2021-09-03T20:46:26.000000+09:00")
                .to("2022-07-29T14:51:35.000000+09:00")
                .page(1270);
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
            "ac5edad7-b9ac-4e4a-ba18-87a89573ede0"
        )
                .from("2024-07-05T00:17:27.000000+09:00")
                .to("2020-04-10T12:12:22.000000+09:00")
                .perPage(2474)
                .page(7867);
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
