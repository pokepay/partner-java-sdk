package jp.pokepay.partnerapi;

public class SSLInitializeError extends Exception {
    SSLInitializeError(String msg) {
        super(msg);
    }

    SSLInitializeError(Exception ex) {
        super(ex.getMessage());
    }
}
