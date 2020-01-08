package jp.pokepay.partnerapi.response;

public class User extends Response {
    private String id;
    private String name;
    private Boolean isMerchant;

    public String getId() {
        return id;
    }

    public User id(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public User name(String name) {
        this.name = name;
        return this;
    }

    public boolean isMerchant() {
        return isMerchant;
    }

    public User setMerchant(boolean merchant) {
        isMerchant = merchant;
        return this;
    }
}

