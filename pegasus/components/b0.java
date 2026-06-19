package com.bilibili.pegasus.components;

import com.bilibili.okretro.converter.IParser;
import com.google.gson.Gson;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/b0.class */
public final class b0<T> implements IParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0<T> f75896a = (b0<T>) new Object();

    @Override // com.bilibili.okretro.converter.IParser
    public final Object convert(ResponseBody responseBody) {
        return new Gson().fromJson(responseBody.string(), BiliNotice.class);
    }
}
