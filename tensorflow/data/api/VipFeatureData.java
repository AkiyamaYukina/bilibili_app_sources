package com.bilibili.tensorflow.data.api;

import com.bilibili.bson.common.Bson;
import java.util.SortedMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/data/api/VipFeatureData.class */
@Bson
public final class VipFeatureData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f110713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SortedMap<Integer, String> f110714b;

    public VipFeatureData(@NotNull String str, @NotNull SortedMap<Integer, String> sortedMap) {
        this.f110713a = str;
        this.f110714b = sortedMap;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VipFeatureData)) {
            return false;
        }
        VipFeatureData vipFeatureData = (VipFeatureData) obj;
        return Intrinsics.areEqual(this.f110713a, vipFeatureData.f110713a) && Intrinsics.areEqual(this.f110714b, vipFeatureData.f110714b);
    }

    public final int hashCode() {
        return this.f110714b.hashCode() + (this.f110713a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "VipFeatureData(versionName=" + this.f110713a + ", value=" + this.f110714b + ")";
    }
}
