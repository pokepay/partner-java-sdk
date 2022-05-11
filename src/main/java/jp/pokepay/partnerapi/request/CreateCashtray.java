// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi.request;

import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import jp.pokepay.partnerapi.response.*;
import java.lang.reflect.Type;

public class CreateCashtray extends Request {
    private String privateMoneyId;
    private String shopId;
    private Double amount;
    private String description;
    private Integer expiresIn;

    public CreateCashtray(String privateMoneyId, String shopId, double amount) {
        this.privateMoneyId = privateMoneyId;
        this.shopId = shopId;
        this.amount = amount;
    }

    public CreateCashtray description(String description) {
        this.description = description;
        return this;
    }

    public CreateCashtray expiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }

    @Override
    public Method method() {
        return Method.POST;
    }

    @Override
    public String path() {
        return "/cashtrays";
    }

    @Override
    public Type getResponseClass() {
        return Cashtray.class;
    }

    @Override
    public JsonObject getRequestBodyJsonObject(JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        if (privateMoneyId != null) { object.add("private_money_id", context.serialize(this.privateMoneyId)); }
        if (shopId != null) { object.add("shop_id", context.serialize(this.shopId)); }
        if (amount != null) { object.add("amount", context.serialize((int)this.amount.doubleValue())); }
        if (description != null) { object.add("description", context.serialize(this.description)); }
        if (expiresIn != null) { object.add("expires_in", context.serialize(this.expiresIn)); }
        return object;
    }
}
