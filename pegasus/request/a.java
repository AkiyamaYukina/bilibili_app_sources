package com.bilibili.pegasus.request;

import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.converter.IParser;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import kp0.C7782e;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/request/a.class */
public final /* synthetic */ class a implements IParser {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.okretro.converter.IParser
    public final Object convert(ResponseBody responseBody) {
        Gson gson = new Gson();
        JsonElement jsonElement = ((JsonObject) gson.fromJson(responseBody.string(), JsonObject.class)).get("data");
        C7782e c7782e = null;
        if (jsonElement != null) {
            if (jsonElement instanceof JsonNull) {
                jsonElement = null;
            }
            c7782e = null;
            if (jsonElement != null) {
                JsonObject asJsonObject = jsonElement.getAsJsonObject();
                c7782e = null;
                if (asJsonObject != null) {
                    c7782e = (C7782e) gson.fromJson(asJsonObject, C7782e.class);
                }
            }
        }
        GeneralResponse generalResponse = new GeneralResponse();
        generalResponse.data = c7782e;
        return generalResponse;
    }
}
