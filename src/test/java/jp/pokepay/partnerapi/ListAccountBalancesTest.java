// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.ListAccountBalances;
import jp.pokepay.partnerapi.request.Request;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ListAccountBalancesTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new ListAccountBalances(
            "68b06cb3-42cd-4ed8-b703-a1f05d71491d"
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
        Request request = new ListAccountBalances(
            "68b06cb3-42cd-4ed8-b703-a1f05d71491d"
        )
                .perPage(5891);
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
        Request request = new ListAccountBalances(
            "68b06cb3-42cd-4ed8-b703-a1f05d71491d"
        )
                .page(2017)
                .perPage(1695);
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
