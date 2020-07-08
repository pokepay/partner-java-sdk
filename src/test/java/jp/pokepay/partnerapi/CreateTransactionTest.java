package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.CreateTransaction;
import jp.pokepay.partnerapi.request.Request;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreateTransactionTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new CreateTransaction(
            "a20b3d7b-a81d-4657-86f7-ba93e26fb398",
            "aaf1e9b2-a5b1-436a-8e5e-7ccb9795b1e7",
            "5e35c6a5-4346-4f09-b8ba-ca4a38f1bf1e"
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
            "a20b3d7b-a81d-4657-86f7-ba93e26fb398",
            "aaf1e9b2-a5b1-436a-8e5e-7ccb9795b1e7",
            "5e35c6a5-4346-4f09-b8ba-ca4a38f1bf1e"
        )
                .description("cOINqHFbqUFNOdIr5nfBKf8RpkafXo7DRtqq");
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
            "a20b3d7b-a81d-4657-86f7-ba93e26fb398",
            "aaf1e9b2-a5b1-436a-8e5e-7ccb9795b1e7",
            "5e35c6a5-4346-4f09-b8ba-ca4a38f1bf1e"
        )
                .pointAmount(9232)
                .description("3hvDo8dIyd20TbgQNDsCWEY0U9lByMxgQ8BaBBu2EOfEFz4e51jK8jV8AbD8Z7t6tIjqu5vmoY7SluEiCxsyJefymZZRT2yWQWtIWjcI65gKp1WmN4Mvoa3QOIaGW8Nqmoji6O6PjCSvby9rHtMhNhzoEXK72FsivJG7R2BIs4");
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
            "a20b3d7b-a81d-4657-86f7-ba93e26fb398",
            "aaf1e9b2-a5b1-436a-8e5e-7ccb9795b1e7",
            "5e35c6a5-4346-4f09-b8ba-ca4a38f1bf1e"
        )
                .moneyAmount(6943)
                .pointAmount(7294)
                .description("jVIBots91PT42D8LGW33MtQsj1zXle3kqjVLT9RVbt6aVzVWQcLo6yPPsFn");
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
