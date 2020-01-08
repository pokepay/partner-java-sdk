package jp.pokepay.partnerapi.request;

import jp.pokepay.partnerapi.response.*;
import jp.pokepay.partnerapi.parameter.*;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class CreateCpmTransaction extends Request {
    private String cpmToken;
    private Integer amount;
    private String shopId;
    private Product[] products;

    public CreateCpmTransaction(String cpmToken, int amount, String shopId) {
        this.cpmToken = cpmToken;
        this.amount = amount;
        this.shopId = shopId;
    }

    public CreateCpmTransaction products(Product[] products) {
        this.products = products;
        return this;
    }

    @Override
    public Method method() {
        return Method.POST;
    }

    @Override
    public String path() {
        return "/transactions" + "/cpm";
    }

    @Override
    public Map<String, Object> parameters() {
        return new HashMap<String, Object>() {{
            put("cpm_token", cpmToken);
            put("amount", amount);
            put("shop_id", shopId);
            if (products != null) put("products", products);
        }};
    }

    @Override
    public Type getResponseClass() {
        return Transaction.class;
    }
}
