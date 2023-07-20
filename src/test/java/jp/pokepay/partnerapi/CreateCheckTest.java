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
            "35a98674-54b1-4eff-b5b7-49135a97ff9c"
        )
                .moneyAmount(2816.0);
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
            "35a98674-54b1-4eff-b5b7-49135a97ff9c"
        )
                .moneyAmount(6850.0)
                .description("8n6abEccT");
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
            "35a98674-54b1-4eff-b5b7-49135a97ff9c"
        )
                .moneyAmount(8661.0)
                .setOnetime(false)
                .description("FUG9Fme9wlEEj2gZC8ckmFOzWRdKb11QTI");
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
            "35a98674-54b1-4eff-b5b7-49135a97ff9c"
        )
                .moneyAmount(4296.0)
                .usageLimit(5837)
                .setOnetime(true)
                .description("x5oJQ4O2Nwel4rHJTDGFvqXggC9Tcy7ogKmUw0VnsFyzfyt6Bg95FB1a7IFTBkW9tPubyeqITUoc54HWI6lY3NxA2Qq6LVyn2dOGJj5BoyL1MgjctfisLuYo4aorOwFrhmbs26EDkzDLnAr7NHvMDZLOk3Kn6N9IKA2DQ0UDl0RkGXqQRpkGArTGUPug");
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
            "35a98674-54b1-4eff-b5b7-49135a97ff9c"
        )
                .moneyAmount(4581.0)
                .expiresAt("2018-11-09T21:43:48.000000+09:00")
                .usageLimit(3848)
                .setOnetime(false)
                .description("JLdESdgB4DMlPhuAgx6J23S5");
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
            "35a98674-54b1-4eff-b5b7-49135a97ff9c"
        )
                .moneyAmount(2145.0)
                .pointExpiresAt("2019-03-24T07:16:36.000000+09:00")
                .expiresAt("2020-12-25T04:51:28.000000+09:00")
                .usageLimit(4385)
                .setOnetime(true)
                .description("XOeAy8xYgmSSWd6nFdHza9f0TF30iljDxgSpyfoekUtYXnQ6dyRqDXbojqilSXXfgL13rI1kMYSkzLYWcqyBEPqq6jXoMPoI5dYhtAEAC8MN1MI");
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
            "35a98674-54b1-4eff-b5b7-49135a97ff9c"
        )
                .moneyAmount(6140.0)
                .pointExpiresInDays(6303)
                .pointExpiresAt("2022-04-04T06:20:22.000000+09:00")
                .expiresAt("2019-12-08T18:06:25.000000+09:00")
                .usageLimit(3701)
                .setOnetime(true)
                .description("0xXqdkQK8VGfHRzulBqoPAVuBC2EUluqb81O3ZagKE8LcCa8bz2nHShe5EoHVudmx1iMacSt3whWHQ5cbR62EyfrAyRxoXmZ8au8D4esSHy55WYfHfvN0QEBe9OUmuQoNyA");
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
            "35a98674-54b1-4eff-b5b7-49135a97ff9c"
        )
                .moneyAmount(6910.0)
                .bearPointAccount("1cfecc92-c98c-4978-bc82-b1e4453b2968")
                .pointExpiresInDays(2261)
                .pointExpiresAt("2019-03-17T05:12:51.000000+09:00")
                .expiresAt("2019-04-14T16:51:46.000000+09:00")
                .usageLimit(5345)
                .setOnetime(true)
                .description("VM2xjqlPxxy8RqwFWTQ1hvVt9bN2zIxNZx4eE9mHPjq6XCvYjxbcuNA5AOQHru6gAXocPu4UpOUbFxl");
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
            "35a98674-54b1-4eff-b5b7-49135a97ff9c"
        )
                .moneyAmount(6705.0)
                .pointAmount(3704.0);
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
            "35a98674-54b1-4eff-b5b7-49135a97ff9c"
        )
                .moneyAmount(4896.0)
                .pointAmount(1767.0)
                .description("8SX1voG8Gydqo4fQ7D47J36mgyKf2pLnur36TYPgxIzfeirgwWnuJKugM3OQh2JHBnxbiEM0oFGnnvKX9mW4mLerHweV6yDqMFurm2HyY5rxBRsFTyEvnewbYd4rNZJsCq7m7arw2NKYH12xHXaAOFqIwxrvxkxwVYBDQiRCyVTR3czNdwQ9LziqjK5MdQ");
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
            "35a98674-54b1-4eff-b5b7-49135a97ff9c"
        )
                .moneyAmount(9393.0)
                .pointAmount(1004.0)
                .setOnetime(true)
                .description("yARXVB9A32ESqVUKE1GN9JqLEvyRdA5j20ws4Z1pnjZ8xWKeN3WKGyHXCKDfS0S9olxtCG8sS34enF");
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
            "35a98674-54b1-4eff-b5b7-49135a97ff9c"
        )
                .moneyAmount(1690.0)
                .pointAmount(7929.0)
                .usageLimit(840)
                .setOnetime(true)
                .description("bteE1tQOMttUhD0OiwEvovxL7L6kZ3KaNub1zwaCdHgj8ik3dmsSURUNaSg6OcHEmOeQFO3Ox8qDzSQ0YVNC6SfrLsEgbwDrafzykU4qQWwEl9RBh7JkqQ2DDr8e6Qf8fK7SBxethCuCr4");
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
            "35a98674-54b1-4eff-b5b7-49135a97ff9c"
        )
                .moneyAmount(9188.0)
                .pointAmount(6210.0)
                .expiresAt("2021-10-13T03:24:11.000000+09:00")
                .usageLimit(5133)
                .setOnetime(false)
                .description("zD3agMTA");
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
            "35a98674-54b1-4eff-b5b7-49135a97ff9c"
        )
                .moneyAmount(7386.0)
                .pointAmount(7924.0)
                .pointExpiresAt("2022-08-04T16:28:11.000000+09:00")
                .expiresAt("2016-02-26T14:19:06.000000+09:00")
                .usageLimit(5613)
                .setOnetime(true)
                .description("viHLHOBHoLHZ5Hyso5u9Osjia9h3ovwp1QqOYhJfTJv94bnDyHKg7jf7TRBDusrb62imeaN035TYhQYVT6897JBIT98Ea3vOiHnJbC3RzxMsGYTRQVbbDGQ3KFvfr7wcTIqfZGa8VmM7LxaafZsEiZ4h1kUtLESZUqCMHUv6WI9WlLqAjFFVtovIA3w7");
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
            "35a98674-54b1-4eff-b5b7-49135a97ff9c"
        )
                .moneyAmount(4329.0)
                .pointAmount(9908.0)
                .pointExpiresInDays(1544)
                .pointExpiresAt("2017-06-24T09:15:27.000000+09:00")
                .expiresAt("2024-06-02T21:18:13.000000+09:00")
                .usageLimit(760)
                .setOnetime(false)
                .description("8N4p4uCNZaugRp11iMcrfILoN8ZP7287J");
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
            "35a98674-54b1-4eff-b5b7-49135a97ff9c"
        )
                .moneyAmount(8362.0)
                .pointAmount(9185.0)
                .bearPointAccount("d6ff851a-8bef-4e59-9f1f-e49ad55e179d")
                .pointExpiresInDays(5825)
                .pointExpiresAt("2023-06-11T04:54:02.000000+09:00")
                .expiresAt("2017-03-08T05:13:35.000000+09:00")
                .usageLimit(8458)
                .setOnetime(true)
                .description("1FcaYx8c7c37K2BoQEomxqdvzxKVxdoit0ns");
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
            "35a98674-54b1-4eff-b5b7-49135a97ff9c"
        )
                .pointAmount(4178.0);
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
            "35a98674-54b1-4eff-b5b7-49135a97ff9c"
        )
                .pointAmount(7999.0)
                .description("0a6T9IRy95uKnYj6aDVb3qDkr4zFWttvA7t4NS9wkdOXwioDpfXuzoNbRpuKefj9znX2XonFzQcO5QEOmdgUm73I2k");
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
            "35a98674-54b1-4eff-b5b7-49135a97ff9c"
        )
                .pointAmount(4323.0)
                .setOnetime(false)
                .description("hNQksZB6ByT3lVRQ7O823WFeXCsADfveWv5SetJLuZcB6tdcwibyPvTHbjOWbqqVGNOP2f7Fmc6XSXXM3Y5XPxnjFhfkfYgvABxRhjV7rXm6F6onhtgkbe1I3fnSrAjiMpnuQgQNZWqLAFAWqZBqyjs43AAjNChMERB");
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
            "35a98674-54b1-4eff-b5b7-49135a97ff9c"
        )
                .pointAmount(3566.0)
                .usageLimit(8522)
                .setOnetime(false)
                .description("R6lOBQBwAgsTow2Z3Uka1wds9TY9Bp5VDJiBPB1XeTNJcIKtWyeNc1zzlxW2hgOK8NI225RAsUHuuLFS4058hKDGnyjbxrF6zxkmTZedVWeLbSdWlORFkWxf1fgII7vr");
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
            "35a98674-54b1-4eff-b5b7-49135a97ff9c"
        )
                .pointAmount(5898.0)
                .expiresAt("2022-02-05T14:38:26.000000+09:00")
                .usageLimit(8700)
                .setOnetime(false)
                .description("EIH6HNdDlfIrfFFwUdXhpSi4j72IcAxs47XeIzYlwiQaQGyn4Age91Y1cWNDBnv9RrzZK5kL8kuH9QZjAoA9Wjz3xWF4fJVtnG3Avmta20vIgud6F1UgGMHbk2IRflsvwuZxk0nQmXMvg0FcWUrBHOSV7LC2s46hfsRF0YKxTClCMK7WZ9OzNLNkjfoAuPS");
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
            "35a98674-54b1-4eff-b5b7-49135a97ff9c"
        )
                .pointAmount(1324.0)
                .pointExpiresAt("2017-09-19T12:32:25.000000+09:00")
                .expiresAt("2022-08-07T04:05:45.000000+09:00")
                .usageLimit(2037)
                .setOnetime(false)
                .description("NAm0yTlB8Y7jnhE6v0ICVfZpB32LWZFMYYNQ77hNnDgeQkP6BrHNLW2TjgwJkClYsxYjLV6mNckmXWb6cDTOBEvT1fZYocBrtgwRLix");
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
            "35a98674-54b1-4eff-b5b7-49135a97ff9c"
        )
                .pointAmount(5777.0)
                .pointExpiresInDays(5743)
                .pointExpiresAt("2019-12-31T10:32:39.000000+09:00")
                .expiresAt("2022-10-23T16:55:46.000000+09:00")
                .usageLimit(7857)
                .setOnetime(false)
                .description("Wqf2JPqamqpbbuSj1PURjYRasH9ARntTDK9f1O2csoG3F55uy56fVMl4ovKtbbNMLWzz4xf72tklHyikvXSu1xVqKMzKtPMLBX6YLvmDqPAbWtHJHRtQBqCHsxk71kIOiSHcZ37iojnk7j2j33qMA4N2evwLBNS7QyCEhtg");
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
            "35a98674-54b1-4eff-b5b7-49135a97ff9c"
        )
                .pointAmount(5256.0)
                .bearPointAccount("1c1e7409-12c4-4775-8287-f6ad37e0a041")
                .pointExpiresInDays(1467)
                .pointExpiresAt("2023-03-23T06:40:54.000000+09:00")
                .expiresAt("2016-05-08T05:59:07.000000+09:00")
                .usageLimit(2621)
                .setOnetime(true)
                .description("u3o7ZMeTosoRh4S0mExQI1uCwHXvSS9xqXNJMeqv2rRxx8SeYgA5RTAZIE0d3whSKLF4xWXCgQOdSsQVPrApoltrzZbMjGbqCaDUv1CsWTy6z2FdXbfXavW2HwaVVWGcOvRgfjTir1eeHpnGAvFN5uVHKI7mM3plgJR5fwzKIFQcpGZZVlRU03Fa2F");
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
