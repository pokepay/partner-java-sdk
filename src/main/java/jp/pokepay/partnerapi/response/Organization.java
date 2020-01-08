package jp.pokepay.partnerapi.response;

public class Organization extends Response {
    private String code;
    private String name;

    public String getCode() {
        return code;
    }

    public Organization code(String code) {
        this.code = code;
        return this;
    }

    public String getName() {
        return name;
    }

    public Organization name(String name) {
        this.name = name;
        return this;
    }
}

