// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.ListTransactionsV2;
import jp.pokepay.partnerapi.request.Request;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ListTransactionsV2Test {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new ListTransactionsV2();
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
        Request request = new ListTransactionsV2()
                .perPage(872);
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
        Request request = new ListTransactionsV2()
                .prevPageCursorId("05c0837a-6a80-4e4f-9521-04de7b4a40af")
                .perPage(967);
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
        Request request = new ListTransactionsV2()
                .nextPageCursorId("31604d2c-743e-4a38-88d2-0770324855d9")
                .prevPageCursorId("27084f89-3e75-4f5e-914c-66340f258066")
                .perPage(315);
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
        Request request = new ListTransactionsV2()
                .to("2022-03-03T21:40:08.000000+09:00")
                .nextPageCursorId("900d6871-a06d-4995-8376-8b74f5efb130")
                .prevPageCursorId("0e1abba2-57e2-4956-bc62-24132e785321")
                .perPage(724);
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
        Request request = new ListTransactionsV2()
                .from("2022-07-10T16:24:17.000000+09:00")
                .to("2021-04-30T08:12:55.000000+09:00")
                .nextPageCursorId("293fd4e9-851f-4781-bece-0d2b2f4579de")
                .prevPageCursorId("48e743b9-269d-4d93-a3dd-a55d6ed76e37")
                .perPage(824);
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
        Request request = new ListTransactionsV2()
                .types(new String[]{"exchange_outflow","topup","exchange_inflow","payment","cashback","expire"})
                .from("2021-03-12T16:41:28.000000+09:00")
                .to("2021-11-30T20:58:12.000000+09:00")
                .nextPageCursorId("a3c008dd-97d5-4555-afe1-850b542f3c25")
                .prevPageCursorId("aa840f34-1090-440f-8c55-75e5abd1f633")
                .perPage(459);
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
        Request request = new ListTransactionsV2()
                .setModified(false)
                .types(new String[]{"exchange_outflow"})
                .from("2021-10-31T08:17:28.000000+09:00")
                .to("2023-10-17T05:31:43.000000+09:00")
                .nextPageCursorId("7d244f6a-fe7e-47bf-a0ba-2f9b1cf567c3")
                .prevPageCursorId("c2c904f5-f185-4f39-997c-6a3360b25eab")
                .perPage(887);
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
        Request request = new ListTransactionsV2()
                .transactionId("z")
                .setModified(false)
                .types(new String[]{"expire","cashback","exchange_inflow","exchange_outflow"})
                .from("2020-01-04T21:31:27.000000+09:00")
                .to("2021-06-27T02:28:58.000000+09:00")
                .nextPageCursorId("8aac9c7f-7d7f-435b-a8c3-003858e85571")
                .prevPageCursorId("3880d6e7-93d8-4ff4-9514-8beaae051075")
                .perPage(980);
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
        Request request = new ListTransactionsV2()
                .description("QuM7dynCRDNtDGqSRRbfVk")
                .transactionId("LYD5c4p7CO")
                .setModified(true)
                .types(new String[]{"expire","exchange_outflow","payment","exchange_inflow"})
                .from("2023-10-27T13:51:10.000000+09:00")
                .to("2022-05-27T12:35:08.000000+09:00")
                .nextPageCursorId("2363e424-0542-4828-a512-a76c59f41f9e")
                .prevPageCursorId("d720593a-469a-40a3-8e6e-fa1f35e540c9")
                .perPage(243);
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
        Request request = new ListTransactionsV2()
                .customerName("7gH9jVOPbAymwXcIE3kyUDebDcON21PE513FzYRScFrmMcJLgl8qlxExNj27GBoQzDu6ZtM45Y6NAe92GRGGtpxSlDGcvcSVc07eDZ64WBgtILE4RRSEnRn2gmEOUybX3")
                .description("GPBeOxM7ClWAYwiHKTizhwN5y3cpA9QHvqiUpVYKJuFzgJooxc2PluD123h7Ni8Pgd4DgkzvH6sZnO1VvMCf7lahvdrXwGoxtAp9lUsacIcOYi4LLh3jg4dboprkQ0ge9uJIC")
                .transactionId("NXWkfejKs")
                .setModified(false)
                .types(new String[]{"exchange_outflow","topup","exchange_inflow","payment","cashback","expire"})
                .from("2022-06-05T00:00:27.000000+09:00")
                .to("2020-04-19T06:46:33.000000+09:00")
                .nextPageCursorId("82f055fb-d92a-4e02-9bb4-071b7788b792")
                .prevPageCursorId("dcf7f41d-c9cb-4dc4-8de5-b2487780a680")
                .perPage(982);
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
        Request request = new ListTransactionsV2()
                .customerId("7d3c6b96-95ce-4a0a-b3a6-4b3ced3094f0")
                .customerName("5NkFUE6QWcnqT7Hk15NoKckgrygyAxvqDD0jrjCszQdvytzuTG2WxsDKPS")
                .description("Hkz9XkjrPPy02fbMNnJUUk7ZRtJ5EOU9OGjypaebd4RSnhq5ihdc4t7Voms8E0sTxL1w0pUzAXQi9tzZZ7")
                .transactionId("06AKGFM")
                .setModified(false)
                .types(new String[]{"payment","exchange_inflow","topup","expire"})
                .from("2024-05-07T19:28:20.000000+09:00")
                .to("2020-03-22T17:09:48.000000+09:00")
                .nextPageCursorId("936c0733-c863-4a5d-bbd7-6cd63fc78db6")
                .prevPageCursorId("c006390a-1ea5-4755-a7ea-570ed0130c42")
                .perPage(422);
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
        Request request = new ListTransactionsV2()
                .terminalId("52cd1b02-b6c2-4246-8f57-595f4d0e5930")
                .customerId("adce0332-a17f-4e18-b494-cb4aec18023b")
                .customerName("CGJjPKlURuj7ycbIGoEKUl7G16Zd6s2087tEBMagl2e9SO6CqEyZvA7fz2wTO0JiLgsiZpNPerc03BAQivBaO5UZLOzehNei353mUvY3ty5KryadhCHSpSxgra7idj04vpHJIJsmKXWCSRQ4A63fVOTQV6bykKWMe12Y7cANhYvrjqdHbakvsRs9wsw3W17Q5Q5cAaXxWSEcCXqePXpkDEp8Z6mE0hDHllzONKEfogLcLGcn1dQ5hXU")
                .description("Vebbu")
                .transactionId("eYkcSK88H")
                .setModified(true)
                .types(new String[]{"expire","topup"})
                .from("2020-01-22T16:13:03.000000+09:00")
                .to("2021-01-11T00:14:10.000000+09:00")
                .nextPageCursorId("3e3cf142-f30f-4028-a583-9a0a16d0f823")
                .prevPageCursorId("d095438b-5851-4f6f-bef4-0915148f64ad")
                .perPage(857);
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
        Request request = new ListTransactionsV2()
                .shopId("3fe82367-42a0-4b0c-a863-03da74dd83ca")
                .terminalId("1b6df310-a329-4beb-98d1-8446aac886a1")
                .customerId("f34fa1e9-8a6a-4233-b5e6-22e9e5bca01e")
                .customerName("3WleSBllDd5AWqK8c2DYoFQCLtEtR5xv3VVWFB3vCSXyQ5kVX3JdipcKGkBk3nIz4gFV0ZEcbhJU1SGYgM9xdbwmVGgGuPKULnJGuD9C9NjBTXP9eo07pRBZUWumd7UiZycGSpXyHo9dMqK747NjsiK4xp3N6vD9P")
                .description("OBQ1FKpkifHIQKF1O")
                .transactionId("YagHk89wf")
                .setModified(true)
                .types(new String[]{"payment"})
                .from("2020-03-14T13:04:17.000000+09:00")
                .to("2021-03-22T01:26:51.000000+09:00")
                .nextPageCursorId("78dd1df1-5b15-4feb-bc84-ba4c34aaa7dc")
                .prevPageCursorId("a6d95e04-fa57-43a6-a451-958c42f5ed23")
                .perPage(165);
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
    void test14() throws ConnectionError, ProcessingError {
        Request request = new ListTransactionsV2()
                .organizationCode("Ov-Wp-v6CT-7Bb")
                .shopId("143db73c-f2d4-4706-9b2b-422af59e8145")
                .terminalId("19cb778e-6a28-478f-886f-b424f510fbb3")
                .customerId("b6cd78b9-23ce-4c18-a9fa-f2ff0043c85a")
                .customerName("im1PSbSYIEt3XkXUv1u4QLD8SGKfz56TqVbZmHkWAGa2MrjZUW6ZeYiSoxJXLsLGoQiHlWNzH7JEiRZJp27WWMqutWIDJdCpdv7AImd7IATeJXFdQ0NgwxfETWxEZOhYDXmly1scYgkvTglhbp5BsFckftw1MrLJ3YpVm")
                .description("MQvKbR40JeiZj31AyIUcxvCpwtFPGwKqatoK5G32rmCFoL5o2wxXPnONcpS1RTTiMckrYnN792qQOEIt0FteLKiGFkf5j1AslNIEcwOdn8b34zeYw8gM1QDaHUIAUlJaFHFhf59O5Z1RghpJqtXihemd68r9ANoIeZIH0RAR6M")
                .transactionId("L")
                .setModified(false)
                .types(new String[]{"expire","topup","exchange_outflow","exchange_inflow","payment"})
                .from("2023-12-25T13:53:54.000000+09:00")
                .to("2021-10-01T23:01:48.000000+09:00")
                .nextPageCursorId("e9197e86-7110-429a-9cb7-15c15e28a4a2")
                .prevPageCursorId("b912f4be-6b66-499b-bab8-d95e56e27dd4")
                .perPage(475);
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
    void test15() throws ConnectionError, ProcessingError {
        Request request = new ListTransactionsV2()
                .privateMoneyId("de1c5277-ed83-4afb-be88-1f6685cba1ef")
                .organizationCode("D-aWc1t-46m1e8-l-")
                .shopId("0dd4d5fe-3f48-4a95-8780-b998a6cc73c7")
                .terminalId("0a993f63-9325-43cf-9da4-30df327ca0ab")
                .customerId("99afdf62-e665-48db-89ae-0620c19ab635")
                .customerName("QopO7L9Jkgda1flOR1yNg05F9t3WVMflqgoH4tlTNL")
                .description("v4WRcJhWghsJvthrQ3Nr0nYnCDUrhgIzmjjdlJKopKJ4SyU1ASV3MNfRiq0nOYwAkkmXwnGsywbtbAm2xgWzrjCqW9WuwvNt5ciyLfTi6s0OqFd1rXKJtVkx9vtpZWZ2qYwBKSZFcMXnc8cP3UKuA0McZM0RtK0tzvVge8VdQCFEvEYK")
                .transactionId("ubCc6rICu")
                .setModified(false)
                .types(new String[]{"topup","cashback","exchange_inflow","payment","expire"})
                .from("2022-11-05T22:54:53.000000+09:00")
                .to("2024-05-24T21:13:06.000000+09:00")
                .nextPageCursorId("19462628-6627-4b91-9637-a851dd52f26f")
                .prevPageCursorId("d3a59de5-3234-43b5-bda6-7448219efe4b")
                .perPage(562);
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
