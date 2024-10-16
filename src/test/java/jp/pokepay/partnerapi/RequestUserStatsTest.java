// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.RequestUserStats;
import jp.pokepay.partnerapi.request.Request;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RequestUserStatsTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new RequestUserStats(
            "2022-08-22T14:40:07.000000Z",
            "2024-09-18T13:18:22.000000Z"
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
}
