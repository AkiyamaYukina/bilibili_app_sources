package com.bilibili.ogv.infra.jsb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.util.Iterator;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/jsb/a.class */
public final class a {
    @NotNull
    public static final JsonElement a(@Nullable Object obj) {
        JsonNull jsonPrimitive;
        if (obj == null) {
            jsonPrimitive = JsonNull.INSTANCE;
        } else if (obj instanceof JSONObject) {
            JsonNull jsonObject = new JsonObject();
            Iterator<Map.Entry<String, Object>> it = ((JSONObject) obj).entrySet().iterator();
            while (true) {
                jsonPrimitive = jsonObject;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Object> next = it.next();
                jsonObject.add(next.getKey(), a(next.getValue()));
            }
        } else if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            JsonNull jsonArray = new JsonArray(jSONArray.size());
            Iterator<Object> it2 = jSONArray.iterator();
            while (true) {
                jsonPrimitive = jsonArray;
                if (!it2.hasNext()) {
                    break;
                }
                jsonArray.add(a(it2.next()));
            }
        } else if (obj instanceof String) {
            jsonPrimitive = new JsonPrimitive((String) obj);
        } else if (obj instanceof Number) {
            jsonPrimitive = new JsonPrimitive((Number) obj);
        } else if (obj instanceof Boolean) {
            jsonPrimitive = new JsonPrimitive((Boolean) obj);
        } else {
            if (!(obj instanceof Character)) {
                throw new IllegalArgumentException();
            }
            jsonPrimitive = new JsonPrimitive((Character) obj);
        }
        return jsonPrimitive;
    }
}
