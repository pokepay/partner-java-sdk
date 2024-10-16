// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.CreateTopupTransaction;
import jp.pokepay.partnerapi.request.Request;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreateTopupTransactionTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new CreateTopupTransaction(
            "bbafe09a-0ee7-49a4-ab24-d4ae379dba38",
            "0686a451-395f-4e53-9a1d-f813f169da77",
            "af4d7e4a-0031-4775-a48c-64a95566c41c"
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
        Request request = new CreateTopupTransaction(
            "bbafe09a-0ee7-49a4-ab24-d4ae379dba38",
            "0686a451-395f-4e53-9a1d-f813f169da77",
            "af4d7e4a-0031-4775-a48c-64a95566c41c"
        )
                .requestId("6c64555b-d9af-4745-97c9-087ea03b9908");
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
        Request request = new CreateTopupTransaction(
            "bbafe09a-0ee7-49a4-ab24-d4ae379dba38",
            "0686a451-395f-4e53-9a1d-f813f169da77",
            "af4d7e4a-0031-4775-a48c-64a95566c41c"
        )
                .metadata("{\"key\":\"value\"}")
                .requestId("f939997e-bb86-43a1-8662-9fa926ac4089");
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
        Request request = new CreateTopupTransaction(
            "bbafe09a-0ee7-49a4-ab24-d4ae379dba38",
            "0686a451-395f-4e53-9a1d-f813f169da77",
            "af4d7e4a-0031-4775-a48c-64a95566c41c"
        )
                .description("7zDJ6KZTEk0mDRGqd8jGihF2zo2GN3QYDG6CZS1PVe5LZzi2NmWBluHrzflOytNd3ROmH9nMfAHnX3LOs6P3dxLhDjrt4CFESWJnPCLUxGLtrgoghS3pPHE574eeX1ksH4R2MgyW6z149JBRZmQUgzecq")
                .metadata("{\"key\":\"value\"}")
                .requestId("53596018-c257-4fe4-bcc4-8d098d867fd6");
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
        Request request = new CreateTopupTransaction(
            "bbafe09a-0ee7-49a4-ab24-d4ae379dba38",
            "0686a451-395f-4e53-9a1d-f813f169da77",
            "af4d7e4a-0031-4775-a48c-64a95566c41c"
        )
                .pointExpiresAt("2022-04-26T11:41:07.000000Z")
                .description("stoEtPVoykbtA6l7WDayqQLAKXyhWYdlIH")
                .metadata("{\"key\":\"value\"}")
                .requestId("2ce8fee6-9053-40fe-8242-cc4bb1fa0349");
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
        Request request = new CreateTopupTransaction(
            "bbafe09a-0ee7-49a4-ab24-d4ae379dba38",
            "0686a451-395f-4e53-9a1d-f813f169da77",
            "af4d7e4a-0031-4775-a48c-64a95566c41c"
        )
                .pointAmount(817)
                .pointExpiresAt("2021-09-07T09:54:19.000000Z")
                .description("Ql4cK6HLesoN7AsxjaX4bkzoW5SSzFCKjOEE829PJZq44v95w5OTBAsM3ixdWcd35lzGg9k8zX5Zx6rdzZ6Kiw60EKpO7FL05ARSiRG2UPRPUxcw9rvtxOfCP20hUm1E2Nlz5V1CO5TSFyNto")
                .metadata("{\"key\":\"value\"}")
                .requestId("ca208929-ae70-4cf1-893f-8fbf31547cbb");
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
    void test6() throws ConnectionError, ProcessingError {
        Request request = new CreateTopupTransaction(
            "bbafe09a-0ee7-49a4-ab24-d4ae379dba38",
            "0686a451-395f-4e53-9a1d-f813f169da77",
            "af4d7e4a-0031-4775-a48c-64a95566c41c"
        )
                .moneyAmount(6582)
                .pointAmount(2496)
                .pointExpiresAt("2021-03-28T20:33:04.000000Z")
                .description("rDgQTiBz8hopleWuv10dzqDmxXKufPIjjJpzSXKPSRMVYMVxniANdM0yy6srRZNC9bYJ")
                .metadata("{\"key\":\"value\"}")
                .requestId("28d8b055-11a7-4321-8657-46f08b430634");
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
    void test7() throws ConnectionError, ProcessingError {
        Request request = new CreateTopupTransaction(
            "bbafe09a-0ee7-49a4-ab24-d4ae379dba38",
            "0686a451-395f-4e53-9a1d-f813f169da77",
            "af4d7e4a-0031-4775-a48c-64a95566c41c"
        )
                .bearPointShopId("6bfc44af-b553-494a-9dc4-281b2f3b2864")
                .moneyAmount(1469)
                .pointAmount(9488)
                .pointExpiresAt("2023-01-18T11:40:14.000000Z")
                .description("9Vw0ghvUwHY4GPMgqa4p3NBV6jnDEmNinmBAkCQlWqd4VgtaT7nx9nCCSGOYqsqY3")
                .metadata("{\"key\":\"value\"}")
                .requestId("a5258802-a1a5-41a5-84d0-40d1007639c2");
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
