// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.CreateCheck;
import jp.pokepay.partnerapi.request.Request;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreateCheckTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new CreateCheck(
            "daf2d002-f16e-4d5c-81f5-532f11a3f3f2"
        )
                .moneyAmount(8380.0);
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
        Request request = new CreateCheck(
            "daf2d002-f16e-4d5c-81f5-532f11a3f3f2"
        )
                .moneyAmount(6406.0)
                .description("36TYPgxIzfeirgwWnuJKugM3OQh2JHBnxbiEM0oFGnnvKX9mW4mLerHweV6yDqMFurm2HyY5rxBRsFTyEvnewbYd4rNZJsCq7m7arw2NKYH12xHXaAOFqIwxrvxkxwVYBDQiRCyVT");
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
        Request request = new CreateCheck(
            "daf2d002-f16e-4d5c-81f5-532f11a3f3f2"
        )
                .moneyAmount(8734.0)
                .setOnetime(true)
                .description("3czNdwQ9LziqjK5MdQ1lZMyARXVB9A32ESqVUKE1GN9JqLEvyRdA5j20ws4Z1");
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
        Request request = new CreateCheck(
            "daf2d002-f16e-4d5c-81f5-532f11a3f3f2"
        )
                .moneyAmount(7574.0)
                .usageLimit(138)
                .setOnetime(true)
                .description("jZ8xWKeN3WKGyHXCKDfS0S9olxtCG8sS34enFyHhIbteE1tQOMttUhD0OiwEvovxL7L6kZ3KaNub1zwaCdHgj8ik3dmsSURUNaSg6OcHEmOeQFO");
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
        Request request = new CreateCheck(
            "daf2d002-f16e-4d5c-81f5-532f11a3f3f2"
        )
                .moneyAmount(7859.0)
                .expiresAt("2023-05-07T23:01:35.000000Z")
                .usageLimit(3057)
                .setOnetime(true)
                .description("SQ0YVNC6SfrLsEgbwDrafzykU4qQWwEl9RBh7JkqQ2DDr8e6Qf8fK7SBxethCuCr4dBSWzD3agMTAvZtCmtviHLHOBHoLHZ5Hyso5u9Osjia9h3ovwp1QqOYhJf");
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
        Request request = new CreateCheck(
            "daf2d002-f16e-4d5c-81f5-532f11a3f3f2"
        )
                .moneyAmount(7124.0)
                .pointExpiresAt("2023-05-07T19:04:42.000000Z")
                .expiresAt("2021-04-03T08:49:41.000000Z")
                .usageLimit(5919)
                .setOnetime(true)
                .description("v94bnDyHKg7jf7TRBDusrb62imeaN035TYhQYVT6897JBIT98Ea3vOiHnJbC3RzxMsGYTRQVbbDGQ3KFvfr7wcTIqfZGa8VmM7LxaafZsEiZ4h1kUtLESZUqCMHUv6WI9WlLqAjFFVtovIA3w7if4YoZJ6xmZ8");
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
        Request request = new CreateCheck(
            "daf2d002-f16e-4d5c-81f5-532f11a3f3f2"
        )
                .moneyAmount(5070.0)
                .pointExpiresInDays(6716)
                .pointExpiresAt("2023-03-31T08:24:20.000000Z")
                .expiresAt("2020-11-28T02:54:40.000000Z")
                .usageLimit(2977)
                .setOnetime(false)
                .description("ZaugRp11iMcrfILoN8ZP7287JaoYb8spv1FcaYx8c7c37K2BoQEomxqdvzxKVxdoit0nsRdkY0a6T9IRy95uKnYj6aDVb3qDkr4zFWttvA7t4NS9wkdOXwioDpfXuzoNbRpuKefj9znX2XonFzQcO5QEOmdgUm73I2kFchNQksZB6By");
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
        Request request = new CreateCheck(
            "daf2d002-f16e-4d5c-81f5-532f11a3f3f2"
        )
                .moneyAmount(2132.0)
                .bearPointAccount("564f0633-c088-426c-bfdf-b12916570056")
                .pointExpiresInDays(4947)
                .pointExpiresAt("2024-03-06T17:39:29.000000Z")
                .expiresAt("2024-01-16T03:09:56.000000Z")
                .usageLimit(8911)
                .setOnetime(true)
                .description("23WFeXCsADfveWv5SetJLuZcB6tdcwibyPvTHbjOWbqqVGNOP2f7Fmc6X");
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
        Request request = new CreateCheck(
            "daf2d002-f16e-4d5c-81f5-532f11a3f3f2"
        )
                .moneyAmount(2943.0)
                .pointAmount(6616.0);
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
    void test9() throws ConnectionError, ProcessingError {
        Request request = new CreateCheck(
            "daf2d002-f16e-4d5c-81f5-532f11a3f3f2"
        )
                .moneyAmount(4440.0)
                .pointAmount(2094.0)
                .description("3Y5XPxnjFhfkfYgvABxRhjV7rXm6F6onhtgkbe1I3fnSrAjiMpnuQgQNZWqLAFAWqZBqyjs43AAjNC");
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
    void test10() throws ConnectionError, ProcessingError {
        Request request = new CreateCheck(
            "daf2d002-f16e-4d5c-81f5-532f11a3f3f2"
        )
                .moneyAmount(1341.0)
                .pointAmount(3944.0)
                .setOnetime(false)
                .description("ERBnJER6lOBQBwAgsTow2Z3Uka1wds9TY9Bp5VDJiBPB1XeTNJcIKtWyeNc1zzlxW2hgOK8NI225RAsUHuuLFS4058hKDGnyjbxrF6zxkmTZedVWeLbSdWlORFkWxf1fgII7vrhxHZrOE");
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
    void test11() throws ConnectionError, ProcessingError {
        Request request = new CreateCheck(
            "daf2d002-f16e-4d5c-81f5-532f11a3f3f2"
        )
                .moneyAmount(1020.0)
                .pointAmount(7368.0)
                .usageLimit(6710)
                .setOnetime(false)
                .description("NdDlfIrfFFwUdXhpSi4j72IcAxs47XeIzYlwiQaQGyn4Age91Y1cWNDBnv9RrzZK5kL8kuH9QZjAoA9Wjz3xWF4fJVtnG3Avmta20vIgud6F1UgGMHbk2IRflsvwuZxk0nQmXMvg0FcWUrBHOSV7LC2s46hfsRF0YKxTClCMK7WZ9OzN");
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
    void test12() throws ConnectionError, ProcessingError {
        Request request = new CreateCheck(
            "daf2d002-f16e-4d5c-81f5-532f11a3f3f2"
        )
                .moneyAmount(5196.0)
                .pointAmount(8782.0)
                .expiresAt("2023-04-24T17:55:07.000000Z")
                .usageLimit(3819)
                .setOnetime(true)
                .description("oAuPSksHUuefNAm0yTlB8Y7jnhE6v0ICVfZpB32LWZFMYYNQ77hNnDgeQkP6BrHNLW2TjgwJkClYsxYjLV6mNckmXWb6cDTOBEvT1fZ");
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
    void test13() throws ConnectionError, ProcessingError {
        Request request = new CreateCheck(
            "daf2d002-f16e-4d5c-81f5-532f11a3f3f2"
        )
                .moneyAmount(5465.0)
                .pointAmount(9473.0)
                .pointExpiresAt("2023-01-06T00:46:39.000000Z")
                .expiresAt("2023-12-11T07:46:43.000000Z")
                .usageLimit(1602)
                .setOnetime(true)
                .description("tgwRL");
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
    void test14() throws ConnectionError, ProcessingError {
        Request request = new CreateCheck(
            "daf2d002-f16e-4d5c-81f5-532f11a3f3f2"
        )
                .moneyAmount(778.0)
                .pointAmount(5777.0)
                .pointExpiresInDays(5743)
                .pointExpiresAt("2020-09-11T08:09:37.000000Z")
                .expiresAt("2020-06-24T07:15:37.000000Z")
                .usageLimit(6025)
                .setOnetime(true)
                .description("1");
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
    void test15() throws ConnectionError, ProcessingError {
        Request request = new CreateCheck(
            "daf2d002-f16e-4d5c-81f5-532f11a3f3f2"
        )
                .moneyAmount(3271.0)
                .pointAmount(1239.0)
                .bearPointAccount("d98f9df1-5a7b-4001-a67e-7d325bfa80fc")
                .pointExpiresInDays(1933)
                .pointExpiresAt("2022-10-06T14:18:40.000000Z")
                .expiresAt("2021-10-09T18:26:18.000000Z")
                .usageLimit(2848)
                .setOnetime(true)
                .description("amqpbbuSj1PURjYRasH9ARntTDK9f1O2csoG3F55uy56fVMl4ovKtbbNMLWzz4xf72tklHyikvXSu1xVqKMzKtPMLBX6YLvmDqPAbWtHJHRtQBqCHs");
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
    void test16() throws ConnectionError, ProcessingError {
        Request request = new CreateCheck(
            "daf2d002-f16e-4d5c-81f5-532f11a3f3f2"
        )
                .pointAmount(4728.0);
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
    void test17() throws ConnectionError, ProcessingError {
        Request request = new CreateCheck(
            "daf2d002-f16e-4d5c-81f5-532f11a3f3f2"
        )
                .pointAmount(4232.0)
                .description("1kIOiSHcZ37iojnk7j2j33qMA4N2evwLBNS7QyCEhtgNDuAnxydB9u3o7ZMeTosoRh4S0mExQI1uCwHXvSS9xqXNJMeqv2rRxx8SeYgA5RTAZIE0d3whSKLF4xWXCgQOdSsQVPrApoltrzZbMjGbqCaDUv1CsWTy6z2FdXbfXavW2HwaVVWGcOvR");
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
    void test18() throws ConnectionError, ProcessingError {
        Request request = new CreateCheck(
            "daf2d002-f16e-4d5c-81f5-532f11a3f3f2"
        )
                .pointAmount(5863.0)
                .setOnetime(true)
                .description("fjTir1eeHpnGAvFN5uVHKI7mM3plgJR5");
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
    void test19() throws ConnectionError, ProcessingError {
        Request request = new CreateCheck(
            "daf2d002-f16e-4d5c-81f5-532f11a3f3f2"
        )
                .pointAmount(8844.0)
                .usageLimit(6043)
                .setOnetime(false)
                .description("wzKIFQcpGZZVlRU03Fa2F6PUopGrOCijX4VQZjHwhb9lV9sTjbq8Wo22UU1er3T1gBtfr20CiDsCwyLdW5AzEeQbE5VhNxjrtNh84WLuHKWoYQpDLtJyiWbDVy6Ss7attO0");
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
    void test20() throws ConnectionError, ProcessingError {
        Request request = new CreateCheck(
            "daf2d002-f16e-4d5c-81f5-532f11a3f3f2"
        )
                .pointAmount(5779.0)
                .expiresAt("2021-08-19T06:24:40.000000Z")
                .usageLimit(6812)
                .setOnetime(false)
                .description("KDvZ2PuoFKU33PYYZTEIyRn");
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
    void test21() throws ConnectionError, ProcessingError {
        Request request = new CreateCheck(
            "daf2d002-f16e-4d5c-81f5-532f11a3f3f2"
        )
                .pointAmount(7103.0)
                .pointExpiresAt("2022-04-14T03:54:12.000000Z")
                .expiresAt("2023-11-18T08:53:29.000000Z")
                .usageLimit(8965)
                .setOnetime(false)
                .description("mm72c26Cd6B3OB7swghUIdkqUOY2HAI87h7tC8vMnTzjNmFWDzLZEPN7HQXwymFrbXYvN3cal4RO9jT63dRDxKNVoewLoaJggIMA5wXB3CTdPu3I6Gb57N6Bfk723xgVJhWc2FLm");
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
    void test22() throws ConnectionError, ProcessingError {
        Request request = new CreateCheck(
            "daf2d002-f16e-4d5c-81f5-532f11a3f3f2"
        )
                .pointAmount(9717.0)
                .pointExpiresInDays(8378)
                .pointExpiresAt("2022-01-29T08:19:17.000000Z")
                .expiresAt("2020-01-09T22:54:37.000000Z")
                .usageLimit(2484)
                .setOnetime(false)
                .description("TQ1eFfFoOmA6KgKFTgUMIqeaKPydQtxKkPEiJ9F7s09s2D07ZJtROtnJyz65lsPnpU0js5rsIZ4cWpER3UtPkG2eq1I6SZr9Xo8DUROCVDxPSk72x92MmliF75MFhbZKuKGU7dTPisUgKnCVzFujd5tp1lylHobnm6HycWppeOG5c4bSqVBGp3Ank6BTTvg");
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
    void test23() throws ConnectionError, ProcessingError {
        Request request = new CreateCheck(
            "daf2d002-f16e-4d5c-81f5-532f11a3f3f2"
        )
                .pointAmount(5112.0)
                .bearPointAccount("3b5cf612-fb24-4648-ba09-81a28c59f07a")
                .pointExpiresInDays(2879)
                .pointExpiresAt("2020-05-16T22:29:02.000000Z")
                .expiresAt("2020-03-08T04:01:31.000000Z")
                .usageLimit(8140)
                .setOnetime(false)
                .description("gPMdYrCUsTg7mFBD5JyTl3OSbQF6o9LFFmkiVCdqahnf");
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
