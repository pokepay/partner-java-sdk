package jp.pokepay.partnerapi.response;

public class Account extends Response {
    private String id;
    private String name;
    private boolean isSuspended;
    private PrivateMoney privateMoney;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isSuspended() {
        return isSuspended;
    }

    public PrivateMoney getPrivateMoney() {
        return privateMoney;
    }
}
