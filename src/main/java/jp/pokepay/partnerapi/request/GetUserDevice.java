// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi.request;

import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import jp.pokepay.partnerapi.response.*;
import java.lang.reflect.Type;

public class GetUserDevice extends Request {
    private String userDeviceId;

    public GetUserDevice(String userDeviceId) {
        this.userDeviceId = userDeviceId;
    }

    @Override
    public Method method() {
        return Method.GET;
    }

    @Override
    public String path() {
        return "/user-devices" + "/" + this.userDeviceId;
    }

    @Override
    public Type getResponseClass() {
        return UserDevice.class;
    }

    @Override
    public JsonObject getRequestBodyJsonObject(JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        return object;
    }
}
