// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.CreateCashtray;
import jp.pokepay.partnerapi.request.Request;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreateCashtrayTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new CreateCashtray(
            "044202f7-3525-4117-8dd7-0ded95240fda",
            "48aeadc5-538d-4ee4-af33-69d46096e93b",
            5771.0
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
        Request request = new CreateCashtray(
            "044202f7-3525-4117-8dd7-0ded95240fda",
            "48aeadc5-538d-4ee4-af33-69d46096e93b",
            5771.0
        )
                .expiresIn(5237);
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
        Request request = new CreateCashtray(
            "044202f7-3525-4117-8dd7-0ded95240fda",
            "48aeadc5-538d-4ee4-af33-69d46096e93b",
            5771.0
        )
                .description("PfziyB2HYxaSuFevcjssU2Qn83gWH7hF0T8Nh7eoO6asjOox0RRzWzgJ8qllmxnkMg")
                .expiresIn(1558);
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
