// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.UpdateCustomerAccount;
import jp.pokepay.partnerapi.request.Request;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UpdateCustomerAccountTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new UpdateCustomerAccount(
            "86e1558d-113e-4ea6-8a48-226ea0c2dcab"
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
        Request request = new UpdateCustomerAccount(
            "86e1558d-113e-4ea6-8a48-226ea0c2dcab"
        )
                .metadata("{\"key1\":\"foo\",\"key2\":\"bar\"}");
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
        Request request = new UpdateCustomerAccount(
            "86e1558d-113e-4ea6-8a48-226ea0c2dcab"
        )
                .externalId("hBw4No1YXyGaN9eZjSIQORsTn19Lt83IRfp6apsZzwHUgb2qq")
                .metadata("{\"key1\":\"foo\",\"key2\":\"bar\"}");
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
        Request request = new UpdateCustomerAccount(
            "86e1558d-113e-4ea6-8a48-226ea0c2dcab"
        )
                .accountName("rLtRpMZnFJMuPuuYDxHZdnikAchiJbVP3ZTnJxIJTqpbj9hQa29LtqbzIUCtrgI5GH6wQi2f3OojTDEk0fitYgKzfXu0N7ZPQ6Ey6Tu3BU56A0DovC2AWlgsj8AO1bqHH9NHpqZwH1tkpyNDcuWxfr4xKRRC5UPfd")
                .externalId("KJfLPJmxAhDpkltxfpGBgKzLBWMCYifXDXPCb")
                .metadata("{\"key1\":\"foo\",\"key2\":\"bar\"}");
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
        Request request = new UpdateCustomerAccount(
            "86e1558d-113e-4ea6-8a48-226ea0c2dcab"
        )
                .status("pre-closed")
                .accountName("nT3R8fCd8115VzfSNwUPij0JCeKaErwIngTct5VctC8ahSG576Yk267hNuqsd2aOEu5ugI0fc")
                .externalId("KmGRUw7sMhCFW8ODbHkZSUPXBsmObvnHUj")
                .metadata("{\"key1\":\"foo\",\"key2\":\"bar\"}");
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
