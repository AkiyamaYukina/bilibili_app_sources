package com.bilibili.playerbizcommonv2.abtest;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/abtest/IntExpData.class */
@StabilityInferred(parameters = 1)
@Bson
public final class IntExpData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("data")
    private final int f80809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("success")
    private final boolean f80810b;

    public IntExpData(int i7, boolean z6) {
        this.f80809a = i7;
        this.f80810b = z6;
    }

    public final int a() {
        return this.f80809a;
    }

    public final boolean b() {
        return this.f80810b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntExpData)) {
            return false;
        }
        IntExpData intExpData = (IntExpData) obj;
        return this.f80809a == intExpData.f80809a && this.f80810b == intExpData.f80810b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f80810b) + (Integer.hashCode(this.f80809a) * 31);
    }

    @NotNull
    public final String toString() {
        return "IntExpData(data=" + this.f80809a + ", success=" + this.f80810b + ")";
    }
}
