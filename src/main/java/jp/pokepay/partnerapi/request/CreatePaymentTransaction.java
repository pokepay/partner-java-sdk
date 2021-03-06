// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi.request;

import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import jp.pokepay.partnerapi.response.*;
import java.lang.reflect.Type;

public class CreatePaymentTransaction extends Request {
    private String shopId;
    private String customerId;
    private String privateMoneyId;
    private Double amount;
    private String description;

    public CreatePaymentTransaction(String shopId, String customerId, String privateMoneyId, double amount) {
        this.shopId = shopId;
        this.customerId = customerId;
        this.privateMoneyId = privateMoneyId;
        this.amount = amount;
    }

    public CreatePaymentTransaction description(String description) {
        this.description = description;
        return this;
    }

    @Override
    public Method method() {
        return Method.POST;
    }

    @Override
    public String path() {
        return "/transactions" + "/payment";
    }

    @Override
    public Type getResponseClass() {
        return Transaction.class;
    }

    @Override
    public JsonObject getRequestBodyJsonObject(JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        if (shopId != null) { object.add("shop_id", context.serialize(this.shopId)); }
        if (customerId != null) { object.add("customer_id", context.serialize(this.customerId)); }
        if (privateMoneyId != null) { object.add("private_money_id", context.serialize(this.privateMoneyId)); }
        if (amount != null) { object.add("amount", context.serialize((int)this.amount.doubleValue())); }
        if (description != null) { object.add("description", context.serialize(this.description)); }
        return object;
    }
}
