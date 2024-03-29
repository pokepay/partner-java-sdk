// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi.response;

public class TransactionDetail extends Response {
    private String id;
    private String type;
    private Boolean isModified;
    private User sender;
    private Account senderAccount;
    private User receiver;
    private Account receiverAccount;
    private Double amount;
    private Double moneyAmount;
    private Double pointAmount;
    private Double rawPointAmount;
    private Double campaignPointAmount;
    private String doneAt;
    private String description;
    private Transfer[] transfers;

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public Boolean isModified() {
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

    public Double getAmount() {
        return amount;
    }

    public Double getMoneyAmount() {
        return moneyAmount;
    }

    public Double getPointAmount() {
        return pointAmount;
    }

    public Double getRawPointAmount() {
        return rawPointAmount;
    }

    public Double getCampaignPointAmount() {
        return campaignPointAmount;
    }

    public String getDoneAt() {
        return doneAt;
    }

    public String getDescription() {
        return description;
    }

    public Transfer[] getTransfers() {
        return transfers;
    }
}

