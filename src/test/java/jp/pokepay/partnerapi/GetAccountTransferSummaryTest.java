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
            "dc45d525-508f-4c92-9a1e-24addbe36a04"
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
            "dc45d525-508f-4c92-9a1e-24addbe36a04"
        )
                .transferTypes(new String[]{});
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
            "dc45d525-508f-4c92-9a1e-24addbe36a04"
        )
                .to("2023-06-23T16:08:30.000000+09:00")
                .transferTypes(new String[]{"exchange-inflow","refund-topup","payment","campaign-topup","topup","refund-coupon","refund-exchange-inflow","refund-exchange-outflow","refund-payment"});
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
            "dc45d525-508f-4c92-9a1e-24addbe36a04"
        )
                .from("2019-07-14T22:00:44.000000+09:00")
                .to("2018-03-14T15:21:28.000000+09:00")
                .transferTypes(new String[]{"payment","use-coupon","refund-exchange-inflow"});
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