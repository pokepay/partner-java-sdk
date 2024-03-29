// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi.request;

import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import jp.pokepay.partnerapi.response.*;
import java.lang.reflect.Type;

public class CreateShopV2 extends Request {
    private String name;
    private String postalCode;
    private String address;
    private String tel;
    private String email;
    private String externalId;
    private String organizationCode;
    private String[] privateMoneyIds;
    private String[] canTopupPrivateMoneyIds;

    public CreateShopV2(String name) {
        this.name = name;
    }

    public CreateShopV2 postalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    public CreateShopV2 address(String address) {
        this.address = address;
        return this;
    }

    public CreateShopV2 tel(String tel) {
        this.tel = tel;
        return this;
    }

    public CreateShopV2 email(String email) {
        this.email = email;
        return this;
    }

    public CreateShopV2 externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    public CreateShopV2 organizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
        return this;
    }

    public CreateShopV2 privateMoneyIds(String[] privateMoneyIds) {
        this.privateMoneyIds = privateMoneyIds;
        return this;
    }

    public CreateShopV2 canTopupPrivateMoneyIds(String[] canTopupPrivateMoneyIds) {
        this.canTopupPrivateMoneyIds = canTopupPrivateMoneyIds;
        return this;
    }

    @Override
    public Method method() {
        return Method.POST;
    }

    @Override
    public String path() {
        return "/shops-v2";
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
        if (organizationCode != null) { object.add("organization_code", context.serialize(this.organizationCode)); }
        if (privateMoneyIds != null) { object.add("private_money_ids", context.serialize(this.privateMoneyIds)); }
        if (canTopupPrivateMoneyIds != null) { object.add("can_topup_private_money_ids", context.serialize(this.canTopupPrivateMoneyIds)); }
        return object;
    }
}
