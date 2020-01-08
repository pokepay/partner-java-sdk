package jp.pokepay.partnerapi.response;

public class Pagination extends Response {
    private Integer current;
    private Integer perPage;
    private Integer maxPage;
    private Boolean hasPrev;
    private Boolean hasNext;

    public int getCurrent() {
        return current;
    }

    public Pagination current(int current) {
        this.current = current;
        return this;
    }

    public int getPerPage() {
        return perPage;
    }

    public Pagination perPage(int perPage) {
        this.perPage = perPage;
        return this;
    }

    public int getMaxPage() {
        return maxPage;
    }

    public Pagination maxPage(int maxPage) {
        this.maxPage = maxPage;
        return this;
    }

    public boolean getHasPrev() {
        return hasPrev;
    }

    public Pagination hasPrev(boolean hasPrev) {
        this.hasPrev = hasPrev;
        return this;
    }

    public boolean getHasNext() {
        return hasNext;
    }

    public Pagination hasNext(boolean hasNext) {
        this.hasNext = hasNext;
        return this;
    }
}

