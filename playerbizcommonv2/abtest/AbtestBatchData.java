package com.bilibili.playerbizcommonv2.abtest;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/abtest/AbtestBatchData.class */
@StabilityInferred(parameters = 1)
@Bson
public final class AbtestBatchData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("ab_result")
    @Nullable
    private final AbtestBatchResult f80800a;

    public AbtestBatchData(@Nullable AbtestBatchResult abtestBatchResult) {
        this.f80800a = abtestBatchResult;
    }

    @Nullable
    public final AbtestBatchResult a() {
        return this.f80800a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbtestBatchData) && Intrinsics.areEqual(this.f80800a, ((AbtestBatchData) obj).f80800a);
    }

    public final int hashCode() {
        AbtestBatchResult abtestBatchResult = this.f80800a;
        return abtestBatchResult == null ? 0 : abtestBatchResult.hashCode();
    }

    @NotNull
    public final String toString() {
        return "AbtestBatchData(result=" + this.f80800a + ")";
    }
}
