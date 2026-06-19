package com.bilibili.playerbizcommon.biliad;

import com.alibaba.fastjson.JSONObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/biliad/AdDanmakuInfo.class */
public final class AdDanmakuInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final JSONObject f79548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f79549b;

    public AdDanmakuInfo() {
        this(null, null, 3, null);
    }

    public AdDanmakuInfo(@Nullable JSONObject jSONObject, @NotNull String str) {
        this.f79548a = jSONObject;
        this.f79549b = str;
    }

    public /* synthetic */ AdDanmakuInfo(JSONObject jSONObject, String str, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : jSONObject, (i7 & 2) != 0 ? "" : str);
    }

    @Nullable
    public final JSONObject getCmConfig() {
        return this.f79548a;
    }

    @NotNull
    public final String getFace() {
        return this.f79549b;
    }
}
