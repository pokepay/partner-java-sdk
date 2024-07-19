// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.ListBills;
import jp.pokepay.partnerapi.request.Request;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ListBillsTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new ListBills();
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
        Request request = new ListBills()
                .setDisabled(false);
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
        Request request = new ListBills()
                .upperLimitAmount(5168)
                .setDisabled(false);
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
        Request request = new ListBills()
                .lowerLimitAmount(7192)
                .upperLimitAmount(2756)
                .setDisabled(true);
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
        Request request = new ListBills()
                .shopId("3a601079-b551-4d6f-a145-1d90db3b844c")
                .lowerLimitAmount(7788)
                .upperLimitAmount(8837)
                .setDisabled(true);
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
        Request request = new ListBills()
                .shopName("Jk6MRPKi62IzWH9emhQ0CqvNNBrhyRg9xxzNXJhnMZrEqyRqPCGzbSmOoYCMUQNjvF4AYLzd022rwQVNfYYCfZZWpAcyBWwWi1DgvTt4hTTZowFPycM")
                .shopId("82ebb227-2b66-4610-ac0f-35fd8e7a7012")
                .lowerLimitAmount(9084)
                .upperLimitAmount(8550)
                .setDisabled(false);
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
    void test6() throws ConnectionError, ProcessingError {
        Request request = new ListBills()
                .createdTo("2022-05-19T01:21:34.000000Z")
                .shopName("IeOIKes05558vbabHcGuqU0Zpo5LBba7yo5q8iSiTBSZQPeDSY9S36TscHpgaN0j8ZeP1HDPDTHzzRIdWxHjKy82N74miDUcOuI")
                .shopId("710d4017-92d6-4271-bcdd-481e21159dd2")
                .lowerLimitAmount(4359)
                .upperLimitAmount(8483)
                .setDisabled(false);
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
    void test7() throws ConnectionError, ProcessingError {
        Request request = new ListBills()
                .createdFrom("2023-03-08T17:36:02.000000Z")
                .createdTo("2022-05-20T09:26:17.000000Z")
                .shopName("3kljq")
                .shopId("475e63b1-beff-49d1-b83c-1a5453abc36a")
                .lowerLimitAmount(9077)
                .upperLimitAmount(4735)
                .setDisabled(false);
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
    void test8() throws ConnectionError, ProcessingError {
        Request request = new ListBills()
                .description("kgNdosrcsbqXkWqVhxkWkSbCcQV2KWKaXCJgJ38wW32AKvILX828FihWZQyqSbK0FMXzQI3K0upT8cYYAuEa7VHyo1Pr6ZXG8JSWzel5X6ggilnbIikjMsDtvgyHs8kXaVldBOvstCOu5vNtx3bBib1BS1IIGWD4mpTYqNNFP")
                .createdFrom("2024-04-28T23:17:21.000000Z")
                .createdTo("2021-10-23T10:59:23.000000Z")
                .shopName("cfJ8JMK49acleVRspcldtQ5tmURvImdniels4ZrQj5DbpL3fJFTwwcn9WP3m8VyuReCXx5WTYs7Yv5KDLwBcz7zjgazophuiC1VR8XiXW8JGdOuAk94khcXRAwlFr4tlYuwMI02c6YHU8uGe8qGNvTmA6H2tH06f3cpkGDNNhHR4jcwCrCwplpzKOK41muEKIO2q9f6dQ5BvDAnz25uvrmGGKjRYVWTh4n3")
                .shopId("35000ba0-b226-4912-b48c-e408c8553d3e")
                .lowerLimitAmount(8452)
                .upperLimitAmount(7282)
                .setDisabled(false);
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
    void test9() throws ConnectionError, ProcessingError {
        Request request = new ListBills()
                .organizationCode("-Jp7kL8y")
                .description("IiOwN14umNbs9HzTMzg2AFGgoFwChMKyF")
                .createdFrom("2021-09-29T13:05:19.000000Z")
                .createdTo("2021-10-26T11:55:40.000000Z")
                .shopName("np6NWuVTvukHEJJxjvwAaSkrlPscgFZA7kgmnQGh0g7xEy0gjIfqsy3qqeO2uL3gmJXocI00jDfhi9nkYKzlD45lOs5FqPThDPFGAn6g717B9KAWVHYRkMJaQT0YWfQtgxVhq9RVZQG6j5A2pjVon4uuDqic8AnsoXtmv8LerXQe8LjF8Q6qvpD5ZbBwXFvQ1skGDixXFJczCMVyjlRecAjobCopZKVFLb9UiV0XEmt")
                .shopId("e57b1c63-c28d-43ab-b992-9ee99f75160e")
                .lowerLimitAmount(4290)
                .upperLimitAmount(4228)
                .setDisabled(true);
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
    void test10() throws ConnectionError, ProcessingError {
        Request request = new ListBills()
                .privateMoneyId("df234d3c-99f3-4b08-bc3b-95f9771c9f79")
                .organizationCode("lu3-l----QNs-JFkVzAdX-8--e0-5")
                .description("zg6LOAwdB03Wi69g5bppku3R9lJVdDaUu8gKI7uxlsX8tJTVN1o4Avhi0fX5dozKzovfXQ3P")
                .createdFrom("2021-01-17T09:28:40.000000Z")
                .createdTo("2022-01-08T09:20:21.000000Z")
                .shopName("hjHLVEtSIaxZ8O9N2SLzG35Urh2rbZx2aArvrKFEW0caD1nqOzKQjZCyx1Ep")
                .shopId("72cdf3b4-d256-42fd-ab5f-bb09eca8d78b")
                .lowerLimitAmount(4506)
                .upperLimitAmount(321)
                .setDisabled(true);
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
    void test11() throws ConnectionError, ProcessingError {
        Request request = new ListBills()
                .billId("gvgI7YgV")
                .privateMoneyId("08c9f9cb-602d-46ff-9f17-268356ed04c3")
                .organizationCode("5uc-J-a-3--Ef1-KE6")
                .description("vvyWz4acD4YN59s59xIWGujcTxFFrrXyLyMOsteVH8YLvoUoraYyVUvoHuSd144X7ZEq8UGlMat7Q5BMcC1v73")
                .createdFrom("2024-07-03T12:05:10.000000Z")
                .createdTo("2022-08-09T16:28:31.000000Z")
                .shopName("y8DMLWrlnr061xWZsz1ogogHitDMic7XGDhIwoiIw8buBfBCDG7j4DoWkpZIbqBi9TROGFtlR9rLj2Y1ER9gKdUSrcKHlFd3Ur1MCMIUROIYftW7QMsIbzCAj1GsSvfXjxUW5PMdDuBsMe04PTf8vSsZQwwHu7ykbtkzGPhzROeLpMaUZ")
                .shopId("043c70a4-2dde-415f-ace6-c21faf330fa1")
                .lowerLimitAmount(8747)
                .upperLimitAmount(746)
                .setDisabled(false);
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
    void test12() throws ConnectionError, ProcessingError {
        Request request = new ListBills()
                .perPage(7419)
                .billId("mGpF3omD")
                .privateMoneyId("f2e6f30f-b642-4639-b260-84f23fdaa475")
                .organizationCode("6lrdsx-d8l6i---y--o")
                .description("95sfTG55oAI4VCG4sTwcYeFwcP7ZmLygXYRtjxN2")
                .createdFrom("2023-05-20T19:07:13.000000Z")
                .createdTo("2021-11-08T05:48:57.000000Z")
                .shopName("o6xNkWo0aYr1y1KHCmQGL0IM3EaCDd87kJG01a7GOWj7LV4v5yotPxhlRj2vkjikjfOo5Zy9zD8cfycxdjXF6cmwiKvevzAx7rHin0MHYFpvhqZUg2yG4Wo0L4evFZLjpsodOQD43fZ5T5bk20dIuBp2e25agSXyEGickpeze5Yn7vyzhltNB5edjt157B8n6abEccTMUOFUG9Fme9wlEEj2gZC8ckmFOzWR")
                .shopId("d4d02fe4-2799-4981-8100-8fcb78fc2662")
                .lowerLimitAmount(2172)
                .upperLimitAmount(177)
                .setDisabled(true);
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
    void test13() throws ConnectionError, ProcessingError {
        Request request = new ListBills()
                .page(4530)
                .perPage(466)
                .billId("IHM0x")
                .privateMoneyId("76f68a27-9d35-4225-af5c-14ca1f6447a6")
                .organizationCode("8-4e-G1Y---z--dY-")
                .description("KmUw0VnsFyzfyt6Bg95FB1a7IFTBkW9tPubyeqITUoc54HWI6lY3NxA2Qq6LVyn2dOGJj5BoyL1MgjctfisLuYo4aorOwFrhmbs26EDk")
                .createdFrom("2022-06-25T22:58:02.000000Z")
                .createdTo("2024-05-17T15:59:00.000000Z")
                .shopName("nAr7NHvMDZLOk3Kn6N9IKA2DQ0UDl0RkGXqQRpkGArTGUPugetKJLdESdgB4DMlPhuAgx6J23S5a4")
                .shopId("8b2f984b-29ca-4c48-b2e4-be0bcaa25121")
                .lowerLimitAmount(1482)
                .upperLimitAmount(9878)
                .setDisabled(true);
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
