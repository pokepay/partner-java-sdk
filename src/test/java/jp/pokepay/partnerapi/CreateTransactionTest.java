// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.CreateTransaction;
import jp.pokepay.partnerapi.request.Request;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreateTransactionTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new CreateTransaction(
            "a127058e-cc64-4aef-b424-c7569a784064",
            "8162d673-d7ae-45c8-8421-089c42a65923",
            "c1cd5789-3806-4a99-b148-a2612ffedf09"
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
            "a127058e-cc64-4aef-b424-c7569a784064",
            "8162d673-d7ae-45c8-8421-089c42a65923",
            "c1cd5789-3806-4a99-b148-a2612ffedf09"
        )
                .description("rFGRZ0Q28LywVGUz2s");
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
            "a127058e-cc64-4aef-b424-c7569a784064",
            "8162d673-d7ae-45c8-8421-089c42a65923",
            "c1cd5789-3806-4a99-b148-a2612ffedf09"
        )
                .pointExpiresAt("2020-05-01T02:15:27.000000+09:00")
                .description("RxtNbAYMzHePlwRHJLPebYCA3qabphyjXP3xuhhy9uGRsNNOdzmZ5nbPQzPRirLmp7HiQajpl09d6QIiaL5c40GPi4ivBi3eJhDgAiQ5RhXwEfmyakwCi2K41MKrJ8u3JtJHw13BJLqURa9CDG8z1r52NxmvSo3IMgKOG9RqgqLtsxscDVj4qDxwlIsj");
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
            "a127058e-cc64-4aef-b424-c7569a784064",
            "8162d673-d7ae-45c8-8421-089c42a65923",
            "c1cd5789-3806-4a99-b148-a2612ffedf09"
        )
                .pointAmount(1955)
                .pointExpiresAt("2022-10-29T15:55:13.000000+09:00")
                .description("sgNzWfMVYN8tFORiCKaN1GSBkTmsnETZgON7wI25XD4LDGgtc1eHQx1a38fcy9G2ru7CIugZBUKc64A8KJDFHDE0sPhVLSmxr0FU3DnW6KqsDEeelMkJvsg1mQveiZolVhKjCQVZwzstz19XaUt7HUg2vBtQ3icUlEOMImvGy37aG3VpRlqKVbLVJ59qzi8HFxZtC");
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
    void test4() throws ConnectionError, ProcessingError {
        Request request = new CreateTransaction(
            "a127058e-cc64-4aef-b424-c7569a784064",
            "8162d673-d7ae-45c8-8421-089c42a65923",
            "c1cd5789-3806-4a99-b148-a2612ffedf09"
        )
                .moneyAmount(4239)
                .pointAmount(7936)
                .pointExpiresAt("2024-07-06T01:11:25.000000+09:00")
                .description("ypm8TU2Y6m10oazOnSDRVBADkHpYoJtK8deELoxPb8vCqW8ZrqfNGAkbzmAIScfq8JbwsUjFhr3NwoEyag2SfuJiolnAr0O5BazmKqHUlvI3TLRDU2wR06BrqE4xR4GA8B6QEvmEtQTqfID");
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
