// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi.response;

public class Transfer extends Response {
    private String id;
    private AccountWithoutPrivateMoneyDetail senderAccount;
    private AccountWithoutPrivateMoneyDetail receiverAccount;
    private Double amount;
    private Double moneyAmount;
    private Double pointAmount;
    private String doneAt;
    private String type;
    private String description;
    private String transactionId;

    public String getId() {
        return id;
    }

    public AccountWithoutPrivateMoneyDetail getSenderAccount() {
        return senderAccount;
    }

    public AccountWithoutPrivateMoneyDetail getReceiverAccount() {
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

    public String getDoneAt() {
        return doneAt;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public String getTransactionId() {
        return transactionId;
    }
}

