// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi.request;

import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import jp.pokepay.partnerapi.response.*;
import java.lang.reflect.Type;

public class CreateTransactionWithCashtray extends Request {
    private String cashtrayId;
    private String customerId;
    private String strategy;
    private String requestId;

    public CreateTransactionWithCashtray(String cashtrayId, String customerId) {
        this.cashtrayId = cashtrayId;
        this.customerId = customerId;
    }

    public CreateTransactionWithCashtray strategy(String strategy) {
        this.strategy = strategy;
        return this;
    }

    public CreateTransactionWithCashtray requestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    @Override
    public Method method() {
        return Method.POST;
    }

    @Override
    public String path() {
        return "/transactions" + "/cashtray";
    }

    @Override
    public Type getResponseClass() {
        return TransactionDetail.class;
    }

    @Override
    public JsonObject getRequestBodyJsonObject(JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        if (cashtrayId != null) { object.add("cashtray_id", context.serialize(this.cashtrayId)); }
        if (customerId != null) { object.add("customer_id", context.serialize(this.customerId)); }
        if (strategy != null) { object.add("strategy", context.serialize(this.strategy)); }
        if (requestId != null) { object.add("request_id", context.serialize(this.requestId)); }
        return object;
    }
}
