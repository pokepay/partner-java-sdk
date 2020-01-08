package jp.pokepay.partnerapi.request;

import jp.pokepay.partnerapi.response.*;
import jp.pokepay.partnerapi.parameter.*;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

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
    public Map<String, Object> parameters() {
        return new HashMap<String, Object>() {{
            if (from != null) put("from", from);
            if (to != null) put("to", to);
            if (page != null) put("page", page);
            if (perPage != null) put("per_page", perPage);
            if (shopId != null) put("shop_id", shopId);
            if (customerId != null) put("customer_id", customerId);
            if (customerName != null) put("customer_name", customerName);
            if (terminalId != null) put("terminal_id", terminalId);
            if (transactionId != null) put("transaction_id", transactionId);
            if (organizationCode != null) put("organization_code", organizationCode);
            if (privateMoneyId != null) put("private_money_id", privateMoneyId);
            if (isModified != null) put("is_modified", isModified);
            if (types != null) put("types", types);
        }};
    }

    @Override
    public Type getResponseClass() {
        return PaginatedTransaction.class;
    }
}
