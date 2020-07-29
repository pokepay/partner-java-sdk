// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.CreateOrganization;
import jp.pokepay.partnerapi.request.Request;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreateOrganizationTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new CreateOrganization(
            "ep7hq5MI0BfLkza9O5Qeh5",
            "wL1VMrj4lsxKJVJFPO5jvzGi3jUPEoX6VWHYeuyOTWjDhIZXSKXwc1qtwx5mkNfyy4oglLP8x",
            new String[]{"d0b56f33-e64c-479e-8d2b-18a716d037f0","65f2d9b2-7bf5-47fc-b0b3-f9105d590eeb","f95ca27d-0a86-456c-9855-c44800ba7528","3662c802-fff1-447c-93d8-bb70b39b1ddd","a07b4127-fff9-47db-92ce-0c9cf4eaaa71","68ca0119-9057-487f-b01e-207f53ef2314"},
            "ZsDC4aRj4h@sc6u.com",
            "TpUnVMIenh@nWwL.com"
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
            "ep7hq5MI0BfLkza9O5Qeh5",
            "wL1VMrj4lsxKJVJFPO5jvzGi3jUPEoX6VWHYeuyOTWjDhIZXSKXwc1qtwx5mkNfyy4oglLP8x",
            new String[]{"d0b56f33-e64c-479e-8d2b-18a716d037f0","65f2d9b2-7bf5-47fc-b0b3-f9105d590eeb","f95ca27d-0a86-456c-9855-c44800ba7528","3662c802-fff1-447c-93d8-bb70b39b1ddd","a07b4127-fff9-47db-92ce-0c9cf4eaaa71","68ca0119-9057-487f-b01e-207f53ef2314"},
            "ZsDC4aRj4h@sc6u.com",
            "TpUnVMIenh@nWwL.com"
        )
                .contactName("Kmu8UcCD310Y4pr4u8eAiilWhertPXmSamRVE1nRnyXYVQ5MNDXmSB4l1asFAu5L0FMZMknIRkp6dHvF6V241bBISQJ4Bue");
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
            "ep7hq5MI0BfLkza9O5Qeh5",
            "wL1VMrj4lsxKJVJFPO5jvzGi3jUPEoX6VWHYeuyOTWjDhIZXSKXwc1qtwx5mkNfyy4oglLP8x",
            new String[]{"d0b56f33-e64c-479e-8d2b-18a716d037f0","65f2d9b2-7bf5-47fc-b0b3-f9105d590eeb","f95ca27d-0a86-456c-9855-c44800ba7528","3662c802-fff1-447c-93d8-bb70b39b1ddd","a07b4127-fff9-47db-92ce-0c9cf4eaaa71","68ca0119-9057-487f-b01e-207f53ef2314"},
            "ZsDC4aRj4h@sc6u.com",
            "TpUnVMIenh@nWwL.com"
        )
                .bankAccountHolderName("C")
                .contactName("mekWb7HooNBVyex3morYXb5Yp3VKUYjm6AiOU1uUXY3GrOEFabOGICsZb818jcCSb1WAuBv4d8ff3XDfJMu7YHnEzuY7mrwRTtlAFKDX7hcMlB7y6jY917jxVpSO0sLX8otDdcPjcvfIGEEpdSHM0Kcftnp2EyHpWl3");
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
            "ep7hq5MI0BfLkza9O5Qeh5",
            "wL1VMrj4lsxKJVJFPO5jvzGi3jUPEoX6VWHYeuyOTWjDhIZXSKXwc1qtwx5mkNfyy4oglLP8x",
            new String[]{"d0b56f33-e64c-479e-8d2b-18a716d037f0","65f2d9b2-7bf5-47fc-b0b3-f9105d590eeb","f95ca27d-0a86-456c-9855-c44800ba7528","3662c802-fff1-447c-93d8-bb70b39b1ddd","a07b4127-fff9-47db-92ce-0c9cf4eaaa71","68ca0119-9057-487f-b01e-207f53ef2314"},
            "ZsDC4aRj4h@sc6u.com",
            "TpUnVMIenh@nWwL.com"
        )
                .bankAccount("462")
                .bankAccountHolderName("ｦ")
                .contactName("br4Gg86HamHENnh5forAeWXpPiRl71IbnJRbBieHLVxqZMIZc0EdHE6DDMHnp8r57fO6XAJeYA2rxghsOqbSmO");
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
            "ep7hq5MI0BfLkza9O5Qeh5",
            "wL1VMrj4lsxKJVJFPO5jvzGi3jUPEoX6VWHYeuyOTWjDhIZXSKXwc1qtwx5mkNfyy4oglLP8x",
            new String[]{"d0b56f33-e64c-479e-8d2b-18a716d037f0","65f2d9b2-7bf5-47fc-b0b3-f9105d590eeb","f95ca27d-0a86-456c-9855-c44800ba7528","3662c802-fff1-447c-93d8-bb70b39b1ddd","a07b4127-fff9-47db-92ce-0c9cf4eaaa71","68ca0119-9057-487f-b01e-207f53ef2314"},
            "ZsDC4aRj4h@sc6u.com",
            "TpUnVMIenh@nWwL.com"
        )
                .bankAccountType("other")
                .bankAccount("795173")
                .bankAccountHolderName(",")
                .contactName("3wH1Wt7cQ3abLP11UqvCKkiZWuqBeGoqd4mIJjjgkKn3hDfBBAw8PRHvV3rXxMUx6vIrRxTlgs5e6OvP2G4yFaEGg9If83II7Lu3YzyCrKYm0sR9CcpTuS4PKasqugtaZHTqpTl06Yg7BJ5");
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
            "ep7hq5MI0BfLkza9O5Qeh5",
            "wL1VMrj4lsxKJVJFPO5jvzGi3jUPEoX6VWHYeuyOTWjDhIZXSKXwc1qtwx5mkNfyy4oglLP8x",
            new String[]{"d0b56f33-e64c-479e-8d2b-18a716d037f0","65f2d9b2-7bf5-47fc-b0b3-f9105d590eeb","f95ca27d-0a86-456c-9855-c44800ba7528","3662c802-fff1-447c-93d8-bb70b39b1ddd","a07b4127-fff9-47db-92ce-0c9cf4eaaa71","68ca0119-9057-487f-b01e-207f53ef2314"},
            "ZsDC4aRj4h@sc6u.com",
            "TpUnVMIenh@nWwL.com"
        )
                .bankBranchCode("")
                .bankAccountType("other")
                .bankAccount("8631")
                .bankAccountHolderName("ﾐ")
                .contactName("h7fUhTOZfPsFAxa5O7s1TiLD5fKGQ2G3C137Ii8ZoTzpKCAL0ZBNidBL4HI33xrL6KGCKK8Nh1vaLKOBYz43iBrTt5WZ370LDJLOA1xjU2I4mtQGxscM1jVW67waDceFFc");
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
            "ep7hq5MI0BfLkza9O5Qeh5",
            "wL1VMrj4lsxKJVJFPO5jvzGi3jUPEoX6VWHYeuyOTWjDhIZXSKXwc1qtwx5mkNfyy4oglLP8x",
            new String[]{"d0b56f33-e64c-479e-8d2b-18a716d037f0","65f2d9b2-7bf5-47fc-b0b3-f9105d590eeb","f95ca27d-0a86-456c-9855-c44800ba7528","3662c802-fff1-447c-93d8-bb70b39b1ddd","a07b4127-fff9-47db-92ce-0c9cf4eaaa71","68ca0119-9057-487f-b01e-207f53ef2314"},
            "ZsDC4aRj4h@sc6u.com",
            "TpUnVMIenh@nWwL.com"
        )
                .bankBranchName("hzezY3NfjeO70TjAix7UkgRf8FMf2xGIWuCD")
                .bankBranchCode("321")
                .bankAccountType("saving")
                .bankAccount("4")
                .bankAccountHolderName("9")
                .contactName("yyj2WQyOH3f2AJN2rEnHvTZcfuQHWkVwYoxvYbKs7YQinNBOcPChxfbGzpJjaQaEfj43TdVZZ6HcNF6Qbln4jo2Ta0yMdfR2oN88t5nLw5ZdjSn1HWzUjA");
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
            "ep7hq5MI0BfLkza9O5Qeh5",
            "wL1VMrj4lsxKJVJFPO5jvzGi3jUPEoX6VWHYeuyOTWjDhIZXSKXwc1qtwx5mkNfyy4oglLP8x",
            new String[]{"d0b56f33-e64c-479e-8d2b-18a716d037f0","65f2d9b2-7bf5-47fc-b0b3-f9105d590eeb","f95ca27d-0a86-456c-9855-c44800ba7528","3662c802-fff1-447c-93d8-bb70b39b1ddd","a07b4127-fff9-47db-92ce-0c9cf4eaaa71","68ca0119-9057-487f-b01e-207f53ef2314"},
            "ZsDC4aRj4h@sc6u.com",
            "TpUnVMIenh@nWwL.com"
        )
                .bankCode("6185")
                .bankBranchName("LFSJc4c7VNGegnlMNlrvPQFhDq")
                .bankBranchCode("")
                .bankAccountType("other")
                .bankAccount("522556")
                .bankAccountHolderName(" ")
                .contactName("fdhgDE2eB9TCqM0A3zegP1uvYL3RATMmmi5NRcXCJtitJQCDAVoPHOCVwMi7UYpgwKcyPTk5KHE2NaibFNfuIDDfx0UF0UJ3jtpnhIluuQqvKJYDhfoh6jEh9SZ5ImQZGTzV9Hm658Mr4oSbR5pvcDd9Y1eCwmy2Qxl9psEnICsodH4dSQgF7r7kTO7ctswiqFKCMMvrVvKXwgq9kpHkgDB5IHXsWlgr");
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
            "ep7hq5MI0BfLkza9O5Qeh5",
            "wL1VMrj4lsxKJVJFPO5jvzGi3jUPEoX6VWHYeuyOTWjDhIZXSKXwc1qtwx5mkNfyy4oglLP8x",
            new String[]{"d0b56f33-e64c-479e-8d2b-18a716d037f0","65f2d9b2-7bf5-47fc-b0b3-f9105d590eeb","f95ca27d-0a86-456c-9855-c44800ba7528","3662c802-fff1-447c-93d8-bb70b39b1ddd","a07b4127-fff9-47db-92ce-0c9cf4eaaa71","68ca0119-9057-487f-b01e-207f53ef2314"},
            "ZsDC4aRj4h@sc6u.com",
            "TpUnVMIenh@nWwL.com"
        )
                .bankName("bUzOTBTrDJdANzXd8hSKPFUxfE7Z6")
                .bankCode("8396")
                .bankBranchName("TZItNDe79146f")
                .bankBranchCode("487")
                .bankAccountType("other")
                .bankAccount("7908416")
                .bankAccountHolderName("(")
                .contactName("KVYUT2VOaS0SUjwrAJaED46cyRP1m3vs9F9ggxsh6tZUawFBmbpkAqm4s2yw77vRoEI8BH4LLpQupGZa2QZt36aB4Zs0lwLL3hdB");
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
