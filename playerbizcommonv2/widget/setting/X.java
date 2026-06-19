package com.bilibili.playerbizcommonv2.widget.setting;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/X.class */
@StabilityInferred(parameters = 0)
public final class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f83168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f83169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f83170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f83171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f83172e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f83173f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f83174g;

    @Nullable
    public final String h;

    public X(@NotNull String str, @NotNull String str2, boolean z6, @NotNull String str3, boolean z7, boolean z8, @NotNull Map<String, String> map, @Nullable String str4) {
        this.f83168a = str;
        this.f83169b = str2;
        this.f83170c = z6;
        this.f83171d = str3;
        this.f83172e = z7;
        this.f83173f = z8;
        this.f83174g = map;
        this.h = str4;
    }

    public static X a(X x6) {
        return new X(x6.f83168a, x6.f83169b, x6.f83170c, x6.f83171d, x6.f83172e, x6.f83173f, x6.f83174g, "question_help_circle_line@500");
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X)) {
            return false;
        }
        X x6 = (X) obj;
        return Intrinsics.areEqual(this.f83168a, x6.f83168a) && Intrinsics.areEqual(this.f83169b, x6.f83169b) && this.f83170c == x6.f83170c && Intrinsics.areEqual(this.f83171d, x6.f83171d) && this.f83172e == x6.f83172e && this.f83173f == x6.f83173f && Intrinsics.areEqual(this.f83174g, x6.f83174g) && Intrinsics.areEqual(this.h, x6.h);
    }

    public final int hashCode() {
        int iA = J2.g.a(androidx.compose.animation.z.a(androidx.compose.animation.z.a(I.E.a(androidx.compose.animation.z.a(I.E.a(this.f83168a.hashCode() * 31, 31, this.f83169b), 31, this.f83170c), 31, this.f83171d), 31, this.f83172e), 31, this.f83173f), this.f83174g, 31);
        String str = this.h;
        return iA + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final String toString() {
        Map<String, String> map = this.f83174g;
        StringBuilder sb = new StringBuilder("VideoSettingBaseInfo(iconUrl=");
        sb.append(this.f83168a);
        sb.append(", title=");
        sb.append(this.f83169b);
        sb.append(", disable=");
        sb.append(this.f83170c);
        sb.append(", disableReason=");
        sb.append(this.f83171d);
        sb.append(", grayed=");
        sb.append(this.f83172e);
        sb.append(", reportExposure=");
        sb.append(this.f83173f);
        sb.append(", report=");
        sb.append(map);
        sb.append(", titleEndIconRes=");
        return C8770a.a(sb, this.h, ")");
    }
}
