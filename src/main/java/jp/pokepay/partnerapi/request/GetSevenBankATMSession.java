// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi.request;

import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import jp.pokepay.partnerapi.response.*;
import java.lang.reflect.Type;

public class GetSevenBankAtmSession extends Request {
    private String qrInfo;

    public GetSevenBankAtmSession(String qrInfo) {
        this.qrInfo = qrInfo;
    }

    @Override
    public Method method() {
        return Method.GET;
    }

    @Override
    public String path() {
        return "/seven-bank-atm-sessions" + "/" + this.qrInfo;
    }

    @Override
    public Type getResponseClass() {
        return SevenBankAtmSession.class;
    }

    @Override
    public JsonObject getRequestBodyJsonObject(JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        return object;
    }
}