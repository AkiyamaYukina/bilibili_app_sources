package com.bilibili.playset.api;

import W60.F;
import androidx.compose.animation.C3353d;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.B;
import c6.P;
import com.bapis.bilibili.app.translation.v1.TranslationBusiness;
import com.google.gson.annotations.SerializedName;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/api/c.class */
@StabilityInferred(parameters = 0)
public final class c extends a implements u {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f84041B;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("cnt_info")
    @Nullable
    private final b f84042b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("cover")
    @Nullable
    private final String f84043c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("fav_time")
    private final int f84044d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("oid")
    private final long f84045e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("intro")
    @Nullable
    private final String f84046f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SerializedName("link")
    @Nullable
    private final String f84047g = null;

    @SerializedName("ogv")
    @Nullable
    private final h h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SerializedName("ugc")
    @Nullable
    private final v f84048i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @SerializedName("count")
    private final int f84049j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @SerializedName("playback_position")
    private final int f84050k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @SerializedName("playback_desc")
    @Nullable
    private final String f84051l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @SerializedName("title")
    @Nullable
    private final String f84052m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @SerializedName("otype")
    private final int f84053n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @SerializedName("upper")
    @Nullable
    private final Upper f84054o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @SerializedName("left_text")
    @Nullable
    private final String f84055p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @SerializedName("left_icon_type")
    private final int f84056q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @SerializedName("right_text")
    @Nullable
    private final String f84057r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @SerializedName("right_icon_type")
    private final int f84058s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @SerializedName("user_state")
    private final int f84059t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f84060u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f84061v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @SerializedName("card_type")
    private final int f84062w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @SerializedName("is_invalid")
    private final boolean f84063x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f84064y = true;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f84065z = true;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @SerializedName("translate_info")
    @Nullable
    private final TranslateInfo f84040A = null;

    @Override // com.bilibili.playset.api.u
    @NotNull
    public final String a() {
        String str = this.f84052m;
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        return str2;
    }

    @Nullable
    public final b b() {
        return this.f84042b;
    }

    @Nullable
    public final String c() {
        return this.f84043c;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String d() {
        /*
            r2 = this;
            r0 = r2
            com.bilibili.playset.api.TranslateInfo r0 = r0.f84040A
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L11
            r0 = r3
            java.lang.String r0 = r0.getTranslateTitle()
            r3 = r0
            goto L13
        L11:
            r0 = 0
            r3 = r0
        L13:
            java.lang.String r0 = ""
            r4 = r0
            r0 = r3
            if (r0 == 0) goto L57
            r0 = r3
            int r0 = r0.length()
            if (r0 != 0) goto L26
            goto L57
        L26:
            r0 = r2
            boolean r0 = com.bilibili.playset.api.e.a(r0)
            if (r0 == 0) goto L57
            r0 = r2
            com.bilibili.playset.api.TranslateInfo r0 = r0.f84040A
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L47
            r0 = r3
            java.lang.String r0 = r0.getTranslateTitle()
            r5 = r0
            r0 = r5
            r3 = r0
            r0 = r5
            if (r0 != 0) goto L44
            goto L47
        L44:
            goto L64
        L47:
            r0 = r2
            java.lang.String r0 = r0.f84052m
            r5 = r0
            r0 = r5
            r3 = r0
            r0 = r5
            if (r0 != 0) goto L44
            r0 = r4
            r3 = r0
            goto L64
        L57:
            r0 = r2
            java.lang.String r0 = r0.f84052m
            r5 = r0
            r0 = r5
            r3 = r0
            r0 = r5
            if (r0 != 0) goto L44
            r0 = r4
            r3 = r0
        L64:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.api.c.d():java.lang.String");
    }

    @Nullable
    public final String e() {
        return this.f84046f;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f84042b, cVar.f84042b) && Intrinsics.areEqual(this.f84043c, cVar.f84043c) && this.f84044d == cVar.f84044d && this.f84045e == cVar.f84045e && Intrinsics.areEqual(this.f84046f, cVar.f84046f) && Intrinsics.areEqual(this.f84047g, cVar.f84047g) && Intrinsics.areEqual(this.h, cVar.h) && Intrinsics.areEqual(this.f84048i, cVar.f84048i) && this.f84049j == cVar.f84049j && this.f84050k == cVar.f84050k && Intrinsics.areEqual(this.f84051l, cVar.f84051l) && Intrinsics.areEqual(this.f84052m, cVar.f84052m) && this.f84053n == cVar.f84053n && Intrinsics.areEqual(this.f84054o, cVar.f84054o) && Intrinsics.areEqual(this.f84055p, cVar.f84055p) && this.f84056q == cVar.f84056q && Intrinsics.areEqual(this.f84057r, cVar.f84057r) && this.f84058s == cVar.f84058s && this.f84059t == cVar.f84059t && this.f84060u == cVar.f84060u && this.f84061v == cVar.f84061v && this.f84062w == cVar.f84062w && this.f84063x == cVar.f84063x && this.f84064y == cVar.f84064y && this.f84065z == cVar.f84065z && Intrinsics.areEqual(this.f84040A, cVar.f84040A);
    }

    public final int f() {
        return this.f84056q;
    }

    @Nullable
    public final String g() {
        return this.f84055p;
    }

    @Override // com.bilibili.playset.api.u
    @NotNull
    public final String getBizId() {
        long j7 = this.f84045e;
        return j7 > 0 ? String.valueOf(j7) : "";
    }

    @Override // com.bilibili.playset.api.u
    @NotNull
    public final TranslationBusiness getBizType() {
        return TranslationBusiness.TRANS_BIZ_ARC;
    }

    @Override // com.bilibili.playset.api.u
    public final void h(@Nullable String str) {
        TranslateInfo translateInfo = this.f84040A;
        if (translateInfo != null) {
            translateInfo.setTranslateTitle(str);
        }
    }

    public final int hashCode() {
        b bVar = this.f84042b;
        int iHashCode = bVar == null ? 0 : bVar.hashCode();
        String str = this.f84043c;
        int iA = C3554n0.a(I.a(this.f84044d, ((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.f84045e);
        String str2 = this.f84046f;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.f84047g;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        h hVar = this.h;
        int iHashCode4 = hVar == null ? 0 : hVar.hashCode();
        v vVar = this.f84048i;
        int iA2 = I.a(this.f84050k, I.a(this.f84049j, (((((((iA + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (vVar == null ? 0 : vVar.hashCode())) * 31, 31), 31);
        String str4 = this.f84051l;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.f84052m;
        int iA3 = I.a(this.f84053n, (((iA2 + iHashCode5) * 31) + (str5 == null ? 0 : str5.hashCode())) * 31, 31);
        Upper upper = this.f84054o;
        int iHashCode6 = upper == null ? 0 : upper.hashCode();
        String str6 = this.f84055p;
        int iA4 = I.a(this.f84056q, (((iA3 + iHashCode6) * 31) + (str6 == null ? 0 : str6.hashCode())) * 31, 31);
        String str7 = this.f84057r;
        int iA5 = z.a(z.a(z.a(I.a(this.f84062w, z.a(z.a(I.a(this.f84059t, I.a(this.f84058s, (iA4 + (str7 == null ? 0 : str7.hashCode())) * 31, 31), 31), 31, this.f84060u), 31, this.f84061v), 31), 31, this.f84063x), 31, this.f84064y), 31, this.f84065z);
        TranslateInfo translateInfo = this.f84040A;
        return iA5 + (translateInfo == null ? 0 : translateInfo.hashCode());
    }

    @Nullable
    public final String i() {
        return this.f84047g;
    }

    @Nullable
    public final h j() {
        return this.h;
    }

    public final long k() {
        return this.f84045e;
    }

    public final int l() {
        return this.f84053n;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0014  */
    @Override // com.bilibili.playset.api.u
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m() {
        /*
            r2 = this;
            r0 = r2
            com.bilibili.playset.api.TranslateInfo r0 = r0.f84040A
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L14
            r0 = r3
            java.lang.String r0 = r0.getTranslateTitle()
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L17
        L14:
            java.lang.String r0 = ""
            r3 = r0
        L17:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.api.c.m():java.lang.String");
    }

    @Override // com.bilibili.playset.api.u
    public final int n() {
        TranslateInfo translateInfo = this.f84040A;
        return translateInfo != null ? translateInfo.getTranslateState() : 0;
    }

    @Nullable
    public final String o() {
        return this.f84051l;
    }

    public final int p() {
        return this.f84050k;
    }

    @Override // com.bilibili.playset.api.u
    public final void q(int i7) {
        TranslateInfo translateInfo = this.f84040A;
        if (translateInfo != null) {
            translateInfo.setTranslateState(i7);
        }
        Function0<Unit> function0 = this.f84041B;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final int r() {
        return this.f84058s;
    }

    @Nullable
    public final String s() {
        return this.f84057r;
    }

    @Nullable
    public final String t() {
        return this.f84052m;
    }

    @NotNull
    public final String toString() {
        b bVar = this.f84042b;
        String str = this.f84043c;
        int i7 = this.f84044d;
        long j7 = this.f84045e;
        String str2 = this.f84046f;
        String str3 = this.f84047g;
        h hVar = this.h;
        v vVar = this.f84048i;
        int i8 = this.f84049j;
        int i9 = this.f84050k;
        String str4 = this.f84051l;
        String str5 = this.f84052m;
        int i10 = this.f84053n;
        Upper upper = this.f84054o;
        String str6 = this.f84055p;
        int i11 = this.f84056q;
        String str7 = this.f84057r;
        int i12 = this.f84058s;
        int i13 = this.f84059t;
        int i14 = this.f84062w;
        boolean z6 = this.f84063x;
        boolean z7 = this.f84064y;
        boolean z8 = this.f84065z;
        TranslateInfo translateInfo = this.f84040A;
        StringBuilder sb = new StringBuilder("FavoritesMediasItem(cntInfo=");
        sb.append(bVar);
        sb.append(", cover=");
        sb.append(str);
        sb.append(", favTime=");
        androidx.core.app.o.b(i7, j7, ", oid=", sb);
        B.a(", intro=", str2, ", link=", str3, sb);
        sb.append(", ogv=");
        sb.append(hVar);
        sb.append(", ugc=");
        sb.append(vVar);
        F.b(i8, i9, ", page=", ", playbackPosition=", sb);
        B.a(", playbackDesc=", str4, ", title=", str5, sb);
        sb.append(", otype=");
        sb.append(i10);
        sb.append(", upper=");
        sb.append(upper);
        bf.a.a(i11, ", leftText=", str6, ", leftIconType=", sb);
        bf.a.a(i12, ", rightText=", str7, ", rightIconType=", sb);
        N1.c.a(i13, ", userState=", ", isCheckMode=", sb);
        sb.append(this.f84060u);
        sb.append(", isChecked=");
        C3353d.b(", cardType=", ", isInvalid=", i14, this.f84061v, sb);
        P.a(", enableMore=", ", enableClearInvalid=", sb, z6, z7);
        sb.append(z8);
        sb.append(", translateInfo=");
        sb.append(translateInfo);
        sb.append(")");
        return sb.toString();
    }

    @Nullable
    public final TranslateInfo u() {
        return this.f84040A;
    }

    @Nullable
    public final v v() {
        return this.f84048i;
    }

    @Nullable
    public final Upper w() {
        return this.f84054o;
    }

    public final boolean x() {
        return this.f84053n == 12;
    }

    public final boolean y() {
        return this.f84063x;
    }
}
