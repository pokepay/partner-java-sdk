package jp.pokepay.partnerapi.response;

public class PrivateMoney extends Response {
    private String id;
    private String name;
    private String unit;
    private Boolean isExclusive;
    private String description;
    private String onelineMessage;
    private Organization organization;
    private Double maxBalance;
    private Double transferLimit;
    private String type;
    private String expirationType;

    public String getId() {
        return id;
    }

    public PrivateMoney id(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public PrivateMoney name(String name) {
        this.name = name;
        return this;
    }

    public String getUnit() {
        return unit;
    }

    public PrivateMoney unit(String unit) {
        this.unit = unit;
        return this;
    }

    public boolean isExclusive() {
        return isExclusive;
    }

    public PrivateMoney setExclusive(boolean exclusive) {
        isExclusive = exclusive;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public PrivateMoney description(String description) {
        this.description = description;
        return this;
    }

    public String getOnelineMessage() {
        return onelineMessage;
    }

    public PrivateMoney onelineMessage(String onelineMessage) {
        this.onelineMessage = onelineMessage;
        return this;
    }

    public Organization getOrganization() {
        return organization;
    }

    public PrivateMoney organization(Organization organization) {
        this.organization = organization;
        return this;
    }

    public double getMaxBalance() {
        return maxBalance;
    }

    public PrivateMoney maxBalance(double maxBalance) {
        this.maxBalance = maxBalance;
        return this;
    }

    public double getTransferLimit() {
        return transferLimit;
    }

    public PrivateMoney transferLimit(double transferLimit) {
        this.transferLimit = transferLimit;
        return this;
    }

    public String getType() {
        return type;
    }

    public PrivateMoney type(String type) {
        this.type = type;
        return this;
    }

    public String getExpirationType() {
        return expirationType;
    }

    public PrivateMoney expirationType(String expirationType) {
        this.expirationType = expirationType;
        return this;
    }
}

