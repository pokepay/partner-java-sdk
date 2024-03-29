// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi.request;

import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import jp.pokepay.partnerapi.response.*;
import java.lang.reflect.Type;

public class CreateCustomerAccount extends Request {
    private String privateMoneyId;
    private String userName;
    private String accountName;
    private String externalId;

    public CreateCustomerAccount(String privateMoneyId) {
        this.privateMoneyId = privateMoneyId;
    }

    public CreateCustomerAccount userName(String userName) {
        this.userName = userName;
        return this;
    }

    public CreateCustomerAccount accountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    public CreateCustomerAccount externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    @Override
    public Method method() {
        return Method.POST;
    }

    @Override
    public String path() {
        return "/accounts" + "/customers";
    }

    @Override
    public Type getResponseClass() {
        return AccountWithUser.class;
    }

    @Override
    public JsonObject getRequestBodyJsonObject(JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        if (privateMoneyId != null) { object.add("private_money_id", context.serialize(this.privateMoneyId)); }
        if (userName != null) { object.add("user_name", context.serialize(this.userName)); }
        if (accountName != null) { object.add("account_name", context.serialize(this.accountName)); }
        if (externalId != null) { object.add("external_id", context.serialize(this.externalId)); }
        return object;
    }
}
