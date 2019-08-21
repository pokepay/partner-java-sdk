package jp.pokepay.partnerapi.response;

public class Check extends Response {
    private String id;
    private int amount;
    private int pointAmount;
    private int moneyAmount;
    private String description;
    private User user;
    private PrivateMoney privateMoney;
    private boolean isOnetime;
    private boolean isDisabled;
    private int usageLimit;
    private int usageCount;
    private int expiresAt;
    private String token;

    public String getId() {
        return id;
    }

    public int getAmount() {
        return amount;
    }

    public int getPointAmount() {
        return pointAmount;
    }

    public int getMoneyAmount() {
        return moneyAmount;
    }

    public String getDescription() {
        return description;
    }

    public User getUser() {
        return user;
    }

    public PrivateMoney getPrivateMoney() {
        return privateMoney;
    }

    public boolean isOnetime() {
        return isOnetime;
    }

    public boolean isDisabled() {
        return isDisabled;
    }

    public int getUsageLimit() {
        return usageLimit;
    }

    public int getUsageCount() {
        return usageCount;
    }

    public int getExpiresAt() {
        return expiresAt;
    }

    public String getToken() {
        return token;
    }
}
