package com.bilibili.playerbizcommonv2.api;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/api/TrialBenefit.class */
@StabilityInferred(parameters = 1)
@Bson
public final class TrialBenefit {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("remaining_times")
    private final int f80815a;

    public TrialBenefit(int i7) {
        this.f80815a = i7;
    }

    public final int a() {
        return this.f80815a;
    }
}
