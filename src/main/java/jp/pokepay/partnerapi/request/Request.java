package jp.pokepay.partnerapi.request;

import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

import java.lang.reflect.Type;

public abstract class Request {
    public abstract Method method();
    public abstract String path();
    public abstract Type getResponseClass();
    public abstract JsonObject getRequestBodyJsonObject(JsonSerializationContext context);
}
