package jp.pokepay.partnerapi;

public class ConnectionError extends Exception {

    ConnectionError(Exception ex) {
        super(ex.toString());
    }
}
