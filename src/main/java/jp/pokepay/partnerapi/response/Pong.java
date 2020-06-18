package jp.pokepay.partnerapi.response;

public class Pong extends Response {
    private String pong;

    public String getPong() {
        return pong;
    }

    public Pong ok(String ok) {
        this.pong = pong;
        return this;
    }
}
