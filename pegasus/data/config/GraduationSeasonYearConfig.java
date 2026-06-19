package com.bilibili.pegasus.data.config;

import androidx.annotation.Keep;
import androidx.customview.widget.b;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/config/GraduationSeasonYearConfig.class */
@Keep
public final class GraduationSeasonYearConfig {

    @SerializedName("id")
    private final int id;

    @SerializedName("title")
    @Nullable
    private final String title;

    public GraduationSeasonYearConfig() {
        this(0, null, 3, null);
    }

    public GraduationSeasonYearConfig(int i7, @Nullable String str) {
        this.id = i7;
        this.title = str;
    }

    public /* synthetic */ GraduationSeasonYearConfig(int i7, String str, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 0 : i7, (i8 & 2) != 0 ? null : str);
    }

    public static /* synthetic */ GraduationSeasonYearConfig copy$default(GraduationSeasonYearConfig graduationSeasonYearConfig, int i7, String str, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = graduationSeasonYearConfig.id;
        }
        if ((i8 & 2) != 0) {
            str = graduationSeasonYearConfig.title;
        }
        return graduationSeasonYearConfig.copy(i7, str);
    }

    public final int component1() {
        return this.id;
    }

    @Nullable
    public final String component2() {
        return this.title;
    }

    @NotNull
    public final GraduationSeasonYearConfig copy(int i7, @Nullable String str) {
        return new GraduationSeasonYearConfig(i7, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraduationSeasonYearConfig)) {
            return false;
        }
        GraduationSeasonYearConfig graduationSeasonYearConfig = (GraduationSeasonYearConfig) obj;
        return this.id == graduationSeasonYearConfig.id && Intrinsics.areEqual(this.title, graduationSeasonYearConfig.title);
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.id);
        String str = this.title;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return b.b(this.id, "GraduationSeasonYearConfig(id=", ", title=", this.title, ")");
    }
}
