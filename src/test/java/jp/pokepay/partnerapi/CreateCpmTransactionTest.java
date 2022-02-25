// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.CreateCpmTransaction;
import jp.pokepay.partnerapi.request.Request;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreateCpmTransactionTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new CreateCpmTransaction(
            "8K62vZdczxzKDF7OzztIRd",
            "bcf938bb-b749-4c82-be91-ba422b6236a0",
            6427
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
        Request request = new CreateCpmTransaction(
            "8K62vZdczxzKDF7OzztIRd",
            "bcf938bb-b749-4c82-be91-ba422b6236a0",
            6427
        )
                .requestId("da74ffa6-9ae0-4bbd-83d9-ce54de4a168a");
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
        JsonObject items2 = new JsonObject();
        items2.addProperty("jan_code", "abc");
        items2.addProperty("name", "name1");
        items2.addProperty("unit_price", 100);
        items2.addProperty("price", 100);
        items2.addProperty("is_discounted", false);
        items2.addProperty("other", "{}");
        JsonObject items3 = new JsonObject();
        items3.addProperty("jan_code", "abc");
        items3.addProperty("name", "name1");
        items3.addProperty("unit_price", 100);
        items3.addProperty("price", 100);
        items3.addProperty("is_discounted", false);
        items3.addProperty("other", "{}");
        JsonObject items4 = new JsonObject();
        items4.addProperty("jan_code", "abc");
        items4.addProperty("name", "name1");
        items4.addProperty("unit_price", 100);
        items4.addProperty("price", 100);
        items4.addProperty("is_discounted", false);
        items4.addProperty("other", "{}");
        JsonObject items5 = new JsonObject();
        items5.addProperty("jan_code", "abc");
        items5.addProperty("name", "name1");
        items5.addProperty("unit_price", 100);
        items5.addProperty("price", 100);
        items5.addProperty("is_discounted", false);
        items5.addProperty("other", "{}");
        Request request = new CreateCpmTransaction(
            "8K62vZdczxzKDF7OzztIRd",
            "bcf938bb-b749-4c82-be91-ba422b6236a0",
            6427
        )
                .products(new Object[]{items,items2,items3,items4,items5})
                .requestId("c39b3253-68c8-4ef2-b488-6de0927586cb");
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
        JsonObject items2 = new JsonObject();
        items2.addProperty("jan_code", "abc");
        items2.addProperty("name", "name1");
        items2.addProperty("unit_price", 100);
        items2.addProperty("price", 100);
        items2.addProperty("is_discounted", false);
        items2.addProperty("other", "{}");
        JsonObject items3 = new JsonObject();
        items3.addProperty("jan_code", "abc");
        items3.addProperty("name", "name1");
        items3.addProperty("unit_price", 100);
        items3.addProperty("price", 100);
        items3.addProperty("is_discounted", false);
        items3.addProperty("other", "{}");
        JsonObject items4 = new JsonObject();
        items4.addProperty("jan_code", "abc");
        items4.addProperty("name", "name1");
        items4.addProperty("unit_price", 100);
        items4.addProperty("price", 100);
        items4.addProperty("is_discounted", false);
        items4.addProperty("other", "{}");
        JsonObject items5 = new JsonObject();
        items5.addProperty("jan_code", "abc");
        items5.addProperty("name", "name1");
        items5.addProperty("unit_price", 100);
        items5.addProperty("price", 100);
        items5.addProperty("is_discounted", false);
        items5.addProperty("other", "{}");
        JsonObject items6 = new JsonObject();
        items6.addProperty("jan_code", "abc");
        items6.addProperty("name", "name1");
        items6.addProperty("unit_price", 100);
        items6.addProperty("price", 100);
        items6.addProperty("is_discounted", false);
        items6.addProperty("other", "{}");
        JsonObject items7 = new JsonObject();
        items7.addProperty("jan_code", "abc");
        items7.addProperty("name", "name1");
        items7.addProperty("unit_price", 100);
        items7.addProperty("price", 100);
        items7.addProperty("is_discounted", false);
        items7.addProperty("other", "{}");
        Request request = new CreateCpmTransaction(
            "8K62vZdczxzKDF7OzztIRd",
            "bcf938bb-b749-4c82-be91-ba422b6236a0",
            6427
        )
                .metadata("{\"key\":\"value\"}")
                .products(new Object[]{items,items2,items3,items4,items5,items6,items7})
                .requestId("ff91259f-5713-409c-8483-aedd3efad920");
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
        Request request = new CreateCpmTransaction(
            "8K62vZdczxzKDF7OzztIRd",
            "bcf938bb-b749-4c82-be91-ba422b6236a0",
            6427
        )
                .description("Jx9qY9kB8kVDqJMjy6rf4CluMJ3q8UHdGY9c6av2inoQmoszzzj7gjncZRjG49ZyE9dB8fCGfTM2Oyolj4kfEe2uvMtiKxUivt9MIJ97msI3tBe6ti0SO07EXHC5hQ61pWDcVyEH0QvPCR5IiYZhX71qxxCDFjWtGssb86D9XZfo8j2fPJCGzVYdohDRxcepsSsdecs")
                .metadata("{\"key\":\"value\"}")
                .products(new Object[]{})
                .requestId("c2586985-09de-4cc5-8de3-7292ee2e2ac8");
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