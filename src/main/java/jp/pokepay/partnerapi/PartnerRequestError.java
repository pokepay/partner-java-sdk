package jp.pokepay.partnerapi;

public class PartnerRequestError extends Exception {
    private String type;
    private String message;

    public PartnerRequestError(String type, String message) {
        this.type = type;
        this.message = message;
    }

    public String getType() {
        return type;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
