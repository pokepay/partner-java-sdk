// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi.request;

import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import jp.pokepay.partnerapi.response.*;
import java.lang.reflect.Type;

public class CreateExternalTransaction extends Request {
    private String shopId;
    private String customerId;
    private String privateMoneyId;
    private Integer amount;
    private String description;
    private String metadata;
    private Object[] products;
    private String requestId;

    public CreateExternalTransaction(String shopId, String customerId, String privateMoneyId, int amount) {
        this.shopId = shopId;
        this.customerId = customerId;
        this.privateMoneyId = privateMoneyId;
        this.amount = amount;
    }

    public CreateExternalTransaction description(String description) {
        this.description = description;
        return this;
    }

    public CreateExternalTransaction metadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    public CreateExternalTransaction products(Object[] products) {
        this.products = products;
        return this;
    }

    public CreateExternalTransaction requestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    @Override
    public Method method() {
        return Method.POST;
    }

    @Override
    public String path() {
        return "/external-transactions";
    }

    @Override
    public Type getResponseClass() {
        return ExternalTransaction.class;
    }

    @Override
    public JsonObject getRequestBodyJsonObject(JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        if (shopId != null) { object.add("shop_id", context.serialize(this.shopId)); }
        if (customerId != null) { object.add("customer_id", context.serialize(this.customerId)); }
        if (privateMoneyId != null) { object.add("private_money_id", context.serialize(this.privateMoneyId)); }
        if (amount != null) { object.add("amount", context.serialize(this.amount)); }
        if (description != null) { object.add("description", context.serialize(this.description)); }
        if (metadata != null) { object.add("metadata", context.serialize(this.metadata)); }
        if (products != null) { object.add("products", context.serialize(this.products)); }
        if (requestId != null) { object.add("request_id", context.serialize(this.requestId)); }
        return object;
    }
}