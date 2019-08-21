package jp.pokepay.partnerapi.response;

public class PaginatedChecks extends Response {
    private Check[] rows;
    private int count;
    private Pagination pagination;

    public Check[] getRows() {
        return rows;
    }

    public int getCount() {
        return count;
    }

    public Pagination getPagination() {
        return pagination;
    }
}
