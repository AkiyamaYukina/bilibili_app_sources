package com.bilibili.ogv.opbase;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/BadgeInfo.class */
@StabilityInferred(parameters = 1)
@Bson
public final class BadgeInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("info_badge")
    @NotNull
    private final String f69667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f69668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f69669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f69670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f69671e;

    public BadgeInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        this.f69667a = str;
        this.f69668b = str2;
        this.f69669c = str3;
        this.f69670d = str4;
        this.f69671e = str5;
    }

    @NotNull
    public final String a() {
        return this.f69667a;
    }
}
