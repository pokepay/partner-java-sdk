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
            "abbef614-0559-41bc-a55c-64c08dacd60d"
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
            "abbef614-0559-41bc-a55c-64c08dacd60d"
        )
                .expiresIn(1308);
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
            "abbef614-0559-41bc-a55c-64c08dacd60d"
        )
                .description("DYPITWntjPKsw1FLjeBWpuLOCEW2qMG83Z7742KEo0xZcIacFUP9aAwJqKnTcKyVerIBU42LDMk")
                .expiresIn(8067);
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
            "abbef614-0559-41bc-a55c-64c08dacd60d"
        )
                .amount(6786.0)
                .description("K2X4rBI0JB5LXUZkzBpwo2ug8s1ceMiqQQskUext4D3wQIg4zJca7lmqSaN1oXehMBjxhp9WelJdGdqdd41phjj9WkeKfMN5tyh4SQIrM52EVQSFtKt1nKQCsU3uCBa7OHTtrVkZP6sllMS")
                .expiresIn(2790);
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
