// DO NOT EDIT: File is generated by code generator.

package jp.pokepay.partnerapi.request.serializer;

import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import jp.pokepay.partnerapi.request.ListTransfersV2;

import java.lang.reflect.Type;

public class ListTransfersV2Serializer implements JsonSerializer<ListTransfersV2> {
    @Override
    public JsonElement serialize(ListTransfersV2 src, Type typeOfSrc, JsonSerializationContext context) {
        return src.getRequestBodyJsonObject(context);
    }
}