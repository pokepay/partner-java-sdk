// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.CreateShopV2;
import jp.pokepay.partnerapi.request.Request;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreateShopV2Test {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new CreateShopV2(
            "kvOMHYRjzAZw05Ty0nenwzHOaIVwMTjPFMGevwVMeZt8EqIvyxvlj5KalqxA7HuqvdSNveWzWI5L6stQvZvRJLln3CmVmPz2bcH2xVBHTbiOHYbzW7EYCf76ToHcl8dtzcqD6rq"
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
        Request request = new CreateShopV2(
            "kvOMHYRjzAZw05Ty0nenwzHOaIVwMTjPFMGevwVMeZt8EqIvyxvlj5KalqxA7HuqvdSNveWzWI5L6stQvZvRJLln3CmVmPz2bcH2xVBHTbiOHYbzW7EYCf76ToHcl8dtzcqD6rq"
        )
                .canTopupPrivateMoneyIds(new String[]{});
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
        Request request = new CreateShopV2(
            "kvOMHYRjzAZw05Ty0nenwzHOaIVwMTjPFMGevwVMeZt8EqIvyxvlj5KalqxA7HuqvdSNveWzWI5L6stQvZvRJLln3CmVmPz2bcH2xVBHTbiOHYbzW7EYCf76ToHcl8dtzcqD6rq"
        )
                .privateMoneyIds(new String[]{"f30fb147-1426-4944-bd88-6a56dd9456d2","38fb19e4-5c6f-45a0-aa85-1b47556f5a6a","233f947b-36e9-4067-8870-a11470b6451f","c69e96da-3ebb-4104-ac1b-8d9d9ff28392","b1c0c838-6e49-426e-95a5-81a6f2d8a82d","92f1a6c8-9fa2-4e13-9142-5ee846a8fecd","a780f03b-a949-4c7b-8e72-e364b7864dda","9b1e774a-a60c-4f54-9827-ad3976c8a505"})
                .canTopupPrivateMoneyIds(new String[]{"474d3cff-204d-4f6e-9167-3047572dcdfe","19307487-c38a-4ee6-a380-ad8429fb46c5","793eb0ec-38aa-4feb-9363-55f43d0263b5","fc1685ab-b040-48b6-b442-89b33eb85d40","eef3a0d1-0c76-4c9b-80d9-62ea69c91f11","42909ef9-8138-486d-bb55-fe9242f0b0aa","5051c900-a3e7-4fc4-b995-18d8133f5e2e","2aa5f88e-fc51-4f3a-a314-3c59ffd68307"});
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
        Request request = new CreateShopV2(
            "kvOMHYRjzAZw05Ty0nenwzHOaIVwMTjPFMGevwVMeZt8EqIvyxvlj5KalqxA7HuqvdSNveWzWI5L6stQvZvRJLln3CmVmPz2bcH2xVBHTbiOHYbzW7EYCf76ToHcl8dtzcqD6rq"
        )
                .organizationCode("45obEl-JlK8KJ-2")
                .privateMoneyIds(new String[]{"571c1f61-0fa0-41ee-8cc9-4014511f14aa","b04c775c-5a7e-4500-8cbc-420599d77cb8","4509ce25-bbc6-4a89-b1c9-a858198be5f1"})
                .canTopupPrivateMoneyIds(new String[]{"999c5565-9e89-4619-a1ec-1c820b465bc7","d0a85d7e-c9be-4129-9a3b-75c475e93c4f","5d81e904-fb87-4ace-95df-2025879f3f2c","6bb56041-f8bd-492d-a64a-26208cb731e6","d3d9be5e-74ec-4832-88cd-10f47969b5db","ffb072a0-7a1f-456f-b779-f2619dcda18c","3b2d6593-9601-4a57-b047-daebe29536f4","38efd286-ccb1-4970-8f8f-01cf76094593","14b8b70c-2bc2-4da4-9a81-38fb67363d17","6608ae1e-43fb-40ba-8108-d1efdbb8fbfe"});
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
        Request request = new CreateShopV2(
            "kvOMHYRjzAZw05Ty0nenwzHOaIVwMTjPFMGevwVMeZt8EqIvyxvlj5KalqxA7HuqvdSNveWzWI5L6stQvZvRJLln3CmVmPz2bcH2xVBHTbiOHYbzW7EYCf76ToHcl8dtzcqD6rq"
        )
                .externalId("U6W1vFMKN952VUdQ3t63Wpysg20fNhPhFK8m")
                .organizationCode("J-Ig-h-2e-L-d0I8Gq-5N")
                .privateMoneyIds(new String[]{"cdc42a10-65cf-4515-9a0d-24c638ad6c7b","ce865b7a-8e79-4325-a531-31bd12ff47b0","0d816b84-b4f3-474d-ae8c-f13152031a68","fa56a64c-9171-449c-a085-a297ec0a0da1","9100008d-87e7-4ada-b45b-e3a57c5e040d","20b0ca98-f8d3-41e3-a62b-08ec5295176b","c57e1c2c-7086-4bb2-8a9d-2be4e4b0c66a","84c83a7a-2889-4191-ae6a-23c0db27f082"})
                .canTopupPrivateMoneyIds(new String[]{"a0a0e846-1697-4d83-a5be-621a4342ee7a","17f3abf4-bca8-4055-b9ab-f20992e0278a","f17efb92-c7be-4285-9979-655c9e462199","5a7371d5-3b92-432d-9312-4b2d6eebc7f7","ddb098f7-d640-45f9-9313-5718cc8da6b9","180e68c2-ec35-4a0d-a87d-9bbb6ae12140","5404cc2a-38f4-49e7-8e26-d8c92c3622c4","98bb9170-833d-49d5-aa80-ccf06bc3038a","95de72fa-49cb-450e-a909-4879e24374ea","e43cfd3b-9433-4542-853f-9576a0117059"});
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
        Request request = new CreateShopV2(
            "kvOMHYRjzAZw05Ty0nenwzHOaIVwMTjPFMGevwVMeZt8EqIvyxvlj5KalqxA7HuqvdSNveWzWI5L6stQvZvRJLln3CmVmPz2bcH2xVBHTbiOHYbzW7EYCf76ToHcl8dtzcqD6rq"
        )
                .email("p1TbuySIy9@vMfj.com")
                .externalId("s9RSVIuRLJamUgod9vJ")
                .organizationCode("5sO0P-En--Zn-CZ--ga-2-0-GWq-wO-V")
                .privateMoneyIds(new String[]{"80343906-659b-4c85-94a6-44011287311e","471eac5a-a4e7-4001-b5e5-069aa4784324","dcb5e80a-8b0d-45b6-95b7-56e5c9b3c515","40ca7903-b5a8-43a6-b09e-e0d90b79398a","c602736c-62f2-4d05-acfb-415d36716a4f","4240bbaa-243e-4838-8a45-351b9762407c","f4eb71a9-671b-4c89-b34c-c8b7ecc0c5e7","015b5bd7-36b6-4870-96ad-594f9f064d0d"})
                .canTopupPrivateMoneyIds(new String[]{"6c0731ae-4a87-465a-b480-0b6a722a52d2","44d1e5c6-8082-4ece-a136-c67f8cf3f71d","ec607884-0f24-49e8-a97b-312518633a6f","a24d5b42-f44f-421b-be94-89e9dd964268","10b5069b-d493-4ba0-9bbc-fce4da842b7f","fc34212d-dc04-4248-a776-f2e5ab2ae0ea","a379ed96-2990-463b-a210-521b6c634923","0d0da1cc-01fe-4ae6-a837-84c8abca658a"});
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
        Request request = new CreateShopV2(
            "kvOMHYRjzAZw05Ty0nenwzHOaIVwMTjPFMGevwVMeZt8EqIvyxvlj5KalqxA7HuqvdSNveWzWI5L6stQvZvRJLln3CmVmPz2bcH2xVBHTbiOHYbzW7EYCf76ToHcl8dtzcqD6rq"
        )
                .tel("058821-568")
                .email("czyOhMWAPb@HXyt.com")
                .externalId("djUT8FkE6WXDem2rgSzz")
                .organizationCode("P-25--m-O-9-G-66p--7x-3KKsm18")
                .privateMoneyIds(new String[]{"cdadda4c-ae3d-44a8-b1b6-71efe4f7ffab","2dee894e-6e41-4933-a3ba-e57c1b159dbe","249aeca6-98da-4e34-8eee-aabbd48f12de"})
                .canTopupPrivateMoneyIds(new String[]{"6235a749-7afc-4245-aae1-f94e471e7536","8e7b5480-1964-49a9-a223-ff59d72762a2","3d989b06-fd85-495a-94d9-8e20c1af50df","085af4b4-8713-4dfc-81df-90f0b1a40500","703d2439-fdaf-4f06-9a62-4b5aeca7db67","f3b46622-ce73-4e88-a6e3-f88f56d19b42","71355128-2756-40c0-9d8a-bbb3377d5e0c","e76bc070-fe58-4c69-90d0-a4feed9ff3e9","819bbbd7-f3b2-4519-be9f-358065f1e097"});
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
        Request request = new CreateShopV2(
            "kvOMHYRjzAZw05Ty0nenwzHOaIVwMTjPFMGevwVMeZt8EqIvyxvlj5KalqxA7HuqvdSNveWzWI5L6stQvZvRJLln3CmVmPz2bcH2xVBHTbiOHYbzW7EYCf76ToHcl8dtzcqD6rq"
        )
                .address("Um4FbQucsmz0GYwY85K8kF9CcO2FCZ7wQECuEigH9T54l9EXWThBhNBtq0Hlr5VUDcRjPWhcWE5Ed0Dp6qm5enNIYlp4WuULLQB3hzZG357PPnWlMQ")
                .tel("05-7596-791")
                .email("BJMiWPv5dA@bUBW.com")
                .externalId("ta68v79KNgsodWT1kP64c")
                .organizationCode("KR7nb")
                .privateMoneyIds(new String[]{"e5b4f3eb-3362-484e-9f8a-2b5798d5df14","e11f2da7-242a-4907-b418-5a80213c7f3f","b7ee6134-0178-42b5-ac5b-9714ab36d9f0","1ddf1794-cc21-4319-a91c-a0abadda7660"})
                .canTopupPrivateMoneyIds(new String[]{"9c78491a-8c65-4f6c-8878-9b7f00f1aa36","06feb18e-bb7d-47da-b7b3-fdc15ea2eace","0b6bd05d-ebeb-4524-a7df-657bdb1f1b72","c8dd41ae-0a04-4ce5-8e4d-d25356c9c581","1dea5adb-bc3a-4b7f-ad3d-e0ee5be50599","af424593-329d-4569-a70e-99627c770734","0df948d9-f062-4033-b436-71eb9bc7586d","c2885e76-1879-4e8f-a87c-eba8c16c4d7c","c3f1c30e-a60f-4103-aa22-17c4e2a21637","bd8577a2-1109-49d9-a186-62fe51976f2d"});
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
        Request request = new CreateShopV2(
            "kvOMHYRjzAZw05Ty0nenwzHOaIVwMTjPFMGevwVMeZt8EqIvyxvlj5KalqxA7HuqvdSNveWzWI5L6stQvZvRJLln3CmVmPz2bcH2xVBHTbiOHYbzW7EYCf76ToHcl8dtzcqD6rq"
        )
                .postalCode("1601719")
                .address("h5MLpUpAeuRnJqWXlTPA3BNnPJo0CH10GQb96Jzcef7f3He1f0QYEkgJnc3iiJ3NDVFkNizSfk2HEbXxayxzM2cghdc2Ljaj2GsuiV9UsDnl2m8nhmhWmlD5AgJ4dO8VEt3")
                .tel("0918-0596")
                .email("SJX1OiNUbq@HXuS.com")
                .externalId("WeM8VL")
                .organizationCode("oq8n09-S2v-Go")
                .privateMoneyIds(new String[]{"3cd1c838-0bd6-489d-86ee-5eeaaa745ac6","b5fd5c91-025b-4fef-8589-6d7d373b6973"})
                .canTopupPrivateMoneyIds(new String[]{"c4e163e6-5eab-43bf-879e-cd3652d0d908","d20e9714-2bb4-4809-ad76-157c12616dd8","2ad2094b-2a0e-43bd-83a3-de3027d6a479","760dccc9-318b-422e-a02f-c03a2245ef08","3364f713-fcd9-4644-b2a2-1dcf33e448ed"});
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
