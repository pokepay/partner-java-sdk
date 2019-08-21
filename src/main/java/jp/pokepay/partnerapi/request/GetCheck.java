package jp.pokepay.partnerapi.request;

import jp.pokepay.partnerapi.response.Check;

import java.lang.reflect.Type;
import java.util.Map;

public class GetCheck extends Request {
    private String id;

    public GetCheck(String id) {
        this.id = id;
    }

    @Override
    public Method method() {
        return Method.GET;
    }

    @Override
    public String path() {
        return "/checks/" + this.id;
    }

    @Override
    public Map<String, Object> parameters() {
        return null;
    }

    @Override
    public Type getResponseClass() {
        return Check.class;
    }
}
