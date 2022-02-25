// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi.request;

import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import jp.pokepay.partnerapi.response.*;
import java.lang.reflect.Type;

public class UpdateCampaign extends Request {
    private String name;
    private String startsAt;
    private String endsAt;
    private Integer priority;
    private String event;
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
    private String campaignId;

    public UpdateCampaign(String campaignId) {
        this.campaignId = campaignId;
    }

    public UpdateCampaign name(String name) {
        this.name = name;
        return this;
    }

    public UpdateCampaign startsAt(String startsAt) {
        this.startsAt = startsAt;
        return this;
    }

    public UpdateCampaign endsAt(String endsAt) {
        this.endsAt = endsAt;
        return this;
    }

    public UpdateCampaign priority(int priority) {
        this.priority = priority;
        return this;
    }

    public UpdateCampaign event(String event) {
        this.event = event;
        return this;
    }

    public UpdateCampaign description(String description) {
        this.description = description;
        return this;
    }

    public UpdateCampaign status(String status) {
        this.status = status;
        return this;
    }

    public UpdateCampaign pointExpiresAt(String pointExpiresAt) {
        this.pointExpiresAt = pointExpiresAt;
        return this;
    }

    public UpdateCampaign pointExpiresInDays(int pointExpiresInDays) {
        this.pointExpiresInDays = pointExpiresInDays;
        return this;
    }

    public UpdateCampaign setExclusive(boolean exclusive) {
        isExclusive = exclusive;
        return this;
    }

    public UpdateCampaign subject(String subject) {
        this.subject = subject;
        return this;
    }

    public UpdateCampaign amountBasedPointRules(Object[] amountBasedPointRules) {
        this.amountBasedPointRules = amountBasedPointRules;
        return this;
    }

    public UpdateCampaign productBasedPointRules(Object[] productBasedPointRules) {
        this.productBasedPointRules = productBasedPointRules;
        return this;
    }

    public UpdateCampaign applicableDaysOfWeek(int[] applicableDaysOfWeek) {
        this.applicableDaysOfWeek = applicableDaysOfWeek;
        return this;
    }

    public UpdateCampaign applicableTimeRanges(Object[] applicableTimeRanges) {
        this.applicableTimeRanges = applicableTimeRanges;
        return this;
    }

    public UpdateCampaign applicableShopIds(String[] applicableShopIds) {
        this.applicableShopIds = applicableShopIds;
        return this;
    }

    @Override
    public Method method() {
        return Method.PATCH;
    }

    @Override
    public String path() {
        return "/campaigns" + "/" + this.campaignId;
    }

    @Override
    public Type getResponseClass() {
        return Campaign.class;
    }

    @Override
    public JsonObject getRequestBodyJsonObject(JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        if (name != null) { object.add("name", context.serialize(this.name)); }
        if (startsAt != null) { object.add("starts_at", context.serialize(this.startsAt)); }
        if (endsAt != null) { object.add("ends_at", context.serialize(this.endsAt)); }
        if (priority != null) { object.add("priority", context.serialize(this.priority)); }
        if (event != null) { object.add("event", context.serialize(this.event)); }
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
        return object;
    }
}
