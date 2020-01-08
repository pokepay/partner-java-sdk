package jp.pokepay.partnerapi.request;

import jp.pokepay.partnerapi.response.*;
import jp.pokepay.partnerapi.parameter.*;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class GetPing extends Request {

    public GetPing() {
    }

    @Override
    public Method method() {
        return Method.GET;
    }

    @Override
    public String path() {
        return "/ping";
    }

    @Override
    public Map<String, Object> parameters() {
        return new HashMap<String, Object>() {{
        }};
    }

    @Override
    public Type getResponseClass() {
        return Pong.class;
    }
}
