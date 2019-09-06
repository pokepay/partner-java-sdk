package jp.pokepay.partnerapi.schema;

public class User extends Schema {
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
