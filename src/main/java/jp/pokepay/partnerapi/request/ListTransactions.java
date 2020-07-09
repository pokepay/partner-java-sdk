// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi.request;

import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import jp.pokepay.partnerapi.response.*;
import java.lang.reflect.Type;

public class ListTransactions extends Request {
    private String from;
    private String to;
    private Integer page;
    private Integer perPage;
    private String shopId;
    private String customerId;
    private String customerName;
    private String terminalId;
    private String transactionId;
    private String organizationCode;
    private String privateMoneyId;
    private Boolean isModified;
    private String[] types;

    public ListTransactions() {
    }

    public ListTransactions from(String from) {
        this.from = from;
        return this;
    }

    public ListTransactions to(String to) {
        this.to = to;
        return this;
    }

    public ListTransactions page(int page) {
        this.page = page;
        return this;
    }

    public ListTransactions perPage(int perPage) {
        this.perPage = perPage;
        return this;
    }

    public ListTransactions shopId(String shopId) {
        this.shopId = shopId;
        return this;
    }

    public ListTransactions customerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    public ListTransactions customerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public ListTransactions terminalId(String terminalId) {
        this.terminalId = terminalId;
        return this;
    }

    public ListTransactions transactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    public ListTransactions organizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
        return this;
    }

    public ListTransactions privateMoneyId(String privateMoneyId) {
        this.privateMoneyId = privateMoneyId;
        return this;
    }

    public ListTransactions setModified(boolean modified) {
        isModified = modified;
        return this;
    }

    public ListTransactions types(String[] types) {
        this.types = types;
        return this;
    }

    @Override
    public Method method() {
        return Method.GET;
    }

    @Override
    public String path() {
        return "/transactions";
    }

    @Override
    public Type getResponseClass() {
        return PaginatedTransaction.class;
    }

    @Override
    public JsonObject getRequestBodyJsonObject(JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        object.add("from", context.serialize(this.from));
        object.add("to", context.serialize(this.to));
        object.add("page", context.serialize(this.page));
        object.add("per_page", context.serialize(this.perPage));
        object.add("shop_id", context.serialize(this.shopId));
        object.add("customer_id", context.serialize(this.customerId));
        object.add("customer_name", context.serialize(this.customerName));
        object.add("terminal_id", context.serialize(this.terminalId));
        object.add("transaction_id", context.serialize(this.transactionId));
        object.add("organization_code", context.serialize(this.organizationCode));
        object.add("private_money_id", context.serialize(this.privateMoneyId));
        object.add("is_modified", context.serialize(this.isModified));
        object.add("types", context.serialize(this.types));
        return object;
    }
}
