// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi.request;

import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import jp.pokepay.partnerapi.response.*;
import java.lang.reflect.Type;

public class CreateTransferTransaction extends Request {
    private String senderId;
    private String receiverId;
    private String privateMoneyId;
    private Double amount;
    private String description;

    public CreateTransferTransaction(String senderId, String receiverId, String privateMoneyId, double amount) {
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.privateMoneyId = privateMoneyId;
        this.amount = amount;
    }

    public CreateTransferTransaction description(String description) {
        this.description = description;
        return this;
    }

    @Override
    public Method method() {
        return Method.POST;
    }

    @Override
    public String path() {
        return "/transactions" + "/transfer";
    }

    @Override
    public Type getResponseClass() {
        return Transaction.class;
    }

    @Override
    public JsonObject getRequestBodyJsonObject(JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        if (senderId != null) { object.add("sender_id", context.serialize(this.senderId)); }
        if (receiverId != null) { object.add("receiver_id", context.serialize(this.receiverId)); }
        if (privateMoneyId != null) { object.add("private_money_id", context.serialize(this.privateMoneyId)); }
        if (amount != null) { object.add("amount", context.serialize((int)this.amount.doubleValue())); }
        if (description != null) { object.add("description", context.serialize(this.description)); }
        return object;
    }
}
