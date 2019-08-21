package jp.pokepay.partnerapi.response;

public class Transaction extends Response {
    private String id;
    private String type;
    private boolean isModified;
    private User sender;
    private Account senderAccount;
    private User receiver;
    private Account receiverAccount;
    private int amount;
    private int moneyAmount;
    private int pointAmount;
    private String doneAt;

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public boolean isModified() {
        return isModified;
    }

    public User getSender() {
        return sender;
    }

    public Account getSenderAccount() {
        return senderAccount;
    }

    public User getReceiver() {
        return receiver;
    }

    public Account getReceiverAccount() {
        return receiverAccount;
    }

    public int getAmount() {
        return amount;
    }

    public int getMoneyAmount() {
        return moneyAmount;
    }

    public int getPointAmount() {
        return pointAmount;
    }

    public String getDoneAt() {
        return doneAt;
    }

    public String getDescription() {
        return description;
    }

    private String description;
}
