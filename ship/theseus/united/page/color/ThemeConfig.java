package com.bilibili.ship.theseus.united.page.color;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/color/ThemeConfig.class */
@StabilityInferred(parameters = 1)
@Bson
public final class ThemeConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f99203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f99204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f99205c;

    public ThemeConfig(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.f99203a = str;
        this.f99204b = str2;
        this.f99205c = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThemeConfig)) {
            return false;
        }
        ThemeConfig themeConfig = (ThemeConfig) obj;
        return Intrinsics.areEqual(this.f99203a, themeConfig.f99203a) && Intrinsics.areEqual(this.f99204b, themeConfig.f99204b) && Intrinsics.areEqual(this.f99205c, themeConfig.f99205c);
    }

    public final int hashCode() {
        int iHashCode = 0;
        String str = this.f99203a;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.f99204b;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.f99205c;
        if (str3 != null) {
            iHashCode = str3.hashCode();
        }
        return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ThemeConfig(bgColor=");
        sb.append(this.f99203a);
        sb.append(", selectedBgColor=");
        sb.append(this.f99204b);
        sb.append(", textColor=");
        return C8770a.a(sb, this.f99205c, ")");
    }
}
