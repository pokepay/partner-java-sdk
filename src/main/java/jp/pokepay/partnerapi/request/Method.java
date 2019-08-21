package jp.pokepay.partnerapi.request;

public enum Method {
    GET("GET"),
    POST("POST"),
    PUT("PUT"),
    DELETE("DELETE"),
    PATCH("PATCH");

    private final String name;

    private Method(String s) {
        name = s;
    }

    public String toString() {
        return name;
    }
}
