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
            "M3mKKWyblmmAHRS",
            "YCV0EDw10SY48ZoA8oj9alrEKYDjBWPKCwbirzvScUvjsqVkcSInvOjFPIL9qlVMwg0ANEHCj5eM805Swtsg2NkJBDvuxWoqdLq3QmHRbZpwbPRidVG7B6hajGJrCJBxTKH0YUW8iwJJuJPCjlaztijN3vebjT869RjYRPCqvnZ1Yzdr",
            new String[]{"c162839b-9e5f-4047-9ea9-3e480c0210b7","76573a0f-38a9-4258-8b03-f77eaed499ce","3f42ae17-176f-452e-877e-fc44d08801ac","806d367c-5f7b-4a70-b171-6518af67b3ea","cf8860d9-1eba-4b55-a134-28b2a935ccce","e7ca0592-bd20-413b-8e98-6337c02f2f1f","1381cbea-cee0-433f-90d7-802b62852894","13909617-cfe2-4dd4-8c5b-13c1aebf60aa","588c51db-d5b8-4af3-8528-8d8de287cdd4"},
            "9CjYdhYyR9@ZtWh.com",
            "MAKSZHQ2Tj@ahc0.com"
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
            "M3mKKWyblmmAHRS",
            "YCV0EDw10SY48ZoA8oj9alrEKYDjBWPKCwbirzvScUvjsqVkcSInvOjFPIL9qlVMwg0ANEHCj5eM805Swtsg2NkJBDvuxWoqdLq3QmHRbZpwbPRidVG7B6hajGJrCJBxTKH0YUW8iwJJuJPCjlaztijN3vebjT869RjYRPCqvnZ1Yzdr",
            new String[]{"c162839b-9e5f-4047-9ea9-3e480c0210b7","76573a0f-38a9-4258-8b03-f77eaed499ce","3f42ae17-176f-452e-877e-fc44d08801ac","806d367c-5f7b-4a70-b171-6518af67b3ea","cf8860d9-1eba-4b55-a134-28b2a935ccce","e7ca0592-bd20-413b-8e98-6337c02f2f1f","1381cbea-cee0-433f-90d7-802b62852894","13909617-cfe2-4dd4-8c5b-13c1aebf60aa","588c51db-d5b8-4af3-8528-8d8de287cdd4"},
            "9CjYdhYyR9@ZtWh.com",
            "MAKSZHQ2Tj@ahc0.com"
        )
                .contactName("ASAcEibjku1fdQetgL0O7DlAFrkXVihIdQWu7J4NYirXryPP6taqbm6hsnA9hELkacVB4dzDqQ1LbTyVIgVP7fIz1xemnrDx9P7HPwLX5");
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
            "M3mKKWyblmmAHRS",
            "YCV0EDw10SY48ZoA8oj9alrEKYDjBWPKCwbirzvScUvjsqVkcSInvOjFPIL9qlVMwg0ANEHCj5eM805Swtsg2NkJBDvuxWoqdLq3QmHRbZpwbPRidVG7B6hajGJrCJBxTKH0YUW8iwJJuJPCjlaztijN3vebjT869RjYRPCqvnZ1Yzdr",
            new String[]{"c162839b-9e5f-4047-9ea9-3e480c0210b7","76573a0f-38a9-4258-8b03-f77eaed499ce","3f42ae17-176f-452e-877e-fc44d08801ac","806d367c-5f7b-4a70-b171-6518af67b3ea","cf8860d9-1eba-4b55-a134-28b2a935ccce","e7ca0592-bd20-413b-8e98-6337c02f2f1f","1381cbea-cee0-433f-90d7-802b62852894","13909617-cfe2-4dd4-8c5b-13c1aebf60aa","588c51db-d5b8-4af3-8528-8d8de287cdd4"},
            "9CjYdhYyR9@ZtWh.com",
            "MAKSZHQ2Tj@ahc0.com"
        )
                .bankAccountHolderName("7")
                .contactName("WZKuWWf4n5wNPq2rjN28QfQLnQ9Qr2gs4rAyEVt2ws7WkJzpgGUX4mtxobZ9ZCpNJGZG6LzTWIbd8ZNVrafdiivNn4NbNLXIdoiqtrelImUNmLeKEfXUc2dQExu22E4bXnTsrAuXzcUztcjpDcIzv8TjKb1dIcQKtgPEpt9Ynsu0LI4");
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
            "M3mKKWyblmmAHRS",
            "YCV0EDw10SY48ZoA8oj9alrEKYDjBWPKCwbirzvScUvjsqVkcSInvOjFPIL9qlVMwg0ANEHCj5eM805Swtsg2NkJBDvuxWoqdLq3QmHRbZpwbPRidVG7B6hajGJrCJBxTKH0YUW8iwJJuJPCjlaztijN3vebjT869RjYRPCqvnZ1Yzdr",
            new String[]{"c162839b-9e5f-4047-9ea9-3e480c0210b7","76573a0f-38a9-4258-8b03-f77eaed499ce","3f42ae17-176f-452e-877e-fc44d08801ac","806d367c-5f7b-4a70-b171-6518af67b3ea","cf8860d9-1eba-4b55-a134-28b2a935ccce","e7ca0592-bd20-413b-8e98-6337c02f2f1f","1381cbea-cee0-433f-90d7-802b62852894","13909617-cfe2-4dd4-8c5b-13c1aebf60aa","588c51db-d5b8-4af3-8528-8d8de287cdd4"},
            "9CjYdhYyR9@ZtWh.com",
            "MAKSZHQ2Tj@ahc0.com"
        )
                .bankAccount("")
                .bankAccountHolderName("X")
                .contactName("453YpOK96EoFGxVJNTeRlFM4Xw2YneFRtau24yc1kusN7qW2yhhPFbHNPhRgnqYnUlh");
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
            "M3mKKWyblmmAHRS",
            "YCV0EDw10SY48ZoA8oj9alrEKYDjBWPKCwbirzvScUvjsqVkcSInvOjFPIL9qlVMwg0ANEHCj5eM805Swtsg2NkJBDvuxWoqdLq3QmHRbZpwbPRidVG7B6hajGJrCJBxTKH0YUW8iwJJuJPCjlaztijN3vebjT869RjYRPCqvnZ1Yzdr",
            new String[]{"c162839b-9e5f-4047-9ea9-3e480c0210b7","76573a0f-38a9-4258-8b03-f77eaed499ce","3f42ae17-176f-452e-877e-fc44d08801ac","806d367c-5f7b-4a70-b171-6518af67b3ea","cf8860d9-1eba-4b55-a134-28b2a935ccce","e7ca0592-bd20-413b-8e98-6337c02f2f1f","1381cbea-cee0-433f-90d7-802b62852894","13909617-cfe2-4dd4-8c5b-13c1aebf60aa","588c51db-d5b8-4af3-8528-8d8de287cdd4"},
            "9CjYdhYyR9@ZtWh.com",
            "MAKSZHQ2Tj@ahc0.com"
        )
                .bankAccountType("other")
                .bankAccount("5")
                .bankAccountHolderName("/")
                .contactName("Adcz57ZOWsDr0Djt9M12BOno1AcjM96oftC7mHhiSDgXKvVy5paxKD2XcOfyMo26iqol80j1t4n3lpnoezOx6Ov6eGwjQCqxdtQnDY4S9N4HhJ5rCsX");
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
            "M3mKKWyblmmAHRS",
            "YCV0EDw10SY48ZoA8oj9alrEKYDjBWPKCwbirzvScUvjsqVkcSInvOjFPIL9qlVMwg0ANEHCj5eM805Swtsg2NkJBDvuxWoqdLq3QmHRbZpwbPRidVG7B6hajGJrCJBxTKH0YUW8iwJJuJPCjlaztijN3vebjT869RjYRPCqvnZ1Yzdr",
            new String[]{"c162839b-9e5f-4047-9ea9-3e480c0210b7","76573a0f-38a9-4258-8b03-f77eaed499ce","3f42ae17-176f-452e-877e-fc44d08801ac","806d367c-5f7b-4a70-b171-6518af67b3ea","cf8860d9-1eba-4b55-a134-28b2a935ccce","e7ca0592-bd20-413b-8e98-6337c02f2f1f","1381cbea-cee0-433f-90d7-802b62852894","13909617-cfe2-4dd4-8c5b-13c1aebf60aa","588c51db-d5b8-4af3-8528-8d8de287cdd4"},
            "9CjYdhYyR9@ZtWh.com",
            "MAKSZHQ2Tj@ahc0.com"
        )
                .bankBranchCode("280")
                .bankAccountType("saving")
                .bankAccount("4217")
                .bankAccountHolderName("ﾙ")
                .contactName("pIh03BvqB7CzLjYHoO28zEE65UlKtMCe12MUV2dxrA2428zEWnFZLX87qtedPzV8");
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
            "M3mKKWyblmmAHRS",
            "YCV0EDw10SY48ZoA8oj9alrEKYDjBWPKCwbirzvScUvjsqVkcSInvOjFPIL9qlVMwg0ANEHCj5eM805Swtsg2NkJBDvuxWoqdLq3QmHRbZpwbPRidVG7B6hajGJrCJBxTKH0YUW8iwJJuJPCjlaztijN3vebjT869RjYRPCqvnZ1Yzdr",
            new String[]{"c162839b-9e5f-4047-9ea9-3e480c0210b7","76573a0f-38a9-4258-8b03-f77eaed499ce","3f42ae17-176f-452e-877e-fc44d08801ac","806d367c-5f7b-4a70-b171-6518af67b3ea","cf8860d9-1eba-4b55-a134-28b2a935ccce","e7ca0592-bd20-413b-8e98-6337c02f2f1f","1381cbea-cee0-433f-90d7-802b62852894","13909617-cfe2-4dd4-8c5b-13c1aebf60aa","588c51db-d5b8-4af3-8528-8d8de287cdd4"},
            "9CjYdhYyR9@ZtWh.com",
            "MAKSZHQ2Tj@ahc0.com"
        )
                .bankBranchName("diYCurcmVOPZzwM")
                .bankBranchCode("871")
                .bankAccountType("saving")
                .bankAccount("")
                .bankAccountHolderName("ｷ")
                .contactName("pW9b9NBdczTSynCfTiWLEN2pEbq7ZeB8PVJkE9NzaeTptZ5kX9rLpagdWQnEnTlLyubwibc5uG9Y4cn6ApRZ5NX6gFb5nuODlmm9rpn022H3wQmNFzbLFmfFSz1uperYHhU5vbLxW8");
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
            "M3mKKWyblmmAHRS",
            "YCV0EDw10SY48ZoA8oj9alrEKYDjBWPKCwbirzvScUvjsqVkcSInvOjFPIL9qlVMwg0ANEHCj5eM805Swtsg2NkJBDvuxWoqdLq3QmHRbZpwbPRidVG7B6hajGJrCJBxTKH0YUW8iwJJuJPCjlaztijN3vebjT869RjYRPCqvnZ1Yzdr",
            new String[]{"c162839b-9e5f-4047-9ea9-3e480c0210b7","76573a0f-38a9-4258-8b03-f77eaed499ce","3f42ae17-176f-452e-877e-fc44d08801ac","806d367c-5f7b-4a70-b171-6518af67b3ea","cf8860d9-1eba-4b55-a134-28b2a935ccce","e7ca0592-bd20-413b-8e98-6337c02f2f1f","1381cbea-cee0-433f-90d7-802b62852894","13909617-cfe2-4dd4-8c5b-13c1aebf60aa","588c51db-d5b8-4af3-8528-8d8de287cdd4"},
            "9CjYdhYyR9@ZtWh.com",
            "MAKSZHQ2Tj@ahc0.com"
        )
                .bankCode("")
                .bankBranchName("q15XpRuu89q3NykiRPYO2oQiAY")
                .bankBranchCode("382")
                .bankAccountType("other")
                .bankAccount("589")
                .bankAccountHolderName("｢")
                .contactName("SjxgCW3jFlgob7yobgqdqFleVhpCebdmmx3jJLFYo72YjP5pod5QaLCZTmFLxumOnvrupx16EXCUXyPfCabjEtMliIf7wKoPmNQWU6zl3h0ZGoCe5IIfEbaRlpdhTTQpQoSRT6b0IY83jSy9CLjq8yjjxInoBnLVw5NxHP7CI9Yb5tOQ2qp6BlopujNmJIuVKWvjUjC0u3f2Lo9NqlV");
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
            "M3mKKWyblmmAHRS",
            "YCV0EDw10SY48ZoA8oj9alrEKYDjBWPKCwbirzvScUvjsqVkcSInvOjFPIL9qlVMwg0ANEHCj5eM805Swtsg2NkJBDvuxWoqdLq3QmHRbZpwbPRidVG7B6hajGJrCJBxTKH0YUW8iwJJuJPCjlaztijN3vebjT869RjYRPCqvnZ1Yzdr",
            new String[]{"c162839b-9e5f-4047-9ea9-3e480c0210b7","76573a0f-38a9-4258-8b03-f77eaed499ce","3f42ae17-176f-452e-877e-fc44d08801ac","806d367c-5f7b-4a70-b171-6518af67b3ea","cf8860d9-1eba-4b55-a134-28b2a935ccce","e7ca0592-bd20-413b-8e98-6337c02f2f1f","1381cbea-cee0-433f-90d7-802b62852894","13909617-cfe2-4dd4-8c5b-13c1aebf60aa","588c51db-d5b8-4af3-8528-8d8de287cdd4"},
            "9CjYdhYyR9@ZtWh.com",
            "MAKSZHQ2Tj@ahc0.com"
        )
                .bankName("uXM4yE9kd7lV6QKkz6REzoI7cZYW4c0GyNh6EpQVqX4KE4B5KRDxSSp")
                .bankCode("0682")
                .bankBranchName("QLy6PO73cHGKqjz0v27dHE8reh")
                .bankBranchCode("")
                .bankAccountType("current")
                .bankAccount("09")
                .bankAccountHolderName("ﾃ")
                .contactName("2n0EGsPPbvQvYkAPBJ7wmgCWNKDP1enxAKZBD2FhNoFZKIbAgSoRCKxxDEWQZO9yz4Mc4BWxPS7UaVHpVi4pZYZOGKLSewvJuaN97ObUNQZ0A0Rwk2Z2omGatDjCcJfOMaGd4kHySUJ");
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
