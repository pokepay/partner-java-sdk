// DO NOT EDIT: File is generated by code generator.

package jp.pokepay.partnerapi.request.serializer;

import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import jp.pokepay.partnerapi.request.GetPrivateMoneys;

import java.lang.reflect.Type;

public class GetPrivateMoneysSerializer implements JsonSerializer<GetPrivateMoneys> {
    @Override
    public JsonElement serialize(GetPrivateMoneys src, Type typeOfSrc, JsonSerializationContext context) {
        return src.getRequestBodyJsonObject(context);
    }
}