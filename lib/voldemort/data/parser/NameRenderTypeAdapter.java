package com.bilibili.lib.voldemort.data.parser;

import Wc0.a;
import com.bapis.bilibili.account.service.v1.NameRender;
import com.bilibili.lib.moss.util.common.ProtoKeyStyle;
import com.google.gson.JsonElement;
import com.google.gson.d;
import com.google.gson.e;
import java.lang.reflect.Type;
import xg0.C8973c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/voldemort/data/parser/NameRenderTypeAdapter.class */
public final class NameRenderTypeAdapter implements e<C8973c> {
    public final Object c(JsonElement jsonElement, Type type, d dVar) {
        String string = jsonElement.toString();
        NameRender.b bVarNewBuilder = NameRender.newBuilder();
        new a(ProtoKeyStyle.LOWER_SNAKE_CASE, true).a(string, bVarNewBuilder);
        return new C8973c(bVarNewBuilder);
    }
}
