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
            "8a480fc1-4577-4907-9d6a-c87cf26f7afa",
            "a387e891-8847-4c38-9559-5e87acab0e1d",
            "d044b25e-2b03-4761-acdb-0b70e9a91604"
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
            "8a480fc1-4577-4907-9d6a-c87cf26f7afa",
            "a387e891-8847-4c38-9559-5e87acab0e1d",
            "d044b25e-2b03-4761-acdb-0b70e9a91604"
        )
                .description("gA4DXNtjsg9PgQkXqYPn4dGIxCAVXu8wPFdMI0g8RX9GwTm1EaeDH0runisLVA8D7RtvLwRN8QmXijHIyMGxrgTxrmP2c2b7AqdqrRaU4tsNqOUthYSxSa5qYfKcdpEzIZoGgQ8JT7nM2XSRS8qzeJVaYua2WPHw1UTjf1quigD2l2J");
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
            "8a480fc1-4577-4907-9d6a-c87cf26f7afa",
            "a387e891-8847-4c38-9559-5e87acab0e1d",
            "d044b25e-2b03-4761-acdb-0b70e9a91604"
        )
                .pointExpiresAt("2023-11-18T10:39:42.000000Z")
                .description("K33Y2PKkmhgdj1RbwEdGAkTKdkwDZEgx5wET5OvQd");
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
            "8a480fc1-4577-4907-9d6a-c87cf26f7afa",
            "a387e891-8847-4c38-9559-5e87acab0e1d",
            "d044b25e-2b03-4761-acdb-0b70e9a91604"
        )
                .pointAmount(676)
                .pointExpiresAt("2020-08-14T23:35:01.000000Z")
                .description("ofRUOUAciXVcpzKCMcrOD6Emk2wkp2iXzqZDQWG9JIPYO9QhKjYAAaWngq9PQfQxKRvEszf3mWAEHwNafuFelOU7xCAyi0eUz4xXH5OLhVoB1lIuiOfxpiSD0ualUMr1aiXbRr0Yt6Ont0eqhymEV4KDx3FmD9kb");
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
            "8a480fc1-4577-4907-9d6a-c87cf26f7afa",
            "a387e891-8847-4c38-9559-5e87acab0e1d",
            "d044b25e-2b03-4761-acdb-0b70e9a91604"
        )
                .moneyAmount(7778)
                .pointAmount(5824)
                .pointExpiresAt("2024-01-26T18:25:24.000000Z")
                .description("i1vOnH69EFivIjA6JEHCCuKlnfNVTWFTkh4YZxFD");
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
