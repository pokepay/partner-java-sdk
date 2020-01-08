package jp.pokepay.partnerapi.response;

public class UserTransaction extends Response {
    private String id;
    private User user;
    private Double balance;
    private Double amount;
    private Double moneyAmount;
    private Double pointAmount;
    private Account account;
    private String description;
    private String doneAt;
    private String type;
    private Boolean isModified;

    public String getId() {
        return id;
    }

    public UserTransaction id(String id) {
        this.id = id;
        return this;
    }

    public User getUser() {
        return user;
    }

    public UserTransaction user(User user) {
        this.user = user;
        return this;
    }

    public double getBalance() {
        return balance;
    }

    public UserTransaction balance(double balance) {
        this.balance = balance;
        return this;
    }

    public double getAmount() {
        return amount;
    }

    public UserTransaction amount(double amount) {
        this.amount = amount;
        return this;
    }

    public double getMoneyAmount() {
        return moneyAmount;
    }

    public UserTransaction moneyAmount(double moneyAmount) {
        this.moneyAmount = moneyAmount;
        return this;
    }

    public double getPointAmount() {
        return pointAmount;
    }

    public UserTransaction pointAmount(double pointAmount) {
        this.pointAmount = pointAmount;
        return this;
    }

    public Account getAccount() {
        return account;
    }

    public UserTransaction account(Account account) {
        this.account = account;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UserTransaction description(String description) {
        this.description = description;
        return this;
    }

    public String getDoneAt() {
        return doneAt;
    }

    public UserTransaction doneAt(String doneAt) {
        this.doneAt = doneAt;
        return this;
    }

    public String getType() {
        return type;
    }

    public UserTransaction type(String type) {
        this.type = type;
        return this;
    }

    public boolean isModified() {
        return isModified;
    }

    public UserTransaction setModified(boolean modified) {
        isModified = modified;
        return this;
    }
}

