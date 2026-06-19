package com.bilibili.tensorflow.data.api;

import androidx.compose.animation.core.I;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/data/api/TfRemoteData.class */
@Bson
public final class TfRemoteData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f110709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f110710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final VipFeatureData f110711c;

    public TfRemoteData(long j7, int i7, @NotNull VipFeatureData vipFeatureData) {
        this.f110709a = j7;
        this.f110710b = i7;
        this.f110711c = vipFeatureData;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TfRemoteData)) {
            return false;
        }
        TfRemoteData tfRemoteData = (TfRemoteData) obj;
        return this.f110709a == tfRemoteData.f110709a && this.f110710b == tfRemoteData.f110710b && Intrinsics.areEqual(this.f110711c, tfRemoteData.f110711c);
    }

    public final int hashCode() {
        return this.f110711c.hashCode() + I.a(this.f110710b, Long.hashCode(this.f110709a) * 31, 31);
    }

    @NotNull
    public final String toString() {
        return "TfRemoteData(startTime=" + this.f110709a + ", vipPayType=" + this.f110710b + ", vipInfo=" + this.f110711c + ")";
    }
}
