// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi.request;

import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import jp.pokepay.partnerapi.response.*;
import java.lang.reflect.Type;

public class ListTransactionsV2 extends Request {
    private String privateMoneyId;
    private String organizationCode;
    private String shopId;
    private String terminalId;
    private String customerId;
    private String customerName;
    private String description;
    private String transactionId;
    private Boolean isModified;
    private String[] types;
    private String from;
    private String to;
    private String nextPageCursorId;
    private String prevPageCursorId;
    private Integer perPage;

    public ListTransactionsV2() {
    }

    public ListTransactionsV2 privateMoneyId(String privateMoneyId) {
        this.privateMoneyId = privateMoneyId;
        return this;
    }

    public ListTransactionsV2 organizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
        return this;
    }

    public ListTransactionsV2 shopId(String shopId) {
        this.shopId = shopId;
        return this;
    }

    public ListTransactionsV2 terminalId(String terminalId) {
        this.terminalId = terminalId;
        return this;
    }

    public ListTransactionsV2 customerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    public ListTransactionsV2 customerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public ListTransactionsV2 description(String description) {
        this.description = description;
        return this;
    }

    public ListTransactionsV2 transactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    public ListTransactionsV2 setModified(Boolean modified) {
        isModified = modified;
        return this;
    }

    public ListTransactionsV2 types(String[] types) {
        this.types = types;
        return this;
    }

    public ListTransactionsV2 from(String from) {
        this.from = from;
        return this;
    }

    public ListTransactionsV2 to(String to) {
        this.to = to;
        return this;
    }

    public ListTransactionsV2 nextPageCursorId(String nextPageCursorId) {
        this.nextPageCursorId = nextPageCursorId;
        return this;
    }

    public ListTransactionsV2 prevPageCursorId(String prevPageCursorId) {
        this.prevPageCursorId = prevPageCursorId;
        return this;
    }

    public ListTransactionsV2 perPage(Integer perPage) {
        this.perPage = perPage;
        return this;
    }

    @Override
    public Method method() {
        return Method.GET;
    }

    @Override
    public String path() {
        return "/transactions-v2";
    }

    @Override
    public Type getResponseClass() {
        return PaginatedTransactionV2.class;
    }

    @Override
    public JsonObject getRequestBodyJsonObject(JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        if (privateMoneyId != null) { object.add("private_money_id", context.serialize(this.privateMoneyId)); }
        if (organizationCode != null) { object.add("organization_code", context.serialize(this.organizationCode)); }
        if (shopId != null) { object.add("shop_id", context.serialize(this.shopId)); }
        if (terminalId != null) { object.add("terminal_id", context.serialize(this.terminalId)); }
        if (customerId != null) { object.add("customer_id", context.serialize(this.customerId)); }
        if (customerName != null) { object.add("customer_name", context.serialize(this.customerName)); }
        if (description != null) { object.add("description", context.serialize(this.description)); }
        if (transactionId != null) { object.add("transaction_id", context.serialize(this.transactionId)); }
        if (isModified != null) { object.add("is_modified", context.serialize(this.isModified)); }
        if (types != null) { object.add("types", context.serialize(this.types)); }
        if (from != null) { object.add("from", context.serialize(this.from)); }
        if (to != null) { object.add("to", context.serialize(this.to)); }
        if (nextPageCursorId != null) { object.add("next_page_cursor_id", context.serialize(this.nextPageCursorId)); }
        if (prevPageCursorId != null) { object.add("prev_page_cursor_id", context.serialize(this.prevPageCursorId)); }
        if (perPage != null) { object.add("per_page", context.serialize(this.perPage)); }
        return object;
    }
}