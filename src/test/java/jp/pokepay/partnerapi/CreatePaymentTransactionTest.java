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
            "dde19d05-b2b2-448b-a745-924becbcdff8",
            "b0060417-a30b-41a1-a749-90998fb7722a",
            "d49a65ba-acf6-4975-a4a8-56048e176b22",
            7426
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
            "dde19d05-b2b2-448b-a745-924becbcdff8",
            "b0060417-a30b-41a1-a749-90998fb7722a",
            "d49a65ba-acf6-4975-a4a8-56048e176b22",
            7426
        )
                .requestId("69e78922-ce60-4abb-9f95-e051bb59f8a7");
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
        Request request = new CreatePaymentTransaction(
            "dde19d05-b2b2-448b-a745-924becbcdff8",
            "b0060417-a30b-41a1-a749-90998fb7722a",
            "d49a65ba-acf6-4975-a4a8-56048e176b22",
            7426
        )
                .products(new Object[]{items,items2,items3,items4,items5})
                .requestId("759620a6-d7b3-4ce9-9b99-4ff6d218883c");
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
            "dde19d05-b2b2-448b-a745-924becbcdff8",
            "b0060417-a30b-41a1-a749-90998fb7722a",
            "d49a65ba-acf6-4975-a4a8-56048e176b22",
            7426
        )
                .metadata("{\"key\":\"value\"}")
                .products(new Object[]{items})
                .requestId("032690a9-8898-4893-a079-e38942328fd6");
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
        Request request = new CreatePaymentTransaction(
            "dde19d05-b2b2-448b-a745-924becbcdff8",
            "b0060417-a30b-41a1-a749-90998fb7722a",
            "d49a65ba-acf6-4975-a4a8-56048e176b22",
            7426
        )
                .description("6fe68jtm2G7nC3SW8MPeFKTYT7eEYLwvHQFKDImV0W8uMWRziTXMumFeaEHdh8PePo")
                .metadata("{\"key\":\"value\"}")
                .products(new Object[]{items})
                .requestId("3caff25c-e97d-4991-80da-4b77ae11b96e");
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
