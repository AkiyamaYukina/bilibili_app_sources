package com.bilibili.lib.projection.internal.api.model;

import androidx.annotation.Keep;
import androidx.compose.foundation.gestures.C3392f;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/api/model/CurrQualityInfo.class */
@Keep
public final class CurrQualityInfo {

    @SerializedName("quality")
    private int quality;

    public CurrQualityInfo() {
        this(0, 1, null);
    }

    public CurrQualityInfo(int i7) {
        this.quality = i7;
    }

    public /* synthetic */ CurrQualityInfo(int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 0 : i7);
    }

    public static /* synthetic */ CurrQualityInfo copy$default(CurrQualityInfo currQualityInfo, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = currQualityInfo.quality;
        }
        return currQualityInfo.copy(i7);
    }

    public final int component1() {
        return this.quality;
    }

    @NotNull
    public final CurrQualityInfo copy(int i7) {
        return new CurrQualityInfo(i7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CurrQualityInfo) && this.quality == ((CurrQualityInfo) obj).quality;
    }

    public final int getQuality() {
        return this.quality;
    }

    public int hashCode() {
        return Integer.hashCode(this.quality);
    }

    public final void setQuality(int i7) {
        this.quality = i7;
    }

    @NotNull
    public String toString() {
        return C3392f.a(this.quality, "CurrQualityInfo(quality=", ")");
    }
}
