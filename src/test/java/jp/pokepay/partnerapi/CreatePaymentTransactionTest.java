// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.CreatePaymentTransaction;
import jp.pokepay.partnerapi.request.Request;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreatePaymentTransactionTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new CreatePaymentTransaction(
            "e0111ac5-08fd-4245-8a46-30f306051dbc",
            "547ba588-da25-4d37-92d5-6cd2f29aeafe",
            "d66598e9-1e4a-4a48-a617-dd8e9f798236",
            109
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
            "e0111ac5-08fd-4245-8a46-30f306051dbc",
            "547ba588-da25-4d37-92d5-6cd2f29aeafe",
            "d66598e9-1e4a-4a48-a617-dd8e9f798236",
            109
        )
                .requestId("f420be6e-d6a6-4d67-ab23-35bf6995b305");
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
        JsonObject items8 = new JsonObject();
        items8.addProperty("jan_code", "abc");
        items8.addProperty("name", "name1");
        items8.addProperty("unit_price", 100);
        items8.addProperty("price", 100);
        items8.addProperty("is_discounted", false);
        items8.addProperty("other", "{}");
        JsonObject items9 = new JsonObject();
        items9.addProperty("jan_code", "abc");
        items9.addProperty("name", "name1");
        items9.addProperty("unit_price", 100);
        items9.addProperty("price", 100);
        items9.addProperty("is_discounted", false);
        items9.addProperty("other", "{}");
        JsonObject items10 = new JsonObject();
        items10.addProperty("jan_code", "abc");
        items10.addProperty("name", "name1");
        items10.addProperty("unit_price", 100);
        items10.addProperty("price", 100);
        items10.addProperty("is_discounted", false);
        items10.addProperty("other", "{}");
        Request request = new CreatePaymentTransaction(
            "e0111ac5-08fd-4245-8a46-30f306051dbc",
            "547ba588-da25-4d37-92d5-6cd2f29aeafe",
            "d66598e9-1e4a-4a48-a617-dd8e9f798236",
            109
        )
                .products(new Object[]{items,items2,items3,items4,items5,items6,items7,items8,items9,items10})
                .requestId("1c9e2f9b-a46c-4707-9216-9fbbe086e1e7");
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
        Request request = new CreatePaymentTransaction(
            "e0111ac5-08fd-4245-8a46-30f306051dbc",
            "547ba588-da25-4d37-92d5-6cd2f29aeafe",
            "d66598e9-1e4a-4a48-a617-dd8e9f798236",
            109
        )
                .metadata("{\"key\":\"value\"}")
                .products(new Object[]{items})
                .requestId("566b69b3-b424-4f74-9db5-ea1e3a5e6227");
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
        JsonObject items8 = new JsonObject();
        items8.addProperty("jan_code", "abc");
        items8.addProperty("name", "name1");
        items8.addProperty("unit_price", 100);
        items8.addProperty("price", 100);
        items8.addProperty("is_discounted", false);
        items8.addProperty("other", "{}");
        JsonObject items9 = new JsonObject();
        items9.addProperty("jan_code", "abc");
        items9.addProperty("name", "name1");
        items9.addProperty("unit_price", 100);
        items9.addProperty("price", 100);
        items9.addProperty("is_discounted", false);
        items9.addProperty("other", "{}");
        Request request = new CreatePaymentTransaction(
            "e0111ac5-08fd-4245-8a46-30f306051dbc",
            "547ba588-da25-4d37-92d5-6cd2f29aeafe",
            "d66598e9-1e4a-4a48-a617-dd8e9f798236",
            109
        )
                .description("51AWYy2EKxgIvudVQKM3ivlyVYA6fe68jtm2G7nC3SW8MPeFKTYT7eEYLwvHQFKDImV0W8uMWRziTXMumFeaEHdh8PePoMZwnAEmuUL6pb761IWS7zT3jmF3XMzgKDKO5o6UqQsbMF41d")
                .metadata("{\"key\":\"value\"}")
                .products(new Object[]{items,items2,items3,items4,items5,items6,items7,items8,items9})
                .requestId("9e91eb88-ff9d-4f59-8855-183ad2871d6e");
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
