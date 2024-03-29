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
            "9af3b345-8ee5-4ff2-8c4e-7127a8577917",
            "bd51d245-8c4b-4321-be4d-9459c0099b05",
            "6d4ad3a8-07fb-4773-aad2-cc8044238a66"
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
            "9af3b345-8ee5-4ff2-8c4e-7127a8577917",
            "bd51d245-8c4b-4321-be4d-9459c0099b05",
            "6d4ad3a8-07fb-4773-aad2-cc8044238a66"
        )
                .requestId("590665db-07b9-4f76-8072-72e918278a87");
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
            "9af3b345-8ee5-4ff2-8c4e-7127a8577917",
            "bd51d245-8c4b-4321-be4d-9459c0099b05",
            "6d4ad3a8-07fb-4773-aad2-cc8044238a66"
        )
                .metadata("{\"key\":\"value\"}")
                .requestId("030cd959-7ae9-433d-907b-8d0018d356a9");
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
            "9af3b345-8ee5-4ff2-8c4e-7127a8577917",
            "bd51d245-8c4b-4321-be4d-9459c0099b05",
            "6d4ad3a8-07fb-4773-aad2-cc8044238a66"
        )
                .description("8HndtLKgFWIeB413C8zcpa0a0ipuLt3IQKQQHb6fikVg8U3XBigR3jya01c")
                .metadata("{\"key\":\"value\"}")
                .requestId("7061914c-07b7-4315-a564-a305d539bee8");
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
            "9af3b345-8ee5-4ff2-8c4e-7127a8577917",
            "bd51d245-8c4b-4321-be4d-9459c0099b05",
            "6d4ad3a8-07fb-4773-aad2-cc8044238a66"
        )
                .pointExpiresAt("2020-09-15T01:10:05.000000Z")
                .description("i5NIsblUeDquiQL8YRreNoLAWMJdywYSICtYcbHl2ktF16gpa54attROZcBbejZS9wdnnNKINI7vj8qEDPsdJ8J")
                .metadata("{\"key\":\"value\"}")
                .requestId("3859c46b-1a83-4a4c-b64b-2e24d6c94e1d");
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
            "9af3b345-8ee5-4ff2-8c4e-7127a8577917",
            "bd51d245-8c4b-4321-be4d-9459c0099b05",
            "6d4ad3a8-07fb-4773-aad2-cc8044238a66"
        )
                .pointAmount(5478)
                .pointExpiresAt("2021-01-21T20:23:24.000000Z")
                .description("UtzmymsdzvhUXmrc210VozYCz4wR9Gfv1ooHMcqzJF0zVNZ8zHF5mnetJol0g7uhhZVwBBSB9NQuG198o4cE8ye8xiCptr8X3OQ")
                .metadata("{\"key\":\"value\"}")
                .requestId("b17cfe53-f624-4d0a-a77d-66734f88b581");
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
            "9af3b345-8ee5-4ff2-8c4e-7127a8577917",
            "bd51d245-8c4b-4321-be4d-9459c0099b05",
            "6d4ad3a8-07fb-4773-aad2-cc8044238a66"
        )
                .moneyAmount(4875)
                .pointAmount(5757)
                .pointExpiresAt("2022-07-23T01:40:42.000000Z")
                .description("cvMVMzYpfEHHq4AVCPhpFJVl2NE9OohrFLhvABt92YjeNGkeRyZCxDwnyuzPdWfYw482S6oHFsZh9ksnqTSKQYaLtgBF21Mao0iMx72McbAtuQfbwPK5Ol2Udeu5ClBnNsqGtwvAjO8SQrjpTlUKU7ix6vD3BTnNcaIv4Cy2qiGNeSDJueWNAF2iLh")
                .metadata("{\"key\":\"value\"}")
                .requestId("8c138815-f8eb-46c2-8330-e7b84bbc97ed");
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
            "9af3b345-8ee5-4ff2-8c4e-7127a8577917",
            "bd51d245-8c4b-4321-be4d-9459c0099b05",
            "6d4ad3a8-07fb-4773-aad2-cc8044238a66"
        )
                .bearPointShopId("10405a8e-bc57-4118-816f-fc5d8281775d")
                .moneyAmount(339)
                .pointAmount(7237)
                .pointExpiresAt("2022-04-12T16:41:10.000000Z")
                .description("4Yfnz5e3bjXKldANGzSZe49qKV1rholLnfHAgpNJKDDEjuzSmETPUL6TDRxNm")
                .metadata("{\"key\":\"value\"}")
                .requestId("51ebc46a-bd9a-49dd-8bd7-5914be8dc5d0");
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
