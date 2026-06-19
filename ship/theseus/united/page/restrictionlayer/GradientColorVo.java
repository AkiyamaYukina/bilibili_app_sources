package com.bilibili.ship.theseus.united.page.restrictionlayer;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/GradientColorVo.class */
@StabilityInferred(parameters = 1)
@Bson
public final class GradientColorVo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("start_color")
    @Nullable
    private final Integer f102556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("end_color")
    @Nullable
    private final Integer f102557b;

    public GradientColorVo(@Nullable Integer num, @Nullable Integer num2) {
        this.f102556a = num;
        this.f102557b = num2;
    }

    @Nullable
    public final Integer a() {
        return this.f102557b;
    }

    @Nullable
    public final Integer b() {
        return this.f102556a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GradientColorVo)) {
            return false;
        }
        GradientColorVo gradientColorVo = (GradientColorVo) obj;
        return Intrinsics.areEqual(this.f102556a, gradientColorVo.f102556a) && Intrinsics.areEqual(this.f102557b, gradientColorVo.f102557b);
    }

    public final int hashCode() {
        Integer num = this.f102556a;
        int iHashCode = 0;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        Integer num2 = this.f102557b;
        if (num2 != null) {
            iHashCode = num2.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        return "GradientColorVo(startColor=" + this.f102556a + ", endColor=" + this.f102557b + ")";
    }
}
