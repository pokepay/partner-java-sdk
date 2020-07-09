// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi.request;

import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import jp.pokepay.partnerapi.response.*;
import java.lang.reflect.Type;

public class ListAccountBalances extends Request {
    private Integer page;
    private Integer perPage;
    private String accountId;

    public ListAccountBalances(String accountId) {
        this.accountId = accountId;
    }

    public ListAccountBalances page(int page) {
        this.page = page;
        return this;
    }

    public ListAccountBalances perPage(int perPage) {
        this.perPage = perPage;
        return this;
    }

    @Override
    public Method method() {
        return Method.GET;
    }

    @Override
    public String path() {
        return "/accounts" + "/" + this.accountId + "/balances";
    }

    @Override
    public Type getResponseClass() {
        return PaginatedAccountBalance.class;
    }

    @Override
    public JsonObject getRequestBodyJsonObject(JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        if (page != null) { object.add("page", context.serialize(this.page)); }
        if (perPage != null) { object.add("per_page", context.serialize(this.perPage)); }
        return object;
    }
}
