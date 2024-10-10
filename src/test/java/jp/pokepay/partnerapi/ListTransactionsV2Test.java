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
                .perPage(794);
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
                .prevPageCursorId("3b39a53e-1ceb-475a-be4c-1b23542a7d10")
                .perPage(636);
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
                .nextPageCursorId("92ca1f0d-d064-4922-b9b8-af969e436ea1")
                .prevPageCursorId("04044642-50dc-4f9d-b957-8e57b8dc3771")
                .perPage(510);
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
                .to("2021-07-05T19:46:25.000000Z")
                .nextPageCursorId("d57c82ce-d572-4f58-96a9-0e05ca0f2b0e")
                .prevPageCursorId("6ce554d8-62a9-47bc-898b-f2318d3486ad")
                .perPage(248);
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
                .from("2024-06-30T00:22:03.000000Z")
                .to("2022-09-03T17:53:44.000000Z")
                .nextPageCursorId("62e27792-a1d4-46f1-9c87-7a7715750571")
                .prevPageCursorId("1e012cde-c398-43fa-9686-d03ceb1a2f3f")
                .perPage(549);
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
                .types(new String[]{"exchange_inflow"})
                .from("2021-08-12T01:32:55.000000Z")
                .to("2023-12-16T09:15:41.000000Z")
                .nextPageCursorId("8ff5d0a8-060f-4a8a-97f7-96f0571a1df3")
                .prevPageCursorId("3143db33-2080-43e9-81d2-82a3029c7e44")
                .perPage(75);
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
                .setModified(true)
                .types(new String[]{"cashback","expire","payment"})
                .from("2021-10-09T01:30:02.000000Z")
                .to("2021-02-04T11:44:46.000000Z")
                .nextPageCursorId("83f576fc-6cab-4995-9d8b-f86b58115da9")
                .prevPageCursorId("29dbd74f-2d84-4e92-9a7c-f19c8b2e674f")
                .perPage(687);
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
                .transactionId("E")
                .setModified(false)
                .types(new String[]{"exchange_inflow","exchange_outflow","topup","cashback"})
                .from("2022-02-10T19:32:15.000000Z")
                .to("2020-12-30T04:05:46.000000Z")
                .nextPageCursorId("cd506e1c-213d-4f26-b1b9-91a9746df8d7")
                .prevPageCursorId("6d3afbf4-ed0e-40a9-a773-0173a136a69e")
                .perPage(435);
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
                .description("YjQBhHozeYJjV02y90GWowMI3ASCsApxBJptaJJRDQ6YTYkiFEIISprQ3cmpI6bh8YrVsWGSghDCw1Un7nnaTSFczRArCskatgTSAk3a8TcT02JvhzyAvEGRwH1gqt79bzapcrIrLur4lrAgRY4qmYCDpX8Ny7Ex4zLyYmVuuwRZjnfSOf90")
                .transactionId("Lh1FnEv5pC")
                .setModified(true)
                .types(new String[]{"payment","exchange_inflow"})
                .from("2024-10-03T16:15:54.000000Z")
                .to("2020-04-20T06:48:44.000000Z")
                .nextPageCursorId("bec140d3-d76b-4574-8b07-92f127977031")
                .prevPageCursorId("4f1c3e05-bf3b-4118-a494-ef02c8061d81")
                .perPage(740);
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
                .customerName("xb1w0fAXCRcSE6z5QHSLVITcWyXkWwNeThLpKI1N6RIMY7t0u9TuR54ZsbCHGDImjW34z4jE8W9hhkp")
                .description("YWEzZLn5uyvbNkfkqdGOYba42tK1ETZVrimXQx2toEzw7Z1gM6fgx4uEjyIUvTVKqmlOa23scUcryj4GBWTbDzAVeKXVTyNRuvNAUp6ljdawfubjQ03lDRu1dHypEu4pqRk9KXyywxfAsvQQw8eNXwtPfKAW4UwD")
                .transactionId("tqXzHNdyt")
                .setModified(false)
                .types(new String[]{"cashback","expire"})
                .from("2020-04-21T23:46:36.000000Z")
                .to("2022-07-05T07:08:16.000000Z")
                .nextPageCursorId("b9cf372b-6f2c-44d1-aa17-63f240f1247b")
                .prevPageCursorId("8a07bad7-1169-47eb-8074-e24dc93cf284")
                .perPage(414);
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
                .customerId("72885693-789f-428b-8bdf-87cba7fe9730")
                .customerName("HLyLnvzTdFf0Y1JODoBhEEJFs7RURiJHf6mnglgKA3t551AWYy2EKxgIvudVQKM3ivlyVYA")
                .description("fe68jtm2G7nC3SW8MPeFKTYT7eEYLwvHQFKDImV0W8uMWRziTXMumFe")
                .transactionId("EH")
                .setModified(true)
                .types(new String[]{"exchange_outflow"})
                .from("2023-05-30T21:33:05.000000Z")
                .to("2021-02-27T11:58:29.000000Z")
                .nextPageCursorId("038acead-e850-4994-a96f-3b2ba1881dcd")
                .prevPageCursorId("01fe0421-f25c-497d-9180-4fda1ed94b77")
                .perPage(367);
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
                .terminalId("b820fda7-038a-4541-a7c5-c0a7ae5ffc12")
                .customerId("1a888925-5c1c-4bed-adf5-8f3d0977300d")
                .customerName("UL6pb761IWS7zT3jmF3XMzgKDKO5o6UqQsbMF41dYUnemzRdROKbGph7rDrumGN6tQ3vZwFKRF7w7plclcWB9bNRwQ0LABzLS5AginlSJbgCOpN21EzYv53e8C68gL6nh3hbo")
                .description("1VaXQqYz47H8v5OYX2Bb7kgjpYtpWxkJ26TN1VktFjJy7P4SbKkoz4u4vqNtkYjPXU")
                .transactionId("J1V0r5CHRN")
                .setModified(true)
                .types(new String[]{"cashback","exchange_inflow","topup","exchange_outflow"})
                .from("2024-01-31T03:46:51.000000Z")
                .to("2021-07-13T22:29:32.000000Z")
                .nextPageCursorId("9a618de4-8fe3-425d-b398-6cabc93b72b3")
                .prevPageCursorId("5f1ed84f-6ea8-4bc0-93a3-ea076171cffc")
                .perPage(495);
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
                .shopId("73d29439-f434-47f7-b0d3-6ec38841ac99")
                .terminalId("8b14ad42-0194-4110-8789-9aeec68a43e2")
                .customerId("367bfb18-c63e-4d32-9522-a037e525c9cb")
                .customerName("I1Ko9Ro9P2UOPHKcZd7kJ0a09BOfpTrIxahzBDxgf0eAPjokEVHRFLghiMn2sJjV2bGnLruRc9c27Gpu7iWb08UbIXfazIWogjdxJNEfM7ZphEzx62f8FNzaDel7ro4JT6XY3Y33ek4ahxmsrZJPb5B1K9ZLJjlQzrcG4cFx990D5go4dBLdUCSZVd4cTqnNf")
                .description("RiXLw6IXxof4N3bX72yEerLNEKMYsRf9vriYiP8HndtLKgFWIeB413C8zcpa0a0ipuLt3IQKQQHb6fikVg8U")
                .transactionId("XBig")
                .setModified(false)
                .types(new String[]{"exchange_outflow","expire","exchange_inflow"})
                .from("2020-08-12T04:56:25.000000Z")
                .to("2020-11-24T22:08:32.000000Z")
                .nextPageCursorId("c519f0e1-0b30-4f31-a34c-07b77d20b315")
                .prevPageCursorId("24224765-5d64-4305-a86d-2df292aacf56")
                .perPage(906);
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
                .organizationCode("aK--z--9-9-z-0m2O-grW-bv")
                .shopId("0caa601e-8eb4-4a21-9861-c9a26f97ac7e")
                .terminalId("72170974-9f28-443a-ae74-42d287e37bcf")
                .customerId("970d08da-e963-4d12-8283-ebe2043f9ae5")
                .customerName("ZS9wdnnNKINI7vj8qEDPsdJ8JkL6K4fbUtzmymsdzvhUXmrc210VozYCz4wR9Gfv1ooHMcqzJF0zVNZ8zHF5mnetJol0g7uhhZVwBBSB9NQuG198o4cE8ye8xiCptr8X3OQSs9cvMVMzYpfEHHq4AVCPhpFJVl2NE9OohrFLhvABt92YjeNGkeRyZCxDwnyuzPdWfYw482S6oHFsZh9ksnqTSKQYaLtgBF21Mao0iMx")
                .description("2McbAtuQfbwPK5Ol2Udeu5ClBnNsqGtwvAjO8SQrjpTlUKU7ix6vD3BT")
                .transactionId("Nca")
                .setModified(false)
                .types(new String[]{"cashback","topup"})
                .from("2023-12-25T20:01:08.000000Z")
                .to("2020-09-02T09:26:19.000000Z")
                .nextPageCursorId("8cb39107-9a71-4516-8569-9047b21dc5ce")
                .prevPageCursorId("fe9e45e5-8953-4e94-84ca-edf54581f0e5")
                .perPage(787);
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
                .privateMoneyId("60d57317-f1d7-49a9-834e-3421780c098a")
                .organizationCode("35A-1n")
                .shopId("eff09dcb-e0ec-463c-a4c1-4ba98e9f29ce")
                .terminalId("79267e47-73fa-4353-97da-c3e5d1fd6234")
                .customerId("f9368c39-c597-437d-9a2d-93901ba10cf1")
                .customerName("KV1rholLnfHAgpNJKDDEjuzSmETPUL6TDRxNmjKWPDEzen9VEh9JKwUlzsxb9tQKSZdMATJHlP3s2aiyvcn732KUYpvpwWJTv2DUcmsWBTf3SfgLVNlOhNoRUioebBno3HZhnyNZ5Q77U04")
                .description("Ls4hmy4C28WnCRfz2leovb1R7O6QOgboW2zpcaLxa2QZm")
                .transactionId("6C")
                .setModified(true)
                .types(new String[]{"exchange_outflow","exchange_inflow"})
                .from("2023-11-29T14:24:26.000000Z")
                .to("2024-07-12T21:55:27.000000Z")
                .nextPageCursorId("0d1a60b9-77d9-4f33-a600-8e99e11809b9")
                .prevPageCursorId("11a2eca6-8e64-4b1b-bbea-684d1cbf0e60")
                .perPage(805);
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
