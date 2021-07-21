// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.CreateCashtray;
import jp.pokepay.partnerapi.request.Request;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreateCashtrayTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new CreateCashtray(
            "9be27a75-ba4b-4261-9b7f-5c08c8f5d863",
            "59004cfe-9337-439b-bf43-c4d3c4b07b31",
            6852
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
            "9be27a75-ba4b-4261-9b7f-5c08c8f5d863",
            "59004cfe-9337-439b-bf43-c4d3c4b07b31",
            6852
        )
                .expiresIn(4222);
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
            "9be27a75-ba4b-4261-9b7f-5c08c8f5d863",
            "59004cfe-9337-439b-bf43-c4d3c4b07b31",
            6852
        )
                .description("K4Gnrr3oBLGMXHrz9mqfRhRmUp8pN9pjtBKEK15Dd3XxCT0Zmu6u7tOxquneNatGolCf6SjeF7SeZXyMS6WkNJ2GvSwQUcruYP4H5cCw5ExNqh41OXXFwVmaHYw6oEFbK8qER1L")
                .expiresIn(9887);
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
