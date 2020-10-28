// DO NOT EDIT: File is generated by code generator.
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
                .transferTypes(new String[]{"topup","transfer","payment","exchange"});
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
                .transactionTypes(new String[]{})
                .transferTypes(new String[]{"transfer","exchange","payment","topup"});
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
                .transactionTypes(new String[]{})
                .transferTypes(new String[]{"transfer","topup","payment"});
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
                .privateMoneyId("368f54fd-1e96-4c50-ba0d-a12f5de9af23")
                .setModified(true)
                .transactionTypes(new String[]{"transfer"})
                .transferTypes(new String[]{"payment","topup","transfer","exchange"});
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
                .transactionId("8241fcb6-d353-4140-8de7-58b4bf444d8d")
                .privateMoneyId("c9a7fffa-67cf-482d-a73c-797474cfbc82")
                .setModified(true)
                .transactionTypes(new String[]{})
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
    void test6() throws ConnectionError, ProcessingError {
        Request request = new ListTransfers()
                .customerName("0nLBvCfu5QWsdUnRrH9KHVuXFGKt4lw9lRVMCAhIxweHf4mhVFw56RKDemCYdfHKy6kNARZB0e7gSo7Ck5GjWL9QXL9sfwRokQiO2gJLOs7NWiVmOaSDg31Umvi1k0xZepHVlU5UCBk1m")
                .transactionId("08e34d43-0f3c-4a32-b611-47b09b9a65fe")
                .privateMoneyId("58ec801c-6b00-48d3-a8da-6e491e0e81d0")
                .setModified(true)
                .transactionTypes(new String[]{"payment","transfer","exchange","topup"})
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
    void test7() throws ConnectionError, ProcessingError {
        Request request = new ListTransfers()
                .customerId("50b1b6bd-4942-42c5-b716-6b0691f05a4f")
                .customerName("UnBV1wl8i3xQfqNGTjhBSpAIG2GVjRLCF7S26ypTzMExe5LQXN3tfMMeaiTEdRlgPRLO")
                .transactionId("37d69ba8-d736-4ebf-a975-2d8af987bb0c")
                .privateMoneyId("ac618d34-601c-4499-aff8-e980399e6a28")
                .setModified(true)
                .transactionTypes(new String[]{"topup"})
                .transferTypes(new String[]{"topup","payment"});
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
                .shopName("FskSUixLpvflY8MFYZJvlfPZ9XRs2DjUex8FZcru468uiy2IBQsKNbECUonyUv3nTPZ701h3V5Qywi2pn04JUSx27eVHz2wOx9gOffBCzdPD5lY5ruzs73QnlHzwGBVLp2Vmg3eprOU7ktZcHWsZTpEtZX9770nlSO8H2DCl6imPJgn2XjYsZUpQvLebh65Hdtxmvs4SwxRthVVayjO1th3s3e6fayZ2E32vm3RMvvWttu1PJb3d04")
                .customerId("67525409-8bc9-4be6-b305-5b6bb03698fa")
                .customerName("Rh2KXDkJqy1UyPaGHVkyMSdmemZcovbEUc9TiM3DTSa7pJlo8JS6mIVfCl8O6XTpGUPEJOaNnRanlNyuKHWuXq7zEzVgAAIhzrVmMQ7zQf4j1Xlnx61iQEXBdwXQXBx9CjvSgZke3VuPIIBeUSxLQqoj9SXP9EgDJcoagTJNb42JvVKNsj3zA7Dw0uibv6O0nFaLFwVLIZnC6rDyYuuG1XnlSIVaCTCoBzc")
                .transactionId("e076f30d-b8b3-4883-bcd0-5f6f63474c6c")
                .privateMoneyId("bf32907e-7aa9-44fe-b325-4a6432d4c003")
                .setModified(true)
                .transactionTypes(new String[]{"exchange","topup"})
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
    void test9() throws ConnectionError, ProcessingError {
        Request request = new ListTransfers()
                .shopId("325b0ce2-36fe-4113-b054-736b9d27f651")
                .shopName("9CA458OFUiC0xNjD1g6ausYOsWjmgSVes0LvRpIOKLgAa2m76DTKceEBbKe1QbzWrTYvHigdBYvKVDdotVdsHD1HarFGRZ0Q28LywVGUz2sIRxtNbAY")
                .customerId("fb3046e0-b79d-4340-8dfa-a1c80d5219fc")
                .customerName("ePlwRHJLPebYCA3qabphyjXP3xuhhy9uGRsNNOdzmZ5nbPQzPRirLmp7HiQajpl09")
                .transactionId("9b146e26-ef95-42a7-a4b6-e5d1137f740c")
                .privateMoneyId("10abaa49-b0a4-4669-88a9-8161a01a7d00")
                .setModified(true)
                .transactionTypes(new String[]{"topup","transfer","payment"})
                .transferTypes(new String[]{"payment","topup"});
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
                .perPage(1324)
                .shopId("180f6db0-c1c7-4608-8793-483d48bbb718")
                .shopName("i4ivBi3eJhDgAiQ5RhXwEfmyakwCi2K41MKrJ8u3JtJHw13BJLqURa9CDG8z1r52NxmvSo3IMgKOG9RqgqLtsxscDVj4qDxwlIsjYdDsgNzWfMVYN8tFORiCKaN1GSBkTmsnETZgON7wI25XD4LDGgtc1eHQx1a38fcy9G2ru7CIugZBUKc64A8KJDFHDE0sPhVLSmxr0FU3DnW6K")
                .customerId("5608c25b-1d92-410e-99f1-9ff3a5830e98")
                .customerName("DEeelMkJvsg1mQveiZolVhKjCQVZwzstz19XaUt7HUg2vBtQ3icUlEOMImvGy37aG3VpRlqKVbLVJ59qzi8HFxZtC5ypm8TU2Y6m10oazOnSDRVBADkHpYoJtK8deELoxPb8vCqW8ZrqfNGAkbzmAIScfq8JbwsU")
                .transactionId("e6e1826a-238e-4f9f-80c6-601ffb2032e8")
                .privateMoneyId("931b2c72-db3a-4f2d-b329-864e46986df7")
                .setModified(false)
                .transactionTypes(new String[]{"exchange"})
                .transferTypes(new String[]{"payment","transfer","exchange"});
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
                .page(9106)
                .perPage(2791)
                .shopId("e060bcf5-9cca-435b-a9a5-c36f4da811ae")
                .shopName("nAr0O5BazmKqHUlvI3TLRDU2wR06BrqE4xR4GA8B6QEvmEtQTqfIDfhF08aWAgYKgMRg4eijui0x4AzukqXii06wz9NdLnaFp0d8NnYZXWwwPUfmYGEVrOM4dkj0diMGxwkBMFBNKhTrrGkGVnz7dW1L5JRcqWGZoB7J2SLBuVTFPFKYeglUQAESlFenRvUgW2C0Pk55puUaBmR66mDvQf3SzEAz6sFhOXUyleHUBygYL")
                .customerId("7706d498-d34c-4885-8e4a-db2aaa2caf46")
                .customerName("bbjnOxn1Ii4QyBabDj1sJ7k6dP6L13ja9VovumOjMgFfs83kBzSot4H9G2QRAYPymeRfFOHsPVjb9UCbPcYx5YXiYOW0oa5SUOR88F7Ubd6EIlmfbIWBjq1h3aM3MFSn6Z9Xp0dYAIwKPnm62HiK775FUjJKUwWsCFULHC5xu9xwKzEEFrv0p5VC2XFSxIKMXYPxeKc6v3uyZaCEMZ2Ju8UbXHSU9E0Qlg3gebv")
                .transactionId("8a480fc1-4577-4907-9d6a-c87cf26f7afa")
                .privateMoneyId("a387e891-8847-4c38-9559-5e87acab0e1d")
                .setModified(true)
                .transactionTypes(new String[]{"exchange","transfer","payment"})
                .transferTypes(new String[]{"topup","payment","exchange"});
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
                .to("2019-11-11T08:12:33.000000+09:00")
                .page(1333)
                .perPage(7237)
                .shopId("8795a258-99ce-4774-aa73-f5e7e833cbb9")
                .shopName("PgQkXqYPn4dGIxCAVXu8wPFdMI0g8RX9GwTm1EaeDH0runis")
                .customerId("8c96adbc-8bae-4d9f-8c56-901c04e72a3f")
                .customerName("A8D7RtvLwRN8QmXijHIyMGxrgTxrmP2c2b7AqdqrRaU4tsNqOUthYSxSa5qYfKcdpEzIZoGgQ8JT7nM2XSRS8qzeJVaYua2WPHw1UTjf1quigD2l2JnK33Y2PKkmhgdj1RbwEdGAkTKdkw")
                .transactionId("faa5b900-9944-428f-9a2a-b745b058a667")
                .privateMoneyId("de760078-73fb-4ab5-8577-64070047582e")
                .setModified(false)
                .transactionTypes(new String[]{"exchange","transfer"})
                .transferTypes(new String[]{"exchange"});
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
                .from("2022-04-19T07:02:50.000000+09:00")
                .to("2024-12-17T08:41:43.000000+09:00")
                .page(9221)
                .perPage(2642)
                .shopId("a11be964-42a4-4ea5-9a9f-225fd2da3f6f")
                .shopName("RUOUAciXVcpzKCMcrOD6Emk2wkp2iXzqZDQWG9JIPYO9QhKjYAAaWngq9PQfQxKRvEszf3mWAEHwNafuFelOU7xCAyi0eUz4xXH5OLhVoB1lIuiOfxpiSD0ualUMr1aiXbRr0Yt6Ont0eqhymEV4KDx3FmD9kbbli1vOnH69EFivIjA6JEHCCuKlnfNVTWFTkh4YZxFDhr8QjYlB42oGAhylpmFOwCdKPABZdrg")
                .customerId("4861db91-7698-4d9d-a8b9-d21c6724cbb8")
                .customerName("RslDBuoJSIFUrTRne91u8KmONYXCce6NgXmM6SU8mT9N7YdoyhvIOK96oQgvpt3OE4bGWfPwqWxwC3DU0ZYNIFrYHkTuOzrywGRNkAeSHinr7X7r9y8K62vZdczxzKDF7OzztIRdIBCYTSHrtKwD")
                .transactionId("8a61d083-aedd-4920-92e2-9dc648949c5e")
                .privateMoneyId("29ab12ff-fe4a-4c78-9ab9-f6be43528871")
                .setModified(false)
                .transactionTypes(new String[]{"payment","transfer","topup"})
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
}
