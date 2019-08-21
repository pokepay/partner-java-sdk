package jp.pokepay.partnerapi;

public class ProcessingError extends Exception {
    public ProcessingError(String msg) {
        super(msg);
    }

    public ProcessingError(Exception ex) {
        super(ex.getMessage());
    }
}
