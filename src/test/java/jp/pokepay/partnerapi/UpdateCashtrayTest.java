// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.UpdateCashtray;
import jp.pokepay.partnerapi.request.Request;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UpdateCashtrayTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new UpdateCashtray(
            "fc678128-5d2d-46e4-a1a4-79aa821b23a8"
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
        Request request = new UpdateCashtray(
            "fc678128-5d2d-46e4-a1a4-79aa821b23a8"
        )
                .expiresIn(258);
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
        Request request = new UpdateCashtray(
            "fc678128-5d2d-46e4-a1a4-79aa821b23a8"
        )
                .description("ly62xcI1aMnlsbSXe4GesrExI79x19KmkhchTfWxzmPaojg9yFzoGZsi1sKK2q6w8MEjrkKI0ai2qXIHJPQBzKQMjJLuH117Ia")
                .expiresIn(1338);
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
        Request request = new UpdateCashtray(
            "fc678128-5d2d-46e4-a1a4-79aa821b23a8"
        )
                .amount(3295.0)
                .description("8t8M9ya39V1SwWLpvQPkErTJ5aXLB7a2F9Cdsnu1tRPqZpYTrBY6w2yLWIryBOABUeOhd1rWFNLYQzjeww7wtpUybMbCHr8whmWq0m16hzQxmoxOST5PtlCy1P7NmuyRzRyT7tWtauZaxNBsxaooiSRuvi2Og7ynsxMpVr3XRQe")
                .expiresIn(4711);
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
