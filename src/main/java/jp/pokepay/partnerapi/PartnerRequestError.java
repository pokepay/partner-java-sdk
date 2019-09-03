package jp.pokepay.partnerapi;

public class PartnerRequestError extends Exception {
    private String type;
    private String message;
    private String rawJson;

    public PartnerRequestError(String type, String message, String rawJson) {
        this.type = type;
        this.message = message;
        this.rawJson = rawJson;
    }

    public String getType() {
        return type;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public String getRawJson() {
        return rawJson;
    }
}
