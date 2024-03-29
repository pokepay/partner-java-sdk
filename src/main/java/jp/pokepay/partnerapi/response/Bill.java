// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi.response;

public class Bill extends Response {
    private String id;
    private Double amount;
    private Double maxAmount;
    private Double minAmount;
    private String description;
    private AccountWithUser account;
    private Boolean isDisabled;
    private String token;

    public String getId() {
        return id;
    }

    public Double getAmount() {
        return amount;
    }

    public Double getMaxAmount() {
        return maxAmount;
    }

    public Double getMinAmount() {
        return minAmount;
    }

    public String getDescription() {
        return description;
    }

    public AccountWithUser getAccount() {
        return account;
    }

    public Boolean isDisabled() {
        return isDisabled;
    }

    public String getToken() {
        return token;
    }
}

