// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.CreateTransferTransaction;
import jp.pokepay.partnerapi.request.Request;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreateTransferTransactionTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new CreateTransferTransaction(
            "a77b6581-23fa-4b1f-9104-52c40b0b0875",
            "af154061-0546-4ef6-b456-46f30e8cea03",
            "c429a9e1-84c4-44d5-8d23-d0e7ac255a21",
            3169
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
        Request request = new CreateTransferTransaction(
            "a77b6581-23fa-4b1f-9104-52c40b0b0875",
            "af154061-0546-4ef6-b456-46f30e8cea03",
            "c429a9e1-84c4-44d5-8d23-d0e7ac255a21",
            3169
        )
                .description("HPHLfj8VAxLQCn6DppPY7uZKs5wMf3MBYDCuFCMBOgtd28MFakoJp4sttlPyu0hLTf3LV1FvqM27O2bqybT3XFSWXNEvBDebROkI568yn3vAdg2WzE6cQfJbdKVhYmdIeaGtyZiVBFtaHsVEu5jHLt1IIKsQ450xUM6O5hfI4vi32RsgmtpDzruBR");
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
