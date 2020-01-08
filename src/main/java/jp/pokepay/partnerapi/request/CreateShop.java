package jp.pokepay.partnerapi.request;

import jp.pokepay.partnerapi.response.*;
import jp.pokepay.partnerapi.parameter.*;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class CreateShop extends Request {
    private String shopName;
    private String shopPostalCode;
    private String shopAddress;
    private String shopTel;
    private String shopEmail;
    private String shopExternalId;
    private String organizationCode;

    public CreateShop(String shopName) {
        this.shopName = shopName;
    }

    public CreateShop shopPostalCode(String shopPostalCode) {
        this.shopPostalCode = shopPostalCode;
        return this;
    }

    public CreateShop shopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
        return this;
    }

    public CreateShop shopTel(String shopTel) {
        this.shopTel = shopTel;
        return this;
    }

    public CreateShop shopEmail(String shopEmail) {
        this.shopEmail = shopEmail;
        return this;
    }

    public CreateShop shopExternalId(String shopExternalId) {
        this.shopExternalId = shopExternalId;
        return this;
    }

    public CreateShop organizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
        return this;
    }

    @Override
    public Method method() {
        return Method.POST;
    }

    @Override
    public String path() {
        return "/shops";
    }

    @Override
    public Map<String, Object> parameters() {
        return new HashMap<String, Object>() {{
            put("shop_name", shopName);
            if (shopPostalCode != null) put("shop_postal_code", shopPostalCode);
            if (shopAddress != null) put("shop_address", shopAddress);
            if (shopTel != null) put("shop_tel", shopTel);
            if (shopEmail != null) put("shop_email", shopEmail);
            if (shopExternalId != null) put("shop_external_id", shopExternalId);
            if (organizationCode != null) put("organization_code", organizationCode);
        }};
    }

    @Override
    public Type getResponseClass() {
        return User.class;
    }
}