// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.CreateBill;
import jp.pokepay.partnerapi.request.Request;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreateBillTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new CreateBill(
            "22f5c74f-47d3-475b-81b6-5e0fb7fbc6a8",
            "4ec90ab9-4c4e-4f10-8d16-467078b41281"
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
            "22f5c74f-47d3-475b-81b6-5e0fb7fbc6a8",
            "4ec90ab9-4c4e-4f10-8d16-467078b41281"
        )
                .description("4a9a0scCT7c7Ltn6EsB8h2JwMFMMtYXx4vGdGoRSJ9gIeJ17N1YKgeHSDUHOlNRBomL1vaWnyfGNe7lCmgwdIHspCESfyzDALpt4Q4uDGqfvSsNzJQEHb1exp4ZJ9ARoVovV9owjOwApN79IZjC6hLL1LjnwFNHVg6jzv3b");
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
            "22f5c74f-47d3-475b-81b6-5e0fb7fbc6a8",
            "4ec90ab9-4c4e-4f10-8d16-467078b41281"
        )
                .amount(9063.0)
                .description("Mjbr65sYA3jn9hYTSjeIiydNtXKyftlkeOkPLOOEboomDK4NZwHBmRSKvcWx1bzuc26BtMnAP1poymrXlksjhKXKXupfYjz00ooHuYahc0u5h8dEexVsLcFFdVt7ueZ0ucdEq04fv8SXNqBhiF08r7v2JitBTkf");
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
