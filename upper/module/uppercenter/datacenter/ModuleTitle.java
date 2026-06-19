package com.bilibili.upper.module.uppercenter.datacenter;

import G0.b;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.B;
import com.alibaba.fastjson.annotation.JSONField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenter/datacenter/ModuleTitle.class */
@StabilityInferred(parameters = 0)
@Keep
public final class ModuleTitle {
    public static final int $stable = 8;

    @JSONField(name = "day_background")
    @Nullable
    private String dayBackground;

    @JSONField(name = "day_color")
    @Nullable
    private String dayColor;

    @JSONField(name = "night_background")
    @Nullable
    private String nightBackground;

    @JSONField(name = "night_color")
    @Nullable
    private String nightColor;

    @JSONField(name = "title")
    @Nullable
    private String title;

    public ModuleTitle() {
        this(null, null, null, null, null, 31, null);
    }

    public ModuleTitle(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.title = str;
        this.dayColor = str2;
        this.nightColor = str3;
        this.dayBackground = str4;
        this.nightBackground = str5;
    }

    public /* synthetic */ ModuleTitle(String str, String str2, String str3, String str4, String str5, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : str3, (i7 & 8) != 0 ? null : str4, (i7 & 16) != 0 ? null : str5);
    }

    public static /* synthetic */ ModuleTitle copy$default(ModuleTitle moduleTitle, String str, String str2, String str3, String str4, String str5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = moduleTitle.title;
        }
        if ((i7 & 2) != 0) {
            str2 = moduleTitle.dayColor;
        }
        if ((i7 & 4) != 0) {
            str3 = moduleTitle.nightColor;
        }
        if ((i7 & 8) != 0) {
            str4 = moduleTitle.dayBackground;
        }
        if ((i7 & 16) != 0) {
            str5 = moduleTitle.nightBackground;
        }
        return moduleTitle.copy(str, str2, str3, str4, str5);
    }

    @Nullable
    public final String component1() {
        return this.title;
    }

    @Nullable
    public final String component2() {
        return this.dayColor;
    }

    @Nullable
    public final String component3() {
        return this.nightColor;
    }

    @Nullable
    public final String component4() {
        return this.dayBackground;
    }

    @Nullable
    public final String component5() {
        return this.nightBackground;
    }

    @NotNull
    public final ModuleTitle copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        return new ModuleTitle(str, str2, str3, str4, str5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModuleTitle)) {
            return false;
        }
        ModuleTitle moduleTitle = (ModuleTitle) obj;
        return Intrinsics.areEqual(this.title, moduleTitle.title) && Intrinsics.areEqual(this.dayColor, moduleTitle.dayColor) && Intrinsics.areEqual(this.nightColor, moduleTitle.nightColor) && Intrinsics.areEqual(this.dayBackground, moduleTitle.dayBackground) && Intrinsics.areEqual(this.nightBackground, moduleTitle.nightBackground);
    }

    @Nullable
    public final String getDayBackground() {
        return this.dayBackground;
    }

    @Nullable
    public final String getDayColor() {
        return this.dayColor;
    }

    @Nullable
    public final String getNightBackground() {
        return this.nightBackground;
    }

    @Nullable
    public final String getNightColor() {
        return this.nightColor;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.dayColor;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.nightColor;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.dayBackground;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.nightBackground;
        if (str5 != null) {
            iHashCode = str5.hashCode();
        }
        return (((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode;
    }

    public final void setDayBackground(@Nullable String str) {
        this.dayBackground = str;
    }

    public final void setDayColor(@Nullable String str) {
        this.dayColor = str;
    }

    public final void setNightBackground(@Nullable String str) {
        this.nightBackground = str;
    }

    public final void setNightColor(@Nullable String str) {
        this.nightColor = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.dayColor;
        String str3 = this.nightColor;
        String str4 = this.dayBackground;
        String str5 = this.nightBackground;
        StringBuilder sbA = b.a("ModuleTitle(title=", str, ", dayColor=", str2, ", nightColor=");
        B.a(str3, ", dayBackground=", str4, ", nightBackground=", sbA);
        return C8770a.a(sbA, str5, ")");
    }
}
