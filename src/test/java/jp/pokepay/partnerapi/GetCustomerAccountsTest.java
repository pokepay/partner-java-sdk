// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.GetCustomerAccounts;
import jp.pokepay.partnerapi.request.Request;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GetCustomerAccountsTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new GetCustomerAccounts(
            "7f94c950-6ed6-47a1-b8d4-2c8895d41b68"
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
        Request request = new GetCustomerAccounts(
            "7f94c950-6ed6-47a1-b8d4-2c8895d41b68"
        )
                .setSuspended(false);
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
        Request request = new GetCustomerAccounts(
            "7f94c950-6ed6-47a1-b8d4-2c8895d41b68"
        )
                .createdAtTo("2023-02-11T07:47:16.000000+09:00")
                .setSuspended(false);
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
        Request request = new GetCustomerAccounts(
            "7f94c950-6ed6-47a1-b8d4-2c8895d41b68"
        )
                .createdAtFrom("2020-01-01T12:00:03.000000+09:00")
                .createdAtTo("2019-11-19T15:40:21.000000+09:00")
                .setSuspended(false);
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
        Request request = new GetCustomerAccounts(
            "7f94c950-6ed6-47a1-b8d4-2c8895d41b68"
        )
                .perPage(834)
                .createdAtFrom("2018-07-13T05:22:58.000000+09:00")
                .createdAtTo("2023-08-30T00:52:57.000000+09:00")
                .setSuspended(true);
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
    void test5() throws ConnectionError, ProcessingError {
        Request request = new GetCustomerAccounts(
            "7f94c950-6ed6-47a1-b8d4-2c8895d41b68"
        )
                .page(9263)
                .perPage(4380)
                .createdAtFrom("2024-01-01T10:34:58.000000+09:00")
                .createdAtTo("2019-09-03T13:00:52.000000+09:00")
                .setSuspended(true);
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
