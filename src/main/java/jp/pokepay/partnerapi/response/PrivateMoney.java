// DO NOT EDIT: File is generated by code generator.
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
    private Double moneyTopupTransferLimit;
    private String type;
    private String expirationType;
    private Boolean enableTopupByMember;
    private String displayMoneyAndPoint;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }

    public Boolean isExclusive() {
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

    public Double getMaxBalance() {
        return maxBalance;
    }

    public Double getTransferLimit() {
        return transferLimit;
    }

    public Double getMoneyTopupTransferLimit() {
        return moneyTopupTransferLimit;
    }

    public String getType() {
        return type;
    }

    public String getExpirationType() {
        return expirationType;
    }

    public Boolean getEnableTopupByMember() {
        return enableTopupByMember;
    }

    public String getDisplayMoneyAndPoint() {
        return displayMoneyAndPoint;
    }
}

