// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi.response;

public class Check extends Response {
    private String id;
    private Double amount;
    private Double moneyAmount;
    private Double pointAmount;
    private String description;
    private User user;
    private Boolean isOnetime;
    private Boolean isDisabled;
    private String expiresAt;
    private PrivateMoney privateMoney;
    private Integer usageLimit;
    private Double usageCount;
    private String token;

    public String getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public double getMoneyAmount() {
        return moneyAmount;
    }

    public double getPointAmount() {
        return pointAmount;
    }

    public String getDescription() {
        return description;
    }

    public User getUser() {
        return user;
    }

    public boolean isOnetime() {
        return isOnetime;
    }

    public boolean isDisabled() {
        return isDisabled;
    }

    public String getExpiresAt() {
        return expiresAt;
    }

    public PrivateMoney getPrivateMoney() {
        return privateMoney;
    }

    public int getUsageLimit() {
        return usageLimit;
    }

    public double getUsageCount() {
        return usageCount;
    }

    public String getToken() {
        return token;
    }
}

