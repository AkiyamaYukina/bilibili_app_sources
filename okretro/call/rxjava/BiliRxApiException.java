package com.bilibili.okretro.call.rxjava;

import com.alibaba.fastjson.JSONObject;
import com.bilibili.api.BiliApiException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/call/rxjava/BiliRxApiException.class */
public final class BiliRxApiException extends BiliApiException {
    private final int code;

    @Nullable
    private final JSONObject data;

    public BiliRxApiException(int i7, @Nullable String str, @Nullable JSONObject jSONObject, @Nullable Throwable th) {
        super(i7, str, th);
        this.code = i7;
        this.data = jSONObject;
    }

    public /* synthetic */ BiliRxApiException(int i7, String str, JSONObject jSONObject, Throwable th, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, str, jSONObject, (i8 & 8) != 0 ? null : th);
    }

    public final int getCode() {
        return this.code;
    }

    @Nullable
    public final JSONObject getData() {
        return this.data;
    }
}
