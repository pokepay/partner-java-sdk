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
            "3c306e03-fc9f-4742-819e-76eb7dc7271d",
            "2af43fc3-7bfd-4ed1-a6ec-b0d747bdc8f1",
            "fa972a02-3b64-4c34-96a7-f6e7164f0af4",
            5857
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
            "3c306e03-fc9f-4742-819e-76eb7dc7271d",
            "2af43fc3-7bfd-4ed1-a6ec-b0d747bdc8f1",
            "fa972a02-3b64-4c34-96a7-f6e7164f0af4",
            5857
        )
                .strategy("point-preferred");
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
            "3c306e03-fc9f-4742-819e-76eb7dc7271d",
            "2af43fc3-7bfd-4ed1-a6ec-b0d747bdc8f1",
            "fa972a02-3b64-4c34-96a7-f6e7164f0af4",
            5857
        )
                .requestId("0a999d97-0637-418a-8bee-bbbcaec0c105")
                .strategy("point-preferred");
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
        items.addProperty("quantity", 1);
        items.addProperty("is_discounted", false);
        items.addProperty("other", "{}");
        JsonObject items2 = new JsonObject();
        items2.addProperty("jan_code", "abc");
        items2.addProperty("name", "name1");
        items2.addProperty("unit_price", 100);
        items2.addProperty("price", 100);
        items2.addProperty("quantity", 1);
        items2.addProperty("is_discounted", false);
        items2.addProperty("other", "{}");
        JsonObject items3 = new JsonObject();
        items3.addProperty("jan_code", "abc");
        items3.addProperty("name", "name1");
        items3.addProperty("unit_price", 100);
        items3.addProperty("price", 100);
        items3.addProperty("quantity", 1);
        items3.addProperty("is_discounted", false);
        items3.addProperty("other", "{}");
        JsonObject items4 = new JsonObject();
        items4.addProperty("jan_code", "abc");
        items4.addProperty("name", "name1");
        items4.addProperty("unit_price", 100);
        items4.addProperty("price", 100);
        items4.addProperty("quantity", 1);
        items4.addProperty("is_discounted", false);
        items4.addProperty("other", "{}");
        JsonObject items5 = new JsonObject();
        items5.addProperty("jan_code", "abc");
        items5.addProperty("name", "name1");
        items5.addProperty("unit_price", 100);
        items5.addProperty("price", 100);
        items5.addProperty("quantity", 1);
        items5.addProperty("is_discounted", false);
        items5.addProperty("other", "{}");
        JsonObject items6 = new JsonObject();
        items6.addProperty("jan_code", "abc");
        items6.addProperty("name", "name1");
        items6.addProperty("unit_price", 100);
        items6.addProperty("price", 100);
        items6.addProperty("quantity", 1);
        items6.addProperty("is_discounted", false);
        items6.addProperty("other", "{}");
        JsonObject items7 = new JsonObject();
        items7.addProperty("jan_code", "abc");
        items7.addProperty("name", "name1");
        items7.addProperty("unit_price", 100);
        items7.addProperty("price", 100);
        items7.addProperty("quantity", 1);
        items7.addProperty("is_discounted", false);
        items7.addProperty("other", "{}");
        JsonObject items8 = new JsonObject();
        items8.addProperty("jan_code", "abc");
        items8.addProperty("name", "name1");
        items8.addProperty("unit_price", 100);
        items8.addProperty("price", 100);
        items8.addProperty("quantity", 1);
        items8.addProperty("is_discounted", false);
        items8.addProperty("other", "{}");
        JsonObject items9 = new JsonObject();
        items9.addProperty("jan_code", "abc");
        items9.addProperty("name", "name1");
        items9.addProperty("unit_price", 100);
        items9.addProperty("price", 100);
        items9.addProperty("quantity", 1);
        items9.addProperty("is_discounted", false);
        items9.addProperty("other", "{}");
        JsonObject items10 = new JsonObject();
        items10.addProperty("jan_code", "abc");
        items10.addProperty("name", "name1");
        items10.addProperty("unit_price", 100);
        items10.addProperty("price", 100);
        items10.addProperty("quantity", 1);
        items10.addProperty("is_discounted", false);
        items10.addProperty("other", "{}");
        Request request = new CreatePaymentTransaction(
            "3c306e03-fc9f-4742-819e-76eb7dc7271d",
            "2af43fc3-7bfd-4ed1-a6ec-b0d747bdc8f1",
            "fa972a02-3b64-4c34-96a7-f6e7164f0af4",
            5857
        )
                .products(new Object[]{items,items2,items3,items4,items5,items6,items7,items8,items9,items10})
                .requestId("2d49628f-4b18-4524-aec3-c4280977728e")
                .strategy("money-only");
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
        items.addProperty("quantity", 1);
        items.addProperty("is_discounted", false);
        items.addProperty("other", "{}");
        JsonObject items2 = new JsonObject();
        items2.addProperty("jan_code", "abc");
        items2.addProperty("name", "name1");
        items2.addProperty("unit_price", 100);
        items2.addProperty("price", 100);
        items2.addProperty("quantity", 1);
        items2.addProperty("is_discounted", false);
        items2.addProperty("other", "{}");
        JsonObject items3 = new JsonObject();
        items3.addProperty("jan_code", "abc");
        items3.addProperty("name", "name1");
        items3.addProperty("unit_price", 100);
        items3.addProperty("price", 100);
        items3.addProperty("quantity", 1);
        items3.addProperty("is_discounted", false);
        items3.addProperty("other", "{}");
        JsonObject items4 = new JsonObject();
        items4.addProperty("jan_code", "abc");
        items4.addProperty("name", "name1");
        items4.addProperty("unit_price", 100);
        items4.addProperty("price", 100);
        items4.addProperty("quantity", 1);
        items4.addProperty("is_discounted", false);
        items4.addProperty("other", "{}");
        Request request = new CreatePaymentTransaction(
            "3c306e03-fc9f-4742-819e-76eb7dc7271d",
            "2af43fc3-7bfd-4ed1-a6ec-b0d747bdc8f1",
            "fa972a02-3b64-4c34-96a7-f6e7164f0af4",
            5857
        )
                .metadata("{\"key\":\"value\"}")
                .products(new Object[]{items,items2,items3,items4})
                .requestId("c49bcb53-c73f-4fc7-8f27-693b7d54ead9")
                .strategy("money-only");
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
    void test5() throws ConnectionError, ProcessingError {
        JsonObject items = new JsonObject();
        items.addProperty("jan_code", "abc");
        items.addProperty("name", "name1");
        items.addProperty("unit_price", 100);
        items.addProperty("price", 100);
        items.addProperty("quantity", 1);
        items.addProperty("is_discounted", false);
        items.addProperty("other", "{}");
        JsonObject items2 = new JsonObject();
        items2.addProperty("jan_code", "abc");
        items2.addProperty("name", "name1");
        items2.addProperty("unit_price", 100);
        items2.addProperty("price", 100);
        items2.addProperty("quantity", 1);
        items2.addProperty("is_discounted", false);
        items2.addProperty("other", "{}");
        JsonObject items3 = new JsonObject();
        items3.addProperty("jan_code", "abc");
        items3.addProperty("name", "name1");
        items3.addProperty("unit_price", 100);
        items3.addProperty("price", 100);
        items3.addProperty("quantity", 1);
        items3.addProperty("is_discounted", false);
        items3.addProperty("other", "{}");
        JsonObject items4 = new JsonObject();
        items4.addProperty("jan_code", "abc");
        items4.addProperty("name", "name1");
        items4.addProperty("unit_price", 100);
        items4.addProperty("price", 100);
        items4.addProperty("quantity", 1);
        items4.addProperty("is_discounted", false);
        items4.addProperty("other", "{}");
        JsonObject items5 = new JsonObject();
        items5.addProperty("jan_code", "abc");
        items5.addProperty("name", "name1");
        items5.addProperty("unit_price", 100);
        items5.addProperty("price", 100);
        items5.addProperty("quantity", 1);
        items5.addProperty("is_discounted", false);
        items5.addProperty("other", "{}");
        JsonObject items6 = new JsonObject();
        items6.addProperty("jan_code", "abc");
        items6.addProperty("name", "name1");
        items6.addProperty("unit_price", 100);
        items6.addProperty("price", 100);
        items6.addProperty("quantity", 1);
        items6.addProperty("is_discounted", false);
        items6.addProperty("other", "{}");
        JsonObject items7 = new JsonObject();
        items7.addProperty("jan_code", "abc");
        items7.addProperty("name", "name1");
        items7.addProperty("unit_price", 100);
        items7.addProperty("price", 100);
        items7.addProperty("quantity", 1);
        items7.addProperty("is_discounted", false);
        items7.addProperty("other", "{}");
        JsonObject items8 = new JsonObject();
        items8.addProperty("jan_code", "abc");
        items8.addProperty("name", "name1");
        items8.addProperty("unit_price", 100);
        items8.addProperty("price", 100);
        items8.addProperty("quantity", 1);
        items8.addProperty("is_discounted", false);
        items8.addProperty("other", "{}");
        JsonObject items9 = new JsonObject();
        items9.addProperty("jan_code", "abc");
        items9.addProperty("name", "name1");
        items9.addProperty("unit_price", 100);
        items9.addProperty("price", 100);
        items9.addProperty("quantity", 1);
        items9.addProperty("is_discounted", false);
        items9.addProperty("other", "{}");
        JsonObject items10 = new JsonObject();
        items10.addProperty("jan_code", "abc");
        items10.addProperty("name", "name1");
        items10.addProperty("unit_price", 100);
        items10.addProperty("price", 100);
        items10.addProperty("quantity", 1);
        items10.addProperty("is_discounted", false);
        items10.addProperty("other", "{}");
        Request request = new CreatePaymentTransaction(
            "3c306e03-fc9f-4742-819e-76eb7dc7271d",
            "2af43fc3-7bfd-4ed1-a6ec-b0d747bdc8f1",
            "fa972a02-3b64-4c34-96a7-f6e7164f0af4",
            5857
        )
                .description("qsqY3PQB7j8S1LcJM99jV6h5DQ4TL9sXbFiutZ4wFjGxBLsRpox6uXLc6he8Kxv6FPaZ8I6AxiybIUdjn2JlMSQ6V8dRYSFDiggsas4Nm4Pbqn0MLycuAIyd8Tc91YrDumA0BEPaxu5hz8quH88gYqQC45")
                .metadata("{\"key\":\"value\"}")
                .products(new Object[]{items,items2,items3,items4,items5,items6,items7,items8,items9,items10})
                .requestId("12931051-0a7d-4273-9c2d-da8e52337fe5")
                .strategy("money-only");
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
