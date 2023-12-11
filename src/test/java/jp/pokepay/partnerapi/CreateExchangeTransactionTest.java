// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.CreateExchangeTransaction;
import jp.pokepay.partnerapi.request.Request;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreateExchangeTransactionTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new CreateExchangeTransaction(
            "29b8a118-dd92-4f64-a623-2fa2a9801c5e",
            "f732e27f-fba0-43b6-8352-ae0edc53d277",
            "b2cdf337-a077-4c4a-b360-4adcc81c28eb",
            1271.0
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
        Request request = new CreateExchangeTransaction(
            "29b8a118-dd92-4f64-a623-2fa2a9801c5e",
            "f732e27f-fba0-43b6-8352-ae0edc53d277",
            "b2cdf337-a077-4c4a-b360-4adcc81c28eb",
            1271.0
        )
                .requestId("060432aa-6df0-4b18-bf3a-bcbe5312487d");
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
        Request request = new CreateExchangeTransaction(
            "29b8a118-dd92-4f64-a623-2fa2a9801c5e",
            "f732e27f-fba0-43b6-8352-ae0edc53d277",
            "b2cdf337-a077-4c4a-b360-4adcc81c28eb",
            1271.0
        )
                .description("o4pzYP7h6FPyOfItmpqF4JrYK1A6zUf1UJAmItogkvZMlOEvEKZYx87AxopzzuGAMN3C5av5VtdDpuqEnLm2MTevZRbA")
                .requestId("46ef43ae-5ac8-402c-8f0f-80b275470653");
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
