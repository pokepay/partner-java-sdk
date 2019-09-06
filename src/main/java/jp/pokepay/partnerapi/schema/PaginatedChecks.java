package jp.pokepay.partnerapi.schema;

public class PaginatedChecks extends Schema {
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
