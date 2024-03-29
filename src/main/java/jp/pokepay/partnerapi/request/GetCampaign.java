// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi.request;

import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import jp.pokepay.partnerapi.response.*;
import java.lang.reflect.Type;

public class GetCampaign extends Request {
    private String campaignId;

    public GetCampaign(String campaignId) {
        this.campaignId = campaignId;
    }

    @Override
    public Method method() {
        return Method.GET;
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
        return object;
    }
}
