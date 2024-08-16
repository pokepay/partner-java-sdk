// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.CreateCashtray;
import jp.pokepay.partnerapi.request.Request;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreateCashtrayTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new CreateCashtray(
            "ddafce04-a972-4481-bcf6-a7cb23344b4c",
            "dc5616e3-bbfe-4e3b-84ba-39e0bdf63ef1",
            2479.0
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
        Request request = new CreateCashtray(
            "ddafce04-a972-4481-bcf6-a7cb23344b4c",
            "dc5616e3-bbfe-4e3b-84ba-39e0bdf63ef1",
            2479.0
        )
                .expiresIn(4930);
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
        Request request = new CreateCashtray(
            "ddafce04-a972-4481-bcf6-a7cb23344b4c",
            "dc5616e3-bbfe-4e3b-84ba-39e0bdf63ef1",
            2479.0
        )
                .description("CXcrQeelPgmXpAPVnPz3LHZHo20wPRKNmRpcpB95GgyPD55Mh1j1MOppYBAG56PepHCuDKahyFwLgcTyMhINFt7G9OZkcS1QJsMMCyph1a")
                .expiresIn(1239);
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
