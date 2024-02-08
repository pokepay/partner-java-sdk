// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.UpdateCashtray;
import jp.pokepay.partnerapi.request.Request;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UpdateCashtrayTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new UpdateCashtray(
            "a93d4ebb-a68b-4428-bc36-21b0137be536"
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
        Request request = new UpdateCashtray(
            "a93d4ebb-a68b-4428-bc36-21b0137be536"
        )
                .expiresIn(4781);
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
        Request request = new UpdateCashtray(
            "a93d4ebb-a68b-4428-bc36-21b0137be536"
        )
                .description("w3XOfvqGLqQiqaG2p9irVNMOOMEypf2sbMz5sG1GgyrO7oaIPGJ7JGBC1o5Rc96wfmVrWrKd8ZckndPnp3nLoMele3p")
                .expiresIn(4465);
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
        Request request = new UpdateCashtray(
            "a93d4ebb-a68b-4428-bc36-21b0137be536"
        )
                .amount(4047.0)
                .description("b8vOALeCaVZzJ21Wkjwh096vY0YkfqArkVOxtHaQbqrekxj6KVFbsIqYgBl99xXSIGv3Ovn3SH7ljqEdpqCcPOpWjivoOnvdw0Yvld3IeJyhTlRgTT2NxSiphZRlLoLjMmLSHQhe4tHPdlvKxC8QojNKN0zqICt7BPEIsHw9i")
                .expiresIn(2530);
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
