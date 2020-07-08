package jp.pokepay.partnerapi.request;

import java.lang.reflect.Type;

public abstract class Request {
    public abstract Method method();
    public abstract String path();
    public abstract Type getResponseClass();
}
