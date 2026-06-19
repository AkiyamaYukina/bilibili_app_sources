package com.bilibili.pegasus.components;

import com.bilibili.okretro.converter.IParser;
import com.google.gson.Gson;
import kotlin.Pair;
import kotlin.TuplesKt;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/G.class */
public final /* synthetic */ class G implements IParser {
    public static Pair a(rW0.b bVar, Class cls) {
        return TuplesKt.to(cls, new ei1.c(bVar));
    }

    @Override // com.bilibili.okretro.converter.IParser
    public Object convert(ResponseBody responseBody) {
        return new Gson().fromJson(responseBody.string(), new H().getType());
    }
}
