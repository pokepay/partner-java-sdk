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
            "ddef8a3f-e564-466a-abc4-9978ecd612b2"
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
            "ddef8a3f-e564-466a-abc4-9978ecd612b2"
        )
                .expiresIn(3782);
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
            "ddef8a3f-e564-466a-abc4-9978ecd612b2"
        )
                .description("8q2Tl06IVYw4zb7KKLj26g9D4jd9Fi73fT2ekfbMypSoZArmvOOmVqy7LHITpCScM5po6zQrUB5yHtoGfycJYa2GIKQCGBFwcqnjKtXS5ctb0sUDamQiJFavfIlsQjs1Uxv98uoxa9cfqdBZBSSyuPsLgc14jRH1daAJWkWpeG")
                .expiresIn(3543);
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
            "ddef8a3f-e564-466a-abc4-9978ecd612b2"
        )
                .amount(1685.0)
                .description("7BTtK3VwbUSgXIGfDPEPwHED0KtmDzxLUbUeg7w8cIU7UKhxLe1FMHoh3041czvU7tiTGNYlDyRk3aGMps1HN2Oi8GzWre6yIHCge3KvTMWtvAOdqc6t46b4EgFIpDVk2sqQhlAUNF0Kr6ekdB7WSGlsT24mzzvf0uixfzgMS7DAxR")
                .expiresIn(9371);
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
