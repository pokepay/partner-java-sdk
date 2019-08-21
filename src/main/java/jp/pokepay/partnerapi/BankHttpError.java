package jp.pokepay.partnerapi;

public class BankHttpError extends Exception {
    private String type;
    private String message;

    public BankHttpError(String type, String message) {
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
