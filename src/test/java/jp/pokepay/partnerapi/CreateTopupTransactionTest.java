// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.CreateTopupTransaction;
import jp.pokepay.partnerapi.request.Request;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreateTopupTransactionTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new CreateTopupTransaction(
            "53478468-2d95-4b82-8d08-d76e6eebd35e",
            "4afe1341-ef13-4a47-8290-22813b7a97f2",
            "2eecb44c-f502-4784-b305-43cb03ea285c"
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
        Request request = new CreateTopupTransaction(
            "53478468-2d95-4b82-8d08-d76e6eebd35e",
            "4afe1341-ef13-4a47-8290-22813b7a97f2",
            "2eecb44c-f502-4784-b305-43cb03ea285c"
        )
                .requestId("429c6fe5-ef89-4282-b02b-ddfe1275ae74");
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
        Request request = new CreateTopupTransaction(
            "53478468-2d95-4b82-8d08-d76e6eebd35e",
            "4afe1341-ef13-4a47-8290-22813b7a97f2",
            "2eecb44c-f502-4784-b305-43cb03ea285c"
        )
                .metadata("{\"key\":\"value\"}")
                .requestId("8af39680-feaf-420d-a0f2-2c2e14c0e8a5");
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
        Request request = new CreateTopupTransaction(
            "53478468-2d95-4b82-8d08-d76e6eebd35e",
            "4afe1341-ef13-4a47-8290-22813b7a97f2",
            "2eecb44c-f502-4784-b305-43cb03ea285c"
        )
                .description("eugpuZPDhn3kvKQdinTisU7JGahMN0pspm5VBpWaMfH3OlTb5uoxVylmhf3ESdF0EHZGgpE19g89rUgV81h6fR4XXAReVSL8MjPf2nDJncUb7prKqWXHoSFTkZLdy8B9WWqNrXVXI1wRTqwqzVsahBGWwps3iARDJ")
                .metadata("{\"key\":\"value\"}")
                .requestId("fe90b3e0-32d4-4487-9c2b-117ca7255c52");
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
        Request request = new CreateTopupTransaction(
            "53478468-2d95-4b82-8d08-d76e6eebd35e",
            "4afe1341-ef13-4a47-8290-22813b7a97f2",
            "2eecb44c-f502-4784-b305-43cb03ea285c"
        )
                .pointExpiresAt("2022-06-19T20:12:18.000000+09:00")
                .description("kOOEQFC19Wtss23YjQBhHozeYJjV02y90GWowMI3ASCsApxBJptaJJRDQ6YTYkiFEIISprQ3cmpI6bh8YrVsWGSghDCw1Un7nnaTSFczRArCskatgTSAk3a8TcT02JvhzyAvEGRwH1gqt79bzapcrIrLur4lrAgRY4qmYCDpX8Ny")
                .metadata("{\"key\":\"value\"}")
                .requestId("48686e22-a65c-44fb-b745-53f82b8b8db4");
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
        Request request = new CreateTopupTransaction(
            "53478468-2d95-4b82-8d08-d76e6eebd35e",
            "4afe1341-ef13-4a47-8290-22813b7a97f2",
            "2eecb44c-f502-4784-b305-43cb03ea285c"
        )
                .pointAmount(3194)
                .pointExpiresAt("2022-01-08T20:21:56.000000+09:00")
                .description("YmVuuwRZjnfSOf90ILh1FnEv5pCv1ztILSktq1cNxb1w0fAXCRcSE6z5QHSLVITcWyXkWwNeThLpKI1N6RIMY7t0u9TuR54ZsbCHGDImjW34z4jE8W9hhkpYWE")
                .metadata("{\"key\":\"value\"}")
                .requestId("b9294b3c-f17a-425a-8cee-fc350a53ed85");
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
        Request request = new CreateTopupTransaction(
            "53478468-2d95-4b82-8d08-d76e6eebd35e",
            "4afe1341-ef13-4a47-8290-22813b7a97f2",
            "2eecb44c-f502-4784-b305-43cb03ea285c"
        )
                .moneyAmount(757)
                .pointAmount(1273)
                .pointExpiresAt("2024-03-01T06:03:27.000000+09:00")
                .description("fkqdGOYba42tK1ETZVrimXQx2toEzw7Z1gM6fgx4uEjyIUvTVKqmlOa23scUcryj4GBWTbDzAVeKXVTyNRuvNAUp6ljdawfubjQ03lDRu1dH")
                .metadata("{\"key\":\"value\"}")
                .requestId("63c8b779-e79a-47f0-ad3a-0bc500dbce04");
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
        Request request = new CreateTopupTransaction(
            "53478468-2d95-4b82-8d08-d76e6eebd35e",
            "4afe1341-ef13-4a47-8290-22813b7a97f2",
            "2eecb44c-f502-4784-b305-43cb03ea285c"
        )
                .bearPointShopId("f6d09b75-4626-4814-b470-027148922b52")
                .moneyAmount(9180)
                .pointAmount(5611)
                .pointExpiresAt("2021-11-07T01:05:23.000000+09:00")
                .description("yywxfAsvQQw8eNXwtPfKAW4UwDxtqXzHNdytk1inQrWiktMK0FHLyLnvzTdFf0Y1JODoBhEEJFs7RURiJHf6mnglg")
                .metadata("{\"key\":\"value\"}")
                .requestId("04570ccb-6f41-49b3-a474-2d1ddec96bb5");
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
