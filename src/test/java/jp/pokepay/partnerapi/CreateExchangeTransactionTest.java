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
            "20b64fab-07cb-4869-b736-77309ace2f45",
            "7760bacb-448b-498e-b0cf-e1a7d8d57bb7",
            "1581d02e-d446-49dd-9ccc-47304c371c1c",
            4278
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
            "20b64fab-07cb-4869-b736-77309ace2f45",
            "7760bacb-448b-498e-b0cf-e1a7d8d57bb7",
            "1581d02e-d446-49dd-9ccc-47304c371c1c",
            4278
        )
                .requestId("2d65e7db-21c1-49d2-9916-3e538fbebde9");
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
            "20b64fab-07cb-4869-b736-77309ace2f45",
            "7760bacb-448b-498e-b0cf-e1a7d8d57bb7",
            "1581d02e-d446-49dd-9ccc-47304c371c1c",
            4278
        )
                .description("G2UPRPUxcw9rvtxOfCP20hUm1E2Nlz5V1CO5TSFyNtopqI6bCrDgQTiBz8hopleWuv10dzqDmxXKufPIjjJ")
                .requestId("21073e70-f299-4d1a-ba1e-51d357a1b62e");
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
