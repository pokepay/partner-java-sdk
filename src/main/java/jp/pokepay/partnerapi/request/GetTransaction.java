// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi.request;

import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import jp.pokepay.partnerapi.response.*;
import java.lang.reflect.Type;

public class GetTransaction extends Request {
    private String transactionId;

    public GetTransaction(String transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public Method method() {
        return Method.GET;
    }

    @Override
    public String path() {
        return "/transactions" + "/" + this.transactionId;
    }

    @Override
    public Type getResponseClass() {
        return TransactionDetail.class;
    }

    @Override
    public JsonObject getRequestBodyJsonObject(JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        return object;
    }
}
