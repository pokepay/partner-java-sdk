package jp.pokepay.partnerapi.request;

import jp.pokepay.partnerapi.response.*;
import jp.pokepay.partnerapi.parameter.*;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class CreateCheck extends Request {
    private Double amount;
    private Double moneyAmount;
    private Double pointAmount;
    private String accountId;
    private String description;
    private Boolean isOnetime;
    private Integer usageLimit;
    private String expiresAt;

    public CreateCheck(String accountId) {
        this.accountId = accountId;
    }

    public CreateCheck amount(double amount) {
        this.amount = amount;
        return this;
    }

    public CreateCheck moneyAmount(double moneyAmount) {
        this.moneyAmount = moneyAmount;
        return this;
    }

    public CreateCheck pointAmount(double pointAmount) {
        this.pointAmount = pointAmount;
        return this;
    }

    public CreateCheck description(String description) {
        this.description = description;
        return this;
    }

    public CreateCheck setOnetime(boolean onetime) {
        isOnetime = onetime;
        return this;
    }

    public CreateCheck usageLimit(int usageLimit) {
        this.usageLimit = usageLimit;
        return this;
    }

    public CreateCheck expiresAt(String expiresAt) {
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
            if (amount != null) put("amount", amount);
            if (moneyAmount != null) put("money_amount", moneyAmount);
            if (pointAmount != null) put("point_amount", pointAmount);
            put("account_id", accountId);
            if (description != null) put("description", description);
            if (isOnetime != null) put("is_onetime", isOnetime);
            if (usageLimit != null) put("usage_limit", usageLimit);
            if (expiresAt != null) put("expires_at", expiresAt);
        }};
    }

    @Override
    public Type getResponseClass() {
        return Check.class;
    }
}
