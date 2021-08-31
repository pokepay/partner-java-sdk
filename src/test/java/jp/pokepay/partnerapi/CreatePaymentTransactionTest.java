// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.CreatePaymentTransaction;
import jp.pokepay.partnerapi.request.Request;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreatePaymentTransactionTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new CreatePaymentTransaction(
            "8c3d0553-5536-469a-8e92-6ba6b08a4e14",
            "103c7aab-80ed-4c05-89d6-2be6e80d1bc3",
            "22f3f304-80ec-497f-9f82-1e38d897650b",
            8358
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
        Request request = new CreatePaymentTransaction(
            "8c3d0553-5536-469a-8e92-6ba6b08a4e14",
            "103c7aab-80ed-4c05-89d6-2be6e80d1bc3",
            "22f3f304-80ec-497f-9f82-1e38d897650b",
            8358
        )
                .requestId("24c34c4f-8836-4e1c-9854-a79bab28b8f0");
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
        Request request = new CreatePaymentTransaction(
            "8c3d0553-5536-469a-8e92-6ba6b08a4e14",
            "103c7aab-80ed-4c05-89d6-2be6e80d1bc3",
            "22f3f304-80ec-497f-9f82-1e38d897650b",
            8358
        )
                .description("GUPEJOaNnRanlNyuKHWuXq7zEzVgAAIhzrVmMQ7zQf4j1Xlnx61iQEXBdwXQXBx9CjvSgZke3VuPIIBeUSxLQqoj9SXP9EgDJcoagTJNb42JvVKNsj3zA7Dw0uibv6O0nFaLFwVLIZnC6rDyYuuG1XnlSIVaCTCoBzc3Po")
                .requestId("63474c6c-907e-4aa9-be73-322520264a64");
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
