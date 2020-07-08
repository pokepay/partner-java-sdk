// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.CreateTransaction;
import jp.pokepay.partnerapi.request.Request;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreateTransactionTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new CreateTransaction(
            "7873dcae-f4be-4f8b-b54e-e67b8e4a2aee",
            "89199282-3c98-4e10-9eb3-4a0c6682d315",
            "00eaab3a-9222-4cfa-89f5-2b44bb362256"
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
        Request request = new CreateTransaction(
            "7873dcae-f4be-4f8b-b54e-e67b8e4a2aee",
            "89199282-3c98-4e10-9eb3-4a0c6682d315",
            "00eaab3a-9222-4cfa-89f5-2b44bb362256"
        )
                .description("Rt5BC47u0LBZBDkgirRhxlCXhoa6fle0x7splRxtqMoxBujVwnyfZuE3e5xXxTfkQGMZ5S48tOgoOgFinvFpJRRXLn9SH47GMCXhRNijsaVT1ZF1AseM2Rn07bonAkXsZilcmGprpHWFXvhuQtM1LFFNHZrWuInuoVVka4skh8FYl5NEjnd0oylI0r");
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
        Request request = new CreateTransaction(
            "7873dcae-f4be-4f8b-b54e-e67b8e4a2aee",
            "89199282-3c98-4e10-9eb3-4a0c6682d315",
            "00eaab3a-9222-4cfa-89f5-2b44bb362256"
        )
                .pointAmount(3811)
                .description("FtRqxWtrEvr3hlpSdbFzW41w2wdmAElJ73aGwHq2Nog8yox8gWuz0Iu1C65rngcQXI85abx3oeCZGi3V7DX0N2SSjzIDni5x0B8c80LaKXb5rPdTeVsA7jbdyhDm8GQR6iboQn1ioYPhc4x9p9On1XOPX1Swy9kCa");
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
        Request request = new CreateTransaction(
            "7873dcae-f4be-4f8b-b54e-e67b8e4a2aee",
            "89199282-3c98-4e10-9eb3-4a0c6682d315",
            "00eaab3a-9222-4cfa-89f5-2b44bb362256"
        )
                .moneyAmount(9557)
                .pointAmount(9843)
                .description("kAW7ELp00QTPHVvDnUDfXqj58sfFvf91OJp4CQHeMsdllKvRnnQGxdqEzbAYdHRABS");
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
