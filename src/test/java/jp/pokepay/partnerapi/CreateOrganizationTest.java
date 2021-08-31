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
            "netJol0g7uhhZVwBBSB9NQuG198o4cE",
            "ye8xiCptr8X3OQSs9cvMVMzYpfEHHq4AVCPhpFJVl2NE9OohrFLhvABt9",
            new String[]{"a4186e32-1dd9-4581-aa8e-3565c3f9458b","ce658da7-be1e-4e10-be0e-044e6cf24dc7"},
            "keRyZCxDwn@yuzP.com",
            "dWfYw482S6@oHFs.com"
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
            "netJol0g7uhhZVwBBSB9NQuG198o4cE",
            "ye8xiCptr8X3OQSs9cvMVMzYpfEHHq4AVCPhpFJVl2NE9OohrFLhvABt9",
            new String[]{"a4186e32-1dd9-4581-aa8e-3565c3f9458b","ce658da7-be1e-4e10-be0e-044e6cf24dc7"},
            "keRyZCxDwn@yuzP.com",
            "dWfYw482S6@oHFs.com"
        )
                .contactName("h9ksnqTSKQYaLtgBF21Mao0iMx72McbAtuQfbwPK5Ol2Udeu5ClBnNsqGtwvAjO8SQrjpTlUKU7ix6vD3BTnNcaIv4Cy2qiGNeSDJueWNAF2iLhkB08mWoSEw4Yfnz5e3bjXKldANGzSZe49qKV1rholLnfHAgpNJKDDEjuzSmETPUL6TDRxNmjKWPDEzen9VEh9JKwUlzsxb9tQKSZdMATJHlP");
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
            "netJol0g7uhhZVwBBSB9NQuG198o4cE",
            "ye8xiCptr8X3OQSs9cvMVMzYpfEHHq4AVCPhpFJVl2NE9OohrFLhvABt9",
            new String[]{"a4186e32-1dd9-4581-aa8e-3565c3f9458b","ce658da7-be1e-4e10-be0e-044e6cf24dc7"},
            "keRyZCxDwn@yuzP.com",
            "dWfYw482S6@oHFs.com"
        )
                .bankAccountHolderName("ｲ")
                .contactName("s2aiyvcn732KUYpvpwWJTv2DUcm");
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
            "netJol0g7uhhZVwBBSB9NQuG198o4cE",
            "ye8xiCptr8X3OQSs9cvMVMzYpfEHHq4AVCPhpFJVl2NE9OohrFLhvABt9",
            new String[]{"a4186e32-1dd9-4581-aa8e-3565c3f9458b","ce658da7-be1e-4e10-be0e-044e6cf24dc7"},
            "keRyZCxDwn@yuzP.com",
            "dWfYw482S6@oHFs.com"
        )
                .bankAccount("496")
                .bankAccountHolderName("ﾄ")
                .contactName("fgLVNlOhNoRUioebBno3HZhnyNZ5Q77U04aLs4hmy4C28WnCRfz2leovb1R");
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
            "netJol0g7uhhZVwBBSB9NQuG198o4cE",
            "ye8xiCptr8X3OQSs9cvMVMzYpfEHHq4AVCPhpFJVl2NE9OohrFLhvABt9",
            new String[]{"a4186e32-1dd9-4581-aa8e-3565c3f9458b","ce658da7-be1e-4e10-be0e-044e6cf24dc7"},
            "keRyZCxDwn@yuzP.com",
            "dWfYw482S6@oHFs.com"
        )
                .bankAccountType("other")
                .bankAccount("72307")
                .bankAccountHolderName("ﾅ")
                .contactName("aLxa2QZma6CRo8nyJO9Y");
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
            "netJol0g7uhhZVwBBSB9NQuG198o4cE",
            "ye8xiCptr8X3OQSs9cvMVMzYpfEHHq4AVCPhpFJVl2NE9OohrFLhvABt9",
            new String[]{"a4186e32-1dd9-4581-aa8e-3565c3f9458b","ce658da7-be1e-4e10-be0e-044e6cf24dc7"},
            "keRyZCxDwn@yuzP.com",
            "dWfYw482S6@oHFs.com"
        )
                .bankBranchCode("609")
                .bankAccountType("current")
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
    void test6() throws ConnectionError, ProcessingError {
        Request request = new CreateOrganization(
            "netJol0g7uhhZVwBBSB9NQuG198o4cE",
            "ye8xiCptr8X3OQSs9cvMVMzYpfEHHq4AVCPhpFJVl2NE9OohrFLhvABt9",
            new String[]{"a4186e32-1dd9-4581-aa8e-3565c3f9458b","ce658da7-be1e-4e10-be0e-044e6cf24dc7"},
            "keRyZCxDwn@yuzP.com",
            "dWfYw482S6@oHFs.com"
        )
                .bankBranchName("2zo2GN3")
                .bankBranchCode("713")
                .bankAccountType("saving")
                .bankAccount("6")
                .bankAccountHolderName("｢")
                .contactName("ZS1PVe5LZzi2NmWBluHrzflOytNd3ROmH9nMfAHnX3LOs6P3dxLhDjrt4CFESWJnPCLU");
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
            "netJol0g7uhhZVwBBSB9NQuG198o4cE",
            "ye8xiCptr8X3OQSs9cvMVMzYpfEHHq4AVCPhpFJVl2NE9OohrFLhvABt9",
            new String[]{"a4186e32-1dd9-4581-aa8e-3565c3f9458b","ce658da7-be1e-4e10-be0e-044e6cf24dc7"},
            "keRyZCxDwn@yuzP.com",
            "dWfYw482S6@oHFs.com"
        )
                .bankCode("8704")
                .bankBranchName("rgoghS3pPHE574eeX1ksH4R2MgyW6")
                .bankBranchCode("")
                .bankAccountType("current")
                .bankAccount("1828")
                .bankAccountHolderName(" ")
                .contactName("gzecqWdDVSstoEtPVoykbtA6l7WDayqQLAKXyhWYdlIHfSBBKI1KQl4cK6HLesoN7AsxjaX4bkzoW5SSzFCKjO");
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
            "netJol0g7uhhZVwBBSB9NQuG198o4cE",
            "ye8xiCptr8X3OQSs9cvMVMzYpfEHHq4AVCPhpFJVl2NE9OohrFLhvABt9",
            new String[]{"a4186e32-1dd9-4581-aa8e-3565c3f9458b","ce658da7-be1e-4e10-be0e-044e6cf24dc7"},
            "keRyZCxDwn@yuzP.com",
            "dWfYw482S6@oHFs.com"
        )
                .bankName("EE829PJZq44v95w5OTBAsM3ixdWcd35lzGg9k8z")
                .bankCode("")
                .bankBranchName("5Zx6rdzZ6Kiw60EKpO7FL05ARS")
                .bankBranchCode("272")
                .bankAccountType("saving")
                .bankAccount("89580")
                .bankAccountHolderName("3")
                .contactName("w9rvtxOfCP20hUm1E2Nlz5V1CO5TSFyNtopqI6bCrDgQTiBz8hopleWuv10dzqDmxXKufPIjjJpzSXKPSRMVYMVxniANdM0yy6srRZNC9bYJUFWp4SJDd9Vw0ghvUwHY4GPMgqa4p3NBV6jnDEmNinmBAkCQlWqd4VgtaT7nx9nC");
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
