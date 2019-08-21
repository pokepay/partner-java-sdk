package jp.pokepay.partnerapi.request;

import jp.pokepay.partnerapi.response.Check;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class CreateCheck extends Request {
    private Integer amount;
    private Integer moneyAmount;
    private Integer pointAmount;
    private String accountId;
    private String description;
    private Boolean isOnetime;
    private Integer usageLimit;
    private Integer expiresAt;

    public CreateCheck(String accountId) {
        this.accountId = accountId;
    }

    public CreateCheck setAmount(int amount) {
        this.amount = amount;
        return this;
    }

    public CreateCheck setMoneyAmount(int moneyAmount) {
        this.moneyAmount = moneyAmount;
        return this;
    }

    public CreateCheck setPointAmount(int pointAmount) {
        this.pointAmount = pointAmount;
        return this;
    }

    public CreateCheck setDescription(String description) {
        this.description = description;
        return this;
    }

    public CreateCheck setOnetime(boolean onetime) {
        isOnetime = onetime;
        return this;
    }

    public CreateCheck setUsageLimit(int usageLimit) {
        this.usageLimit = usageLimit;
        return this;
    }

    public CreateCheck setExpiresAt(int expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    @Override
    public Method method() {
        return Method.POST;
    }

    @Override
    public String path() {
        return "/checks";
    }

    @Override
    public Map<String, Object> parameters() {
        return new HashMap<String, Object>() {{
            put("account_id", accountId);
            if (amount != null) {
                put("amount", amount);
            }
            if (moneyAmount != null) {
                put("money_amount", moneyAmount);
            }
            if (pointAmount != null) {
                put("point_amount", pointAmount);
            }
            if (description != null) {
                put("description", description);
            }
            if (isOnetime != null) {
                put("is_onetime", isOnetime);
            }
            if (usageLimit != null) {
                put("usage_limit", usageLimit);
            }
            if (expiresAt != null) {
                put("expires_at", expiresAt);
            }
        }};
    }

    @Override
    public Type getResponseClass() {
        return Check.class;
    }
}
