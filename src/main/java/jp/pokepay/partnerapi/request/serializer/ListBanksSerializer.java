// DO NOT EDIT: File is generated by code generator.

package jp.pokepay.partnerapi.request.serializer;

import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import jp.pokepay.partnerapi.request.ListBanks;

import java.lang.reflect.Type;

public class ListBanksSerializer implements JsonSerializer<ListBanks> {
    @Override
    public JsonElement serialize(ListBanks src, Type typeOfSrc, JsonSerializationContext context) {
        return src.getRequestBodyJsonObject(context);
    }
}
