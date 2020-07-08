package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.ListTransactions;
import jp.pokepay.partnerapi.request.Request;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ListTransactionsTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new ListTransactions();
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
        Request request = new ListTransactions()
                .types(new String[]{});
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
        Request request = new ListTransactions()
                .setModified(false)
                .types(new String[]{"topup"});
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
        Request request = new ListTransactions()
                .privateMoneyId("f16d2f63-2483-46e1-a1c6-3cbd05cc1ddf")
                .setModified(false)
                .types(new String[]{});
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
        Request request = new ListTransactions()
                .organizationCode("-kI")
                .privateMoneyId("4794df06-e613-4f6d-81a4-9c12836a6796")
                .setModified(true)
                .types(new String[]{"topup","exchange_inflow","payment","exchange_outflow"});
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
        Request request = new ListTransactions()
                .transactionId("cbd63096-8dbf-416d-948c-083ec31120ce")
                .organizationCode("")
                .privateMoneyId("7cea2bfc-c851-46cc-bd58-f1e4b7cfd2ca")
                .setModified(false)
                .types(new String[]{"exchange_outflow","payment","exchange_inflow","topup"});
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
        Request request = new ListTransactions()
                .terminalId("1f75ebf3-e16f-4128-9b00-866d9650cfd9")
                .transactionId("98a9a4f0-9159-49b8-a342-d8d50294e52b")
                .organizationCode("To-H7S5b-")
                .privateMoneyId("ce51ffa7-7758-4f8d-bb42-0364cccadd2f")
                .setModified(false)
                .types(new String[]{"exchange_inflow","topup","exchange_outflow","payment"});
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
        Request request = new ListTransactions()
                .customerName("UKsWvFwdBSFaLRqy8W8BLX4uZKx3k4aKAZ11jHtcFKEaUSnfAIeOwvUOWStVX1mrTOqt8iKrzcLcvb5CnSe0T6W9QGMhA7YjloBV2kHSR8EYv38fwmXP8F7L0EHUNUQU4phusz0W9fEzGAuMcN0KFT5qzPUlylEmnDn7AmChTUit8wTRWiv8NocDIejBLcTfPFeIePtCI98KTneIsIXbAa5VLWwyhdA62e8JlTbKMctcul7Da0Cj")
                .terminalId("59027651-7852-4148-ae5d-0479ea46cf79")
                .transactionId("bf1002e8-1d35-43d4-ae2a-85e8e52589ee")
                .organizationCode("2-2K4V7-3")
                .privateMoneyId("8465895e-d441-495e-897e-61218183a2a8")
                .setModified(false)
                .types(new String[]{"payment","topup","exchange_outflow","exchange_inflow"});
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
        Request request = new ListTransactions()
                .customerId("f2f2efe5-3709-4440-b34c-e32432a6b55d")
                .customerName("aBqOLPXPWyzTjqMJvEoooklxSIccJvZthYGVy2zRRRC8X6o2W6GM18MNAw0PKRo8RI")
                .terminalId("82c0a619-4071-4599-955e-95619e6eda0e")
                .transactionId("597c79a5-a9ec-443a-9382-1da7a3bce450")
                .organizationCode("-4Y4--U46Lgpb7K6-4V4-xZwTwQe")
                .privateMoneyId("53a1fd40-e82b-45ad-8b2d-ef7416edc4e7")
                .setModified(true)
                .types(new String[]{"payment","exchange_inflow","topup","exchange_outflow"});
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
        Request request = new ListTransactions()
                .shopId("cd2036bd-f4e5-4143-87ae-8b3b629397ea")
                .customerId("302f58de-69f4-4654-ad25-60a485dd71b0")
                .customerName("zMGlJDP8Jity")
                .terminalId("5dccbf36-cf3e-4cf0-bb4c-a83640e650a1")
                .transactionId("9d07aa67-0b0b-41dd-8967-fcb307dd808d")
                .organizationCode("w-SA-")
                .privateMoneyId("a9b01038-56b7-4800-8ceb-b8ea2827aa31")
                .setModified(true)
                .types(new String[]{"payment"});
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
        Request request = new ListTransactions()
                .perPage(5208)
                .shopId("eb8cdc2a-4689-49ab-89d2-4dcf1503dab0")
                .customerId("f2d75b62-f3a8-4e9d-862e-50c9bffe890c")
                .customerName("DOWTwOY96TyGTpy0AP6e13illkdzcFRNqHsCL5Ewr8TGwFjxjvVL0oi7jJh67iEzGxP8OCh2qtrzxnfTo2GMFZLemdRBBhPzkbEoZmaFitHRKD5elcNLzIFJKhvFYS5")
                .terminalId("534a74a9-ae37-488a-9cd5-9b91ddcfbf3d")
                .transactionId("61910b11-01dc-4d42-8aea-58110c26d7e2")
                .organizationCode("I-")
                .privateMoneyId("812e8c95-e63b-4929-ab8f-edc65df9a123")
                .setModified(false)
                .types(new String[]{"exchange_outflow","topup","payment"});
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
        Request request = new ListTransactions()
                .page(1026)
                .perPage(9861)
                .shopId("9ded0e10-805b-4a70-8595-26070563a238")
                .customerId("ff586297-90f1-4b5f-996c-89dbc373ef55")
                .customerName("4maweDR9JElvTiCVqMVwtxd6tswXH8ZrSHnc22jp2CucnI2Qj4X1KR9K2MXdKsPUbQxS1xyagashuR0QIFdu3zUhEa9dKF7G2tbJh0tx1qy6YsCvvzNAStjjKukuRigyjEjYuf7NwrScmHO95yiDSSB88XAeOfSM71lF2FufW1jX67964mMFBcIrSHgcwT2MnMB")
                .terminalId("e532e34d-e87b-490a-84d0-909051ca378c")
                .transactionId("ad08ee89-d5ca-4395-ab5b-73e3118236e3")
                .organizationCode("-N-4-")
                .privateMoneyId("df4b780f-7cb7-4368-ad0d-93a4268ea9c1")
                .setModified(false)
                .types(new String[]{"exchange_inflow"});
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
        Request request = new ListTransactions()
                .to("2017-11-08T11:37:04.000000+09:00")
                .page(538)
                .perPage(6755)
                .shopId("3433f4d0-6020-4a7d-a0a8-1ffb53b7e2fa")
                .customerId("cf274fdb-e0d3-48b9-8221-6b70dd0907e9")
                .customerName("FiiAzsHamfTnHbfFQXMxe60379TndeAdBwor4Xaj6DRa91XJ9XPzOFN0logyiK8R0z8ubcP7wrzVodZGql4LEft2qYcTrOOej65gJywi9umep7YWeDJahcFfcILvh0V8UxKRgrby8FR7SSprohuIKDLH0wJPE")
                .terminalId("f1355c76-0ccb-461f-9d56-9bd76a74950b")
                .transactionId("3d29f04b-d84a-4639-a08d-deb4f623211c")
                .organizationCode("N70YCG7-Uy-E-6-GuB14xE3--n-")
                .privateMoneyId("c2bfef71-183d-41e4-8143-7e72656b42da")
                .setModified(true)
                .types(new String[]{"exchange_outflow","payment"});
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
        Request request = new ListTransactions()
                .from("2019-12-08T01:00:00.000000+09:00")
                .to("2022-02-23T18:31:17.000000+09:00")
                .page(8975)
                .perPage(2536)
                .shopId("e2890504-099d-4f64-9ec7-8e007ef063a1")
                .customerId("fae7de78-42bd-404e-a6ac-a3d260096938")
                .customerName("v5Jumn28jcWJX5V4QnTPJTNA7oBXBRxbTTobLAO1Lo2ij0mcTFGYqh4eIVgshQ3AcrqwEZyZQo5cUJGjjB7roCwkIV7zt89LctsPz9hLAzPu5tvRIsdtCwXGhudRkNp3bADTmKEkK07mCFkDvXTjGMR1dsruWidbw3rWKu2scu7IsgCdfb1YVwy")
                .terminalId("7ee3a20d-7464-4d9c-96b3-08c783f54f42")
                .transactionId("27644555-abef-44b7-a873-93c860a25637")
                .organizationCode("-f-qKkQaC79--Am-hq9-H4-rnM-R")
                .privateMoneyId("c84b5547-b759-4bf8-a47b-e9587a9b15dd")
                .setModified(true)
                .types(new String[]{"topup"});
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
