package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.GetPrivateMoneyOrganizationSummaries;
import jp.pokepay.partnerapi.request.Request;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GetPrivateMoneyOrganizationSummariesTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new GetPrivateMoneyOrganizationSummaries(
            "c3bb4486-35ed-4925-8489-0c42062f27dd"
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
            "c3bb4486-35ed-4925-8489-0c42062f27dd"
        )
                .perPage(9790);
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
            "c3bb4486-35ed-4925-8489-0c42062f27dd"
        )
                .page(5747)
                .perPage(7704);
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
            "c3bb4486-35ed-4925-8489-0c42062f27dd"
        )
                .to("2020-06-19T17:15:18.000000+09:00")
                .page(7911)
                .perPage(1083);
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
            "c3bb4486-35ed-4925-8489-0c42062f27dd"
        )
                .from("2018-05-04T11:04:54.000000+09:00")
                .to("2018-04-28T01:53:14.000000+09:00")
                .page(3867)
                .perPage(557);
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
