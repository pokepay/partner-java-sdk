package jp.pokepay.partnerapi.response;

public class Transaction extends Response {
    private String id;
    private String type;
    private Boolean isModified;
    private User sender;
    private Account senderAccount;
    private User receiver;
    private Account receiverAccount;
    private Integer amount;
    private Integer moneyAmount;
    private Integer pointAmount;
    private String doneAt;
    private String description;

    public String getId() {
        return id;
    }

    public Transaction id(String id) {
        this.id = id;
        return this;
    }

    public String getType() {
        return type;
    }

    public Transaction type(String type) {
        this.type = type;
        return this;
    }

    public boolean isModified() {
        return isModified;
    }

    public Transaction setModified(boolean modified) {
        isModified = modified;
        return this;
    }

    public User getSender() {
        return sender;
    }

    public Transaction sender(User sender) {
        this.sender = sender;
        return this;
    }

    public Account getSenderAccount() {
        return senderAccount;
    }

    public Transaction senderAccount(Account senderAccount) {
        this.senderAccount = senderAccount;
        return this;
    }

    public User getReceiver() {
        return receiver;
    }

    public Transaction receiver(User receiver) {
        this.receiver = receiver;
        return this;
    }

    public Account getReceiverAccount() {
        return receiverAccount;
    }

    public Transaction receiverAccount(Account receiverAccount) {
        this.receiverAccount = receiverAccount;
        return this;
    }

    public int getAmount() {
        return amount;
    }

    public Transaction amount(int amount) {
        this.amount = amount;
        return this;
    }

    public int getMoneyAmount() {
        return moneyAmount;
    }

    public Transaction moneyAmount(int moneyAmount) {
        this.moneyAmount = moneyAmount;
        return this;
    }

    public int getPointAmount() {
        return pointAmount;
    }

    public Transaction pointAmount(int pointAmount) {
        this.pointAmount = pointAmount;
        return this;
    }

    public String getDoneAt() {
        return doneAt;
    }

    public Transaction doneAt(String doneAt) {
        this.doneAt = doneAt;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Transaction description(String description) {
        this.description = description;
        return this;
    }
}

