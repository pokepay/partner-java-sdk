package jp.pokepay.partnerapi.response;

public class Pagination {
    private int current;
    private int perPage;
    private int maxPage;
    private boolean hasPrev;
    private boolean hasNext;

    public int getCurrent() {
        return current;
    }

    public int getPerPage() {
        return perPage;
    }

    public int getMaxPage() {
        return maxPage;
    }

    public boolean isHasPrev() {
        return hasPrev;
    }

    public boolean isHasNext() {
        return hasNext;
    }
}
