package com.bilibili.pegasus.data.config;

import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/config/GraduationSeasonConfig.class */
@Keep
public final class GraduationSeasonConfig {

    @SerializedName("exp")
    private final int exp;

    @SerializedName("guide")
    @Nullable
    private final GraduationSeasonGuideConfig guide;

    @SerializedName("share")
    @Nullable
    private final GraduationSeasonShareConfig share;

    @SerializedName("top_view")
    @Nullable
    private final GraduationSeasonTopViewConfig topView;

    @SerializedName("year_popup")
    @Nullable
    private final GraduationSeasonYearPopupConfig yearPopup;

    public GraduationSeasonConfig() {
        this(null, null, null, 0, null, 31, null);
    }

    public GraduationSeasonConfig(@Nullable GraduationSeasonGuideConfig graduationSeasonGuideConfig, @Nullable GraduationSeasonYearPopupConfig graduationSeasonYearPopupConfig, @Nullable GraduationSeasonShareConfig graduationSeasonShareConfig, int i7, @Nullable GraduationSeasonTopViewConfig graduationSeasonTopViewConfig) {
        this.guide = graduationSeasonGuideConfig;
        this.yearPopup = graduationSeasonYearPopupConfig;
        this.share = graduationSeasonShareConfig;
        this.exp = i7;
        this.topView = graduationSeasonTopViewConfig;
    }

    public /* synthetic */ GraduationSeasonConfig(GraduationSeasonGuideConfig graduationSeasonGuideConfig, GraduationSeasonYearPopupConfig graduationSeasonYearPopupConfig, GraduationSeasonShareConfig graduationSeasonShareConfig, int i7, GraduationSeasonTopViewConfig graduationSeasonTopViewConfig, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? null : graduationSeasonGuideConfig, (i8 & 2) != 0 ? null : graduationSeasonYearPopupConfig, (i8 & 4) != 0 ? null : graduationSeasonShareConfig, (i8 & 8) != 0 ? 0 : i7, (i8 & 16) != 0 ? null : graduationSeasonTopViewConfig);
    }

    public static /* synthetic */ GraduationSeasonConfig copy$default(GraduationSeasonConfig graduationSeasonConfig, GraduationSeasonGuideConfig graduationSeasonGuideConfig, GraduationSeasonYearPopupConfig graduationSeasonYearPopupConfig, GraduationSeasonShareConfig graduationSeasonShareConfig, int i7, GraduationSeasonTopViewConfig graduationSeasonTopViewConfig, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            graduationSeasonGuideConfig = graduationSeasonConfig.guide;
        }
        if ((i8 & 2) != 0) {
            graduationSeasonYearPopupConfig = graduationSeasonConfig.yearPopup;
        }
        if ((i8 & 4) != 0) {
            graduationSeasonShareConfig = graduationSeasonConfig.share;
        }
        if ((i8 & 8) != 0) {
            i7 = graduationSeasonConfig.exp;
        }
        if ((i8 & 16) != 0) {
            graduationSeasonTopViewConfig = graduationSeasonConfig.topView;
        }
        return graduationSeasonConfig.copy(graduationSeasonGuideConfig, graduationSeasonYearPopupConfig, graduationSeasonShareConfig, i7, graduationSeasonTopViewConfig);
    }

    @Nullable
    public final GraduationSeasonGuideConfig component1() {
        return this.guide;
    }

    @Nullable
    public final GraduationSeasonYearPopupConfig component2() {
        return this.yearPopup;
    }

    @Nullable
    public final GraduationSeasonShareConfig component3() {
        return this.share;
    }

    public final int component4() {
        return this.exp;
    }

    @Nullable
    public final GraduationSeasonTopViewConfig component5() {
        return this.topView;
    }

    @NotNull
    public final GraduationSeasonConfig copy(@Nullable GraduationSeasonGuideConfig graduationSeasonGuideConfig, @Nullable GraduationSeasonYearPopupConfig graduationSeasonYearPopupConfig, @Nullable GraduationSeasonShareConfig graduationSeasonShareConfig, int i7, @Nullable GraduationSeasonTopViewConfig graduationSeasonTopViewConfig) {
        return new GraduationSeasonConfig(graduationSeasonGuideConfig, graduationSeasonYearPopupConfig, graduationSeasonShareConfig, i7, graduationSeasonTopViewConfig);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraduationSeasonConfig)) {
            return false;
        }
        GraduationSeasonConfig graduationSeasonConfig = (GraduationSeasonConfig) obj;
        return Intrinsics.areEqual(this.guide, graduationSeasonConfig.guide) && Intrinsics.areEqual(this.yearPopup, graduationSeasonConfig.yearPopup) && Intrinsics.areEqual(this.share, graduationSeasonConfig.share) && this.exp == graduationSeasonConfig.exp && Intrinsics.areEqual(this.topView, graduationSeasonConfig.topView);
    }

    public final int getExp() {
        return this.exp;
    }

    @Nullable
    public final GraduationSeasonGuideConfig getGuide() {
        return this.guide;
    }

    @Nullable
    public final GraduationSeasonShareConfig getShare() {
        return this.share;
    }

    @Nullable
    public final GraduationSeasonTopViewConfig getTopView() {
        return this.topView;
    }

    public final int getTriggerScreenCount() {
        GraduationSeasonGuideConfig graduationSeasonGuideConfig = this.guide;
        return graduationSeasonGuideConfig != null ? graduationSeasonGuideConfig.getTriggerScreenCount() : 0;
    }

    @Nullable
    public final GraduationSeasonYearPopupConfig getYearPopup() {
        return this.yearPopup;
    }

    public int hashCode() {
        GraduationSeasonGuideConfig graduationSeasonGuideConfig = this.guide;
        int iHashCode = graduationSeasonGuideConfig == null ? 0 : graduationSeasonGuideConfig.hashCode();
        GraduationSeasonYearPopupConfig graduationSeasonYearPopupConfig = this.yearPopup;
        int iHashCode2 = graduationSeasonYearPopupConfig == null ? 0 : graduationSeasonYearPopupConfig.hashCode();
        GraduationSeasonShareConfig graduationSeasonShareConfig = this.share;
        int iA = I.a(this.exp, ((((iHashCode * 31) + iHashCode2) * 31) + (graduationSeasonShareConfig == null ? 0 : graduationSeasonShareConfig.hashCode())) * 31, 31);
        GraduationSeasonTopViewConfig graduationSeasonTopViewConfig = this.topView;
        return iA + (graduationSeasonTopViewConfig == null ? 0 : graduationSeasonTopViewConfig.hashCode());
    }

    @NotNull
    public String toString() {
        return "GraduationSeasonConfig(guide=" + this.guide + ", yearPopup=" + this.yearPopup + ", share=" + this.share + ", exp=" + this.exp + ", topView=" + this.topView + ")";
    }
}
