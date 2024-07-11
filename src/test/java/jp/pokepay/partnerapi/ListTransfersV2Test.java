// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.ListTransfersV2;
import jp.pokepay.partnerapi.request.Request;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ListTransfersV2Test {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new ListTransfersV2();
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
        Request request = new ListTransfersV2()
                .to("2021-03-23T04:04:58.000000Z");
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
        Request request = new ListTransfersV2()
                .from("2024-03-16T20:33:15.000000Z")
                .to("2022-04-02T14:18:51.000000Z");
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
        Request request = new ListTransfersV2()
                .description("wCFGwiyv4vlRBRxfHZeKBVf4jVtecQNubIdHetIBPUrvpeN86f46tWgyM43AJZ0KTwWOYBSX4EzfsIiIDCSxoowqwobMRj4K8plKuk4zO")
                .from("2023-03-07T13:23:26.000000Z")
                .to("2022-07-25T06:59:02.000000Z");
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
        Request request = new ListTransfersV2()
                .transferTypes(new String[]{"coupon","topup","exchange","cashback","expire"})
                .description("CXAkk07Q9YuV27x2ZZwJNPJ0aXH1uRWCYsw6VRBfXAF7xeo")
                .from("2020-10-15T17:58:00.000000Z")
                .to("2020-06-23T23:04:50.000000Z");
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
        Request request = new ListTransfersV2()
                .perPage(817)
                .transferTypes(new String[]{"payment","cashback","topup","expire"})
                .description("KEOyMV89HUL5OwvTmfkSpdcLQvsJQRiuvWpRkphzntqbTr2vHF1iF0Y7dBxe8")
                .from("2023-03-16T16:33:44.000000Z")
                .to("2022-12-04T08:35:53.000000Z");
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
        Request request = new ListTransfersV2()
                .prevPageCursorId("c600b954-117a-4222-a977-e9ebee9ca24c")
                .perPage(757)
                .transferTypes(new String[]{"exchange","transfer","campaign","coupon"})
                .description("kaQm6vULSy1FKdTtu83N0tnRGbdpbMjOs6NsjUaiDroY6Q3IK7BQ6AmswdAM3IJrwVbs9pMxfMCthiv1a2EEHFmQw4OmJsXraAGliEBPmHrH76ocsr7yZptwOIMGRxZLktLdV7uiWarFr5GP0wp4l70ZsGyPlyZYRURgUM")
                .from("2023-03-31T16:58:24.000000Z")
                .to("2020-10-25T02:59:22.000000Z");
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
        Request request = new ListTransfersV2()
                .nextPageCursorId("13b37081-7daf-4435-9b0a-40efd5d5907a")
                .prevPageCursorId("12de16c8-5c44-4c6e-a28a-b1b00ce2db90")
                .perPage(234)
                .transferTypes(new String[]{"exchange","campaign","payment","topup","cashback","coupon","expire","transfer"})
                .description("RMyR0nQkh8Zz7eaFGoiOPKR0rUW9UTcnGDBsZuPfABdiNvfS9Anufij6THnocikBJOkD3FvwnaI0WeOGlWm")
                .from("2020-12-27T00:56:08.000000Z")
                .to("2021-02-25T20:32:37.000000Z");
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
        Request request = new ListTransfersV2()
                .transactionTypes(new String[]{"expire","cashback"})
                .nextPageCursorId("af0744c7-8de8-4ae5-ad2d-8e8ef679abfb")
                .prevPageCursorId("256441a2-fc14-45fb-b354-86992c485b94")
                .perPage(574)
                .transferTypes(new String[]{"topup","expire","coupon","exchange","campaign","cashback","payment","transfer"})
                .description("c7CS1DK4G")
                .from("2023-08-10T03:01:06.000000Z")
                .to("2022-11-14T00:51:10.000000Z");
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
        Request request = new ListTransfersV2()
                .setModified(true)
                .transactionTypes(new String[]{"exchange"})
                .nextPageCursorId("17ac544d-078c-4c58-9b07-320c57bdc9c8")
                .prevPageCursorId("327abbfc-6a97-498e-9d72-14fa41ea10b9")
                .perPage(60)
                .transferTypes(new String[]{"campaign","coupon","expire"})
                .description("mUp8pN9pjtBKEK15Dd3XxCT0Zmu")
                .from("2024-03-18T05:31:34.000000Z")
                .to("2022-03-14T12:52:05.000000Z");
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
        Request request = new ListTransfersV2()
                .privateMoneyId("6eb0a40d-c937-44f4-820e-b0cf3a0c4440")
                .setModified(true)
                .transactionTypes(new String[]{"exchange","transfer"})
                .nextPageCursorId("161abbde-6265-4cdc-9dce-5f6195861a74")
                .prevPageCursorId("c0942e47-98a8-42de-bf06-267c6ab5cb6f")
                .perPage(877)
                .transferTypes(new String[]{"transfer","expire","cashback","exchange","topup","coupon","campaign","payment"})
                .description("SeZXyMS6WkNJ2GvSwQUcruYP4H5cCw5ExNqh41OXXFwVmaHYw6oEFbK8qER1Ll")
                .from("2021-07-18T19:57:18.000000Z")
                .to("2022-01-18T16:37:21.000000Z");
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
        Request request = new ListTransfersV2()
                .transactionId("3405f240-8da3-4c0a-aac9-83e9c7fb400a")
                .privateMoneyId("ac2d57bd-0f35-4b3d-b1d9-31545b075671")
                .setModified(true)
                .transactionTypes(new String[]{"transfer","topup","cashback","exchange","expire","payment"})
                .nextPageCursorId("136c436a-c71a-4c14-bc01-a66666243374")
                .prevPageCursorId("e4685af3-359d-4342-94ab-c4eb7cb010a6")
                .perPage(896)
                .transferTypes(new String[]{"transfer","coupon"})
                .description("gIBcgyeHE0tecRrYBgXoYNaRDH3xa5ZXl3L94kmDiQZVmfdCV9wGJUROgp1VTNstKsbk2wvZcZmJCZwuee4w9Rkvag9C19xRl1IlJpGXql")
                .from("2023-07-03T17:38:54.000000Z")
                .to("2022-06-30T07:14:35.000000Z");
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
        Request request = new ListTransfersV2()
                .customerName("d5uwOg53j3Qic0iyKLnZxaZi9iCa2kj9IDD4FLU53H4cTCafuN856J50SdiADG37eydGENMPuSUGCPNHip0Y3dBWcNdXe1sIjLSVztCsp")
                .transactionId("21798f89-20e4-48ff-9308-3ff01ff7a6cb")
                .privateMoneyId("34092b84-562e-43e3-bc1f-2ba0fbc9fa08")
                .setModified(false)
                .transactionTypes(new String[]{"exchange","expire","payment"})
                .nextPageCursorId("6849350b-72b5-42a3-a77c-34bd749761cc")
                .prevPageCursorId("9b3bab85-e5c1-4454-8170-817ac425298f")
                .perPage(338)
                .transferTypes(new String[]{"exchange","transfer","campaign","payment","coupon","cashback"})
                .description("G1XtK0UfX1fzmKZw4jAX5TdVMZA3FsBWHTaR7q8iHovbTWoPNbCUX3WmvU0lnYW7MWulxJqejEoXiemEzy22TP2wtSY9IoDSrJUA2sSTBsOwjVmr0bTbO79fqhITnnz7WaCAiQd9B8sle88sl7rSWKN9oQjHsNX48VkSyiuzE1L2w")
                .from("2023-07-06T21:17:42.000000Z")
                .to("2020-03-06T07:13:06.000000Z");
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
        Request request = new ListTransfersV2()
                .customerId("01340f5e-e511-4db3-b6d9-0a3aa2cdda2c")
                .customerName("uE4jwp0IiR44I5KLiOrRKq3qxtTGi")
                .transactionId("dee32366-1821-44ce-b63f-e1cb261c9a2c")
                .privateMoneyId("5da3a272-3e72-46e1-84b5-60f5ebdeb5a4")
                .setModified(false)
                .transactionTypes(new String[]{"transfer","cashback","payment","exchange","topup"})
                .nextPageCursorId("ba7b5f00-a9a8-4ded-91e4-d74c73fedb4e")
                .prevPageCursorId("c853e04f-52cb-49ad-9c3e-eeabed53ba9f")
                .perPage(830)
                .transferTypes(new String[]{"topup","expire"})
                .description("Oh78QfhNbZ3YfGhlbqaOElvScjtjkG1WEjltqaYkhp7caXjUtBcNe9XyY4wthFo0glXBErIUB1p7aPMzXnAdDrY96Gn0OAQ9xSN0zfKx7ivixiVqjgvBNcsQLQxAtJmVTcXWtKUzkNd35gyuBKlwozbM8BIp6WWFtoNM3")
                .from("2024-06-24T19:10:10.000000Z")
                .to("2020-09-08T11:39:54.000000Z");
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
        Request request = new ListTransfersV2()
                .shopName("blmmAHRSYCV0EDw10SY48ZoA8oj9alrEKYDjBWPKCwbirzvScUvjsqVkcSInvOjFPIL9qlVMwg0ANEHCj5eM805Swtsg2NkJBDvuxWoqdLq3QmHRbZpwbPRidV")
                .customerId("87951304-1e47-461f-b719-da29f2c9cac2")
                .customerName("6hajGJrCJBxTKH0YUW8iwJJuJPCjlaztijN3vebjT869RjYRPCqvnZ1YzdrhGH7XKNoGDpqqjYUa42NN7jWbTA8sT9CjYdhYyR9ZtWhMAKSZHQ2Tjahc0hASAcEibjku1fdQetgL0O7DlAFrkXVihIdQWu7J4NYirXryPP6taqbm6hsnA9hELkacVB4dzDqQ1LbTyVIgVP7fIz1xemnrDx9P7HPwLX5")
                .transactionId("47b14440-34ec-497f-8f77-68aeae516ed7")
                .privateMoneyId("34d59ddd-6596-4d5a-8b75-1f57af90bb57")
                .setModified(true)
                .transactionTypes(new String[]{"cashback"})
                .nextPageCursorId("23d1c950-51f1-40b2-b2ea-bece15ca43ab")
                .prevPageCursorId("f917069c-5732-42a2-b8a8-a700a3b13851")
                .perPage(615)
                .transferTypes(new String[]{"payment","expire","transfer","topup","cashback"})
                .description("Qr2gs4rAyEVt2ws7WkJzpgGUX4mtxobZ9ZCpNJGZG6LzTWIbd8ZNVrafdi")
                .from("2021-05-20T20:37:10.000000Z")
                .to("2024-07-05T05:06:05.000000Z");
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
        Request request = new ListTransfersV2()
                .shopId("db44dc4e-8fee-43b4-8e05-9662940afdce")
                .shopName("XIdoiqtrelImUNmLeKEfXUc2dQExu22E4bXnTsrAuXzcUztcjpDcIzv8TjKb1dIcQKtgPEpt9Ynsu0LI4T70lQwB453YpOK96EoFGxVJNTeRlFM4Xw2YneFRtau24yc1kusN7qW2yhhPFbHNPhRgnqYnUlh4JbOrMj5jFwrAdcz57ZOWsDr0Djt9M12BOno1AcjM96oftC7mH")
                .customerId("aac45f15-00e8-4969-a0d3-46c4f9deee8e")
                .customerName("XKvVy5paxKD2XcOfyMo26iqol80j1t4n3lpnoezOx6Ov6eGwjQCqxdtQnDY4S9N4HhJ5rCsXRcUZY47cpIh03BvqB7CzLjYHoO28zEE65UlKtMCe12MUV2dxrA2428zEWnFZLX87qtedPzV8NdiYCurcmVOPZzwMWHgQ0VESfspW9b9NBdczTSynCfTiWLEN2pEbq7ZeB8PVJkE9NzaeTptZ5kX9rLpagdWQnEnT")
                .transactionId("78f15c8a-e4ec-4989-934c-66f998f4bcfe")
                .privateMoneyId("b5102dfc-6ade-4475-bfdc-73839d210a62")
                .setModified(false)
                .transactionTypes(new String[]{"payment"})
                .nextPageCursorId("f4d07335-cbf5-4c16-8739-bdfba1be0d59")
                .prevPageCursorId("3f422c34-2019-48e3-ae03-e3ac71afdc8c")
                .perPage(951)
                .transferTypes(new String[]{"cashback","exchange","expire","transfer","payment"})
                .description("RZ5NX6gFb5nuODlmm9rpn022H3wQmNFzbLFmfFSz1uperYHhU5vbLxW8Yq15XpRuu89q3NykiRPYO2oQiAYMcKkXBWEu4RSjxgCW3jFlgob7yobgqdqFleVhpCebdmmx3jJLFYo72YjP5pod5QaLCZTmFLxumOnvrupx16")
                .from("2023-07-22T03:23:23.000000Z")
                .to("2022-10-03T00:53:54.000000Z");
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
