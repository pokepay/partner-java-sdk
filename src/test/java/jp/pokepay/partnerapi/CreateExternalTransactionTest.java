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
            "73a82581-8b6a-498e-a58b-8da7d438be1e",
            "f5552e10-b0be-480e-8ec7-586b6ee31d5d",
            "5f469105-5e65-4dbc-9fd2-1979ca04045a",
            4803
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
            "73a82581-8b6a-498e-a58b-8da7d438be1e",
            "f5552e10-b0be-480e-8ec7-586b6ee31d5d",
            "5f469105-5e65-4dbc-9fd2-1979ca04045a",
            4803
        )
                .requestId("bf3e3878-8744-4ff7-aef9-538af7aa1175");
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
            "73a82581-8b6a-498e-a58b-8da7d438be1e",
            "f5552e10-b0be-480e-8ec7-586b6ee31d5d",
            "5f469105-5e65-4dbc-9fd2-1979ca04045a",
            4803
        )
                .products(new Object[]{items})
                .requestId("fb52827a-0050-4ae4-9792-6d5e056ab966");
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
        Request request = new CreateExternalTransaction(
            "73a82581-8b6a-498e-a58b-8da7d438be1e",
            "f5552e10-b0be-480e-8ec7-586b6ee31d5d",
            "5f469105-5e65-4dbc-9fd2-1979ca04045a",
            4803
        )
                .metadata("{\"key\":\"value\"}")
                .products(new Object[]{items,items2,items3,items4,items5,items6,items7,items8,items9})
                .requestId("54113df7-4134-43b8-b253-b11f12d37d0c");
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
        Request request = new CreateExternalTransaction(
            "73a82581-8b6a-498e-a58b-8da7d438be1e",
            "f5552e10-b0be-480e-8ec7-586b6ee31d5d",
            "5f469105-5e65-4dbc-9fd2-1979ca04045a",
            4803
        )
                .description("6oHFsZh9ksnqTSKQYaLtgBF21Mao0iMx72McbAtuQfbwPK5Ol2Udeu5ClBnNsqGtwvAjO8SQrjpTlUKU7ix6vD3BTnNcaIv4Cy2qiGNeSDJueWNAF2iLhkB08mWoSEw4Yfnz5e3bjXKldANGzSZe49qKV1rholLnfHAg")
                .metadata("{\"key\":\"value\"}")
                .products(new Object[]{})
                .requestId("f88bd397-0d00-4a14-9392-c1ce23272b4a");
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
