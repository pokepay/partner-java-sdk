// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi.request;

import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import jp.pokepay.partnerapi.response.*;
import java.lang.reflect.Type;

public class GetCustomerAccounts extends Request {
    private String privateMoneyId;
    private Integer page;
    private Integer perPage;
    private String createdAtFrom;
    private String createdAtTo;
    private Boolean isSuspended;
    private String status;
    private String externalId;
    private String tel;
    private String email;

    public GetCustomerAccounts(String privateMoneyId) {
        this.privateMoneyId = privateMoneyId;
    }

    public GetCustomerAccounts page(Integer page) {
        this.page = page;
        return this;
    }

    public GetCustomerAccounts perPage(Integer perPage) {
        this.perPage = perPage;
        return this;
    }

    public GetCustomerAccounts createdAtFrom(String createdAtFrom) {
        this.createdAtFrom = createdAtFrom;
        return this;
    }

    public GetCustomerAccounts createdAtTo(String createdAtTo) {
        this.createdAtTo = createdAtTo;
        return this;
    }

    public GetCustomerAccounts setSuspended(Boolean suspended) {
        isSuspended = suspended;
        return this;
    }

    public GetCustomerAccounts status(String status) {
        this.status = status;
        return this;
    }

    public GetCustomerAccounts externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    public GetCustomerAccounts tel(String tel) {
        this.tel = tel;
        return this;
    }

    public GetCustomerAccounts email(String email) {
        this.email = email;
        return this;
    }

    @Override
    public Method method() {
        return Method.GET;
    }

    @Override
    public String path() {
        return "/accounts" + "/customers";
    }

    @Override
    public Type getResponseClass() {
        return PaginatedAccountWithUsers.class;
    }

    @Override
    public JsonObject getRequestBodyJsonObject(JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        if (privateMoneyId != null) { object.add("private_money_id", context.serialize(this.privateMoneyId)); }
        if (page != null) { object.add("page", context.serialize(this.page)); }
        if (perPage != null) { object.add("per_page", context.serialize(this.perPage)); }
        if (createdAtFrom != null) { object.add("created_at_from", context.serialize(this.createdAtFrom)); }
        if (createdAtTo != null) { object.add("created_at_to", context.serialize(this.createdAtTo)); }
        if (isSuspended != null) { object.add("is_suspended", context.serialize(this.isSuspended)); }
        if (status != null) { object.add("status", context.serialize(this.status)); }
        if (externalId != null) { object.add("external_id", context.serialize(this.externalId)); }
        if (tel != null) { object.add("tel", context.serialize(this.tel)); }
        if (email != null) { object.add("email", context.serialize(this.email)); }
        return object;
    }
}
