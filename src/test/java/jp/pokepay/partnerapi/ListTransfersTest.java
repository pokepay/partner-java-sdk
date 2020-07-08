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
                .transferTypes(new String[]{"transfer","topup"});
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
                .transactionTypes(new String[]{"exchange","topup","transfer"})
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
    void test3() throws ConnectionError, ProcessingError {
        Request request = new ListTransfers()
                .setModified(true)
                .transactionTypes(new String[]{"topup"})
                .transferTypes(new String[]{"topup","exchange"});
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
                .privateMoneyId("235449fb-91f3-45e2-b935-4ab30e096e0d")
                .setModified(false)
                .transactionTypes(new String[]{"payment","exchange","topup"})
                .transferTypes(new String[]{"exchange","payment","transfer","topup"});
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
                .transactionId("02c74489-9b51-45db-ba04-4ac5d4f950f6")
                .privateMoneyId("070491ca-30ab-4b89-a10f-36cfb22d81cf")
                .setModified(false)
                .transactionTypes(new String[]{})
                .transferTypes(new String[]{"exchange","topup","payment","transfer"});
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
                .customerName("QJJXouCCzvbxQ9dmfxSdEI4NPS4ck7JmATlGngbZZGX8xLUQFbJfJod")
                .transactionId("9fe5c718-09d0-4270-90ac-687fdbefc160")
                .privateMoneyId("45871a26-15d2-426d-855d-3d998332b0cb")
                .setModified(true)
                .transactionTypes(new String[]{"exchange"})
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
    void test7() throws ConnectionError, ProcessingError {
        Request request = new ListTransfers()
                .customerId("bd3beb18-dbdd-4d4c-91c7-1e0a42fe67c9")
                .customerName("Ap4jzU9iCl3f8GtbGYyft1bjpji6e2XQciDm2is4qbFvrifIlY0UOZShOc0tecY02iAHavNNeSU4BXsnomXv1A9YjVRCjPXoeKj")
                .transactionId("a6493199-2ff6-45be-b8be-096c45c1957c")
                .privateMoneyId("b6fc11ea-7059-47ce-b4b7-f9cae9ca8be1")
                .setModified(true)
                .transactionTypes(new String[]{"payment","exchange"})
                .transferTypes(new String[]{"payment","transfer","topup","exchange"});
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
                .shopName("bAH7TNYWzyfg3sEnHLd4OUA4soeesGXEJw7ae1ei7Iq8VQlC3ZzvLFxtP8BB8i0BNpk8vL853ZFKfZtuODBCwQomOlVJZgbvlJxLj0jt9UTDvjdBAuVZUVqIfUfyQ6IA9CIe63FJ4p6t6m")
                .customerId("3842a16f-327a-4d51-b790-3869da55691a")
                .customerName("NMqRFZtmgxQq0IJc3Gh360IOxcJRGh0ee9p1DiQxLBHfpy8vLLvNkjpwY66pmX8bZheDH8wxV9W2X4dkvUwJ3wSc2kWKpXVks9SsEx4qUL")
                .transactionId("e2f975b1-e15b-40bc-adb7-d1d0ae516868")
                .privateMoneyId("82f3968e-e39c-46c7-982e-8079f0ddb20e")
                .setModified(false)
                .transactionTypes(new String[]{"exchange","payment","topup","transfer"})
                .transferTypes(new String[]{"exchange","payment","topup","transfer"});
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
                .shopId("2cded4f6-3882-462b-b2a3-75f532a69a94")
                .shopName("bi")
                .customerId("2b00d22b-6680-4a6e-9413-01e77d48dec9")
                .customerName("CHCXqhwQmOqkg8UxICaq1gOLrI5OAp8LhoW3ysgKWi57ewpdd3gZl6cF410Ar1N1GC8ndIs8KSnKm0TAwmgRoEP5LcpV10Qe4oUWtoXOri68ypERIlJ")
                .transactionId("0fd21f18-0c2c-4096-87ef-ba8bf74461cf")
                .privateMoneyId("704b56fe-26b5-4511-bb84-c7c5c03e7f0d")
                .setModified(true)
                .transactionTypes(new String[]{"exchange","payment","topup"})
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
    void test10() throws ConnectionError, ProcessingError {
        Request request = new ListTransfers()
                .perPage(2753)
                .shopId("7953c274-a8fe-481c-a456-2481e4adb9e2")
                .shopName("0ekZJcmpYyWn25yqPf4Isfm7TApXYquZn5pmv0Vmt3AqrIEsyExv8EbZAt4mhGVcYkVLLFvl5u6LCwDanXFtDrrB8d5zsSdvbKSJhnHXC36l4ebo0ZZeSYsxfsrATzSCt5zUb2IKOuR9pwlkkfKz7Zyp0h")
                .customerId("cff6693a-3c67-4d3c-8459-ad5fe9bf250b")
                .customerName("oCpIXFjNK7DwA8rfRCHNVETKzEctH9EDPh0ZEXB4FvS7MYYuikGlAzYbS7hon8tb48uc2izeh89")
                .transactionId("530e96ce-59a7-4fe8-8f6c-e0f403ce09f4")
                .privateMoneyId("d1bcacea-f7c0-4a57-848a-29d4d35b7447")
                .setModified(false)
                .transactionTypes(new String[]{})
                .transferTypes(new String[]{"transfer","topup"});
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
                .page(1228)
                .perPage(5616)
                .shopId("4bd0a13b-7246-4dd4-baef-1fb5be4fc602")
                .shopName("8QM3mzK3C4Z6sdelqCjXTda8P5AO7TA4G1s8SoXgifs9dKsYchxjGEYaSEr3Zdvfbxjvq08A2s7lJ9XqQr4LKM2OM55OtjZngdkwoR7vB8fILqMciYPJkipY3IKJgZ85qphlwqUF5I2sGDetMemrLhobkY7hCYpojQQnI0brSEcY3PB1EIeDqIPCYCAAVZiik5gzqadhd1xL0Vr8j29CQa2xuci3yz8Z")
                .customerId("ce7fef55-55e4-4416-a4ab-4189cf58e48d")
                .customerName("qOl39D36haPu1UrWTmegq5q5pXQYQl5mH3L4t8GuwDIr6R6eo5iF0aKhFzYp6FxZwZq8FpqgBX31413O5pAZue29YVBNPdPcYJBSYemWyHSbKsucptKribePS4lWPF1K17WnLdnDMWOFhqwqSFvNKQmec22oP5cfSrWiqXrEoKnf5Y3qcw6jo3ftYzvrbHQQ9oiIg")
                .transactionId("f2c9eae8-6bb5-4e98-9b1e-354590302c3f")
                .privateMoneyId("a22abf4c-66a9-4c0b-b898-ba2eeeb4fa80")
                .setModified(true)
                .transactionTypes(new String[]{"transfer","topup"})
                .transferTypes(new String[]{"topup","payment","transfer","exchange"});
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
                .to("2021-10-14T07:40:03.000000+09:00")
                .page(226)
                .perPage(9784)
                .shopId("2ea4d7f1-9f6e-44eb-8471-61bad4346489")
                .shopName("BRJvQlDgxSDZbNPY5HYVyxphCUqeuUphI3MHdYvtUJ")
                .customerId("c4cdc413-f561-42bc-9035-3fda92f1721a")
                .customerName("bxFJFF8E2OSXOMgYJa3ld2Ac8iua85JA3EED8N0O86wNNFyluC7bfuK8uVys8YskulZfq5n5wX5dklqQWozk7KXTYRTEnMXbKW6tiUxx5D9AJByaTU")
                .transactionId("d28c790c-232d-4361-968d-946ce1171b1c")
                .privateMoneyId("9b71a4a7-4ef8-47cf-8c03-7854cc9e63dd")
                .setModified(false)
                .transactionTypes(new String[]{"transfer"})
                .transferTypes(new String[]{"topup","payment","transfer","exchange"});
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
                .from("2021-04-19T21:29:30.000000+09:00")
                .to("2019-10-26T19:50:13.000000+09:00")
                .page(8745)
                .perPage(1494)
                .shopId("84a55e76-cc04-4990-a4f8-c887bbe1c919")
                .shopName("HJDNCZDeQOfE84cuuVyziHUeDQWPiPaONvvVnMUC55bDJZyxjQuunbcTHAvERNHHxYRwrXfNrrRrkAqb9Bj9sIfLT6hEjWjgYNYFfr3mLibEXpKBY0jxMXnxmTMl9C2JyTi60K9G8IZKCm6m9pjU1OWYfvDX52sZMo0ccu1iDblbBftD5t9Kf2xMyJVXoz9r7JDCabCSt7wZuuexcYFFjMvjzK8Yn8VadH35XLUrFTJxLsCGfwIA8mqVROz")
                .customerId("2e0ba373-e68f-41b3-8d18-6e9f1cf2b2f1")
                .customerName("NBSiXz7vdXTey3ryuO3L9QDs1snP1zv7psRZQKCUdaNuZcXLOVW0C2jdupRLBK82")
                .transactionId("94c204c8-8176-459d-a57a-6cf5d9184d3c")
                .privateMoneyId("f30456fb-10c2-4be7-8f51-bb10971829e4")
                .setModified(false)
                .transactionTypes(new String[]{"transfer","topup","exchange","payment"})
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
}
