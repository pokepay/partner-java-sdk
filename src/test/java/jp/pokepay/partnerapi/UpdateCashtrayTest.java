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
            "8ae5fe62-4b5a-4b67-a273-be88997f1eff"
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
            "8ae5fe62-4b5a-4b67-a273-be88997f1eff"
        )
                .expiresIn(8871);
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
            "8ae5fe62-4b5a-4b67-a273-be88997f1eff"
        )
                .description("BV3pXiPPiW2qUm4FbQucsmz0GYwY85K8kF9CcO2FCZ7wQECuEigH9T54l9EXWThBhNBtq0Hlr5VUDcRjPWhcWE5Ed0Dp6qm5enNIYlp4WuULLQB3hzZG357PPnWlMQlOO65IFrI1BJMiWPv5")
                .expiresIn(2452);
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
            "8ae5fe62-4b5a-4b67-a273-be88997f1eff"
        )
                .amount(5014.0)
                .description("bUBWta68v79KNgsodWT1kP64chZLEzZTeXAsCUOeSILicKJugPMhkbNW44x5lpizelx6Zw3ANkreMSnigb4Yb3t6kmvyhjD7Y1lgzqIh5MLpUpAeuRnJqWXlTPA3BNnPJo0CH10GQb96Jzcef7f3He1f0QYEkgJnc3iiJ3NDVFkNizSfk2HEbXxayxzM2cghdc")
                .expiresIn(9011);
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
