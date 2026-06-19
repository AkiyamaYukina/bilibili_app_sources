package com.bilibili.search2.result.base;

import I.E;
import K7.L;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.GravityCompat;
import androidx.media3.exoplayer.analytics.C4665g;
import androidx.paging.M;
import androidx.room.B;
import com.bapis.bilibili.polymer.app.search.v1.Sort;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/v.class */
@StabilityInferred(parameters = 0)
public final class v {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @Nullable
    public final String f87640A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @Nullable
    public final String f87641B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @Nullable
    public final Map<String, String> f87642C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f87643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f87644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f87645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f87646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final String f87647e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public String f87648f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f87649g;

    @Nullable
    public List<Integer> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public List<Integer> f87650i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f87651j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f87652k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f87653l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f87654m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f87655n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f87656o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public String f87657p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f87658q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f87659r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final Xs0.a f87660s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public final Integer f87661t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public final String f87662u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public final Long f87663v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public final Long f87664w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f87665x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public Sort f87666y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public final String f87667z;

    public /* synthetic */ v(String str, int i7, boolean z6, boolean z7, String str2, String str3, List list, List list2, boolean z8, int i8, int i9, boolean z9, boolean z10, int i10, String str4, long j7, long j8, Xs0.a aVar, Integer num, String str5, Long l7, Long l8, int i11, String str6, String str7, String str8, Map map, int i12) {
        this(str, i7, z6, z7, str2, str3, false, list, list2, z8, i8, i9, z9, (i12 & 8192) != 0 ? false : z10, i10, str4, j7, j8, aVar, num, str5, l7, l8, (i12 & GravityCompat.RELATIVE_LAYOUT_DIRECTION) != 0 ? 0 : i11, null, str6, str7, str8, map);
    }

    public v(@Nullable String str, int i7, boolean z6, boolean z7, @Nullable String str2, @Nullable String str3, boolean z8, @Nullable List<Integer> list, @Nullable List<Integer> list2, boolean z9, int i8, int i9, boolean z10, boolean z11, int i10, @NotNull String str4, long j7, long j8, @NotNull Xs0.a aVar, @Nullable Integer num, @Nullable String str5, @Nullable Long l7, @Nullable Long l8, int i11, @Nullable Sort sort, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable Map<String, String> map) {
        this.f87643a = str;
        this.f87644b = i7;
        this.f87645c = z6;
        this.f87646d = z7;
        this.f87647e = str2;
        this.f87648f = str3;
        this.f87649g = z8;
        this.h = list;
        this.f87650i = list2;
        this.f87651j = z9;
        this.f87652k = i8;
        this.f87653l = i9;
        this.f87654m = z10;
        this.f87655n = z11;
        this.f87656o = i10;
        this.f87657p = str4;
        this.f87658q = j7;
        this.f87659r = j8;
        this.f87660s = aVar;
        this.f87661t = num;
        this.f87662u = str5;
        this.f87663v = l7;
        this.f87664w = l8;
        this.f87665x = i11;
        this.f87666y = sort;
        this.f87667z = str6;
        this.f87640A = str7;
        this.f87641B = str8;
        this.f87642C = map;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Intrinsics.areEqual(this.f87643a, vVar.f87643a) && this.f87644b == vVar.f87644b && this.f87645c == vVar.f87645c && this.f87646d == vVar.f87646d && Intrinsics.areEqual(this.f87647e, vVar.f87647e) && Intrinsics.areEqual(this.f87648f, vVar.f87648f) && this.f87649g == vVar.f87649g && Intrinsics.areEqual(this.h, vVar.h) && Intrinsics.areEqual(this.f87650i, vVar.f87650i) && this.f87651j == vVar.f87651j && this.f87652k == vVar.f87652k && this.f87653l == vVar.f87653l && this.f87654m == vVar.f87654m && this.f87655n == vVar.f87655n && this.f87656o == vVar.f87656o && Intrinsics.areEqual(this.f87657p, vVar.f87657p) && this.f87658q == vVar.f87658q && this.f87659r == vVar.f87659r && Intrinsics.areEqual(this.f87660s, vVar.f87660s) && Intrinsics.areEqual(this.f87661t, vVar.f87661t) && Intrinsics.areEqual(this.f87662u, vVar.f87662u) && Intrinsics.areEqual(this.f87663v, vVar.f87663v) && Intrinsics.areEqual(this.f87664w, vVar.f87664w) && this.f87665x == vVar.f87665x && this.f87666y == vVar.f87666y && Intrinsics.areEqual(this.f87667z, vVar.f87667z) && Intrinsics.areEqual(this.f87640A, vVar.f87640A) && Intrinsics.areEqual(this.f87641B, vVar.f87641B) && Intrinsics.areEqual(this.f87642C, vVar.f87642C);
    }

    public final int hashCode() {
        int iHashCode = 0;
        String str = this.f87643a;
        int iA = z.a(z.a(I.a(this.f87644b, (str == null ? 0 : str.hashCode()) * 31, 31), 31, this.f87645c), 31, this.f87646d);
        String str2 = this.f87647e;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.f87648f;
        int iA2 = z.a((((iA + iHashCode2) * 31) + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f87649g);
        List<Integer> list = this.h;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        List<Integer> list2 = this.f87650i;
        int iA3 = C3554n0.a(C3554n0.a(E.a(I.a(this.f87656o, z.a(z.a(I.a(this.f87653l, I.a(this.f87652k, z.a((((iA2 + iHashCode3) * 31) + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.f87651j), 31), 31), 31, this.f87654m), 31, this.f87655n), 31), 31, this.f87657p), 31, this.f87658q), 31, this.f87659r);
        int iHashCode4 = this.f87660s.hashCode();
        Integer num = this.f87661t;
        int iHashCode5 = num == null ? 0 : num.hashCode();
        String str4 = this.f87662u;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        Long l7 = this.f87663v;
        int iHashCode7 = l7 == null ? 0 : l7.hashCode();
        Long l8 = this.f87664w;
        int iA4 = I.a(this.f87665x, (((((((((iHashCode4 + iA3) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (l8 == null ? 0 : l8.hashCode())) * 31, 31);
        Sort sort = this.f87666y;
        int iHashCode8 = sort == null ? 0 : sort.hashCode();
        String str5 = this.f87667z;
        int iHashCode9 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.f87640A;
        int iHashCode10 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.f87641B;
        int iHashCode11 = str7 == null ? 0 : str7.hashCode();
        Map<String, String> map = this.f87642C;
        if (map != null) {
            iHashCode = map.hashCode();
        }
        return ((((((((iA4 + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        String str = this.f87648f;
        List<Integer> list = this.h;
        List<Integer> list2 = this.f87650i;
        String str2 = this.f87657p;
        Sort sort = this.f87666y;
        Map<String, String> map = this.f87642C;
        StringBuilder sb = new StringBuilder("SearchMoreParams(keyword=");
        sb.append(this.f87643a);
        sb.append(", page=");
        sb.append(this.f87644b);
        sb.append(", isFilter=");
        sb.append(this.f87645c);
        sb.append(", fromExtra=");
        sb.append(this.f87646d);
        sb.append(", from=");
        B.a(this.f87647e, ", mOrder=", str, ", isSearchMore=", sb);
        L.b(sb, this.f87649g, ", tList=", list, ", dList=");
        sb.append(list2);
        sb.append(", reset=");
        sb.append(this.f87651j);
        sb.append(", version=");
        sb.append(this.f87652k);
        sb.append(", isOrgQuery=");
        sb.append(this.f87653l);
        sb.append(", forceChatGpt=");
        sb.append(this.f87654m);
        sb.append(", isRefresh=");
        sb.append(this.f87655n);
        sb.append(", refreshTimes=");
        M.a(this.f87656o, ", since=", str2, ", pubTimeStart=", sb);
        sb.append(this.f87658q);
        sb.append(", pubTimeEnd=");
        sb.append(this.f87659r);
        sb.append(", reportExt=");
        sb.append(this.f87660s);
        sb.append(", sugTermType=");
        sb.append(this.f87661t);
        sb.append(", sugSubType=");
        sb.append(this.f87662u);
        sb.append(", sugRef=");
        sb.append(this.f87663v);
        sb.append(", sugRef1=");
        sb.append(this.f87664w);
        sb.append(", currentSize=");
        sb.append(this.f87665x);
        sb.append(", sort=");
        sb.append(sort);
        sb.append(", fromAvid=");
        sb.append(this.f87667z);
        sb.append(", fromComid=");
        sb.append(this.f87640A);
        sb.append(", fromTrackId=");
        return C4665g.a(sb, this.f87641B, ", filterMap=", map, ")");
    }
}
