// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi.request;

import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import jp.pokepay.partnerapi.response.*;
import java.lang.reflect.Type;

public class CreateTopupTransactionWithCheck extends Request {
    private String checkId;
    private String customerId;

    public CreateTopupTransactionWithCheck(String checkId, String customerId) {
        this.checkId = checkId;
        this.customerId = customerId;
    }

    @Override
    public Method method() {
        return Method.POST;
    }

    @Override
    public String path() {
        return "/transactions" + "/topup" + "/check";
    }

    @Override
    public Type getResponseClass() {
        return Transaction.class;
    }

    @Override
    public JsonObject getRequestBodyJsonObject(JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        if (checkId != null) { object.add("check_id", context.serialize(this.checkId)); }
        if (customerId != null) { object.add("customer_id", context.serialize(this.customerId)); }
        return object;
    }
}
