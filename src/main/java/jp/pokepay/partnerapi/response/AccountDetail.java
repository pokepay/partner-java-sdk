// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi.response;

public class AccountDetail extends Response {
    private String id;
    private String name;
    private Boolean isSuspended;
    private AccountStatus status;
    private Double balance;
    private Double moneyBalance;
    private Double pointBalance;
    private PrivateMoney privateMoney;
    private User user;
    private String externalId;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Boolean isSuspended() {
        return isSuspended;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getMoneyBalance() {
        return moneyBalance;
    }

    public Double getPointBalance() {
        return pointBalance;
    }

    public PrivateMoney getPrivateMoney() {
        return privateMoney;
    }

    public User getUser() {
        return user;
    }

    public String getExternalId() {
        return externalId;
    }
}

