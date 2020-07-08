package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.CreatePaymentTransaction;
import jp.pokepay.partnerapi.request.Request;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreatePaymentTransactionTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new CreatePaymentTransaction(
            "7d281a35-ea21-438e-a9fb-803e84aa6a8c",
            "d58f3342-22e8-4326-be2e-b841e047a194",
            "90bff941-958f-4943-8a08-a499410ea453",
            959
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
        Request request = new CreatePaymentTransaction(
            "7d281a35-ea21-438e-a9fb-803e84aa6a8c",
            "d58f3342-22e8-4326-be2e-b841e047a194",
            "90bff941-958f-4943-8a08-a499410ea453",
            959
        )
                .description("tomZtNMSpMb9hu4uX8rzEWUU2YIjFeOiXxzlMOsSDBnIuLKyFCMftXN9gShnvNsDjm8JuFMnhniswAczC9zaOgwaTwjApKyYGQsdt3l9ZLZF6hAQJUQ");
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
