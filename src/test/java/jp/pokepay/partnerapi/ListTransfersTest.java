// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.ListTransfers;
import jp.pokepay.partnerapi.request.Request;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ListTransfersTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new ListTransfers();
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
        Request request = new ListTransfers()
                .transferTypes(new String[]{});
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
        Request request = new ListTransfers()
                .transactionTypes(new String[]{"transfer"})
                .transferTypes(new String[]{"exchange"});
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
        Request request = new ListTransfers()
                .setModified(true)
                .transactionTypes(new String[]{"exchange","payment","transfer","topup"})
                .transferTypes(new String[]{"topup","payment","exchange"});
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
        Request request = new ListTransfers()
                .privateMoneyId("0cc69c94-6b3f-4a91-b3b3-d5e5e78e2a40")
                .setModified(true)
                .transactionTypes(new String[]{"transfer"})
                .transferTypes(new String[]{"payment","transfer"});
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
        Request request = new ListTransfers()
                .transactionId("1bff689c-8cfb-475b-a32a-95326e526f27")
                .privateMoneyId("6420361e-5c1c-46c5-88dc-0bb32c278a0d")
                .setModified(false)
                .transactionTypes(new String[]{"payment","exchange","topup"})
                .transferTypes(new String[]{"topup","transfer","payment"});
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
        Request request = new ListTransfers()
                .customerName("MvvWttu1PJb3d04IfskzbRh2KXDkJqy1UyPaGHVkyMSdmemZcovbEUc9TiM3DTSa7pJlo8JS6mIVfCl8O6XTpGUPEJOaNnRanlNyuKHWuXq7zEzVgAAIhzrVmMQ7zQf4j1Xlnx61iQEXBdwXQXBx9CjvSgZke3VuPIIBeUSxLQqoj9SXP9EgDJcoagTJNb42JvVKNsj3zA7Dw0uibv6")
                .transactionId("6c75e590-a6be-46cf-b01a-116eb30ffa46")
                .privateMoneyId("f7935efc-6482-4822-a1ae-08889b7d1c93")
                .setModified(true)
                .transactionTypes(new String[]{"topup","transfer","payment","exchange"})
                .transferTypes(new String[]{"transfer","exchange","topup","payment"});
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
        Request request = new ListTransfers()
                .customerId("5994de8f-2149-495a-9c20-8604f4572eee")
                .customerName("C6rDyYuuG1XnlSIVaCTCoBzc3PolsdbrxUTbpTkQr9CA458OFUiC0xNjD1g6ausYOsWjmgSVes0LvRpIOKLgAa2m76DTKceEBbKe1QbzWrTYvHigdBYvKVDdotVdsHD1HarFGRZ0Q28LywVGUz2sIRxtNbAYMzHePlwRH")
                .transactionId("69e6efca-1f4c-41d0-84e5-3262ea8d8220")
                .privateMoneyId("45b98659-485f-43c3-817f-789dc0139e33")
                .setModified(false)
                .transactionTypes(new String[]{})
                .transferTypes(new String[]{});
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
        Request request = new ListTransfers()
                .shopName("XP3xuhhy9uGRsNNOdzmZ5nbPQzPRirLmp7HiQajpl09d6QIiaL5c40GPi4ivBi3eJhDgAiQ5RhXwEfmyakwCi2K41MKrJ8u3JtJHw13BJLqURa9CDG8z1r52NxmvSo3IMgKOG9RqgqLtsxscDVj4qDxwlIsjYdDsgNzWfMVYN8tFORiCKaN1GSBkTmsnETZgON7wI25XD4LDGgtc1eHQx1a38fcy9G2ru7CIugZBUKc")
                .customerId("f6b53b36-8db4-4b14-bb41-1cb81de6c588")
                .customerName("KJDFHDE0sPhVLSmxr0FU3DnW6KqsDEeelMkJvsg1mQveiZolVhKjCQVZwzstz19XaUt7HUg2vBtQ3icUlEOMImvGy37aG3VpRlqKVbLVJ59qzi8HFxZtC5ypm8TU2Y6m10oazOnSDRVBADkHpYoJtK8deELoxPb8vCqW")
                .transactionId("99f47538-2e20-495d-8dda-9e0cfbd6a0e0")
                .privateMoneyId("40263372-1d23-472b-9571-d2bbe9ff71e6")
                .setModified(true)
                .transactionTypes(new String[]{"transfer"})
                .transferTypes(new String[]{"exchange"});
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
        Request request = new ListTransfers()
                .shopId("52e1b86b-d2e2-47ff-ba99-d37a0dea92a0")
                .shopName("mAIScfq8JbwsUjFhr3Nwo")
                .customerId("c3aa48c5-0021-4e25-b961-18676f6a3f32")
                .customerName("SfuJiolnAr0O5BazmKqHU")
                .transactionId("32d82dec-280c-42df-b6fc-ad496297d8b3")
                .privateMoneyId("c01dee54-86cc-42d2-85c4-4516feb21916")
                .setModified(false)
                .transactionTypes(new String[]{"transfer","exchange"})
                .transferTypes(new String[]{"topup","payment","exchange"});
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
        Request request = new ListTransfers()
                .perPage(4868)
                .shopId("c0640bf2-7117-4510-8fc0-cf5f1dc538f1")
                .shopName("E4xR4GA8B6QEvmE")
                .customerId("97772522-a1f4-43d1-9154-a3ba7004ac1c")
                .customerName("qfIDfhF08aWAgYKg")
                .transactionId("09bb2bcd-10bc-4952-a7be-f2b47b5f97ac")
                .privateMoneyId("e6a21b5c-4be5-4b69-aaf5-8d1903dc1b7b")
                .setModified(false)
                .transactionTypes(new String[]{"topup","payment","exchange","transfer"})
                .transferTypes(new String[]{"exchange","topup","transfer"});
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
        Request request = new ListTransfers()
                .page(2784)
                .perPage(4219)
                .shopId("f98b4df5-c995-408a-bb6b-47a2f3349e71")
                .shopName("Xii06wz9NdLnaFp0d8NnYZXWwwPUfmYGEVrOM4dkj0diMGxwkBMFBNKhTrrGkGVnz7dW1L5JRcqWGZoB7J2SLBuVTFPFKYeglUQAESlFenRvUgW2C0Pk55puUaBmR66mDvQf3SzEAz6sFhOXUyleHUBygYLLJFfbbjnOxn1Ii4")
                .customerId("102832d1-372f-4b79-a1c2-ff615d5aa9e2")
                .customerName("j1sJ7k6dP6L13ja9VovumOjMgFfs83kBzSot4H9G2QRAYPymeRfFOHsPVjb9UCbPcYx5Y")
                .transactionId("e0af101c-8658-4e02-a9d9-4f4f9b3545d7")
                .privateMoneyId("f70e4db0-5b06-438d-af01-ff114423a488")
                .setModified(true)
                .transactionTypes(new String[]{"payment","transfer","topup"})
                .transferTypes(new String[]{"transfer","exchange","topup"});
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
        Request request = new ListTransfers()
                .to("2017-04-11T06:07:49.000000+09:00")
                .page(4668)
                .perPage(3286)
                .shopId("9572bf4f-ca52-4b38-8998-c53865a579dc")
                .shopName("F7Ubd6")
                .customerId("0885ed81-ed24-48a5-9945-00dcb2e383a5")
                .customerName("IlmfbIWBjq1h3aM3MFSn6Z9Xp0dYAIwKPnm62HiK775FUjJKUwWsCFULHC5xu9xwKzEEFrv0p5VC2XFSxIKMXYPxeKc6v3uyZaCEMZ2Ju8UbXHSU9E0Qlg3gebvAwjzG8UYapgA4DXNtjsg9PgQ")
                .transactionId("977a70eb-fd58-4ef1-999c-df501080f69c")
                .privateMoneyId("bae62c29-6b0c-49fe-916e-2d5c9c176211")
                .setModified(true)
                .transactionTypes(new String[]{})
                .transferTypes(new String[]{"topup"});
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
        Request request = new ListTransfers()
                .from("2022-11-03T04:04:27.000000+09:00")
                .to("2022-10-16T17:18:01.000000+09:00")
                .page(1910)
                .perPage(3217)
                .shopId("84cc37b8-5977-40bb-901b-fd46a304dee4")
                .shopName("I0g8RX9GwTm1EaeDH0runisLVA8D7RtvLwRN8QmXijHIyMGxrgTxrmP2c2b7AqdqrRaU4tsNqOUthYSxSa5qYfKcdpEzIZoGgQ8JT7nM2XSRS8qzeJVaYua2WPHw1UTjf1quigD2l2JnK33Y2PKkmhgdj1RbwEdGAkTKdkwDZEgx5wET5OvQdZofRUOUAciXVcpzKCMcrOD6Em")
                .customerId("19f2c56b-d132-4377-abaf-17f05a6d8132")
                .customerName("XzqZDQWG9JIPYO9QhKjYAAaWngq9PQfQxKRvEszf3mWAEHwNafuFelOU7xCAyi0eUz4xXH5OLhVoB1lIuiOfxpiSD0ualUMr1aiXbRr0Yt")
                .transactionId("a380ba3c-56b6-45ae-8fdf-ed9ddd0b2f6e")
                .privateMoneyId("bd3c2e2d-daa7-4074-b08b-f6133a23fc8c")
                .setModified(false)
                .transactionTypes(new String[]{"payment"})
                .transferTypes(new String[]{"payment","topup","transfer","exchange"});
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
