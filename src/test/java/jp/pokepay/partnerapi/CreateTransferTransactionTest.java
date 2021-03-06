// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.CreateTransferTransaction;
import jp.pokepay.partnerapi.request.Request;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreateTransferTransactionTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new CreateTransferTransaction(
            "4d6630bf-8582-4807-9309-77d8ac5a8908",
            "85b8af0e-9318-4bcb-a500-21862bb622b5",
            "7b359986-1e08-449c-9aec-ac23dc273ef1",
            5840
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
            "4d6630bf-8582-4807-9309-77d8ac5a8908",
            "85b8af0e-9318-4bcb-a500-21862bb622b5",
            "7b359986-1e08-449c-9aec-ac23dc273ef1",
            5840
        )
                .description("Z9vRV0xbdBDEvdzHS5KI84n4B4JwtxMbsrynFzleqVzZvPQrwaZ5xfzumz05DAlrcpN");
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
