package jp.pokepay.partnerapi.response;

public class Account extends Response {
    private String id;
    private String name;
    private Boolean isSuspended;
    private PrivateMoney privateMoney;

    public String getId() {
        return id;
    }

    public Account id(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Account name(String name) {
        this.name = name;
        return this;
    }

    public boolean isSuspended() {
        return isSuspended;
    }

    public Account setSuspended(boolean suspended) {
        isSuspended = suspended;
        return this;
    }

    public PrivateMoney getPrivateMoney() {
        return privateMoney;
    }

    public Account privateMoney(PrivateMoney privateMoney) {
        this.privateMoney = privateMoney;
        return this;
    }
}

