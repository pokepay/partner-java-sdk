// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.CreateTransferTransaction;
import jp.pokepay.partnerapi.request.Request;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreateTransferTransactionTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new CreateTransferTransaction(
            "9c68abcb-c211-477f-8e00-69df4169df80",
            "29c1371e-e22d-44c3-8e79-39e277a0f1ed",
            "90298810-c341-476c-8d8f-f36b19b5d961",
            7328.0
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
        Request request = new CreateTransferTransaction(
            "9c68abcb-c211-477f-8e00-69df4169df80",
            "29c1371e-e22d-44c3-8e79-39e277a0f1ed",
            "90298810-c341-476c-8d8f-f36b19b5d961",
            7328.0
        )
                .requestId("afd92ace-45ca-4369-a94f-f90c92f0b0f6");
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
        Request request = new CreateTransferTransaction(
            "9c68abcb-c211-477f-8e00-69df4169df80",
            "29c1371e-e22d-44c3-8e79-39e277a0f1ed",
            "90298810-c341-476c-8d8f-f36b19b5d961",
            7328.0
        )
                .description("RswwQSmiJco3KwhjqpMqyENnno")
                .requestId("eaabfe74-0124-461b-8acb-a74ef40db4a5");
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
        Request request = new CreateTransferTransaction(
            "9c68abcb-c211-477f-8e00-69df4169df80",
            "29c1371e-e22d-44c3-8e79-39e277a0f1ed",
            "90298810-c341-476c-8d8f-f36b19b5d961",
            7328.0
        )
                .metadata("{\"key\":\"value\"}")
                .description("2DvQSu06FE8juzeNINZktFZU0JpHpSrpNbF8O3WzYFSGY9bWV5jbNBEz14f9BIpTXI2luGWaGy1CoC")
                .requestId("7cd2c5aa-6d59-462f-afd9-e01a7bbac46d");
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
