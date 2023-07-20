// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi.response;

public class BulkTransactionJob extends Response {
    private Integer id;
    private BulkTransaction bulkTransaction;
    private String type;
    private String senderAccountId;
    private String receiverAccountId;
    private Double moneyAmount;
    private Double pointAmount;
    private String description;
    private String bearPointAccountId;
    private String pointExpiresAt;
    private String status;
    private String error;
    private Integer lineno;
    private String transactionId;
    private String createdAt;
    private String updatedAt;

    public Integer getId() {
        return id;
    }

    public BulkTransaction getBulkTransaction() {
        return bulkTransaction;
    }

    public String getType() {
        return type;
    }

    public String getSenderAccountId() {
        return senderAccountId;
    }

    public String getReceiverAccountId() {
        return receiverAccountId;
    }

    public Double getMoneyAmount() {
        return moneyAmount;
    }

    public Double getPointAmount() {
        return pointAmount;
    }

    public String getDescription() {
        return description;
    }

    public String getBearPointAccountId() {
        return bearPointAccountId;
    }

    public String getPointExpiresAt() {
        return pointExpiresAt;
    }

    public String getStatus() {
        return status;
    }

    public String getError() {
        return error;
    }

    public Integer getLineno() {
        return lineno;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
}
