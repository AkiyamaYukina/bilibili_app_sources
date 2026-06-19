package com.bilibili.ship.theseus.ogv.pay.sponsor;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/pay/sponsor/BangumiThreshold.class */
@StabilityInferred(parameters = 0)
@Bson
public final class BangumiThreshold {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f94221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("days_text")
    @Nullable
    private String f94222b;

    @Nullable
    public final String a() {
        return this.f94222b;
    }

    public final void b(@Nullable String str) {
        this.f94222b = str;
    }
}
