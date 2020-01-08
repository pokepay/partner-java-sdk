package jp.pokepay.partnerapi.request;

import jp.pokepay.partnerapi.response.*;
import jp.pokepay.partnerapi.parameter.*;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class GetUser extends Request {

    public GetUser() {
    }

    @Override
    public Method method() {
        return Method.GET;
    }

    @Override
    public String path() {
        return "/user";
    }

    @Override
    public Map<String, Object> parameters() {
        return new HashMap<String, Object>() {{
        }};
    }

    @Override
    public Type getResponseClass() {
        return AdminUserWithShopsAndPrivateMoneys.class;
    }
}
