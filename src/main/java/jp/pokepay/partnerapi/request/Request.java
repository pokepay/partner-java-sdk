package jp.pokepay.partnerapi.request;

import java.lang.reflect.Type;
import java.util.Map;

public abstract class Request {
    public abstract Method method();
    public abstract String path();
    public abstract Map<String, Object> parameters();
    public abstract Type getResponseClass();
}
