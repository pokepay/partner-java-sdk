// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.CreateBill;
import jp.pokepay.partnerapi.request.Request;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreateBillTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new CreateBill(
            "10b38e5a-a0a2-4643-b978-0431d3fe12c5",
            "6be77097-48f0-43b4-96fd-0f6bfa0ed65f"
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
        Request request = new CreateBill(
            "10b38e5a-a0a2-4643-b978-0431d3fe12c5",
            "6be77097-48f0-43b4-96fd-0f6bfa0ed65f"
        )
                .description("AmGgvgI7Yg");
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
        Request request = new CreateBill(
            "10b38e5a-a0a2-4643-b978-0431d3fe12c5",
            "6be77097-48f0-43b4-96fd-0f6bfa0ed65f"
        )
                .amount(7044)
                .description("C9RfQiSpTWZrd0hVSBtTuiSKN3fmfJoVUvvyWz4acD4YN5");
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