// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.CreateExternalTransaction;
import jp.pokepay.partnerapi.request.Request;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreateExternalTransactionTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new CreateExternalTransaction(
            "5b8c1045-7438-4e79-a58e-622e5cfa8838",
            "52387805-2fbb-47f8-a4e9-9e235d9cc243",
            "8b951d70-c974-4472-807e-2e991747cc38",
            6488
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
        Request request = new CreateExternalTransaction(
            "5b8c1045-7438-4e79-a58e-622e5cfa8838",
            "52387805-2fbb-47f8-a4e9-9e235d9cc243",
            "8b951d70-c974-4472-807e-2e991747cc38",
            6488
        )
                .requestId("52fd151a-8b14-4913-b323-19116a5d3cfe");
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
        JsonObject items = new JsonObject();
        items.addProperty("jan_code", "abc");
        items.addProperty("name", "name1");
        items.addProperty("unit_price", 100);
        items.addProperty("price", 100);
        items.addProperty("is_discounted", false);
        items.addProperty("other", "{}");
        Request request = new CreateExternalTransaction(
            "5b8c1045-7438-4e79-a58e-622e5cfa8838",
            "52387805-2fbb-47f8-a4e9-9e235d9cc243",
            "8b951d70-c974-4472-807e-2e991747cc38",
            6488
        )
                .products(new Object[]{items})
                .requestId("0219c8d1-fe53-4624-8aa7-e07dc1376673");
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
        JsonObject items = new JsonObject();
        items.addProperty("jan_code", "abc");
        items.addProperty("name", "name1");
        items.addProperty("unit_price", 100);
        items.addProperty("price", 100);
        items.addProperty("is_discounted", false);
        items.addProperty("other", "{}");
        Request request = new CreateExternalTransaction(
            "5b8c1045-7438-4e79-a58e-622e5cfa8838",
            "52387805-2fbb-47f8-a4e9-9e235d9cc243",
            "8b951d70-c974-4472-807e-2e991747cc38",
            6488
        )
                .metadata("{\"key\":\"value\"}")
                .products(new Object[]{items})
                .requestId("9c3d530b-567d-409a-b9e3-c8a2fa6bfa9f");
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
    void test4() throws ConnectionError, ProcessingError {
        JsonObject items = new JsonObject();
        items.addProperty("jan_code", "abc");
        items.addProperty("name", "name1");
        items.addProperty("unit_price", 100);
        items.addProperty("price", 100);
        items.addProperty("is_discounted", false);
        items.addProperty("other", "{}");
        JsonObject items2 = new JsonObject();
        items2.addProperty("jan_code", "abc");
        items2.addProperty("name", "name1");
        items2.addProperty("unit_price", 100);
        items2.addProperty("price", 100);
        items2.addProperty("is_discounted", false);
        items2.addProperty("other", "{}");
        Request request = new CreateExternalTransaction(
            "5b8c1045-7438-4e79-a58e-622e5cfa8838",
            "52387805-2fbb-47f8-a4e9-9e235d9cc243",
            "8b951d70-c974-4472-807e-2e991747cc38",
            6488
        )
                .description("vMVMzYpfEHHq4AVCPhpFJVl2NE9OohrFLhvA")
                .metadata("{\"key\":\"value\"}")
                .products(new Object[]{items,items2})
                .requestId("37140474-4d1b-44b9-9132-1dd973a82581");
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
