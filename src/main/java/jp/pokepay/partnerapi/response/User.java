package jp.pokepay.partnerapi.response;

public class User extends Response {
    private String id;
    private String name;
    private boolean isMerchant;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isMerchant() {
        return isMerchant;
    }
}
