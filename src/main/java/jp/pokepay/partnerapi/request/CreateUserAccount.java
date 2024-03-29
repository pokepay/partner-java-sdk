// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi.request;

import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import jp.pokepay.partnerapi.response.*;
import java.lang.reflect.Type;

public class CreateUserAccount extends Request {
    private String privateMoneyId;
    private String name;
    private String externalId;
    private String metadata;
    private String userId;

    public CreateUserAccount(String userId, String privateMoneyId) {
        this.userId = userId;
        this.privateMoneyId = privateMoneyId;
    }

    public CreateUserAccount name(String name) {
        this.name = name;
        return this;
    }

    public CreateUserAccount externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    public CreateUserAccount metadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    @Override
    public Method method() {
        return Method.POST;
    }

    @Override
    public String path() {
        return "/users" + "/" + this.userId + "/accounts";
    }

    @Override
    public Type getResponseClass() {
        return AccountDetail.class;
    }

    @Override
    public JsonObject getRequestBodyJsonObject(JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        if (privateMoneyId != null) { object.add("private_money_id", context.serialize(this.privateMoneyId)); }
        if (name != null) { object.add("name", context.serialize(this.name)); }
        if (externalId != null) { object.add("external_id", context.serialize(this.externalId)); }
        if (metadata != null) { object.add("metadata", context.serialize(this.metadata)); }
        return object;
    }
}
