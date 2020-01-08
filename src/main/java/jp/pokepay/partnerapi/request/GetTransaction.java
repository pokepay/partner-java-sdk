package jp.pokepay.partnerapi.request;

import jp.pokepay.partnerapi.response.*;
import jp.pokepay.partnerapi.parameter.*;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class GetTransaction extends Request {
    private String transactionId;

    public GetTransaction(String transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public Method method() {
        return Method.GET;
    }

    @Override
    public String path() {
        return "/transactions" + "/" + this.transactionId;
    }

    @Override
    public Map<String, Object> parameters() {
        return new HashMap<String, Object>() {{
        }};
    }

    @Override
    public Type getResponseClass() {
        return Transaction.class;
    }
}