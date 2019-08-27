package jp.pokepay.partnerapi.response;

public class Echo extends Response {
    private String status;
    private String message;

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}
