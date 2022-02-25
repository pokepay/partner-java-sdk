// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi.response;

public class AccountWithUser extends Response {
    private String id;
    private String name;
    private Boolean isSuspended;
    private AccountStatus status;
    private PrivateMoney privateMoney;
    private User user;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isSuspended() {
        return isSuspended;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public PrivateMoney getPrivateMoney() {
        return privateMoney;
    }

    public User getUser() {
        return user;
    }
}

