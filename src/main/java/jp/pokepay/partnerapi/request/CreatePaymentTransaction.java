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
        object.add("shop_id", context.serialize(this.shopId));
        object.add("customer_id", context.serialize(this.customerId));
        object.add("private_money_id", context.serialize(this.privateMoneyId));
        object.add("amount", context.serialize(this.amount));
        object.add("description", context.serialize(this.description));
        return object;
    }
}
