// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.CreateOrganization;
import jp.pokepay.partnerapi.request.Request;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreateOrganizationTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new CreateOrganization(
            "0k8dxuKg",
            "CFI0Qv1brn8ATMTNMMEyVApkaDeYuOtBoCZgc4gwc8RSE7B5wsqfAkho5yO5EQGpb9AHk6UF1UjWUyw97H5Wi0UlM5hWRopq8fm3QjwrUJDS6QIEgbGEOQG1PZp7fjd91zgh1RHHtL55R7YEprCJ0U4QnLZWmGvTqLQwaZ9v",
            new String[]{"1cbefc36-69b7-4473-8170-0befefa305d2","9307c76f-4a88-4550-bc11-bc0b090cc8cb","ebb2ff55-fbe7-4c7e-af09-3957df1f28f6","2feb369b-b459-472d-ab1b-f756f4479705","632fb513-3cbf-40dd-a03e-91fed8c6a607","8fdfc1e1-69af-4f1e-b347-c3a71f8645f6","2f237f8a-e6ac-40b9-88f8-02e25457f666"},
            "zvgScohGvf@vszF.com",
            "ZKZ0fsirdy@b8N5.com"
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
        Request request = new CreateOrganization(
            "0k8dxuKg",
            "CFI0Qv1brn8ATMTNMMEyVApkaDeYuOtBoCZgc4gwc8RSE7B5wsqfAkho5yO5EQGpb9AHk6UF1UjWUyw97H5Wi0UlM5hWRopq8fm3QjwrUJDS6QIEgbGEOQG1PZp7fjd91zgh1RHHtL55R7YEprCJ0U4QnLZWmGvTqLQwaZ9v",
            new String[]{"1cbefc36-69b7-4473-8170-0befefa305d2","9307c76f-4a88-4550-bc11-bc0b090cc8cb","ebb2ff55-fbe7-4c7e-af09-3957df1f28f6","2feb369b-b459-472d-ab1b-f756f4479705","632fb513-3cbf-40dd-a03e-91fed8c6a607","8fdfc1e1-69af-4f1e-b347-c3a71f8645f6","2f237f8a-e6ac-40b9-88f8-02e25457f666"},
            "zvgScohGvf@vszF.com",
            "ZKZ0fsirdy@b8N5.com"
        )
                .contactName("N4uLXeppDXZ9aq2pYugtiiL7qWoYElTKm");
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
        Request request = new CreateOrganization(
            "0k8dxuKg",
            "CFI0Qv1brn8ATMTNMMEyVApkaDeYuOtBoCZgc4gwc8RSE7B5wsqfAkho5yO5EQGpb9AHk6UF1UjWUyw97H5Wi0UlM5hWRopq8fm3QjwrUJDS6QIEgbGEOQG1PZp7fjd91zgh1RHHtL55R7YEprCJ0U4QnLZWmGvTqLQwaZ9v",
            new String[]{"1cbefc36-69b7-4473-8170-0befefa305d2","9307c76f-4a88-4550-bc11-bc0b090cc8cb","ebb2ff55-fbe7-4c7e-af09-3957df1f28f6","2feb369b-b459-472d-ab1b-f756f4479705","632fb513-3cbf-40dd-a03e-91fed8c6a607","8fdfc1e1-69af-4f1e-b347-c3a71f8645f6","2f237f8a-e6ac-40b9-88f8-02e25457f666"},
            "zvgScohGvf@vszF.com",
            "ZKZ0fsirdy@b8N5.com"
        )
                .bankAccountHolderName("ｦ")
                .contactName("ZkEzCv");
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
        Request request = new CreateOrganization(
            "0k8dxuKg",
            "CFI0Qv1brn8ATMTNMMEyVApkaDeYuOtBoCZgc4gwc8RSE7B5wsqfAkho5yO5EQGpb9AHk6UF1UjWUyw97H5Wi0UlM5hWRopq8fm3QjwrUJDS6QIEgbGEOQG1PZp7fjd91zgh1RHHtL55R7YEprCJ0U4QnLZWmGvTqLQwaZ9v",
            new String[]{"1cbefc36-69b7-4473-8170-0befefa305d2","9307c76f-4a88-4550-bc11-bc0b090cc8cb","ebb2ff55-fbe7-4c7e-af09-3957df1f28f6","2feb369b-b459-472d-ab1b-f756f4479705","632fb513-3cbf-40dd-a03e-91fed8c6a607","8fdfc1e1-69af-4f1e-b347-c3a71f8645f6","2f237f8a-e6ac-40b9-88f8-02e25457f666"},
            "zvgScohGvf@vszF.com",
            "ZKZ0fsirdy@b8N5.com"
        )
                .bankAccount("4")
                .bankAccountHolderName(")")
                .contactName("nF41oUMWRj1sxtSyQgT1GkRhboXHY39x3Xs6KbKOjUQYLsphxNcJXceDU70KRGU02ETtMe3p5BruF5QOJx8zwWTQtwhgEUQrpqVtFI20RqU84wWVej7KjR7PO79YOuc2btzI2HvKaIy1dRKuzOlLMmdBSZr220xtZpZdQ9sslu");
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
        Request request = new CreateOrganization(
            "0k8dxuKg",
            "CFI0Qv1brn8ATMTNMMEyVApkaDeYuOtBoCZgc4gwc8RSE7B5wsqfAkho5yO5EQGpb9AHk6UF1UjWUyw97H5Wi0UlM5hWRopq8fm3QjwrUJDS6QIEgbGEOQG1PZp7fjd91zgh1RHHtL55R7YEprCJ0U4QnLZWmGvTqLQwaZ9v",
            new String[]{"1cbefc36-69b7-4473-8170-0befefa305d2","9307c76f-4a88-4550-bc11-bc0b090cc8cb","ebb2ff55-fbe7-4c7e-af09-3957df1f28f6","2feb369b-b459-472d-ab1b-f756f4479705","632fb513-3cbf-40dd-a03e-91fed8c6a607","8fdfc1e1-69af-4f1e-b347-c3a71f8645f6","2f237f8a-e6ac-40b9-88f8-02e25457f666"},
            "zvgScohGvf@vszF.com",
            "ZKZ0fsirdy@b8N5.com"
        )
                .bankAccountType("current")
                .bankAccount("183")
                .bankAccountHolderName("3")
                .contactName("AlylPpV6xWxt7f2oLFlgp2lLhVbHghg4lZSVxXqYiDQPFv2xIXmI4PlPvyiodipyOhBLvJd18F7msVClYIZ6Bq4ZCm153pAwidsKM1ZphpLhv7NIoqmlJpzKOYIsRtFF9xx8GHcZXN3Xa70o7nFXURkjCcagg1x0DCy4shXKR7nTWCyIt3Gr6ubUQRiycmsaOa8T2aG0PP6tnqHnuoUILOizvfJbTr");
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
        Request request = new CreateOrganization(
            "0k8dxuKg",
            "CFI0Qv1brn8ATMTNMMEyVApkaDeYuOtBoCZgc4gwc8RSE7B5wsqfAkho5yO5EQGpb9AHk6UF1UjWUyw97H5Wi0UlM5hWRopq8fm3QjwrUJDS6QIEgbGEOQG1PZp7fjd91zgh1RHHtL55R7YEprCJ0U4QnLZWmGvTqLQwaZ9v",
            new String[]{"1cbefc36-69b7-4473-8170-0befefa305d2","9307c76f-4a88-4550-bc11-bc0b090cc8cb","ebb2ff55-fbe7-4c7e-af09-3957df1f28f6","2feb369b-b459-472d-ab1b-f756f4479705","632fb513-3cbf-40dd-a03e-91fed8c6a607","8fdfc1e1-69af-4f1e-b347-c3a71f8645f6","2f237f8a-e6ac-40b9-88f8-02e25457f666"},
            "zvgScohGvf@vszF.com",
            "ZKZ0fsirdy@b8N5.com"
        )
                .bankBranchCode("")
                .bankAccountType("saving")
                .bankAccount("246051")
                .bankAccountHolderName(",")
                .contactName("HQVtzlq6MKoBezSZGJZ1h8km3mkAPAZ0UMnnwl");
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
        Request request = new CreateOrganization(
            "0k8dxuKg",
            "CFI0Qv1brn8ATMTNMMEyVApkaDeYuOtBoCZgc4gwc8RSE7B5wsqfAkho5yO5EQGpb9AHk6UF1UjWUyw97H5Wi0UlM5hWRopq8fm3QjwrUJDS6QIEgbGEOQG1PZp7fjd91zgh1RHHtL55R7YEprCJ0U4QnLZWmGvTqLQwaZ9v",
            new String[]{"1cbefc36-69b7-4473-8170-0befefa305d2","9307c76f-4a88-4550-bc11-bc0b090cc8cb","ebb2ff55-fbe7-4c7e-af09-3957df1f28f6","2feb369b-b459-472d-ab1b-f756f4479705","632fb513-3cbf-40dd-a03e-91fed8c6a607","8fdfc1e1-69af-4f1e-b347-c3a71f8645f6","2f237f8a-e6ac-40b9-88f8-02e25457f666"},
            "zvgScohGvf@vszF.com",
            "ZKZ0fsirdy@b8N5.com"
        )
                .bankBranchName("o100h7H4BT2IdLeJZDTCEki4ZW2q")
                .bankBranchCode("959")
                .bankAccountType("saving")
                .bankAccount("0427")
                .bankAccountHolderName(")")
                .contactName("XkPd0Pd9Lm5F7XmpoqfPmIraGVhsLJiqbQ3MQR9CltXlG6ahNcft22Prls");
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
        Request request = new CreateOrganization(
            "0k8dxuKg",
            "CFI0Qv1brn8ATMTNMMEyVApkaDeYuOtBoCZgc4gwc8RSE7B5wsqfAkho5yO5EQGpb9AHk6UF1UjWUyw97H5Wi0UlM5hWRopq8fm3QjwrUJDS6QIEgbGEOQG1PZp7fjd91zgh1RHHtL55R7YEprCJ0U4QnLZWmGvTqLQwaZ9v",
            new String[]{"1cbefc36-69b7-4473-8170-0befefa305d2","9307c76f-4a88-4550-bc11-bc0b090cc8cb","ebb2ff55-fbe7-4c7e-af09-3957df1f28f6","2feb369b-b459-472d-ab1b-f756f4479705","632fb513-3cbf-40dd-a03e-91fed8c6a607","8fdfc1e1-69af-4f1e-b347-c3a71f8645f6","2f237f8a-e6ac-40b9-88f8-02e25457f666"},
            "zvgScohGvf@vszF.com",
            "ZKZ0fsirdy@b8N5.com"
        )
                .bankCode("9798")
                .bankBranchName("tQj4OhVm")
                .bankBranchCode("416")
                .bankAccountType("saving")
                .bankAccount("606")
                .bankAccountHolderName("｣")
                .contactName("tR4Fr5En7ms3KrOq6LmEP7tafjyhKgvwh227cUJMuQ1t83oitBAmKCKeNp7Z6KeHafoOKYuUs7zf9dIsiva1vYlz4sIXfB3ep9eHnNy54z9YZjsWtY1WGlubcf8p");
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
        Request request = new CreateOrganization(
            "0k8dxuKg",
            "CFI0Qv1brn8ATMTNMMEyVApkaDeYuOtBoCZgc4gwc8RSE7B5wsqfAkho5yO5EQGpb9AHk6UF1UjWUyw97H5Wi0UlM5hWRopq8fm3QjwrUJDS6QIEgbGEOQG1PZp7fjd91zgh1RHHtL55R7YEprCJ0U4QnLZWmGvTqLQwaZ9v",
            new String[]{"1cbefc36-69b7-4473-8170-0befefa305d2","9307c76f-4a88-4550-bc11-bc0b090cc8cb","ebb2ff55-fbe7-4c7e-af09-3957df1f28f6","2feb369b-b459-472d-ab1b-f756f4479705","632fb513-3cbf-40dd-a03e-91fed8c6a607","8fdfc1e1-69af-4f1e-b347-c3a71f8645f6","2f237f8a-e6ac-40b9-88f8-02e25457f666"},
            "zvgScohGvf@vszF.com",
            "ZKZ0fsirdy@b8N5.com"
        )
                .bankName("H65gFI1eD4xOb3KkBBLymzX1iKABzsalQh9et3sJPwGPZVdf")
                .bankCode("8216")
                .bankBranchName("60qrR")
                .bankBranchCode("394")
                .bankAccountType("current")
                .bankAccount("7955440")
                .bankAccountHolderName(" ")
                .contactName("hJH0jAjNW1ZH6MoDDkoySCPKncEWYebt4RUGRqT3wcuceySCabxrgTXSxZbg1Ud9jBS9CQqv6T7eIQXHJd8SnpNPnO39WNWvjXlHUhCIHkb");
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
