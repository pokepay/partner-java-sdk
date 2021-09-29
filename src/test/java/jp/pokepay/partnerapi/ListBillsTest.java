// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.ListBills;
import jp.pokepay.partnerapi.request.Request;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ListBillsTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new ListBills();
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
        Request request = new ListBills()
                .setDisabled(false);
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
        Request request = new ListBills()
                .upperLimitAmount(6550)
                .setDisabled(true);
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
        Request request = new ListBills()
                .lowerLimitAmount(5371)
                .upperLimitAmount(1502)
                .setDisabled(false);
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
        Request request = new ListBills()
                .shopId("0744757a-0466-40a2-9fd3-6d2dc831404e")
                .lowerLimitAmount(503)
                .upperLimitAmount(2063)
                .setDisabled(false);
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
        Request request = new ListBills()
                .shopName("UPij0JCeKaErwIngTct5VctC8ahSG576Yk267hNuqsd2aOEu5ugI0fcKmGRUw7sMhCFW8ODbHkZSUPXBsmObvnHUjDTSSciw3PX7IImkvl5vCAHh7QD95u0YIcm0Sp2RluFOAxJTKKlkJp5ENq52OLTcJlnsa7zuy")
                .shopId("621c603a-c6b1-4df4-9d75-62f3e2935501")
                .lowerLimitAmount(1015)
                .upperLimitAmount(5477)
                .setDisabled(true);
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
        Request request = new ListBills()
                .createdTo("2024-02-09T07:55:33.000000Z")
                .shopName("Z1wrrgdxWfKkMLwrBpORQ9LHlnKRmCd4nadmeyKnqGyqpn3W7S36l34SSSOxW72gqSjd8QPzbjt0rt7UmerReZGbvGgvAZbyLJ1Lea6an4P1AnQALadFsAzgfKjbtuXgZDedIJqTHGgnOhGiwZBj5AvHdO2AtfcLabY2vDzXzQx3sP8V6IT9VFC5")
                .shopId("6a438f62-b511-446f-b093-638a0541d53f")
                .lowerLimitAmount(344)
                .upperLimitAmount(4198)
                .setDisabled(false);
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
        Request request = new ListBills()
                .createdFrom("2017-10-05T15:37:12.000000Z")
                .createdTo("2022-10-15T05:09:50.000000Z")
                .shopName("8jPQ0hMJ4nPgNJOUuVI3xkUSOX0vTgyFK1FOp7pl9MWii2exAarzlUllrgsQZQAnUYeKIbZQuPYAKNLvTyMcIYlLoYSz5jRHNPv9LO3MtPyt1wTnktL8AYkBvD7caRgncONv8Kje2pUTWzADND")
                .shopId("195e4ee5-eb1d-4906-b8b7-82efe5592669")
                .lowerLimitAmount(193)
                .upperLimitAmount(7876)
                .setDisabled(false);
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
        Request request = new ListBills()
                .description("B6ZsUUsk6umIdkjysmBoCy1Ud1e5PrxfXmPZX1V")
                .createdFrom("2025-06-27T21:22:12.000000Z")
                .createdTo("2022-10-08T17:35:10.000000Z")
                .shopName("ebv0ckwSJ4e9e0pY47yGoAwg28Msl4sq96mAewFZHEg2RF0uEHwK5Jbwu9JRSn5a7ymUxn4mfvD7ycun86BZW4IWD5GZy4J15w0ovSrq2HjQnZoVWhOdLDSpe9mEjTApY38vZyrfHaX2ePxiTIXhf26BicGgC0Q3onqPmyIzFPAF7SEHME8DlS2m5Kv5IbgTWsj7MinGr0IGEeLzU5ms0HjwVmUqLVvuFmzvx3MioePO7gkONN")
                .shopId("4faa4393-bfc1-4501-bb6a-b042c64b79ab")
                .lowerLimitAmount(1219)
                .upperLimitAmount(729)
                .setDisabled(true);
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
        Request request = new ListBills()
                .organizationCode("AsqS2Z-V79-dtNkY7")
                .description("xuQUV")
                .createdFrom("2023-06-24T14:35:38.000000Z")
                .createdTo("2022-08-07T21:45:21.000000Z")
                .shopName("ZD3LHlYNS3c0MUvvhZyFdpqg4zFLwpBAFUZ73GCZjYfwcSTcjOL0y0KRT0zFenF09DVyQoaELlrJk6MRPKi62IzWH9emhQ0CqvNNBrhyRg9xxzNXJhnMZrEqyRqPCGzbSmOoYCMUQNjvF4AYLzd022rwQVNfYYCfZZWpAcyBWwWi1DgvTt4hTTZowFPycMflfcbIe")
                .shopId("515d81cf-56c9-4e2d-8b3e-fcaf1c1fe59d")
                .lowerLimitAmount(4965)
                .upperLimitAmount(6298)
                .setDisabled(true);
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
        Request request = new ListBills()
                .privateMoneyId("864ea212-382c-493b-9df3-443f4fd60db0")
                .organizationCode("Q0--Vm51xP51j-Uc-1fe-3Z-e---")
                .description("TscHpgaN0j8ZeP1HDPDTHzzRIdWxHjKy82N74miDUcOuIVqRIEU93kljq1Q8TjukgNdosrcsbqXkWqVhxkWkSbCcQV2KWKaXCJgJ38wW32AKvILX828FihWZQyqSbK0FMXzQI3K0upT8cYYAuEa7VHyo1Pr6ZXG8JSWzel5X6ggilnbIikjMsDt")
                .createdFrom("2019-04-11T10:02:55.000000Z")
                .createdTo("2016-03-28T08:19:29.000000Z")
                .shopName("Hs8kXaVldBOvstCOu5vNtx3bBib1BS1IIGWD4mpTYqNNFPcbcfJ8JMK49acle")
                .shopId("54afd3d6-a852-4a73-bc70-69e31ba6b2ec")
                .lowerLimitAmount(868)
                .upperLimitAmount(2036)
                .setDisabled(false);
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
        Request request = new ListBills()
                .billId("5tmURvImdn")
                .privateMoneyId("ed6fdaa7-91e9-45e5-9b29-8dec29b3be0c")
                .organizationCode("DoRXh-Y-9SWD-l-fv-u")
                .description("Ys7Yv5K")
                .createdFrom("2016-09-06T00:57:24.000000Z")
                .createdTo("2023-02-14T13:10:18.000000Z")
                .shopName("cz7zjgazoph")
                .shopId("e79838f5-c921-4023-9669-1143c81ef931")
                .lowerLimitAmount(9302)
                .upperLimitAmount(3548)
                .setDisabled(true);
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
        Request request = new ListBills()
                .perPage(447)
                .billId("XiXW8JGdO")
                .privateMoneyId("5050d80d-c7ba-4f99-ad8b-b975c78d25bf")
                .organizationCode("z")
                .description("uwMI02c6YHU8uGe8qGNvTmA")
                .createdFrom("2021-03-11T08:24:05.000000Z")
                .createdTo("2024-02-26T14:31:28.000000Z")
                .shopName("H06f3cpkGDNNhHR4jcwCrCwplpzKOK41muEKIO2q9f6dQ5BvDAnz25uvrmGGKjRYVWTh4n3trK0bvzHyQJ1u0mKrSXl5b4zkBhHXIiOwN14umNbs9HzTMzg2AFGgoFwChMKyFjnp6NWuVTvukHEJJxjvwAaSkrlPscgFZA7kgmnQGh0g7xEy0gjIfqsy3qqeO2uL3gmJXocI00jDfhi9nkYKzlD45lOs5FqPThDPFGAn6g717B9KA")
                .shopId("e1400ce0-47d7-451c-9618-89c8bbd88a9a")
                .lowerLimitAmount(2172)
                .upperLimitAmount(8069)
                .setDisabled(true);
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
        Request request = new ListBills()
                .page(5228)
                .perPage(6990)
                .billId("aQT0YWfQtg")
                .privateMoneyId("aa0d8a40-f689-4fdb-b8d6-736898ef5371")
                .organizationCode("-4V-k1D8HboK--w-uW")
                .description("LerXQe8LjF8Q6qvpD5ZbBwXFvQ1skGDixXFJczCMVyjlRecAjobCopZKV")
                .createdFrom("2024-12-05T12:24:47.000000Z")
                .createdTo("2021-12-15T07:10:53.000000Z")
                .shopName("9UiV0XEmtc9iB2syyuELfawMoOZtkTktpas3rTKhS7CSUreJUtTC5W6xtdNcZmGzg6LOAwdB03Wi69g5bppku3R9lJVdDaUu8gKI7uxlsX8tJTVN1o4Avhi0fX5dozKzovfXQ3PHUhjHLVEtSIaxZ8O9N2SLzG35Urh2rbZx2aArvrKFEW0caD1nqOz")
                .shopId("ef491acb-060a-4810-910f-e7adbe43b402")
                .lowerLimitAmount(2666)
                .upperLimitAmount(8542)
                .setDisabled(true);
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
