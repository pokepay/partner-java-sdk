package jp.pokepay.partnerapi.response;

public class OrganizationSummary extends Response {
    private Integer count;
    private Double moneyAmount;
    private Integer moneyCount;
    private Double pointAmount;
    private Integer pointCount;

    public int getCount() {
        return count;
    }

    public OrganizationSummary count(int count) {
        this.count = count;
        return this;
    }

    public double getMoneyAmount() {
        return moneyAmount;
    }

    public OrganizationSummary moneyAmount(double moneyAmount) {
        this.moneyAmount = moneyAmount;
        return this;
    }

    public int getMoneyCount() {
        return moneyCount;
    }

    public OrganizationSummary moneyCount(int moneyCount) {
        this.moneyCount = moneyCount;
        return this;
    }

    public double getPointAmount() {
        return pointAmount;
    }

    public OrganizationSummary pointAmount(double pointAmount) {
        this.pointAmount = pointAmount;
        return this;
    }

    public int getPointCount() {
        return pointCount;
    }

    public OrganizationSummary pointCount(int pointCount) {
        this.pointCount = pointCount;
        return this;
    }
}

