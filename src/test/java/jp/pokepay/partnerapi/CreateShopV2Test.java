// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.CreateShopV2;
import jp.pokepay.partnerapi.request.Request;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreateShopV2Test {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new CreateShopV2(
            "ynCfTiWLEN2pEbq7ZeB8PVJkE9NzaeTptZ5kX9rLpagdWQnEnTlLyubwibc5uG9Y4cn6ApRZ5NX6gFb5nuODlmm9rpn022H3wQmNFzbLFmfFSz1uperYHhU5vbLxW8Yq15XpRuu89q3NykiRPYO2oQiAYMcKkXBWEu4RSjxgCW3jFlgob7yobgqdqFleVhpCebdmmx3jJLFYo72YjP5p"
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
        Request request = new CreateShopV2(
            "ynCfTiWLEN2pEbq7ZeB8PVJkE9NzaeTptZ5kX9rLpagdWQnEnTlLyubwibc5uG9Y4cn6ApRZ5NX6gFb5nuODlmm9rpn022H3wQmNFzbLFmfFSz1uperYHhU5vbLxW8Yq15XpRuu89q3NykiRPYO2oQiAYMcKkXBWEu4RSjxgCW3jFlgob7yobgqdqFleVhpCebdmmx3jJLFYo72YjP5p"
        )
                .canTopupPrivateMoneyIds(new String[]{"c1852564-5135-4f08-912a-bbe1b3a86186","252e4acc-ea43-4cda-8854-a96dfbc3a98b","7518f646-64a6-4ecc-b83e-dd235a2b8575","a4b2199e-99ed-474f-ba04-7d8d4fca2bee","b44c9298-d776-483f-b275-34f0e71ce8f8","a7dcfaa1-5db1-487b-b6ab-c9bab52e51a2","984c0512-4bc5-4658-abc3-5594816b6f55","52b23058-bff9-4887-90bb-97e6c002f90b","1e73c6c3-bf3c-42fd-a1e2-c91454a20d85","365f4fea-dcc5-4174-8dec-c8e93118ec3f"});
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
        Request request = new CreateShopV2(
            "ynCfTiWLEN2pEbq7ZeB8PVJkE9NzaeTptZ5kX9rLpagdWQnEnTlLyubwibc5uG9Y4cn6ApRZ5NX6gFb5nuODlmm9rpn022H3wQmNFzbLFmfFSz1uperYHhU5vbLxW8Yq15XpRuu89q3NykiRPYO2oQiAYMcKkXBWEu4RSjxgCW3jFlgob7yobgqdqFleVhpCebdmmx3jJLFYo72YjP5p"
        )
                .privateMoneyIds(new String[]{"52baeb66-550e-48be-b777-364bc05bc004","a6d3da3d-25ef-4450-9c85-64bc69a57324","dac88bab-b29f-47dc-ad2c-86a7a41e9317","eb0f254e-230f-4c3d-9157-f30bbabf3bd5","5097460e-5eb6-4efa-959a-4becd483b9bf","4d13d733-de68-4f1e-b05a-8afcc403099f","a1166047-a285-429e-80fb-5f105c00e7ef","54495643-af97-46e5-b594-44a54a0c471b","e32eeb49-22a9-4749-a611-a50d0dad7a45","e56e6d62-9106-4e20-a1ac-f661d77551d2"})
                .canTopupPrivateMoneyIds(new String[]{"66371d97-73a6-4083-acf0-4c1a6d68ce7e","3c3b0ae4-a1aa-4ea4-a868-ff2088f725bf","de7e7d54-395d-4310-9428-a28d22d5c67d"});
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
        Request request = new CreateShopV2(
            "ynCfTiWLEN2pEbq7ZeB8PVJkE9NzaeTptZ5kX9rLpagdWQnEnTlLyubwibc5uG9Y4cn6ApRZ5NX6gFb5nuODlmm9rpn022H3wQmNFzbLFmfFSz1uperYHhU5vbLxW8Yq15XpRuu89q3NykiRPYO2oQiAYMcKkXBWEu4RSjxgCW3jFlgob7yobgqdqFleVhpCebdmmx3jJLFYo72YjP5p"
        )
                .organizationCode("--zJ-0Ka-1zk-8")
                .privateMoneyIds(new String[]{"6def9c24-386e-4b3f-bd6f-c6afc5682613","ecabccc2-216e-4f0a-8c56-22f77a805705","1f64bfb5-298a-4d8a-8e9e-607897a55001","81a0a49c-d2c8-4ed0-a2b7-90c30d96ed1e","3b1fa612-a1c9-4a39-99e2-c421d31348b5","41d65790-67f4-4ccf-919a-6b2a8fe4b4b2","f2f34471-5303-4791-b0b6-2325151dd28b","fbcb7842-8190-47ec-a1ef-2b826add4d9e","3a3df570-8bf5-40ea-abce-b8ed6e4e4299","1c9e874a-4713-47a9-89f5-fc563806b684"})
                .canTopupPrivateMoneyIds(new String[]{"6e38798d-d6cb-4699-9796-ad9667e64d1b","ba0e88ae-ea76-442b-aaac-869da061ff98","c3902bd5-d0be-4c89-aafb-f2c3386d6ab0","3af743f5-58af-4ab3-9d9b-7186b1859066","4eff11b2-4127-4e01-8c3d-a4efc9819339","13db0fce-b0f1-436c-96b6-10ae9c670575","cf9ae458-100c-4da6-beaa-44a06cc5abcd","5c833634-0c3e-4879-85b9-066b09382d64","03e72a5b-ae5d-4518-b7ec-0dd6f4918536","9997865f-1301-4d90-971f-8151c5b0a00d"});
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
        Request request = new CreateShopV2(
            "ynCfTiWLEN2pEbq7ZeB8PVJkE9NzaeTptZ5kX9rLpagdWQnEnTlLyubwibc5uG9Y4cn6ApRZ5NX6gFb5nuODlmm9rpn022H3wQmNFzbLFmfFSz1uperYHhU5vbLxW8Yq15XpRuu89q3NykiRPYO2oQiAYMcKkXBWEu4RSjxgCW3jFlgob7yobgqdqFleVhpCebdmmx3jJLFYo72YjP5p"
        )
                .externalId("Kkz6REzoI7cZYW4c0GyNh6EpQVqX4K")
                .organizationCode("--ah-")
                .privateMoneyIds(new String[]{"f5fcbeea-2a7a-46a5-beb0-f376e4475ab2","2319fabb-cdb7-4f64-a948-27455b78af2d"})
                .canTopupPrivateMoneyIds(new String[]{"b3625780-b8f2-4565-9b68-510a08d80639","c249b6e2-78b3-4776-b7fa-82f137a5b1e5","60095d02-657f-4f80-99d3-bf3dc1bb4a92","25eeba8a-62a2-468b-b27f-0e6e4dace617","4d62e930-4525-40c5-870a-11f340449dbf","3734f6a0-e7d0-4ed0-a207-a276f90d83a3","2b1cd3d1-e2ba-4a76-83bb-ae2fb1519e18","cd1f8e7c-84d9-4e6b-8150-5ac2f344eea9"});
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
        Request request = new CreateShopV2(
            "ynCfTiWLEN2pEbq7ZeB8PVJkE9NzaeTptZ5kX9rLpagdWQnEnTlLyubwibc5uG9Y4cn6ApRZ5NX6gFb5nuODlmm9rpn022H3wQmNFzbLFmfFSz1uperYHhU5vbLxW8Yq15XpRuu89q3NykiRPYO2oQiAYMcKkXBWEu4RSjxgCW3jFlgob7yobgqdqFleVhpCebdmmx3jJLFYo72YjP5p"
        )
                .email("J7wmgCWNKD@P1en.com")
                .externalId("xAKZBD2FhNoFZKIbAgSoRCK")
                .organizationCode("-BK-")
                .privateMoneyIds(new String[]{"4124bf9c-7e04-4a48-b08a-46d622c18808","0cc8eee9-5040-4b86-b4f0-09fc2d794b5a","f969af7d-03e0-4a59-9acf-6ec707d4bacb","8fbf55cc-a8d3-4865-89ab-9b8b6423e677","f3eda9a8-21f6-4a2e-8a0a-322157f73bf5","e3688661-22ce-4cb9-ba37-c29b57dec94f","656753db-83e2-4bd5-a64e-9d15d247a33b"})
                .canTopupPrivateMoneyIds(new String[]{"2c89515a-9f9a-49b0-81b0-a50870bf807d"});
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
        Request request = new CreateShopV2(
            "ynCfTiWLEN2pEbq7ZeB8PVJkE9NzaeTptZ5kX9rLpagdWQnEnTlLyubwibc5uG9Y4cn6ApRZ5NX6gFb5nuODlmm9rpn022H3wQmNFzbLFmfFSz1uperYHhU5vbLxW8Yq15XpRuu89q3NykiRPYO2oQiAYMcKkXBWEu4RSjxgCW3jFlgob7yobgqdqFleVhpCebdmmx3jJLFYo72YjP5p"
        )
                .tel("0722714-180")
                .email("CcJfOMaGd4@kHyS.com")
                .externalId("UJYrKI48UyLazcdaqg9M9b56VUQ")
                .organizationCode("ZwMF9nn2b")
                .privateMoneyIds(new String[]{"b724e61d-6ee6-49a2-a834-ca1a89da4683","c8daa07f-7a3c-4c2b-9189-aa83eda0962f","8f49e816-ff12-4062-8964-e3fdc9ae8fa4","790dcaa1-8f50-4253-b210-92c46ff2a99f","72921c18-3495-4c1d-a623-12cc9b19be28","ea946508-4125-4865-aaf7-40055b4f1702","f5fbbcb9-afea-4ff3-b64c-54e3027502bc","66306b58-666a-4fdf-a096-9383a3244c8a"})
                .canTopupPrivateMoneyIds(new String[]{"c121c482-8b52-4013-b1db-7e41464643f3","a6671c3f-6a64-413d-9e79-df05a30d955b","8a551655-9a0e-48b0-abc5-4208d4fb1a85","48632802-2324-4a6a-9e28-11fa8ae0967f","90e27489-fc46-43c7-a45e-56bfcfcc3bef","54d05eae-c629-4b26-83c5-ec05557de3ab"});
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
        Request request = new CreateShopV2(
            "ynCfTiWLEN2pEbq7ZeB8PVJkE9NzaeTptZ5kX9rLpagdWQnEnTlLyubwibc5uG9Y4cn6ApRZ5NX6gFb5nuODlmm9rpn022H3wQmNFzbLFmfFSz1uperYHhU5vbLxW8Yq15XpRuu89q3NykiRPYO2oQiAYMcKkXBWEu4RSjxgCW3jFlgob7yobgqdqFleVhpCebdmmx3jJLFYo72YjP5p"
        )
                .address("oN09yrlyTlHcxkp2hdiJWs83eoAqvgg01zZW75gRDgWRTNwobRsB1baR1aePdc9fGHLcwyelAg5Jr7zEeO7nUDq")
                .tel("089896467")
                .email("3AIOVakyq8@QHWK.com")
                .externalId("Nric3MBQYWsKtvnxoQJLloM94TQV")
                .organizationCode("853--3w2-T--oGA-xm9rE5l-v-G")
                .privateMoneyIds(new String[]{"0d2a1820-ca63-416e-afb7-994cd538a3df","ab8c30bf-ef81-4882-a55a-4c467dd1745a","8759110f-3adb-48db-b7e8-df79d86f3935","c0c28684-8588-4a06-aa10-cb52eaa8fbc9","2a50064a-1a84-4747-bf2f-dbf7bdffccbf","41ae9e2f-6de2-43c6-add3-6a5a488d331e"})
                .canTopupPrivateMoneyIds(new String[]{"fc540395-7971-4082-9533-7d942786738c","d2141f4c-1139-462b-8b9b-bf1b1ac34c66"});
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
    void test8() throws ConnectionError, ProcessingError {
        Request request = new CreateShopV2(
            "ynCfTiWLEN2pEbq7ZeB8PVJkE9NzaeTptZ5kX9rLpagdWQnEnTlLyubwibc5uG9Y4cn6ApRZ5NX6gFb5nuODlmm9rpn022H3wQmNFzbLFmfFSz1uperYHhU5vbLxW8Yq15XpRuu89q3NykiRPYO2oQiAYMcKkXBWEu4RSjxgCW3jFlgob7yobgqdqFleVhpCebdmmx3jJLFYo72YjP5p"
        )
                .postalCode("240-9254")
                .address("gz3O9wlyQ0TWfR4Gx21zM7WIQGDsPsJyAShBlCJPjtVj6RA58jW2j8noWbhryHKQAP2bBeZkmIh2UeN7Z047tEp9MnaMKkPTTOh4KlFXKgtixsqVTYrrSHZ1a0tz4EzkuhUCHWp85qyAYWUJWst1yI")
                .tel("0830-8986")
                .email("Qkur8SbZd3@wcuC.com")
                .externalId("sxkTgeUlIAlQvL5t780R8L5VrLxzRQ")
                .organizationCode("fg-W-uRD-p3j3FYv1-")
                .privateMoneyIds(new String[]{"2d951fd3-f421-4dd8-b078-c8bb6255f253","6d49f4c8-f708-498b-8ad2-e63a9c91bf8a","42e602a7-6ada-4020-a9b5-00b2053c14f9","37b19b37-16cb-4bff-a476-24118ab9326f","2e62e3ac-56e5-4d11-9e6b-576c830e89c9","ff9b29d2-9db5-4ae9-aa67-ef8950bc3da7","276cd390-f0b7-470c-b49a-101678422dc6","14be5d6b-ada6-4762-8915-930bbb883bf4","482e5762-3e12-4cfb-bd00-00e2c83d3230"})
                .canTopupPrivateMoneyIds(new String[]{"4edd096c-6b4b-4f3c-b211-781dfbba4589","7969ea4b-fd8f-40e2-948e-f638427259c2","afb9b515-f19b-4c51-b8fd-98576f854ca9"});
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
