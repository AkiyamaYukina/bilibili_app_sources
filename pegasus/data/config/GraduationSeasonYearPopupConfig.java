package com.bilibili.pegasus.data.config;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/config/GraduationSeasonYearPopupConfig.class */
@Keep
public final class GraduationSeasonYearPopupConfig {

    @SerializedName("tip")
    @Nullable
    private final String tip;

    @SerializedName("years")
    @Nullable
    private final List<GraduationSeasonYearConfig> years;

    public GraduationSeasonYearPopupConfig() {
        this(null, null, 3, null);
    }

    public GraduationSeasonYearPopupConfig(@Nullable List<GraduationSeasonYearConfig> list, @Nullable String str) {
        this.years = list;
        this.tip = str;
    }

    public /* synthetic */ GraduationSeasonYearPopupConfig(List list, String str, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : list, (i7 & 2) != 0 ? null : str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GraduationSeasonYearPopupConfig copy$default(GraduationSeasonYearPopupConfig graduationSeasonYearPopupConfig, List list, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            list = graduationSeasonYearPopupConfig.years;
        }
        if ((i7 & 2) != 0) {
            str = graduationSeasonYearPopupConfig.tip;
        }
        return graduationSeasonYearPopupConfig.copy(list, str);
    }

    @Nullable
    public final List<GraduationSeasonYearConfig> component1() {
        return this.years;
    }

    @Nullable
    public final String component2() {
        return this.tip;
    }

    @NotNull
    public final GraduationSeasonYearPopupConfig copy(@Nullable List<GraduationSeasonYearConfig> list, @Nullable String str) {
        return new GraduationSeasonYearPopupConfig(list, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraduationSeasonYearPopupConfig)) {
            return false;
        }
        GraduationSeasonYearPopupConfig graduationSeasonYearPopupConfig = (GraduationSeasonYearPopupConfig) obj;
        return Intrinsics.areEqual(this.years, graduationSeasonYearPopupConfig.years) && Intrinsics.areEqual(this.tip, graduationSeasonYearPopupConfig.tip);
    }

    @Nullable
    public final String getTip() {
        return this.tip;
    }

    @Nullable
    public final List<GraduationSeasonYearConfig> getYears() {
        return this.years;
    }

    public int hashCode() {
        List<GraduationSeasonYearConfig> list = this.years;
        int iHashCode = 0;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        String str = this.tip;
        if (str != null) {
            iHashCode = str.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    @NotNull
    public String toString() {
        return "GraduationSeasonYearPopupConfig(years=" + this.years + ", tip=" + this.tip + ")";
    }
}
