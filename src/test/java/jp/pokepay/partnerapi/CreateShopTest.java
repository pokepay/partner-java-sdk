package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.CreateShop;
import jp.pokepay.partnerapi.request.Request;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreateShopTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new CreateShop(
            "cYvYSVRgXnjdGlueYXxeYEhaGxnXNc5d4gxalVltnEUunVFKoM5RPwsE5JAajT0Rg85BO6sxxLNobvM7ZPVFc"
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
        Request request = new CreateShop(
            "cYvYSVRgXnjdGlueYXxeYEhaGxnXNc5d4gxalVltnEUunVFKoM5RPwsE5JAajT0Rg85BO6sxxLNobvM7ZPVFc"
        )
                .organizationCode("ShZG--");
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
        Request request = new CreateShop(
            "cYvYSVRgXnjdGlueYXxeYEhaGxnXNc5d4gxalVltnEUunVFKoM5RPwsE5JAajT0Rg85BO6sxxLNobvM7ZPVFc"
        )
                .shopExternalId("rl9io4lNLTXp8ZK0SjnIM")
                .organizationCode("S--4-LIlP04gds-oJ-");
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
        Request request = new CreateShop(
            "cYvYSVRgXnjdGlueYXxeYEhaGxnXNc5d4gxalVltnEUunVFKoM5RPwsE5JAajT0Rg85BO6sxxLNobvM7ZPVFc"
        )
                .shopEmail("ZKxRL8EKlB@owzt.com")
                .shopExternalId("PmXRHmGfOejWmMSokxgE78k7CDvp")
                .organizationCode("5-2nm-Y57oVCf-l11-");
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
        Request request = new CreateShop(
            "cYvYSVRgXnjdGlueYXxeYEhaGxnXNc5d4gxalVltnEUunVFKoM5RPwsE5JAajT0Rg85BO6sxxLNobvM7ZPVFc"
        )
                .shopTel("0911-1821-707")
                .shopEmail("b48Qy1gv0Z@dQyI.com")
                .shopExternalId("mcPILVFBnuVo9bUye7FkiTj1XB5a1ZZUu")
                .organizationCode("U-q-395");
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
        Request request = new CreateShop(
            "cYvYSVRgXnjdGlueYXxeYEhaGxnXNc5d4gxalVltnEUunVFKoM5RPwsE5JAajT0Rg85BO6sxxLNobvM7ZPVFc"
        )
                .shopAddress("ATVaDh5xdTrRSZxJAjPDnhmpWOVSO8Pc2TEWmzwhnwoyTD2bXkds6EbMczhITF05eyJmY0YaYsmhfn7fwK7GgMocZxx6Hf6gEPdzwzq1vlTpsVFG0x3hcyoYa2smoHHw0pISoP5K52KEJbp9MgHZBhsmPBdh7xje3q35QBkrC9xIeGwrDCatzDxTWqc7JiDiMjTDSavdnH612vL3twwf4WqHXkxbynJm3oHmEc5dXQtMp7C")
                .shopTel("03-1734957")
                .shopEmail("2YvajHyvQP@KJuz.com")
                .shopExternalId("Z")
                .organizationCode("n--176D1-");
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
        Request request = new CreateShop(
            "cYvYSVRgXnjdGlueYXxeYEhaGxnXNc5d4gxalVltnEUunVFKoM5RPwsE5JAajT0Rg85BO6sxxLNobvM7ZPVFc"
        )
                .shopPostalCode("312-9552")
                .shopAddress("ykebS5nmyMXEUgMEh4g341lY4NXFEiLCoeigixeWQd0B2Zge1PS5mQ9Z8dKCuIeybPS0BWXZV7BPap4kUmIBiDY7wUWoE6YaLyMi9VXsB4W8EAROy")
                .shopTel("0210-5566-843")
                .shopEmail("pgJMFzBE4u@1qc8.com")
                .shopExternalId("HibGlM5tqfl6PyEvNY5TXdmN3rs")
                .organizationCode("2Cx--5FLcd-d72-Lf");
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
