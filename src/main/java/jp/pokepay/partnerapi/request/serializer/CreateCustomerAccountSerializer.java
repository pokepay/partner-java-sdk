// DO NOT EDIT: File is generated by code generator.

package jp.pokepay.partnerapi.request.serializer;

import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import jp.pokepay.partnerapi.request.CreateCustomerAccount;

import java.lang.reflect.Type;

public class CreateCustomerAccountSerializer implements JsonSerializer<CreateCustomerAccount> {
    @Override
    public JsonElement serialize(CreateCustomerAccount src, Type typeOfSrc, JsonSerializationContext context) {
        return src.getRequestBodyJsonObject(context);
    }
}