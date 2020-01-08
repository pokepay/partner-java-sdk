package jp.pokepay.partnerapi.response;

public class Echo extends Response {
    private String status;
    private String message;

    public String getStatus() {
        return status;
    }

    public Echo status(String status) {
        this.status = status;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public Echo message(String message) {
        this.message = message;
        return this;
    }
}

