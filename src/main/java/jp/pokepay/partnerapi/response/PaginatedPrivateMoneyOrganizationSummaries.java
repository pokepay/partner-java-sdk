package jp.pokepay.partnerapi.response;

public class PaginatedPrivateMoneyOrganizationSummaries extends Response {
    private PrivateMoneyOrganizationSummary[] rows;
    private Integer count;
    private Pagination pagination;

    public PrivateMoneyOrganizationSummary[] getRows() {
        return rows;
    }

    public PaginatedPrivateMoneyOrganizationSummaries rows(PrivateMoneyOrganizationSummary[] rows) {
        this.rows = rows;
        return this;
    }

    public int getCount() {
        return count;
    }

    public PaginatedPrivateMoneyOrganizationSummaries count(int count) {
        this.count = count;
        return this;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public PaginatedPrivateMoneyOrganizationSummaries pagination(Pagination pagination) {
        this.pagination = pagination;
        return this;
    }
}

