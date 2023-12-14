// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.GetAccountTransferSummary;
import jp.pokepay.partnerapi.request.Request;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GetAccountTransferSummaryTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new GetAccountTransferSummary(
            "7c5c4082-cbbc-4bc9-88fd-6799b52b5091"
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
        Request request = new GetAccountTransferSummary(
            "7c5c4082-cbbc-4bc9-88fd-6799b52b5091"
        )
                .transferTypes(new String[]{"refund-campaign","topup","refund-exchange-outflow","refund-payment"});
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
        Request request = new GetAccountTransferSummary(
            "7c5c4082-cbbc-4bc9-88fd-6799b52b5091"
        )
                .to("2015-12-24T02:00:20.000000+09:00")
                .transferTypes(new String[]{"topup","refund-payment","refund-topup"});
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
        Request request = new GetAccountTransferSummary(
            "7c5c4082-cbbc-4bc9-88fd-6799b52b5091"
        )
                .from("2017-08-26T18:54:41.000000+09:00")
                .to("2016-08-20T05:39:56.000000+09:00")
                .transferTypes(new String[]{"campaign-topup","payment","refund-campaign","refund-exchange-outflow","exchange-outflow","topup"});
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
