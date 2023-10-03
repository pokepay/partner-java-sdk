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
            "519c48c4-325b-4858-a298-c6ef9a292715",
            "c317b308-9f92-4e83-aaea-ae8d43085871"
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
            "519c48c4-325b-4858-a298-c6ef9a292715",
            "c317b308-9f92-4e83-aaea-ae8d43085871"
        )
                .description("lSXXfgL13rI1kMYSkzLYWcqyBEPqq6jXoMPoI5dYhtAEAC8MN1MIRbysguh0xXqdkQK8VGfHRzulBqoPAVuBC2EUluqb81O3ZagKE8LcCa8bz2nHShe5EoHVudmx1");
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
            "519c48c4-325b-4858-a298-c6ef9a292715",
            "c317b308-9f92-4e83-aaea-ae8d43085871"
        )
                .amount(5162.0)
                .description("iMacSt3whWHQ5cbR62EyfrAyRxoXmZ8au8D4esSHy55WYfHfvN0QEBe9OUm");
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
