package jp.pokepay.partnerapi.request;

import jp.pokepay.partnerapi.response.Transaction;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class CreateTransaction extends Request {
    String privateMoneyId;
    String shopId;
    String customerId;
    Integer moneyAmount;
    Integer pointAmount;
    String description;

    public CreateTransaction(String privateMoneyId, String shopId, String customerId) {
        this.privateMoneyId = privateMoneyId;
        this.shopId = shopId;
        this.customerId = customerId;
    }

    public CreateTransaction setMoneyAmount(int moneyAmount) {
        this.moneyAmount = moneyAmount;
        return this;
    }

    public CreateTransaction setPointAmount(int pointAmount) {
        this.pointAmount = pointAmount;
        return this;
    }

    public CreateTransaction setDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public Method method() {
        return Method.POST;
    }

    @Override
    public String path() {
        return "/transactions";
    }

    @Override
    public Map<String, Object> parameters() {
        return new HashMap<String, Object>() {{
            put("private_money_id", privateMoneyId);
            put("shop_id", shopId);
            put("customer_id", customerId);
            if (moneyAmount != null) {
                put("money_amount", moneyAmount);
            }
            if (pointAmount != null) {
                put("point_amount", pointAmount);
            }
            if (description != null) {
                put("description", description);
            }
        }};
    }

    @Override
    public Type getResponseClass() {
        return Transaction.class;
    }
}
