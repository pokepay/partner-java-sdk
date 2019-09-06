package jp.pokepay.partnerapi.request;

import jp.pokepay.partnerapi.schema.Echo;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class CreateEcho extends Request {

    private String message;

    public CreateEcho(String message) {
        this.message = message;
    }

    @Override
    public Method method() {
        return Method.POST;
    }

    @Override
    public String path() {
        return "/echo";
    }

    @Override
    public Map<String, Object> parameters() {
        return new HashMap<String, Object>() {{
            put("message", message);
        }};
    }

    @Override
    public Type getResponseClass() {
        return Echo.class;
    }
}
