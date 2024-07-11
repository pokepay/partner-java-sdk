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
            "104404f2-ac03-4216-88f7-c9e53b350a56"
        )
                .moneyAmount(2950.0);
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
            "104404f2-ac03-4216-88f7-c9e53b350a56"
        )
                .moneyAmount(4601.0)
                .description("DqMFurm2HyY5rxBRsFTyEvnewbYd4rNZJsCq7m7arw2NKYH12xHXaAOFqIwxrvxkxwVYBDQiRCyVTR3czNdwQ9LziqjK5MdQ1lZMyARXVB9A32ESqVUKE1GN9JqLEvyRdA5j20ws4Z1pnjZ8xWKeN3");
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
            "104404f2-ac03-4216-88f7-c9e53b350a56"
        )
                .moneyAmount(653.0)
                .setOnetime(false)
                .description("KGyHXCKDfS0S9olxtCG8sS34enFyHhIbteE1tQOMttUhD0OiwEvovxL7L6kZ3KaNub1zwaCdHgj8ik3dmsSURUNaSg6OcHEmOeQFO3Ox8qDzSQ0YVNC6SfrLsEgbwDrafzykU4qQWwEl9RBh");
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
            "104404f2-ac03-4216-88f7-c9e53b350a56"
        )
                .moneyAmount(2203.0)
                .usageLimit(1226)
                .setOnetime(true)
                .description("Q2DDr8e6Qf8fK7SBxethCuCr4dBSWzD3agMTAvZtCmtviHLHOBHoLHZ5Hyso5u9Osjia9h3ovwp1QqOYhJfTJv94bnDyHKg7jf7TRBDusrb62imeaN");
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
            "104404f2-ac03-4216-88f7-c9e53b350a56"
        )
                .moneyAmount(1500.0)
                .expiresAt("2021-03-27T16:00:05.000000Z")
                .usageLimit(48)
                .setOnetime(false)
                .description("5TYhQYVT6897JBIT98Ea3vOiHnJbC3RzxMsGYTRQVbbDGQ3KFvfr7wcTIqfZGa8VmM7LxaafZsEiZ4h1kUtLESZUqCMHUv6WI9WlLqAjFFVtovIA3w7if4YoZJ6xmZ8N4p4uCNZaugRp11i");
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
            "104404f2-ac03-4216-88f7-c9e53b350a56"
        )
                .moneyAmount(9631.0)
                .pointExpiresAt("2021-09-27T23:36:37.000000Z")
                .expiresAt("2021-07-29T18:09:32.000000Z")
                .usageLimit(1700)
                .setOnetime(false)
                .description("rfILoN8ZP7287JaoYb8spv1FcaYx8c7c37K2BoQEomxqdvzxKVxdoit0nsRdkY0a6T9IRy95uKnYj6aDVb3qDkr4zFWttvA7t4NS");
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
            "104404f2-ac03-4216-88f7-c9e53b350a56"
        )
                .moneyAmount(4281.0)
                .pointExpiresInDays(1449)
                .pointExpiresAt("2023-07-22T15:05:17.000000Z")
                .expiresAt("2023-01-18T17:41:56.000000Z")
                .usageLimit(4763)
                .setOnetime(false)
                .description("OXwioDpfXuzoNb");
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
            "104404f2-ac03-4216-88f7-c9e53b350a56"
        )
                .moneyAmount(7318.0)
                .bearPointAccount("15bf6da1-5b8f-4870-895d-15aaa6b83b75")
                .pointExpiresInDays(4770)
                .pointExpiresAt("2024-04-12T08:24:15.000000Z")
                .expiresAt("2021-03-13T11:50:02.000000Z")
                .usageLimit(5381)
                .setOnetime(false)
                .description("nX2XonFzQcO5QEOmdgUm73I2kFchNQksZB6ByT3lVRQ7O823WFeXCsADfveWv5SetJLuZcB6tdcwibyPvTHbjOWbqqVGNOP2f7Fmc6XSXXM3Y5XPxnjFhfkfYgv");
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
            "104404f2-ac03-4216-88f7-c9e53b350a56"
        )
                .moneyAmount(9409.0)
                .pointAmount(4674.0);
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
            "104404f2-ac03-4216-88f7-c9e53b350a56"
        )
                .moneyAmount(2680.0)
                .pointAmount(6866.0)
                .description("hjV7rXm");
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
            "104404f2-ac03-4216-88f7-c9e53b350a56"
        )
                .moneyAmount(3978.0)
                .pointAmount(8774.0)
                .setOnetime(true)
                .description("nhtgkbe1I3fnSrAjiMpnuQgQNZWqLAFAWqZBqyjs43AAjNChMERBnJER6lOBQBwAgsTow2Z3Uka1wds9TY9Bp5VDJiBPB1XeTNJcIKtWyeNc1zzlxW2hgOK8NI225RAsUHuuLFS4058hKDGnyjb");
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
            "104404f2-ac03-4216-88f7-c9e53b350a56"
        )
                .moneyAmount(9592.0)
                .pointAmount(507.0)
                .usageLimit(7327)
                .setOnetime(true)
                .description("6zxkmTZedVWeLbSdWlORFkWxf1fgII7vrhxHZrOEIH6HNdDlfIrfFFwUdXhpSi4j72IcAxs47XeIzYlwiQaQGyn4Age91Y1cWNDBnv9RrzZK5kL8kuH9QZjAoA9Wjz3xWF4fJVtnG3Avmta20vIgud6F1UgGMHbk2IRflsvwuZxk0nQmXMvg0FcWUrBHOSV7LC2s46h");
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
            "104404f2-ac03-4216-88f7-c9e53b350a56"
        )
                .moneyAmount(7185.0)
                .pointAmount(7782.0)
                .expiresAt("2024-05-05T17:58:52.000000Z")
                .usageLimit(883)
                .setOnetime(true)
                .description("F0YKxTClCMK7WZ9OzNLNkjfoAuPSksHUuefNAm0yTlB8Y7");
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
            "104404f2-ac03-4216-88f7-c9e53b350a56"
        )
                .moneyAmount(2618.0)
                .pointAmount(7070.0)
                .pointExpiresAt("2023-08-27T11:56:26.000000Z")
                .expiresAt("2021-10-27T01:35:36.000000Z")
                .usageLimit(4677)
                .setOnetime(true)
                .description("ICVfZpB32LWZFMYYNQ77hNnDgeQkP6BrHNLW2TjgwJkClYsxYjLV6mNckmXWb6cDTOBEvT1fZYocBrtgwRLixenA1GWqf2JPqamqpbbuSj1PURjYRasH9ARntTDK9f1O2csoG3F55uy56fVMl4ovKtbbNMLWzz4xf72tklHyikvXSu1xV");
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
            "104404f2-ac03-4216-88f7-c9e53b350a56"
        )
                .moneyAmount(5489.0)
                .pointAmount(3882.0)
                .pointExpiresInDays(2311)
                .pointExpiresAt("2020-01-01T18:18:58.000000Z")
                .expiresAt("2022-01-26T03:26:05.000000Z")
                .usageLimit(634)
                .setOnetime(false)
                .description("tPMLBX6YLvmDqPAbWtHJHRtQBqCHsxk71kIOiSHcZ37iojnk7j2j33qMA4N2evwLBNS7QyCEhtgNDuAnxydB9u3o7ZMeTosoRh4S0mExQI1uCwHXvSS9xqXNJMeqv2rRxx8SeYgA5RTAZIE0d3whSKLF4xWXCgQOdS");
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
            "104404f2-ac03-4216-88f7-c9e53b350a56"
        )
                .moneyAmount(6131.0)
                .pointAmount(7044.0)
                .bearPointAccount("4803fc60-d215-471b-879e-1ed16a32a956")
                .pointExpiresInDays(7633)
                .pointExpiresAt("2023-08-12T01:48:34.000000Z")
                .expiresAt("2021-07-31T18:48:50.000000Z")
                .usageLimit(7337)
                .setOnetime(false)
                .description("ltrzZbMjGbqCaDUv1CsWTy6z2FdXbfXavW2HwaVVWGcOvRgfjTir1eeHpnGAvFN5uVHKI7mM3plgJR5fwzKIFQcpGZZVlRU03Fa2F6PUopGrOCijX4VQZjHwhb9lV9sTjbq8Wo22UU1er3T1gB");
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
            "104404f2-ac03-4216-88f7-c9e53b350a56"
        )
                .pointAmount(528.0);
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
            "104404f2-ac03-4216-88f7-c9e53b350a56"
        )
                .pointAmount(4212.0)
                .description("fr20CiDsCwyLdW5AzEeQbE5VhNxjrtNh84WLuHKWoYQpDLtJyiWbDVy6Ss7attO0KDvZ2PuoFKU33PYYZTEIyRndmm72c26Cd6B3OB7swghUIdkqUOY2HAI87h7tC8vMnTzjNmFWDzLZEPN7HQXwymFrbXYvN3cal4RO9jT63dRDxKNV");
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
            "104404f2-ac03-4216-88f7-c9e53b350a56"
        )
                .pointAmount(8687.0)
                .setOnetime(true)
                .description("ewLoaJggIMA5wXB3CTdPu3I6Gb57N6Bfk723xgVJhWc2FLmu9RV4wTQ1eFfFoOmA6KgKFTgUMIqeaKPydQtxKkPEiJ9F7s09s2D07ZJtROtnJyz65lsPnpU0js5rsIZ4cWpER3UtPkG2eq1I6");
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
            "104404f2-ac03-4216-88f7-c9e53b350a56"
        )
                .pointAmount(3155.0)
                .usageLimit(765)
                .setOnetime(true)
                .description("9Xo8DUROCVDxPSk72x92MmliF75MFhbZKuKGU7dTPisUgKnCVzFujd5tp1lylHobnm6HycWppeOG5c4bSqVBGp3Ank6BTTvgxHzzgdLIxgPMdYrCUsT");
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
            "104404f2-ac03-4216-88f7-c9e53b350a56"
        )
                .pointAmount(7697.0)
                .expiresAt("2021-10-08T12:20:58.000000Z")
                .usageLimit(8679)
                .setOnetime(true)
                .description("mFBD5JyTl3OSbQF6o9LFFmkiVCdqahnfY1HR9DfMzD3LCASqee9bY3sHOGNF3Mai4m7no77RN8AasCH56gnyuHFpFsNPJmzuH1GHYOOmiUvKwyiQYSSoPK3N5ZGrmU0unMptspEioBBqGcJLaXcepDTPRHElLNQrvWUnk17KWAioiFIGH7shpxz5");
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
            "104404f2-ac03-4216-88f7-c9e53b350a56"
        )
                .pointAmount(5554.0)
                .pointExpiresAt("2022-01-18T07:38:26.000000Z")
                .expiresAt("2021-12-03T08:50:00.000000Z")
                .usageLimit(2201)
                .setOnetime(true)
                .description("r4Char2DsC6IOlQ3ZCa8lZmMT5mAFAIeN7EOzXnRCcbLOsMiN4tjoxBAROpiRc0j39oPNkDTFwGmGihFz2z0gAPfWDnSv3peMsqUtDBVf5JNWPBpzSQtetKx5V0IU1H2quyHwM52367FRSK6Z");
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
            "104404f2-ac03-4216-88f7-c9e53b350a56"
        )
                .pointAmount(2588.0)
                .pointExpiresInDays(6373)
                .pointExpiresAt("2022-08-02T23:35:44.000000Z")
                .expiresAt("2021-01-14T09:00:05.000000Z")
                .usageLimit(199)
                .setOnetime(true)
                .description("YhssMJ1c81K9V4uwaN6FqKGuMQEbIhSKLSxcJDAAH0jwIPbMhYlMMXruKsOetb8P3w3wpAlq46MRFhBa1KSFCImukjAtQPb0UOTifX7KrzTtAdseC51TTzGU05VTqLiAQDTT40IDYkIvu0sCcHMaDTH");
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
            "104404f2-ac03-4216-88f7-c9e53b350a56"
        )
                .pointAmount(829.0)
                .bearPointAccount("e3fef183-bbe0-4bc5-8f06-ef40e2b14318")
                .pointExpiresInDays(479)
                .pointExpiresAt("2022-11-09T06:28:27.000000Z")
                .expiresAt("2024-02-01T19:52:09.000000Z")
                .usageLimit(5088)
                .setOnetime(true)
                .description("dOoQxmayWcgZvBQUAudiHvhALf0xr0YedjAtAhk4Q5ZEYWHc6DIDKem3xaXPio5o0q9x0iUyrfJOMPlYYA9d24g2qlkQeuW1v6Ot04JjRtK");
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
