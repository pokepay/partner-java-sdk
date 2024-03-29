// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi.request;

import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import jp.pokepay.partnerapi.response.*;
import java.lang.reflect.Type;

public class GetPrivateMoneySummary extends Request {
    private String from;
    private String to;
    private String privateMoneyId;

    public GetPrivateMoneySummary(String privateMoneyId) {
        this.privateMoneyId = privateMoneyId;
    }

    public GetPrivateMoneySummary from(String from) {
        this.from = from;
        return this;
    }

    public GetPrivateMoneySummary to(String to) {
        this.to = to;
        return this;
    }

    @Override
    public Method method() {
        return Method.GET;
    }

    @Override
    public String path() {
        return "/private-moneys" + "/" + this.privateMoneyId + "/summary";
    }

    @Override
    public Type getResponseClass() {
        return PrivateMoneySummary.class;
    }

    @Override
    public JsonObject getRequestBodyJsonObject(JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        if (from != null) { object.add("from", context.serialize(this.from)); }
        if (to != null) { object.add("to", context.serialize(this.to)); }
        return object;
    }
}
