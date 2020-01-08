package jp.pokepay.partnerapi.response;

public class PrivateMoneyOrganizationSummary extends Response {
    private String organizationCode;
    private OrganizationSummary topup;
    private OrganizationSummary payment;

    public String getOrganizationCode() {
        return organizationCode;
    }

    public PrivateMoneyOrganizationSummary organizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
        return this;
    }

    public OrganizationSummary getTopup() {
        return topup;
    }

    public PrivateMoneyOrganizationSummary topup(OrganizationSummary topup) {
        this.topup = topup;
        return this;
    }

    public OrganizationSummary getPayment() {
        return payment;
    }

    public PrivateMoneyOrganizationSummary payment(OrganizationSummary payment) {
        this.payment = payment;
        return this;
    }
}

