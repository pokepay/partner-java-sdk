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
            "2f89887a-34d3-4b8f-bb0f-85ef0554db01",
            "f2c54019-0174-40b4-9bac-a84871d63d1f",
            "73c373b9-1e47-4432-91d2-24c130729759"
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
            "2f89887a-34d3-4b8f-bb0f-85ef0554db01",
            "f2c54019-0174-40b4-9bac-a84871d63d1f",
            "73c373b9-1e47-4432-91d2-24c130729759"
        )
                .requestId("8a7139d0-935f-47f9-91fe-1c6d721468e5");
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
            "2f89887a-34d3-4b8f-bb0f-85ef0554db01",
            "f2c54019-0174-40b4-9bac-a84871d63d1f",
            "73c373b9-1e47-4432-91d2-24c130729759"
        )
                .metadata("{\"key\":\"value\"}")
                .requestId("12bebf52-1782-4c97-a62e-f1a86afa4fc6");
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
            "2f89887a-34d3-4b8f-bb0f-85ef0554db01",
            "f2c54019-0174-40b4-9bac-a84871d63d1f",
            "73c373b9-1e47-4432-91d2-24c130729759"
        )
                .description("OHsPVjb9UCbPcYx5YXiYOW0oa5SUOR88F7Ubd6EIlmfbIWBjq1h3aM3MFSn6Z9Xp0dYAIwKPnm62HiK775FUjJKUwWsCFULHC5xu9xwKzEEFrv0p5VC2XFSxIKMXYPxeKc")
                .metadata("{\"key\":\"value\"}")
                .requestId("5a76cd36-21f6-48db-b3bc-5f0e70eb8275");
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
            "2f89887a-34d3-4b8f-bb0f-85ef0554db01",
            "f2c54019-0174-40b4-9bac-a84871d63d1f",
            "73c373b9-1e47-4432-91d2-24c130729759"
        )
                .pointExpiresAt("2016-08-20T01:52:44.000000+09:00")
                .description("aCEMZ2Ju8UbXHSU9E0Qlg3gebvAwjzG8UYapgA4DXNtjsg9PgQkXqYPn4dGIxCAVXu8wPFdMI0g8RX9GwTm1EaeDH0r")
                .metadata("{\"key\":\"value\"}")
                .requestId("0e0f61de-7097-4407-b5ee-00699e6fdaf3");
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
            "2f89887a-34d3-4b8f-bb0f-85ef0554db01",
            "f2c54019-0174-40b4-9bac-a84871d63d1f",
            "73c373b9-1e47-4432-91d2-24c130729759"
        )
                .pointAmount(2990)
                .pointExpiresAt("2021-02-17T16:15:35.000000+09:00")
                .description("A8D7RtvLwRN8QmXijHIyMGxrgTxrmP2c2b7AqdqrRaU4tsNqOUthYSxSa5qYfKcdpEzIZoGgQ8JT7nM2XSRS8qz")
                .metadata("{\"key\":\"value\"}")
                .requestId("5a2a4465-2305-4407-a68a-cbcac4f40703");
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
            "2f89887a-34d3-4b8f-bb0f-85ef0554db01",
            "f2c54019-0174-40b4-9bac-a84871d63d1f",
            "73c373b9-1e47-4432-91d2-24c130729759"
        )
                .moneyAmount(9664)
                .pointAmount(4875)
                .pointExpiresAt("2021-11-24T21:22:35.000000+09:00")
                .description("VaYua2WPHw1UTjf1quigD2l2JnK33Y2PKkmhgdj1RbwEdGAkTKdkwDZEgx5wET5OvQdZofRUOUAciXVcpzKCMcrOD6Emk2wkp2iXzqZDQWG9JIPYO9QhKjYAAaWngq9PQfQxKRvEszf3mWA")
                .metadata("{\"key\":\"value\"}")
                .requestId("c3815bc5-b9c8-4e22-86f7-a4cee4d60e61");
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
            "2f89887a-34d3-4b8f-bb0f-85ef0554db01",
            "f2c54019-0174-40b4-9bac-a84871d63d1f",
            "73c373b9-1e47-4432-91d2-24c130729759"
        )
                .bearPointShopId("3fd26cdf-3d0a-43e6-b596-ab4682843886")
                .moneyAmount(7781)
                .pointAmount(7532)
                .pointExpiresAt("2018-01-03T23:07:37.000000+09:00")
                .description("7xCAyi0eUz4xXH5OLhVoB1lIuiOfxpiSD0ualUMr1aiXbRr0Yt6Ont0eqhymE")
                .metadata("{\"key\":\"value\"}")
                .requestId("59acf811-bf56-438a-bd5c-f6bfb24a7f34");
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
