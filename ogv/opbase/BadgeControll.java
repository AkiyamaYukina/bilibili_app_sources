package com.bilibili.ogv.opbase;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/BadgeControll.class */
@StabilityInferred(parameters = 0)
@Bson
public final class BadgeControll {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f69664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("data")
    @Nullable
    private final NewestTime f69665b;

    public BadgeControll(@NotNull String str, @Nullable NewestTime newestTime) {
        this.f69664a = str;
        this.f69665b = newestTime;
    }

    @Nullable
    public final NewestTime a() {
        return this.f69665b;
    }
}
