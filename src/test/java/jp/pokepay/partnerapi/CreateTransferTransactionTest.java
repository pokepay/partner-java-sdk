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
            "94cb77a2-f454-495b-8e2d-8bb108995456",
            "cac8c76b-fe5c-45df-9cf4-f6c6fada295e",
            "f9d84486-3dea-469d-8af9-ec9b91c80718",
            3932.0
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
            "94cb77a2-f454-495b-8e2d-8bb108995456",
            "cac8c76b-fe5c-45df-9cf4-f6c6fada295e",
            "f9d84486-3dea-469d-8af9-ec9b91c80718",
            3932.0
        )
                .requestId("0566cbb7-03d0-4c11-8d5c-563438473e13");
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
            "94cb77a2-f454-495b-8e2d-8bb108995456",
            "cac8c76b-fe5c-45df-9cf4-f6c6fada295e",
            "f9d84486-3dea-469d-8af9-ec9b91c80718",
            3932.0
        )
                .description("bKkoz4u4vqNtkYjPXUyJ1V0r5CHRNT2ecfLdc33OSn94wpSCBGnb27KI1Ko9Ro9P2UOPHKcZd7kJ0a09BOfp")
                .requestId("cae56093-4054-43bc-8ef2-2ac93162065e");
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
            "94cb77a2-f454-495b-8e2d-8bb108995456",
            "cac8c76b-fe5c-45df-9cf4-f6c6fada295e",
            "f9d84486-3dea-469d-8af9-ec9b91c80718",
            3932.0
        )
                .metadata("{\"key\":\"value\"}")
                .description("ahzBDxgf0eAPjokEVHRFLghiMn2sJjV2bGnLruRc9c27Gpu7iWb08UbIXfazIWogjdxJNEfM7ZphEzx62f8FNzaDel7ro4JT6XY3Y33ek4ahxmsrZJPb5B1K9ZLJjlQz")
                .requestId("ddd2b872-67e3-40c7-b4e3-7e46024f6100");
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
