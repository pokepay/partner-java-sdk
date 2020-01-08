package jp.pokepay.partnerapi.response;

public class Pong extends Response {
    private String ok;

    public String getOk() {
        return ok;
    }

    public Pong ok(String ok) {
        this.ok = ok;
        return this;
    }
}

