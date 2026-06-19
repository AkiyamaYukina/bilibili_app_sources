package com.bilibili.ship.theseus.ogv.playviewextra;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/playviewextra/BadgeButtonVo.class */
@StabilityInferred(parameters = 1)
@Bson
public final class BadgeButtonVo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("action_type")
    @Nullable
    private final String f94341a;

    public BadgeButtonVo(@Nullable String str) {
        this.f94341a = str;
    }

    @Nullable
    public final String a() {
        return this.f94341a;
    }
}
