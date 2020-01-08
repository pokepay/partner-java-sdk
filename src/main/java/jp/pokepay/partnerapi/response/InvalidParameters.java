package jp.pokepay.partnerapi.response;

public class InvalidParameters extends Response {
    private String type;
    private String message;
    private Object errors;

    public String getType() {
        return type;
    }

    public InvalidParameters type(String type) {
        this.type = type;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public InvalidParameters message(String message) {
        this.message = message;
        return this;
    }

    public Object getErrors() {
        return errors;
    }

    public InvalidParameters errors(Object errors) {
        this.errors = errors;
        return this;
    }
}

