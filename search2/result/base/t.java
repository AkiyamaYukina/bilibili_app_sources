package com.bilibili.search2.result.base;

import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/t.class */
@StabilityInferred(parameters = 0)
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f87610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f87611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f87612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f87613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final String f87614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f87615f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f87616g;
    public final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f87617i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final Integer f87618j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final String f87619k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Xs0.a f87620l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public final Integer f87621m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public final String f87622n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public final Long f87623o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public final Long f87624p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public final Map<String, String> f87625q;

    public t(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, boolean z6, int i7, int i8, boolean z7, @Nullable Integer num, @Nullable String str6, @NotNull Xs0.a aVar, @Nullable Integer num2, @Nullable String str7, @Nullable Long l7, @Nullable Long l8, @Nullable Map<String, String> map) {
        this.f87610a = str;
        this.f87611b = str2;
        this.f87612c = str3;
        this.f87613d = str4;
        this.f87614e = str5;
        this.f87615f = z6;
        this.f87616g = i7;
        this.h = i8;
        this.f87617i = z7;
        this.f87618j = num;
        this.f87619k = str6;
        this.f87620l = aVar;
        this.f87621m = num2;
        this.f87622n = str7;
        this.f87623o = l7;
        this.f87624p = l8;
        this.f87625q = map;
    }

    public static t a(t tVar, int i7, Map map, int i8) {
        String str = tVar.f87610a;
        String str2 = tVar.f87611b;
        String str3 = tVar.f87612c;
        String str4 = tVar.f87613d;
        String str5 = tVar.f87614e;
        boolean z6 = tVar.f87615f;
        if ((i8 & 64) != 0) {
            i7 = tVar.f87616g;
        }
        int i9 = tVar.h;
        boolean z7 = tVar.f87617i;
        Integer num = (i8 & 512) != 0 ? tVar.f87618j : null;
        String str6 = tVar.f87619k;
        Xs0.a aVar = tVar.f87620l;
        Integer num2 = tVar.f87621m;
        String str7 = tVar.f87622n;
        Long l7 = tVar.f87623o;
        Long l8 = tVar.f87624p;
        if ((i8 & 65536) != 0) {
            map = tVar.f87625q;
        }
        tVar.getClass();
        return new t(str, str2, str3, str4, str5, z6, i7, i9, z7, num, str6, aVar, num2, str7, l7, l8, map);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.areEqual(this.f87610a, tVar.f87610a) && Intrinsics.areEqual(this.f87611b, tVar.f87611b) && Intrinsics.areEqual(this.f87612c, tVar.f87612c) && Intrinsics.areEqual(this.f87613d, tVar.f87613d) && Intrinsics.areEqual(this.f87614e, tVar.f87614e) && this.f87615f == tVar.f87615f && this.f87616g == tVar.f87616g && this.h == tVar.h && this.f87617i == tVar.f87617i && Intrinsics.areEqual(this.f87618j, tVar.f87618j) && Intrinsics.areEqual(this.f87619k, tVar.f87619k) && Intrinsics.areEqual(this.f87620l, tVar.f87620l) && Intrinsics.areEqual(this.f87621m, tVar.f87621m) && Intrinsics.areEqual(this.f87622n, tVar.f87622n) && Intrinsics.areEqual(this.f87623o, tVar.f87623o) && Intrinsics.areEqual(this.f87624p, tVar.f87624p) && Intrinsics.areEqual(this.f87625q, tVar.f87625q);
    }

    public final int hashCode() {
        int iHashCode = this.f87610a.hashCode();
        int iHashCode2 = 0;
        String str = this.f87611b;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.f87612c;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.f87613d;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.f87614e;
        int iA = z.a(I.a(this.h, I.a(this.f87616g, z.a(((((((((iHashCode * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f87615f), 31), 31), 31, this.f87617i);
        Integer num = this.f87618j;
        int iHashCode6 = num == null ? 0 : num.hashCode();
        String str5 = this.f87619k;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        int iHashCode8 = this.f87620l.hashCode();
        Integer num2 = this.f87621m;
        int iHashCode9 = num2 == null ? 0 : num2.hashCode();
        String str6 = this.f87622n;
        int iHashCode10 = str6 == null ? 0 : str6.hashCode();
        Long l7 = this.f87623o;
        int iHashCode11 = l7 == null ? 0 : l7.hashCode();
        Long l8 = this.f87624p;
        int iHashCode12 = l8 == null ? 0 : l8.hashCode();
        Map<String, String> map = this.f87625q;
        if (map != null) {
            iHashCode2 = map.hashCode();
        }
        return ((((((((((iHashCode8 + ((((iA + iHashCode6) * 31) + iHashCode7) * 31)) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode2;
    }

    @NotNull
    public final String toString() {
        return "SearchInitParams(keyword=" + this.f87610a + ", from=" + this.f87611b + ", fromTrackId=" + this.f87612c + ", fromAvid=" + this.f87613d + ", fromComid=" + this.f87614e + ", reset=" + this.f87615f + ", version=" + this.f87616g + ", isOrgQuery=" + this.h + ", forceChatGpt=" + this.f87617i + ", forceLocateToType=" + this.f87618j + ", oneTimeExtra=" + this.f87619k + ", reportExt=" + this.f87620l + ", sugTermType=" + this.f87621m + ", sugSubType=" + this.f87622n + ", sugRef=" + this.f87623o + ", sugRef1=" + this.f87624p + ", filterMap=" + this.f87625q + ")";
    }
}
