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
            "d5c78ec9-4dba-43e0-a0d6-d858ab8d61dc"
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
            "d5c78ec9-4dba-43e0-a0d6-d858ab8d61dc"
        )
                .expiresIn(4629);
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
            "d5c78ec9-4dba-43e0-a0d6-d858ab8d61dc"
        )
                .description("Kvq4lt1nRgyDmcrKU2m75t9zQsQisOrew1tXyZ3vJvrViLx0ONSF74D46QdGtqO2RWkN5vm7bUc3")
                .expiresIn(5330);
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
            "d5c78ec9-4dba-43e0-a0d6-d858ab8d61dc"
        )
                .amount(7803.0)
                .description("mjyR2Mc")
                .expiresIn(8196);
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
