// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.UpdateBill;
import jp.pokepay.partnerapi.request.Request;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UpdateBillTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new UpdateBill(
            "e23c9bf5-7751-4b89-a17e-4bef457df04e"
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
        Request request = new UpdateBill(
            "e23c9bf5-7751-4b89-a17e-4bef457df04e"
        )
                .setDisabled(false);
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
        Request request = new UpdateBill(
            "e23c9bf5-7751-4b89-a17e-4bef457df04e"
        )
                .description("xdhT65YfaNVM2xjqlPxxy8RqwFWTQ1hvVt9bN2zIxNZx4eE9mHPjq6XCvYjxbcuNA5AOQHru6gAXocPu4UpOUbFxl1xg8SX1voG8Gydqo4fQ7D47J36mgyKf2pLnur36TYPgxIzfeirgwWnuJKugM3OQh2JHBnxbiEM0oFGnnvKX9mW4mLerHweV6yDqMFurm2")
                .setDisabled(true);
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
        Request request = new UpdateBill(
            "e23c9bf5-7751-4b89-a17e-4bef457df04e"
        )
                .amount(7673.0)
                .description("Y5rxBRsFTyEvnewbYd4rNZJsCq7m7ar")
                .setDisabled(false);
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
