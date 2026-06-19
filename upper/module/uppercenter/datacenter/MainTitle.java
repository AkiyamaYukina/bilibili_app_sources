package com.bilibili.upper.module.uppercenter.datacenter;

import G0.b;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenter/datacenter/MainTitle.class */
@StabilityInferred(parameters = 0)
@Keep
public final class MainTitle {
    public static final int $stable = 8;

    @JSONField(name = "day_color")
    @Nullable
    private String dayColor;

    @JSONField(name = "night_color")
    @Nullable
    private String nightColor;

    @JSONField(name = "title")
    @Nullable
    private String title;

    public MainTitle() {
        this(null, null, null, 7, null);
    }

    public MainTitle(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.title = str;
        this.dayColor = str2;
        this.nightColor = str3;
    }

    public /* synthetic */ MainTitle(String str, String str2, String str3, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : str3);
    }

    public static /* synthetic */ MainTitle copy$default(MainTitle mainTitle, String str, String str2, String str3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = mainTitle.title;
        }
        if ((i7 & 2) != 0) {
            str2 = mainTitle.dayColor;
        }
        if ((i7 & 4) != 0) {
            str3 = mainTitle.nightColor;
        }
        return mainTitle.copy(str, str2, str3);
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

    @NotNull
    public final MainTitle copy(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new MainTitle(str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MainTitle)) {
            return false;
        }
        MainTitle mainTitle = (MainTitle) obj;
        return Intrinsics.areEqual(this.title, mainTitle.title) && Intrinsics.areEqual(this.dayColor, mainTitle.dayColor) && Intrinsics.areEqual(this.nightColor, mainTitle.nightColor);
    }

    @Nullable
    public final String getDayColor() {
        return this.dayColor;
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
        if (str3 != null) {
            iHashCode = str3.hashCode();
        }
        return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
    }

    public final void setDayColor(@Nullable String str) {
        this.dayColor = str;
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
        return C8770a.a(b.a("MainTitle(title=", str, ", dayColor=", str2, ", nightColor="), this.nightColor, ")");
    }
}
