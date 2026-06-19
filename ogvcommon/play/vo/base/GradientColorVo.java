package com.bilibili.ogvcommon.play.vo.base;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.adapter.StringIntColorTypeAdapter;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/vo/base/GradientColorVo.class */
@StabilityInferred(parameters = 1)
@Bson
public final class GradientColorVo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("start_color")
    @JsonAdapter(StringIntColorTypeAdapter.class)
    @Nullable
    private final Integer f73339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("end_color")
    @JsonAdapter(StringIntColorTypeAdapter.class)
    @Nullable
    private final Integer f73340b;

    public GradientColorVo(@Nullable Integer num, @Nullable Integer num2) {
        this.f73339a = num;
        this.f73340b = num2;
    }

    @Nullable
    public final Integer a() {
        return this.f73340b;
    }

    @Nullable
    public final Integer b() {
        return this.f73339a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GradientColorVo)) {
            return false;
        }
        GradientColorVo gradientColorVo = (GradientColorVo) obj;
        return Intrinsics.areEqual(this.f73339a, gradientColorVo.f73339a) && Intrinsics.areEqual(this.f73340b, gradientColorVo.f73340b);
    }

    public final int hashCode() {
        Integer num = this.f73339a;
        int iHashCode = 0;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        Integer num2 = this.f73340b;
        if (num2 != null) {
            iHashCode = num2.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        return "GradientColorVo(startColor=" + this.f73339a + ", endColor=" + this.f73340b + ")";
    }
}
