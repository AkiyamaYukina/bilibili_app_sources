package com.bilibili.ogv.kmm.operation.inlinefeed;

import kotlin.jvm.functions.Function1;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinefeed/b.class */
public final /* synthetic */ class b implements Function1 {
    public final Object invoke(Object obj) {
        JsonElement jsonElement = (JsonElement) ((JsonObject) obj).get("inline_info");
        return Boolean.valueOf(!(jsonElement == null || (jsonElement instanceof JsonNull)));
    }
}
