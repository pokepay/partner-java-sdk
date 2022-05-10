// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi.request;

import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import jp.pokepay.partnerapi.response.*;
import java.lang.reflect.Type;

public class GetShopAccounts extends Request {
    private String privateMoneyId;
    private Integer page;
    private Integer perPage;
    private String createdAtFrom;
    private String createdAtTo;
    private Boolean isSuspended;

    public GetShopAccounts(String privateMoneyId) {
        this.privateMoneyId = privateMoneyId;
    }

    public GetShopAccounts page(Integer page) {
        this.page = page;
        return this;
    }

    public GetShopAccounts perPage(Integer perPage) {
        this.perPage = perPage;
        return this;
    }

    public GetShopAccounts createdAtFrom(String createdAtFrom) {
        this.createdAtFrom = createdAtFrom;
        return this;
    }

    public GetShopAccounts createdAtTo(String createdAtTo) {
        this.createdAtTo = createdAtTo;
        return this;
    }

    public GetShopAccounts setSuspended(Boolean suspended) {
        isSuspended = suspended;
        return this;
    }

    @Override
    public Method method() {
        return Method.GET;
    }

    @Override
    public String path() {
        return "/accounts" + "/shops";
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
        return object;
    }
}
