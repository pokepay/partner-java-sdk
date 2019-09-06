package jp.pokepay.partnerapi.schema;

public class PrivateMoney extends Schema {
    private String id;
    private String name;
    private String unit;
    private boolean isExclusive;
    private String description;
    private String onelineMessage;
    private Organization organization;
    private int maxBalance;
    private int transferLimit;
    private String type;
    private String expirationType;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }

    public boolean isExclusive() {
        return isExclusive;
    }

    public String getDescription() {
        return description;
    }

    public String getOnelineMessage() {
        return onelineMessage;
    }

    public Organization getOrganization() {
        return organization;
    }

    public int getMaxBalance() {
        return maxBalance;
    }

    public int getTransferLimit() {
        return transferLimit;
    }

    public String getType() {
        return type;
    }

    public String getExpirationType() {
        return expirationType;
    }
}
