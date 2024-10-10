// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.CreateCustomerAccount;
import jp.pokepay.partnerapi.request.Request;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreateCustomerAccountTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new CreateCustomerAccount(
            "c454fa7a-8121-47c1-8460-3b4e2ea6762c"
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
        Request request = new CreateCustomerAccount(
            "c454fa7a-8121-47c1-8460-3b4e2ea6762c"
        )
                .externalId("e87oi");
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
        Request request = new CreateCustomerAccount(
            "c454fa7a-8121-47c1-8460-3b4e2ea6762c"
        )
                .accountName("kJDB6ZsUUsk6umIdkjysmBoCy1Ud1e5PrxfXmPZX1VlVfqebv0ckwSJ4e9e0pY47yGoAwg28Msl4sq96mAewFZHEg2RF0uEHwK5Jbwu9JRSn5a7ymUxn4mfvD7ycun86BZW4IWD5GZy4J15w0ovSrq2HjQnZoVWhOdLDSpe9mEjTApY38vZyrfHaX2ePxiTIXh")
                .externalId("26BicGgC0Q3onqPmyIzFPAF7SEHME8DlS2m5Kv5");
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
        Request request = new CreateCustomerAccount(
            "c454fa7a-8121-47c1-8460-3b4e2ea6762c"
        )
                .userName("bgTWsj7MinGr0IGEeLzU5ms0HjwVmUqLVvuFmzvx3MioePO7gkONNAjBCYm4KWEpCDEdkn0OKxjITuRCVadPy2BbYSAUfNgtCT3aJmzxxuQUVBryDZD3LHlYNS3c0MUvvhZyFdpqg4zFLwpBAFUZ73GCZjYfwcSTcjOL0y0KRT0zFenF09DVyQoaELlrJk6MRPKi62IzWH")
                .accountName("emhQ0CqvNNBrhyRg9xxzNXJhnMZrEqyRqPCGzbSmOoYCMUQNjvF4AYLzd022rwQVNfYYCfZZWpAcyBWwWi1DgvTt4hTTZowFPycMflfcbIeOIKes05558vbabHcGuqU0Zpo5LBba7yo5q8iSiTBSZQPeDSY9S36TscHpgaN0j8ZeP1HDPDTHzzRIdW")
                .externalId("jKy82N74m");
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
