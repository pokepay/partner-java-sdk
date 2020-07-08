package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.CreateOrganization;
import jp.pokepay.partnerapi.request.Request;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreateOrganizationTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new CreateOrganization(
            "9GWcmGB8dinnYs8O",
            "sIOJA69xBFjoJfCsE4WG",
            new String[]{"f9bee131-ad7a-4c69-8ee3-8b1f554a759e","08d053f0-955e-4350-a212-06a7907b0ac7","797d430b-5f42-4d38-9e65-a56f5ad40ebf","deba9ebb-bc54-4213-8c09-a46b33bdb78f"},
            "SNOUfkDwbS@4Qrs.com",
            "c2Hfc44dqw@1oLb.com"
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
            "9GWcmGB8dinnYs8O",
            "sIOJA69xBFjoJfCsE4WG",
            new String[]{"f9bee131-ad7a-4c69-8ee3-8b1f554a759e","08d053f0-955e-4350-a212-06a7907b0ac7","797d430b-5f42-4d38-9e65-a56f5ad40ebf","deba9ebb-bc54-4213-8c09-a46b33bdb78f"},
            "SNOUfkDwbS@4Qrs.com",
            "c2Hfc44dqw@1oLb.com"
        )
                .contactName("IR8nLhQa2MUQ01aK9uA1Tj3LjfNHBCeIhxas4TZbqrpMiKfvBokEzgPYXvyMYtEp4yT09n46yaOIQQaMJKMVAzXOBYeTIEmDZF3jM4d2FfcqnIIQ5SR4VPoTfYrcMHpxGo8VQGYZH3atzD2Y98gaPbCtZFWBGuKfZOVQ");
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
            "9GWcmGB8dinnYs8O",
            "sIOJA69xBFjoJfCsE4WG",
            new String[]{"f9bee131-ad7a-4c69-8ee3-8b1f554a759e","08d053f0-955e-4350-a212-06a7907b0ac7","797d430b-5f42-4d38-9e65-a56f5ad40ebf","deba9ebb-bc54-4213-8c09-a46b33bdb78f"},
            "SNOUfkDwbS@4Qrs.com",
            "c2Hfc44dqw@1oLb.com"
        )
                .bankAccountHolderName(" ")
                .contactName("RiIZMr8hx4KruOwhGggWftp5KUXyTWsiaUcd3owjyFrJw5kggryqWQ");
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
            "9GWcmGB8dinnYs8O",
            "sIOJA69xBFjoJfCsE4WG",
            new String[]{"f9bee131-ad7a-4c69-8ee3-8b1f554a759e","08d053f0-955e-4350-a212-06a7907b0ac7","797d430b-5f42-4d38-9e65-a56f5ad40ebf","deba9ebb-bc54-4213-8c09-a46b33bdb78f"},
            "SNOUfkDwbS@4Qrs.com",
            "c2Hfc44dqw@1oLb.com"
        )
                .bankAccount("66291")
                .bankAccountHolderName("(")
                .contactName("Q7xDtVLph398rHfNLqaEhLVbuJA0qloHbD0GQxd25Aj0BsgxjgbvsYbeT4QJANjqJ3i9I9RjF2OObjAd12LSqWsQ09E8GVWDtAwNBsE0RmA2Ll5ScRfRM8XUeKcB7VVDQrG5XFTwXIYE6Nmczp2zihAWCDceMpdnZ1mudDWxySrcJoIL9JfdqjC");
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
            "9GWcmGB8dinnYs8O",
            "sIOJA69xBFjoJfCsE4WG",
            new String[]{"f9bee131-ad7a-4c69-8ee3-8b1f554a759e","08d053f0-955e-4350-a212-06a7907b0ac7","797d430b-5f42-4d38-9e65-a56f5ad40ebf","deba9ebb-bc54-4213-8c09-a46b33bdb78f"},
            "SNOUfkDwbS@4Qrs.com",
            "c2Hfc44dqw@1oLb.com"
        )
                .bankAccountType("saving")
                .bankAccount("3")
                .bankAccountHolderName("ｲ")
                .contactName("Vml6eEN0Acd6B0N");
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
            "9GWcmGB8dinnYs8O",
            "sIOJA69xBFjoJfCsE4WG",
            new String[]{"f9bee131-ad7a-4c69-8ee3-8b1f554a759e","08d053f0-955e-4350-a212-06a7907b0ac7","797d430b-5f42-4d38-9e65-a56f5ad40ebf","deba9ebb-bc54-4213-8c09-a46b33bdb78f"},
            "SNOUfkDwbS@4Qrs.com",
            "c2Hfc44dqw@1oLb.com"
        )
                .bankBranchCode("740")
                .bankAccountType("current")
                .bankAccount("9224415")
                .bankAccountHolderName("ｦ")
                .contactName("boKkbhCEfGydz41cndmf4qtbkyCxs6Rs2upXLAPQlmVmAv6ipYw6b92LEVKYIUxdaMtl10O4JDeskULMj3F6uxKRKhM9OnjWQxy3Kofd176V0j7HaLAmtyG2Je1ERleQacK4ROLMrO3utwi01E");
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
            "9GWcmGB8dinnYs8O",
            "sIOJA69xBFjoJfCsE4WG",
            new String[]{"f9bee131-ad7a-4c69-8ee3-8b1f554a759e","08d053f0-955e-4350-a212-06a7907b0ac7","797d430b-5f42-4d38-9e65-a56f5ad40ebf","deba9ebb-bc54-4213-8c09-a46b33bdb78f"},
            "SNOUfkDwbS@4Qrs.com",
            "c2Hfc44dqw@1oLb.com"
        )
                .bankBranchName("g0JfFiNFGLfXNkBEkyjsfl34R2iDVAHWsHCqMkYPAumotH210IXkF8EXPcIW7KH")
                .bankBranchCode("")
                .bankAccountType("saving")
                .bankAccount("6849668")
                .bankAccountHolderName(" ")
                .contactName("kPaOIt8FCOWm5pzvxyUff0ZaTmKgRPkqRKpdJCUDNvE");
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
            "9GWcmGB8dinnYs8O",
            "sIOJA69xBFjoJfCsE4WG",
            new String[]{"f9bee131-ad7a-4c69-8ee3-8b1f554a759e","08d053f0-955e-4350-a212-06a7907b0ac7","797d430b-5f42-4d38-9e65-a56f5ad40ebf","deba9ebb-bc54-4213-8c09-a46b33bdb78f"},
            "SNOUfkDwbS@4Qrs.com",
            "c2Hfc44dqw@1oLb.com"
        )
                .bankCode("")
                .bankBranchName("jRU6PY21YZ6oZvE")
                .bankBranchCode("593")
                .bankAccountType("other")
                .bankAccount("245912")
                .bankAccountHolderName("ｦ")
                .contactName("A8vIlHtFmaZJm166l4JAdhAZehezXuHiEmOYxb4yPP3INwicOWBlRGoLFJrnEZEJY0nSH0VuT0bLlJ9IpMeg08LgvyZo3NAnerI2q1gH0nQII1ZiOCq6vW0afD6JfEsNvmr37aygooJf3E2ObvpuciEsIaoiVHywhjAEyZ1iSNZJjYI97RJRSxmhsTbmb2fBXYF8MMUM4MToQ1zVj");
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
            "9GWcmGB8dinnYs8O",
            "sIOJA69xBFjoJfCsE4WG",
            new String[]{"f9bee131-ad7a-4c69-8ee3-8b1f554a759e","08d053f0-955e-4350-a212-06a7907b0ac7","797d430b-5f42-4d38-9e65-a56f5ad40ebf","deba9ebb-bc54-4213-8c09-a46b33bdb78f"},
            "SNOUfkDwbS@4Qrs.com",
            "c2Hfc44dqw@1oLb.com"
        )
                .bankName("EvYGD824mBpPJE2EHLcBYSwPCqJCoUwA20oP4R7nF8Id")
                .bankCode("")
                .bankBranchName("6I9xdHbljijFY6y2380LYXyvMEykym7RsbNudCQzdqRPBZyCXbE")
                .bankBranchCode("479")
                .bankAccountType("current")
                .bankAccount("11263")
                .bankAccountHolderName("8")
                .contactName("vNMsMWd9DQ7yUPnU80nH9158tYFQzVsPu8SHlbHIdFD80fTRiMEs2qHQKv9MniyBjrA0iZEHIweVLdWEkdrlIR6nnizV");
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
