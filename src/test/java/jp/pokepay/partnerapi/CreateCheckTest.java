package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.CreateCheck;
import jp.pokepay.partnerapi.request.Request;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreateCheckTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new CreateCheck(
            "ada2e46b-2790-462b-bb9a-e84f0fdfc376"
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
        Request request = new CreateCheck(
            "ada2e46b-2790-462b-bb9a-e84f0fdfc376"
        )
                .bearPointAccount("e6d602da-36fb-43fc-a682-3592fee85f82");
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
            "ada2e46b-2790-462b-bb9a-e84f0fdfc376"
        )
                .pointExpiresInDays(9274)
                .bearPointAccount("426760d3-0a85-4fa2-ad0d-a5469ba9aec4");
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
            "ada2e46b-2790-462b-bb9a-e84f0fdfc376"
        )
                .pointExpiresAt("2019-09-08T13:44:29.000000+09:00")
                .pointExpiresInDays(5628)
                .bearPointAccount("bb3c57ff-403b-4d32-8e51-c2a445566613");
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
            "ada2e46b-2790-462b-bb9a-e84f0fdfc376"
        )
                .expiresAt("2016-07-06T07:29:14.000000+09:00")
                .pointExpiresAt("2020-05-25T20:11:01.000000+09:00")
                .pointExpiresInDays(9389)
                .bearPointAccount("194c41da-1222-48ac-906e-c6852795ddaa");
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
            "ada2e46b-2790-462b-bb9a-e84f0fdfc376"
        )
                .usageLimit(2957)
                .expiresAt("2017-11-13T13:52:28.000000+09:00")
                .pointExpiresAt("2017-02-28T00:18:08.000000+09:00")
                .pointExpiresInDays(8237)
                .bearPointAccount("a10b3174-cb4c-4f56-aecf-e6335a065c37");
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
            "ada2e46b-2790-462b-bb9a-e84f0fdfc376"
        )
                .setOnetime(false)
                .usageLimit(4543)
                .expiresAt("2021-02-21T07:24:39.000000+09:00")
                .pointExpiresAt("2023-01-20T05:04:50.000000+09:00")
                .pointExpiresInDays(3658)
                .bearPointAccount("a6cdbcc9-29d5-4fd5-bbed-50dd1e3dfed3");
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
            "ada2e46b-2790-462b-bb9a-e84f0fdfc376"
        )
                .description("HxaUfZL484v6WgijYE6jC1cK6rRKzRKLLHP34HHUQBT4msKCAr4ultRyoBLG3e3ktbdp7rKUBRoWQsFj9saeW7tWNnstROs25Wh2cjDTvSijVL8UbtLRGeoL5XICucR20yCfo")
                .setOnetime(true)
                .usageLimit(9350)
                .expiresAt("2017-06-06T16:58:53.000000+09:00")
                .pointExpiresAt("2023-09-29T13:36:27.000000+09:00")
                .pointExpiresInDays(6875)
                .bearPointAccount("ea3500aa-8ae1-410c-83a5-f1bab7c6798b");
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
            "ada2e46b-2790-462b-bb9a-e84f0fdfc376"
        )
                .pointAmount(4340)
                .description("mdEHjactvQLENARQTa4xuEdbI7CfOglmowoMTZr6Wd5Z6W5CKK5ZSuFd4zIxlSD0T4N")
                .setOnetime(true)
                .usageLimit(2853)
                .expiresAt("2017-11-01T10:08:56.000000+09:00")
                .pointExpiresAt("2024-12-01T02:56:15.000000+09:00")
                .pointExpiresInDays(2370)
                .bearPointAccount("98d6d241-5cdd-4ae0-a2a6-97f81a54202f");
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
            "ada2e46b-2790-462b-bb9a-e84f0fdfc376"
        )
                .moneyAmount(9084)
                .pointAmount(2821)
                .description("rggPbczQq2BfiP7Z48SMhV0kx99K6BEur8I10mjwAGgf7rRo6Q3NrSAzhlUeTVTDWxZbhwUvSZh8pFtDtrEaWla9nZlWM7WijunYixBLIQeU0gBamKJOmOSkZ50Lofpy3Ilvd31DHEJ1RPqaG6o791")
                .setOnetime(true)
                .usageLimit(5414)
                .expiresAt("2016-11-19T21:06:12.000000+09:00")
                .pointExpiresAt("2021-08-07T03:15:44.000000+09:00")
                .pointExpiresInDays(7434)
                .bearPointAccount("b75c8aff-dc7c-4d18-9e6d-2e60bd6d3b09");
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
