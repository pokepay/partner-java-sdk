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

    public Check id(String id) {
        this.id = id;
        return this;
    }

    public double getAmount() {
        return amount;
    }

    public Check amount(double amount) {
        this.amount = amount;
        return this;
    }

    public double getMoneyAmount() {
        return moneyAmount;
    }

    public Check moneyAmount(double moneyAmount) {
        this.moneyAmount = moneyAmount;
        return this;
    }

    public double getPointAmount() {
        return pointAmount;
    }

    public Check pointAmount(double pointAmount) {
        this.pointAmount = pointAmount;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Check description(String description) {
        this.description = description;
        return this;
    }

    public User getUser() {
        return user;
    }

    public Check user(User user) {
        this.user = user;
        return this;
    }

    public boolean isOnetime() {
        return isOnetime;
    }

    public Check setOnetime(boolean onetime) {
        isOnetime = onetime;
        return this;
    }

    public boolean isDisabled() {
        return isDisabled;
    }

    public Check setDisabled(boolean disabled) {
        isDisabled = disabled;
        return this;
    }

    public String getExpiresAt() {
        return expiresAt;
    }

    public Check expiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    public PrivateMoney getPrivateMoney() {
        return privateMoney;
    }

    public Check privateMoney(PrivateMoney privateMoney) {
        this.privateMoney = privateMoney;
        return this;
    }

    public int getUsageLimit() {
        return usageLimit;
    }

    public Check usageLimit(int usageLimit) {
        this.usageLimit = usageLimit;
        return this;
    }

    public double getUsageCount() {
        return usageCount;
    }

    public Check usageCount(double usageCount) {
        this.usageCount = usageCount;
        return this;
    }

    public String getToken() {
        return token;
    }

    public Check token(String token) {
        this.token = token;
        return this;
    }
}

