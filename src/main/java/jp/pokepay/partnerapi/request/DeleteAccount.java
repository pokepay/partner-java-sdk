// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi.request;

import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import jp.pokepay.partnerapi.response.*;
import java.lang.reflect.Type;

public class DeleteAccount extends Request {
    private Boolean cashback;
    private String accountId;

    public DeleteAccount(String accountId) {
        this.accountId = accountId;
    }

    public DeleteAccount cashback(boolean cashback) {
        this.cashback = cashback;
        return this;
    }

    @Override
    public Method method() {
        return Method.DELETE;
    }

    @Override
    public String path() {
        return "/accounts" + "/" + this.accountId;
    }

    @Override
    public Type getResponseClass() {
        return AccountDeleted.class;
    }

    @Override
    public JsonObject getRequestBodyJsonObject(JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        if (cashback != null) { object.add("cashback", context.serialize(this.cashback)); }
        return object;
    }
}
