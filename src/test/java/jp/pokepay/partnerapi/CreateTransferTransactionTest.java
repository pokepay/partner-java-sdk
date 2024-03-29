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
            "3a769fe5-ee23-42bf-947c-a065feae4e58",
            "25fadf3a-fb31-4d02-ab0e-d173863896c8",
            "01bf5cb4-a152-4eb2-8d09-9367e182b608",
            9687.0
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
            "3a769fe5-ee23-42bf-947c-a065feae4e58",
            "25fadf3a-fb31-4d02-ab0e-d173863896c8",
            "01bf5cb4-a152-4eb2-8d09-9367e182b608",
            9687.0
        )
                .requestId("37d4c4a4-dabf-4ab6-ba31-5fb48e82ab0b");
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
            "3a769fe5-ee23-42bf-947c-a065feae4e58",
            "25fadf3a-fb31-4d02-ab0e-d173863896c8",
            "01bf5cb4-a152-4eb2-8d09-9367e182b608",
            9687.0
        )
                .description("JBRZmQUgzecqWdDVSstoEtPVoykbtA6l7WDayqQLAKXyhWYdlIHfSBBKI1")
                .requestId("832b55cb-dc90-46d1-ac8d-0fb44328a863");
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
            "3a769fe5-ee23-42bf-947c-a065feae4e58",
            "25fadf3a-fb31-4d02-ab0e-d173863896c8",
            "01bf5cb4-a152-4eb2-8d09-9367e182b608",
            9687.0
        )
                .metadata("{\"key\":\"value\"}")
                .description("6HLesoN7AsxjaX4bkzoW5SSzFCKjOEE829PJZq44v95w5OTBAsM3ixdWcd35lzGg9k8zX5Zx6rdz")
                .requestId("d7a5de29-8fda-47c0-ba8e-5e36d9e5fbff");
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
