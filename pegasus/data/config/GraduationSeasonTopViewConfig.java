package com.bilibili.pegasus.data.config;

import androidx.annotation.Keep;
import androidx.constraintlayout.motion.widget.p;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/config/GraduationSeasonTopViewConfig.class */
@Keep
public final class GraduationSeasonTopViewConfig {

    @SerializedName("tip")
    @Nullable
    private final String tip;

    @SerializedName("tip_icon")
    @Nullable
    private final String tipIcon;

    public GraduationSeasonTopViewConfig() {
        this(null, null, 3, null);
    }

    public GraduationSeasonTopViewConfig(@Nullable String str, @Nullable String str2) {
        this.tipIcon = str;
        this.tip = str2;
    }

    public /* synthetic */ GraduationSeasonTopViewConfig(String str, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2);
    }

    public static /* synthetic */ GraduationSeasonTopViewConfig copy$default(GraduationSeasonTopViewConfig graduationSeasonTopViewConfig, String str, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = graduationSeasonTopViewConfig.tipIcon;
        }
        if ((i7 & 2) != 0) {
            str2 = graduationSeasonTopViewConfig.tip;
        }
        return graduationSeasonTopViewConfig.copy(str, str2);
    }

    @Nullable
    public final String component1() {
        return this.tipIcon;
    }

    @Nullable
    public final String component2() {
        return this.tip;
    }

    @NotNull
    public final GraduationSeasonTopViewConfig copy(@Nullable String str, @Nullable String str2) {
        return new GraduationSeasonTopViewConfig(str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraduationSeasonTopViewConfig)) {
            return false;
        }
        GraduationSeasonTopViewConfig graduationSeasonTopViewConfig = (GraduationSeasonTopViewConfig) obj;
        return Intrinsics.areEqual(this.tipIcon, graduationSeasonTopViewConfig.tipIcon) && Intrinsics.areEqual(this.tip, graduationSeasonTopViewConfig.tip);
    }

    @Nullable
    public final String getTip() {
        return this.tip;
    }

    @Nullable
    public final String getTipIcon() {
        return this.tipIcon;
    }

    public int hashCode() {
        String str = this.tipIcon;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.tip;
        if (str2 != null) {
            iHashCode = str2.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    @NotNull
    public String toString() {
        return p.a("GraduationSeasonTopViewConfig(tipIcon=", this.tipIcon, ", tip=", this.tip, ")");
    }
}
