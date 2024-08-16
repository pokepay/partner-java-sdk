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
            "aSAEam9pXGfGu",
            "8UwJw4clWC9a8kaRRCgVtT6a25Bwbmq5KfiZYFVaFc4mkmlTAEsGSahRzgpPwE7er6jQXCucQuqskHUmxrV23XXFc0uKT4V5",
            new String[]{"7f14dd81-cd77-4bd7-8162-be4e31cb3dc4","cb16afca-cb01-4a2e-98a2-39a7af723f8a","027a6d30-f417-4574-a21c-908ee158ec6f","ee6793f2-984e-4a8c-a13d-13c8914c03d1","46baee89-394d-4195-8bfc-db965d24a503","b2e93d55-7f5b-4ad2-9279-f7d61276a1c9","7f37a69c-2d19-4ef3-9c72-f2a3a4ade38e","c8e97206-5cd1-46e0-84b8-74462171e94d","c64b87ac-89eb-4873-8355-5fdf3392f832","414fb12f-1e3e-4fbd-9cb0-380836427467"},
            "zllvOHGni8@HkNj.com",
            "P7lPXF5F2G@MbXA.com"
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
            "aSAEam9pXGfGu",
            "8UwJw4clWC9a8kaRRCgVtT6a25Bwbmq5KfiZYFVaFc4mkmlTAEsGSahRzgpPwE7er6jQXCucQuqskHUmxrV23XXFc0uKT4V5",
            new String[]{"7f14dd81-cd77-4bd7-8162-be4e31cb3dc4","cb16afca-cb01-4a2e-98a2-39a7af723f8a","027a6d30-f417-4574-a21c-908ee158ec6f","ee6793f2-984e-4a8c-a13d-13c8914c03d1","46baee89-394d-4195-8bfc-db965d24a503","b2e93d55-7f5b-4ad2-9279-f7d61276a1c9","7f37a69c-2d19-4ef3-9c72-f2a3a4ade38e","c8e97206-5cd1-46e0-84b8-74462171e94d","c64b87ac-89eb-4873-8355-5fdf3392f832","414fb12f-1e3e-4fbd-9cb0-380836427467"},
            "zllvOHGni8@HkNj.com",
            "P7lPXF5F2G@MbXA.com"
        )
                .contactName("mJpey7UUsjsVOtjxJRdz35L4y5ebAvcsRmCFG7ZCQJ8tYzX6ZTQKt9HlFGF551mnvfdwSSdjSpZlSQSbrVDZqSOWrjbTJDATLCSouiXNQioUdQxlShDCm1CKViw60UeNqWcjAxL1GKVeQHZuGPEygaV10NXTv0eho5YP94o80H0vX1akvR6MY7kBuXm2wLBzyyncr3D5S5Ez4rlVa65vyo");
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
            "aSAEam9pXGfGu",
            "8UwJw4clWC9a8kaRRCgVtT6a25Bwbmq5KfiZYFVaFc4mkmlTAEsGSahRzgpPwE7er6jQXCucQuqskHUmxrV23XXFc0uKT4V5",
            new String[]{"7f14dd81-cd77-4bd7-8162-be4e31cb3dc4","cb16afca-cb01-4a2e-98a2-39a7af723f8a","027a6d30-f417-4574-a21c-908ee158ec6f","ee6793f2-984e-4a8c-a13d-13c8914c03d1","46baee89-394d-4195-8bfc-db965d24a503","b2e93d55-7f5b-4ad2-9279-f7d61276a1c9","7f37a69c-2d19-4ef3-9c72-f2a3a4ade38e","c8e97206-5cd1-46e0-84b8-74462171e94d","c64b87ac-89eb-4873-8355-5fdf3392f832","414fb12f-1e3e-4fbd-9cb0-380836427467"},
            "zllvOHGni8@HkNj.com",
            "P7lPXF5F2G@MbXA.com"
        )
                .bankAccountHolderName("ｳ")
                .contactName("JEpcvwWowpPuaeqrDTqXOu5brxlUkXvWlc5ew5Ojoavi176IuFKvYiBn3X05V7bL5tfUcfRap44ub2K45YocbqOxTREdzQ28U");
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
            "aSAEam9pXGfGu",
            "8UwJw4clWC9a8kaRRCgVtT6a25Bwbmq5KfiZYFVaFc4mkmlTAEsGSahRzgpPwE7er6jQXCucQuqskHUmxrV23XXFc0uKT4V5",
            new String[]{"7f14dd81-cd77-4bd7-8162-be4e31cb3dc4","cb16afca-cb01-4a2e-98a2-39a7af723f8a","027a6d30-f417-4574-a21c-908ee158ec6f","ee6793f2-984e-4a8c-a13d-13c8914c03d1","46baee89-394d-4195-8bfc-db965d24a503","b2e93d55-7f5b-4ad2-9279-f7d61276a1c9","7f37a69c-2d19-4ef3-9c72-f2a3a4ade38e","c8e97206-5cd1-46e0-84b8-74462171e94d","c64b87ac-89eb-4873-8355-5fdf3392f832","414fb12f-1e3e-4fbd-9cb0-380836427467"},
            "zllvOHGni8@HkNj.com",
            "P7lPXF5F2G@MbXA.com"
        )
                .bankAccount("93252")
                .bankAccountHolderName("｣")
                .contactName("YONzcBwRWSDLiCOz0KGMFbnI549FWLsTpMw28xCwnnHcZy5ZCD2kKhhra4x");
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
            "aSAEam9pXGfGu",
            "8UwJw4clWC9a8kaRRCgVtT6a25Bwbmq5KfiZYFVaFc4mkmlTAEsGSahRzgpPwE7er6jQXCucQuqskHUmxrV23XXFc0uKT4V5",
            new String[]{"7f14dd81-cd77-4bd7-8162-be4e31cb3dc4","cb16afca-cb01-4a2e-98a2-39a7af723f8a","027a6d30-f417-4574-a21c-908ee158ec6f","ee6793f2-984e-4a8c-a13d-13c8914c03d1","46baee89-394d-4195-8bfc-db965d24a503","b2e93d55-7f5b-4ad2-9279-f7d61276a1c9","7f37a69c-2d19-4ef3-9c72-f2a3a4ade38e","c8e97206-5cd1-46e0-84b8-74462171e94d","c64b87ac-89eb-4873-8355-5fdf3392f832","414fb12f-1e3e-4fbd-9cb0-380836427467"},
            "zllvOHGni8@HkNj.com",
            "P7lPXF5F2G@MbXA.com"
        )
                .bankAccountType("current")
                .bankAccount("7219942")
                .bankAccountHolderName(" ")
                .contactName("3cva3bAZviVkAJwPInLqt6bfWJr9PmHvPgxdHtcOyQM1tRBg8wDHjDN8h0TykW83hWffg4C3Rn2YaF1GNK6a0j8vEwtdloktm8w2Wc2W5bRjoFy6qH4Y4XGyngL1gHk3wLwzSgvUq6idc4iQTPMDJWcSlA7VAiw8IAqb30eIcwgTGhyaAodw7BIcxTeYcHjwgbw");
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
            "aSAEam9pXGfGu",
            "8UwJw4clWC9a8kaRRCgVtT6a25Bwbmq5KfiZYFVaFc4mkmlTAEsGSahRzgpPwE7er6jQXCucQuqskHUmxrV23XXFc0uKT4V5",
            new String[]{"7f14dd81-cd77-4bd7-8162-be4e31cb3dc4","cb16afca-cb01-4a2e-98a2-39a7af723f8a","027a6d30-f417-4574-a21c-908ee158ec6f","ee6793f2-984e-4a8c-a13d-13c8914c03d1","46baee89-394d-4195-8bfc-db965d24a503","b2e93d55-7f5b-4ad2-9279-f7d61276a1c9","7f37a69c-2d19-4ef3-9c72-f2a3a4ade38e","c8e97206-5cd1-46e0-84b8-74462171e94d","c64b87ac-89eb-4873-8355-5fdf3392f832","414fb12f-1e3e-4fbd-9cb0-380836427467"},
            "zllvOHGni8@HkNj.com",
            "P7lPXF5F2G@MbXA.com"
        )
                .bankBranchCode("104")
                .bankAccountType("other")
                .bankAccount("65539")
                .bankAccountHolderName("ｹ")
                .contactName("SJl2ySoLBGUkGh4kR3Obxw8DPGTjbgB9c4UvjHxKvyoo6eR2rETO0esrJASWnWsIzeMEDmTVH4LPtMXwZDgC1GcDgWzD9fCQ3OJ5GTUGj01Fiwa0qtjZ0gi2aJwD5BeiVwwBdzqowlWarr2V68q28Lzokz0pGRkZmfrntDFDNZdEpDU70uAWnunvVL2HzF");
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
            "aSAEam9pXGfGu",
            "8UwJw4clWC9a8kaRRCgVtT6a25Bwbmq5KfiZYFVaFc4mkmlTAEsGSahRzgpPwE7er6jQXCucQuqskHUmxrV23XXFc0uKT4V5",
            new String[]{"7f14dd81-cd77-4bd7-8162-be4e31cb3dc4","cb16afca-cb01-4a2e-98a2-39a7af723f8a","027a6d30-f417-4574-a21c-908ee158ec6f","ee6793f2-984e-4a8c-a13d-13c8914c03d1","46baee89-394d-4195-8bfc-db965d24a503","b2e93d55-7f5b-4ad2-9279-f7d61276a1c9","7f37a69c-2d19-4ef3-9c72-f2a3a4ade38e","c8e97206-5cd1-46e0-84b8-74462171e94d","c64b87ac-89eb-4873-8355-5fdf3392f832","414fb12f-1e3e-4fbd-9cb0-380836427467"},
            "zllvOHGni8@HkNj.com",
            "P7lPXF5F2G@MbXA.com"
        )
                .bankBranchName("jNBD534R")
                .bankBranchCode("")
                .bankAccountType("current")
                .bankAccount("8011")
                .bankAccountHolderName(")")
                .contactName("e8ZodW8myjuM2kKFb6bDSA5KOivUIB927HvS2PeOQhbxdoZjI6jmjYrj4dTpffw8uHjsZUGaPu5hoaE9148zFevKKRgPpMDhzs7OOi6hsV0l5zD8gpHiG3iJgGxq3dTcuM6qj36SlpmjltHqydq99huI1hnfPyAqA1KfDhNBSmBrsgGJPxnNLpOyyNvO7Ke9I0eY0Qp5zXIWJAvDwRA");
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
            "aSAEam9pXGfGu",
            "8UwJw4clWC9a8kaRRCgVtT6a25Bwbmq5KfiZYFVaFc4mkmlTAEsGSahRzgpPwE7er6jQXCucQuqskHUmxrV23XXFc0uKT4V5",
            new String[]{"7f14dd81-cd77-4bd7-8162-be4e31cb3dc4","cb16afca-cb01-4a2e-98a2-39a7af723f8a","027a6d30-f417-4574-a21c-908ee158ec6f","ee6793f2-984e-4a8c-a13d-13c8914c03d1","46baee89-394d-4195-8bfc-db965d24a503","b2e93d55-7f5b-4ad2-9279-f7d61276a1c9","7f37a69c-2d19-4ef3-9c72-f2a3a4ade38e","c8e97206-5cd1-46e0-84b8-74462171e94d","c64b87ac-89eb-4873-8355-5fdf3392f832","414fb12f-1e3e-4fbd-9cb0-380836427467"},
            "zllvOHGni8@HkNj.com",
            "P7lPXF5F2G@MbXA.com"
        )
                .bankCode("")
                .bankBranchName("coUyzw6jpDe0iXXWpHaVgs2N")
                .bankBranchCode("")
                .bankAccountType("current")
                .bankAccount("225")
                .bankAccountHolderName("｣")
                .contactName("AvLH18s5yRzfPDR60w3nUfoRd0DVRpgzEcK0ctsbIp0ZCCeIeHhCtliiBeFIeWAboOEyL2Kkg8r9BkvRmp6uCfR5Wh9ZtWlFZIWG45ZbZPVkUlfhZGGe9cudf0o7rM2K87t9fK9KbIhb3Fu5yOppG8qmqeyhfasmqGiaK6w6V5cAKv2fyjznEfLkLLrNqvCGLc4yTEdoZOVyBMVVmPdKhB1pKOdlDhO88vFyJ6qH6aht44jEv");
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
            "aSAEam9pXGfGu",
            "8UwJw4clWC9a8kaRRCgVtT6a25Bwbmq5KfiZYFVaFc4mkmlTAEsGSahRzgpPwE7er6jQXCucQuqskHUmxrV23XXFc0uKT4V5",
            new String[]{"7f14dd81-cd77-4bd7-8162-be4e31cb3dc4","cb16afca-cb01-4a2e-98a2-39a7af723f8a","027a6d30-f417-4574-a21c-908ee158ec6f","ee6793f2-984e-4a8c-a13d-13c8914c03d1","46baee89-394d-4195-8bfc-db965d24a503","b2e93d55-7f5b-4ad2-9279-f7d61276a1c9","7f37a69c-2d19-4ef3-9c72-f2a3a4ade38e","c8e97206-5cd1-46e0-84b8-74462171e94d","c64b87ac-89eb-4873-8355-5fdf3392f832","414fb12f-1e3e-4fbd-9cb0-380836427467"},
            "zllvOHGni8@HkNj.com",
            "P7lPXF5F2G@MbXA.com"
        )
                .bankName("gSR0J92zX5m62mJYTnpnaua")
                .bankCode("9892")
                .bankBranchName("uDfzbFiQM9URlthCPrW479xppqkJlPZPNlSrej8BqsKC5KKPcXc")
                .bankBranchCode("")
                .bankAccountType("other")
                .bankAccount("74")
                .bankAccountHolderName("/")
                .contactName("QuUNMonBXIdgLMVsnhoFl5ulh7APFLKqxpPBTnz7CHLdSi8gln35nyFwm3dYnCkKQiXtFSYm4r14lIB8SR7QelmzF870e65VvjZbyzGK1qmk7H0MK1HXl1UmmHgldvwbzLVFFaevPyHvjvMzTU1ATibodjUDLzBZEYL2AaJRG0UD");
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
