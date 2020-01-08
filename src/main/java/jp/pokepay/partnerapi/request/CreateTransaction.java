package jp.pokepay.partnerapi.request;

import jp.pokepay.partnerapi.response.*;
import jp.pokepay.partnerapi.parameter.*;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class CreateTransaction extends Request {
    private String shopId;
    private String customerId;
    private String privateMoneyId;
    private Integer moneyAmount;
    private Integer pointAmount;
    private String description;

    public CreateTransaction(String shopId, String customerId, String privateMoneyId) {
        this.shopId = shopId;
        this.customerId = customerId;
        this.privateMoneyId = privateMoneyId;
    }

    public CreateTransaction moneyAmount(int moneyAmount) {
        this.moneyAmount = moneyAmount;
        return this;
    }

    public CreateTransaction pointAmount(int pointAmount) {
        this.pointAmount = pointAmount;
        return this;
    }

    public CreateTransaction description(String description) {
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
            put("shop_id", shopId);
            put("customer_id", customerId);
            put("private_money_id", privateMoneyId);
            if (moneyAmount != null) put("money_amount", moneyAmount);
            if (pointAmount != null) put("point_amount", pointAmount);
            if (description != null) put("description", description);
        }};
    }

    @Override
    public Type getResponseClass() {
        return Transaction.class;
    }
}
