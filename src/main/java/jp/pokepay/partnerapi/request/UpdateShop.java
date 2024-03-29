// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi.request;

import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import jp.pokepay.partnerapi.response.*;
import java.lang.reflect.Type;

public class UpdateShop extends Request {
    private String name;
    private String postalCode;
    private String address;
    private String tel;
    private String email;
    private String externalId;
    private String[] privateMoneyIds;
    private String[] canTopupPrivateMoneyIds;
    private String status;
    private String shopId;

    public UpdateShop(String shopId) {
        this.shopId = shopId;
    }

    public UpdateShop name(String name) {
        this.name = name;
        return this;
    }

    public UpdateShop postalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    public UpdateShop address(String address) {
        this.address = address;
        return this;
    }

    public UpdateShop tel(String tel) {
        this.tel = tel;
        return this;
    }

    public UpdateShop email(String email) {
        this.email = email;
        return this;
    }

    public UpdateShop externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    public UpdateShop privateMoneyIds(String[] privateMoneyIds) {
        this.privateMoneyIds = privateMoneyIds;
        return this;
    }

    public UpdateShop canTopupPrivateMoneyIds(String[] canTopupPrivateMoneyIds) {
        this.canTopupPrivateMoneyIds = canTopupPrivateMoneyIds;
        return this;
    }

    public UpdateShop status(String status) {
        this.status = status;
        return this;
    }

    @Override
    public Method method() {
        return Method.PATCH;
    }

    @Override
    public String path() {
        return "/shops" + "/" + this.shopId;
    }

    @Override
    public Type getResponseClass() {
        return ShopWithAccounts.class;
    }

    @Override
    public JsonObject getRequestBodyJsonObject(JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        if (name != null) { object.add("name", context.serialize(this.name)); }
        if (postalCode != null) { object.add("postal_code", context.serialize(this.postalCode)); }
        if (address != null) { object.add("address", context.serialize(this.address)); }
        if (tel != null) { object.add("tel", context.serialize(this.tel)); }
        if (email != null) { object.add("email", context.serialize(this.email)); }
        if (externalId != null) { object.add("external_id", context.serialize(this.externalId)); }
        if (privateMoneyIds != null) { object.add("private_money_ids", context.serialize(this.privateMoneyIds)); }
        if (canTopupPrivateMoneyIds != null) { object.add("can_topup_private_money_ids", context.serialize(this.canTopupPrivateMoneyIds)); }
        if (status != null) { object.add("status", context.serialize(this.status)); }
        return object;
    }
}
