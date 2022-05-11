// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi.request;

import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import jp.pokepay.partnerapi.response.*;
import java.lang.reflect.Type;

public class CreateCampaign extends Request {
    private String name;
    private String privateMoneyId;
    private String startsAt;
    private String endsAt;
    private Integer priority;
    private String event;
    private String bearPointShopId;
    private String description;
    private String status;
    private String pointExpiresAt;
    private Integer pointExpiresInDays;
    private Boolean isExclusive;
    private String subject;
    private Object[] amountBasedPointRules;
    private Object[] productBasedPointRules;
    private Integer[] applicableDaysOfWeek;
    private Object[] applicableTimeRanges;
    private String[] applicableShopIds;
    private Integer minimumNumberForCombinationPurchase;
    private String destPrivateMoneyId;

    public CreateCampaign(String name, String privateMoneyId, String startsAt, String endsAt, int priority, String event) {
        this.name = name;
        this.privateMoneyId = privateMoneyId;
        this.startsAt = startsAt;
        this.endsAt = endsAt;
        this.priority = priority;
        this.event = event;
    }

    public CreateCampaign bearPointShopId(String bearPointShopId) {
        this.bearPointShopId = bearPointShopId;
        return this;
    }

    public CreateCampaign description(String description) {
        this.description = description;
        return this;
    }

    public CreateCampaign status(String status) {
        this.status = status;
        return this;
    }

    public CreateCampaign pointExpiresAt(String pointExpiresAt) {
        this.pointExpiresAt = pointExpiresAt;
        return this;
    }

    public CreateCampaign pointExpiresInDays(Integer pointExpiresInDays) {
        this.pointExpiresInDays = pointExpiresInDays;
        return this;
    }

    public CreateCampaign setExclusive(Boolean exclusive) {
        isExclusive = exclusive;
        return this;
    }

    public CreateCampaign subject(String subject) {
        this.subject = subject;
        return this;
    }

    public CreateCampaign amountBasedPointRules(Object[] amountBasedPointRules) {
        this.amountBasedPointRules = amountBasedPointRules;
        return this;
    }

    public CreateCampaign productBasedPointRules(Object[] productBasedPointRules) {
        this.productBasedPointRules = productBasedPointRules;
        return this;
    }

    public CreateCampaign applicableDaysOfWeek(Integer[] applicableDaysOfWeek) {
        this.applicableDaysOfWeek = applicableDaysOfWeek;
        return this;
    }

    public CreateCampaign applicableTimeRanges(Object[] applicableTimeRanges) {
        this.applicableTimeRanges = applicableTimeRanges;
        return this;
    }

    public CreateCampaign applicableShopIds(String[] applicableShopIds) {
        this.applicableShopIds = applicableShopIds;
        return this;
    }

    public CreateCampaign minimumNumberForCombinationPurchase(Integer minimumNumberForCombinationPurchase) {
        this.minimumNumberForCombinationPurchase = minimumNumberForCombinationPurchase;
        return this;
    }

    public CreateCampaign destPrivateMoneyId(String destPrivateMoneyId) {
        this.destPrivateMoneyId = destPrivateMoneyId;
        return this;
    }

    @Override
    public Method method() {
        return Method.POST;
    }

    @Override
    public String path() {
        return "/campaigns";
    }

    @Override
    public Type getResponseClass() {
        return Campaign.class;
    }

    @Override
    public JsonObject getRequestBodyJsonObject(JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        if (name != null) { object.add("name", context.serialize(this.name)); }
        if (privateMoneyId != null) { object.add("private_money_id", context.serialize(this.privateMoneyId)); }
        if (startsAt != null) { object.add("starts_at", context.serialize(this.startsAt)); }
        if (endsAt != null) { object.add("ends_at", context.serialize(this.endsAt)); }
        if (priority != null) { object.add("priority", context.serialize(this.priority)); }
        if (event != null) { object.add("event", context.serialize(this.event)); }
        if (bearPointShopId != null) { object.add("bear_point_shop_id", context.serialize(this.bearPointShopId)); }
        if (description != null) { object.add("description", context.serialize(this.description)); }
        if (status != null) { object.add("status", context.serialize(this.status)); }
        if (pointExpiresAt != null) { object.add("point_expires_at", context.serialize(this.pointExpiresAt)); }
        if (pointExpiresInDays != null) { object.add("point_expires_in_days", context.serialize(this.pointExpiresInDays)); }
        if (isExclusive != null) { object.add("is_exclusive", context.serialize(this.isExclusive)); }
        if (subject != null) { object.add("subject", context.serialize(this.subject)); }
        if (amountBasedPointRules != null) { object.add("amount_based_point_rules", context.serialize(this.amountBasedPointRules)); }
        if (productBasedPointRules != null) { object.add("product_based_point_rules", context.serialize(this.productBasedPointRules)); }
        if (applicableDaysOfWeek != null) { object.add("applicable_days_of_week", context.serialize(this.applicableDaysOfWeek)); }
        if (applicableTimeRanges != null) { object.add("applicable_time_ranges", context.serialize(this.applicableTimeRanges)); }
        if (applicableShopIds != null) { object.add("applicable_shop_ids", context.serialize(this.applicableShopIds)); }
        if (minimumNumberForCombinationPurchase != null) { object.add("minimum_number_for_combination_purchase", context.serialize(this.minimumNumberForCombinationPurchase)); }
        if (destPrivateMoneyId != null) { object.add("dest_private_money_id", context.serialize(this.destPrivateMoneyId)); }
        return object;
    }
}
