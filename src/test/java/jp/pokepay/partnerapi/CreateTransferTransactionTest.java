// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.CreateTransferTransaction;
import jp.pokepay.partnerapi.request.Request;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreateTransferTransactionTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new CreateTransferTransaction(
            "c7c85bbe-933e-4efa-8e94-dccc9631cc03",
            "1b84ad53-edb5-4b1c-81be-7abfec22d6a4",
            "e02c5fe7-3813-45ac-9b3e-ef2dc2e33969",
            750.0
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
        Request request = new CreateTransferTransaction(
            "c7c85bbe-933e-4efa-8e94-dccc9631cc03",
            "1b84ad53-edb5-4b1c-81be-7abfec22d6a4",
            "e02c5fe7-3813-45ac-9b3e-ef2dc2e33969",
            750.0
        )
                .requestId("07a1bdec-1fbb-4b9e-bed3-128ae0e700ff");
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
        Request request = new CreateTransferTransaction(
            "c7c85bbe-933e-4efa-8e94-dccc9631cc03",
            "1b84ad53-edb5-4b1c-81be-7abfec22d6a4",
            "e02c5fe7-3813-45ac-9b3e-ef2dc2e33969",
            750.0
        )
                .description("bgCOpN21EzYv53e8C68gL6nh3hboA1VaXQqYz47H8v5OYX2Bb7kgjpYtpWxkJ26TN1VktFjJy7P")
                .requestId("83245c11-3d0d-465c-b413-08533aff7862");
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
        Request request = new CreateTransferTransaction(
            "c7c85bbe-933e-4efa-8e94-dccc9631cc03",
            "1b84ad53-edb5-4b1c-81be-7abfec22d6a4",
            "e02c5fe7-3813-45ac-9b3e-ef2dc2e33969",
            750.0
        )
                .metadata("{\"key\":\"value\"}")
                .description("koz4u4vqNtkYjPXUyJ1V0r5CHRNT2ecfLdc33OSn94wpSCBGnb27KI1Ko9Ro9P2UOPHKcZd7kJ0a")
                .requestId("d57fad30-3f39-45c2-845b-ec297103e596");
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
