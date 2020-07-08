package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.CreateCustomerAccount;
import jp.pokepay.partnerapi.request.Request;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreateCustomerAccountTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new CreateCustomerAccount(
            "03713f37-a575-41c6-9017-ae34b7903149"
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
        Request request = new CreateCustomerAccount(
            "03713f37-a575-41c6-9017-ae34b7903149"
        )
                .accountName("1Sv6YK6kJYzvbFh0r0BDP8B5Qw1mP9QwgJ3JHEuyXHxb5R88qN7WwM7pQ2l1hXyowT29oXzs5JjxL8N5c81FONmLhpKkKM8D0Ybf4iuMjR2e9bKOivGQj3myOAB5MztsEbeaSJQGoBj3iHytYWHwP7p543znkgfY9pCrZUQNRPNEi5wKpVBuSZPF6Ynqo14Ec9smicxzKfrJ5w6ediPnBTmLfkUnxlFYUXzpIleQUiuiftGvUiLTZ4osRfx");
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
        Request request = new CreateCustomerAccount(
            "03713f37-a575-41c6-9017-ae34b7903149"
        )
                .userName("sKY75qCoobJSdOItAm8Uu86WWEGlrerjq3USCvb8K2thDy6a6WviA8dLXyD7wYwNIREBJv2zmHr8WNUcjkOqMaPoo3pdm2ENzVFNaAwqZDtT4EVSgwUpNSRxgV2AgAqyd7sXMwQH7I1GTFgpIBACn8taMU2JjTH5HkTPN1JImD36vQdzuS4tOuA0UPiSHPrTy0AfmaLux46hKSdA8lMBAy2xX7U")
                .accountName("cqJ2BHGa8xZebGYapcbqrsHlxWJbVeQseaCiDc8Ml2wCyobeTqbHs1IIUukiCDW8HCfj9hvailMPsg49M1sHaMuJtdGTQihGHYrI8R2oL1pIP985wUiUmuCalEu6nt1cYnEfRJrvpUHUlnaxZjtl9aFy1agEEHKujnnnyqenUSgDgwCQugI8VH6GbLVQIbBKzpF4kLS8qtY1nzPi2jPSZbCUTYf3CuglGRcqOOKrsOGNF");
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
