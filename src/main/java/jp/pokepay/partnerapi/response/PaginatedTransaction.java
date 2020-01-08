package jp.pokepay.partnerapi.response;

public class PaginatedTransaction extends Response {
    private Transaction[] rows;
    private Integer count;
    private Pagination pagination;

    public Transaction[] getRows() {
        return rows;
    }

    public PaginatedTransaction rows(Transaction[] rows) {
        this.rows = rows;
        return this;
    }

    public int getCount() {
        return count;
    }

    public PaginatedTransaction count(int count) {
        this.count = count;
        return this;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public PaginatedTransaction pagination(Pagination pagination) {
        this.pagination = pagination;
        return this;
    }
}

