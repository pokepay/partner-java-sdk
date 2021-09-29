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
            "2NE9OohrFLhvABt92YjeNGkeRyZCxDw",
            "yuzPdWfYw482S6oHFsZh9ksnqTSKQYaLtgBF21Mao0iMx72McbAtuQfbwPK5Ol2Udeu5ClBnNsqGtwvAjO8SQrjpTlUKU7ix6vD3BTnNcaIv4Cy",
            new String[]{"eb110732-d01b-4e84-bb07-9a71c68d5516"},
            "iGNeSDJueW@NAF2.com",
            "iLhkB08mWo@SEw4.com"
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
            "2NE9OohrFLhvABt92YjeNGkeRyZCxDw",
            "yuzPdWfYw482S6oHFsZh9ksnqTSKQYaLtgBF21Mao0iMx72McbAtuQfbwPK5Ol2Udeu5ClBnNsqGtwvAjO8SQrjpTlUKU7ix6vD3BTnNcaIv4Cy",
            new String[]{"eb110732-d01b-4e84-bb07-9a71c68d5516"},
            "iGNeSDJueW@NAF2.com",
            "iLhkB08mWo@SEw4.com"
        )
                .contactName("fnz5e3bjXKldANGzSZe49qKV1rholLnfHAgpNJKDDEjuzSmETPUL6TDRxNmjKWPDEzen9VEh9JKwUlzsxb9tQKSZdMATJHlP3s2aiyvcn732KUYpvpwWJTv2DUcmsWBTf3SfgLVNlOhNoRUioebBno3HZhnyNZ5Q77U04aLs4hmy4C28WnCRfz2leovb1R7O6QOgboW2zpcaLxa2QZma6CRo8n");
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
            "2NE9OohrFLhvABt92YjeNGkeRyZCxDw",
            "yuzPdWfYw482S6oHFsZh9ksnqTSKQYaLtgBF21Mao0iMx72McbAtuQfbwPK5Ol2Udeu5ClBnNsqGtwvAjO8SQrjpTlUKU7ix6vD3BTnNcaIv4Cy",
            new String[]{"eb110732-d01b-4e84-bb07-9a71c68d5516"},
            "iGNeSDJueW@NAF2.com",
            "iLhkB08mWo@SEw4.com"
        )
                .bankAccountHolderName("ﾗ")
                .contactName("9");
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
            "2NE9OohrFLhvABt92YjeNGkeRyZCxDw",
            "yuzPdWfYw482S6oHFsZh9ksnqTSKQYaLtgBF21Mao0iMx72McbAtuQfbwPK5Ol2Udeu5ClBnNsqGtwvAjO8SQrjpTlUKU7ix6vD3BTnNcaIv4Cy",
            new String[]{"eb110732-d01b-4e84-bb07-9a71c68d5516"},
            "iGNeSDJueW@NAF2.com",
            "iLhkB08mWo@SEw4.com"
        )
                .bankAccount("474481")
                .bankAccountHolderName("ﾋ")
                .contactName("wJ1udEIb7zDJ6KZTEk0mDRGqd8jGih");
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
            "2NE9OohrFLhvABt92YjeNGkeRyZCxDw",
            "yuzPdWfYw482S6oHFsZh9ksnqTSKQYaLtgBF21Mao0iMx72McbAtuQfbwPK5Ol2Udeu5ClBnNsqGtwvAjO8SQrjpTlUKU7ix6vD3BTnNcaIv4Cy",
            new String[]{"eb110732-d01b-4e84-bb07-9a71c68d5516"},
            "iGNeSDJueW@NAF2.com",
            "iLhkB08mWo@SEw4.com"
        )
                .bankAccountType("other")
                .bankAccount("27")
                .bankAccountHolderName("ｿ")
                .contactName("3QYDG6CZS1PVe5LZzi2NmWBluHrzflOytNd3ROmH9nMfAHnX3LOs6P3dxLhDjrt4CFESWJnPCLUxGLtrgoghS3pPHE574eeX1ksH4R2MgyW6z149JBRZmQUgzecqWdDVSstoEtPVoykbtA6");
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
            "2NE9OohrFLhvABt92YjeNGkeRyZCxDw",
            "yuzPdWfYw482S6oHFsZh9ksnqTSKQYaLtgBF21Mao0iMx72McbAtuQfbwPK5Ol2Udeu5ClBnNsqGtwvAjO8SQrjpTlUKU7ix6vD3BTnNcaIv4Cy",
            new String[]{"eb110732-d01b-4e84-bb07-9a71c68d5516"},
            "iGNeSDJueW@NAF2.com",
            "iLhkB08mWo@SEw4.com"
        )
                .bankBranchCode("977")
                .bankAccountType("saving")
                .bankAccount("1718")
                .bankAccountHolderName(" ")
                .contactName("hWYdlIHfSBBKI1KQl4cK6HLesoN7AsxjaX4bkzoW5SSzFCKjOEE829PJZq44v95w5OTBAsM3ixdWcd35lzGg9k8zX5Zx6rdzZ6Kiw60EKpO7FL05ARSiRG2UPRPUxc");
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
            "2NE9OohrFLhvABt92YjeNGkeRyZCxDw",
            "yuzPdWfYw482S6oHFsZh9ksnqTSKQYaLtgBF21Mao0iMx72McbAtuQfbwPK5Ol2Udeu5ClBnNsqGtwvAjO8SQrjpTlUKU7ix6vD3BTnNcaIv4Cy",
            new String[]{"eb110732-d01b-4e84-bb07-9a71c68d5516"},
            "iGNeSDJueW@NAF2.com",
            "iLhkB08mWo@SEw4.com"
        )
                .bankBranchName("w9rvtxOfCP20hUm1E2Nlz5V1CO5TSFyNtopqI6bCrDgQ")
                .bankBranchCode("409")
                .bankAccountType("other")
                .bankAccount("05")
                .bankAccountHolderName("｣")
                .contactName("v10dzqDmxXKufPIjjJpzSXKPSRMVYMVxniANdM0yy6srRZNC9bYJUFWp4SJDd9Vw0ghvUwHY4GPMgqa4p3NBV6jnDEmNinmBAkCQlWqd4VgtaT7nx9nCCSGOYqsqY3PQB7j8S1LcJM99jV6h5DQ4TL9sXbFiutZ4wFjGxBLsRpox6uXLc6he8Kxv6FPaZ8I6AxiybIUdjn2JlMSQ6V8dRYSFDiggsas4Nm4Pbqn0MLycuAIyd8Tc91");
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
            "2NE9OohrFLhvABt92YjeNGkeRyZCxDw",
            "yuzPdWfYw482S6oHFsZh9ksnqTSKQYaLtgBF21Mao0iMx72McbAtuQfbwPK5Ol2Udeu5ClBnNsqGtwvAjO8SQrjpTlUKU7ix6vD3BTnNcaIv4Cy",
            new String[]{"eb110732-d01b-4e84-bb07-9a71c68d5516"},
            "iGNeSDJueW@NAF2.com",
            "iLhkB08mWo@SEw4.com"
        )
                .bankCode("1245")
                .bankBranchName("A0BEPaxu5hz8quH88gYqQC45YQseyms9QyHVorEq6zLZyg")
                .bankBranchCode("")
                .bankAccountType("current")
                .bankAccount("39240")
                .bankAccountHolderName("\\")
                .contactName("e1DJRmWCvXV5f7NFxRTTWOKh4cp2t8rtdj0F82");
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
            "2NE9OohrFLhvABt92YjeNGkeRyZCxDw",
            "yuzPdWfYw482S6oHFsZh9ksnqTSKQYaLtgBF21Mao0iMx72McbAtuQfbwPK5Ol2Udeu5ClBnNsqGtwvAjO8SQrjpTlUKU7ix6vD3BTnNcaIv4Cy",
            new String[]{"eb110732-d01b-4e84-bb07-9a71c68d5516"},
            "iGNeSDJueW@NAF2.com",
            "iLhkB08mWo@SEw4.com"
        )
                .bankName("huu2d72PSRBNNGTP71wcJLJGkIvTZnRNAv7oeQjUe")
                .bankCode("")
                .bankBranchName("z1G0bwCFurxmaLHHuXDOcuycP")
                .bankBranchCode("")
                .bankAccountType("other")
                .bankAccount("04")
                .bankAccountHolderName("6")
                .contactName("yWZt9ZjHKqLir6qmCF3zfoEN4hG6jzrPFiN4YTSJ9o4hVc0u6tzaZ3sbYKCNybmAlkaNJiOvuRswwQSmiJco3KwhjqpMqyENnnotJKNM2DvQSu06FE8juzeNINZktFZU0JpHpSrpNbF8O3WzYFSGY9bWV5jbNBEz14f9BIpTXI2luGWaGy1CoCYoYmaLr1BLYdgsrsB7nf3z7z76OYqLZhd2VmnwZ1YQA");
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
