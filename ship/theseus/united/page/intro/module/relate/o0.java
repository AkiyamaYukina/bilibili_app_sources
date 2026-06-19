package com.bilibili.ship.theseus.united.page.intro.module.relate;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.adcommon.data.model.AdRelateItem;
import com.bilibili.adcommon.data.model.SourceContent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/o0.class */
@StabilityInferred(parameters = 0)
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final RelateCardType f101316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f101317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final p0 f101318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final G0 f101319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final SourceContent f101320e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final C6321j0 f101321f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final C6319i0 f101322g;

    @Nullable
    public final C6323k0 h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final C6325l0 f101323i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final A0 f101324j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final m0 f101325k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public final C0 f101326l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public final F0 f101327m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public final RelateBangumiResourceCard f101328n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public final s0 f101329o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public final D0 f101330p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public final B0 f101331q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f101334t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f101335u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public String f101337w;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f101332r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f101333s = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public String f101336v = "";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public String f101338x = "";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f101339y = Long.MIN_VALUE;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public String f101340z = "";

    public o0(@NotNull RelateCardType relateCardType, @NotNull String str, @NotNull p0 p0Var, @Nullable G0 g02, @Nullable SourceContent sourceContent, @Nullable C6321j0 c6321j0, @Nullable C6319i0 c6319i0, @Nullable C6323k0 c6323k0, @Nullable C6325l0 c6325l0, @Nullable A0 a02, @Nullable m0 m0Var, @Nullable C0 c02, @Nullable F0 f02, @Nullable RelateBangumiResourceCard relateBangumiResourceCard, @Nullable s0 s0Var, @Nullable D0 d02, @Nullable B0 b02) {
        this.f101316a = relateCardType;
        this.f101317b = str;
        this.f101318c = p0Var;
        this.f101319d = g02;
        this.f101320e = sourceContent;
        this.f101321f = c6321j0;
        this.f101322g = c6319i0;
        this.h = c6323k0;
        this.f101323i = c6325l0;
        this.f101324j = a02;
        this.f101325k = m0Var;
        this.f101326l = c02;
        this.f101327m = f02;
        this.f101328n = relateBangumiResourceCard;
        this.f101329o = s0Var;
        this.f101330p = d02;
        this.f101331q = b02;
        this.f101337w = p0Var.f101346c;
    }

    public final boolean a() {
        return this.f101316a == RelateCardType.f101047AV;
    }

    @NotNull
    public final String b() {
        String strValueOf;
        AdRelateItem adRelateItem;
        if (this.f101316a == RelateCardType.CM) {
            m0 m0Var = this.f101325k;
            strValueOf = String.valueOf((m0Var == null || (adRelateItem = m0Var.f101304k) == null) ? null : Long.valueOf(adRelateItem.getCreativeId()));
        } else {
            strValueOf = String.valueOf(this.f101318c.f101354l);
        }
        return strValueOf;
    }

    @Nullable
    public final String c() {
        String strB;
        if (a()) {
            C6321j0 c6321j0 = this.f101321f;
            strB = null;
            if (c6321j0 != null) {
                C6302a c6302a = c6321j0.f101268f;
                strB = null;
                if (c6302a != null) {
                    strB = c6302a.f101087a;
                }
            }
        } else {
            RelateCardType relateCardType = RelateCardType.BANGUMI;
            RelateCardType relateCardType2 = this.f101316a;
            if (relateCardType2 == relateCardType) {
                C6325l0 c6325l0 = this.f101323i;
                strB = null;
                if (c6325l0 != null) {
                    C6302a c6302a2 = c6325l0.f101284f;
                    strB = null;
                    if (c6302a2 != null) {
                        strB = c6302a2.f101087a;
                    }
                }
            } else if (relateCardType2 == RelateCardType.RESOURCE) {
                RelateBangumiResourceCard relateBangumiResourceCard = this.f101328n;
                strB = null;
                if (relateBangumiResourceCard != null) {
                    strB = relateBangumiResourceCard.b();
                }
            } else if (relateCardType2 == RelateCardType.GAME) {
                A0 a02 = this.f101324j;
                strB = null;
                if (a02 != null) {
                    strB = a02.h;
                }
            } else {
                strB = null;
                if (relateCardType2 == RelateCardType.SPECIAL) {
                    F0 f02 = this.f101327m;
                    strB = null;
                    if (f02 != null) {
                        C6302a c6302a3 = f02.f100998b;
                        strB = null;
                        if (c6302a3 != null) {
                            strB = c6302a3.f101087a;
                        }
                    }
                }
            }
        }
        return strB;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return this.f101316a == o0Var.f101316a && Intrinsics.areEqual(this.f101317b, o0Var.f101317b) && Intrinsics.areEqual(this.f101318c, o0Var.f101318c) && Intrinsics.areEqual(this.f101319d, o0Var.f101319d) && Intrinsics.areEqual(this.f101320e, o0Var.f101320e) && Intrinsics.areEqual(this.f101321f, o0Var.f101321f) && Intrinsics.areEqual(this.f101322g, o0Var.f101322g) && Intrinsics.areEqual(this.h, o0Var.h) && Intrinsics.areEqual(this.f101323i, o0Var.f101323i) && Intrinsics.areEqual(this.f101324j, o0Var.f101324j) && Intrinsics.areEqual(this.f101325k, o0Var.f101325k) && Intrinsics.areEqual(this.f101326l, o0Var.f101326l) && Intrinsics.areEqual(this.f101327m, o0Var.f101327m) && Intrinsics.areEqual(this.f101328n, o0Var.f101328n) && Intrinsics.areEqual(this.f101329o, o0Var.f101329o) && Intrinsics.areEqual(this.f101330p, o0Var.f101330p) && Intrinsics.areEqual(this.f101331q, o0Var.f101331q);
    }

    public final int hashCode() {
        int iA = I.E.a(this.f101316a.hashCode() * 31, 31, this.f101317b);
        int iHashCode = this.f101318c.hashCode();
        int iHashCode2 = 0;
        G0 g02 = this.f101319d;
        int iHashCode3 = g02 == null ? 0 : g02.hashCode();
        SourceContent sourceContent = this.f101320e;
        int iHashCode4 = sourceContent == null ? 0 : sourceContent.hashCode();
        C6321j0 c6321j0 = this.f101321f;
        int iHashCode5 = c6321j0 == null ? 0 : c6321j0.hashCode();
        C6319i0 c6319i0 = this.f101322g;
        int iHashCode6 = c6319i0 == null ? 0 : c6319i0.hashCode();
        C6323k0 c6323k0 = this.h;
        int iHashCode7 = c6323k0 == null ? 0 : c6323k0.hashCode();
        C6325l0 c6325l0 = this.f101323i;
        int iHashCode8 = c6325l0 == null ? 0 : c6325l0.hashCode();
        A0 a02 = this.f101324j;
        int iHashCode9 = a02 == null ? 0 : a02.hashCode();
        m0 m0Var = this.f101325k;
        int iHashCode10 = m0Var == null ? 0 : m0Var.hashCode();
        C0 c02 = this.f101326l;
        int iHashCode11 = c02 == null ? 0 : c02.hashCode();
        F0 f02 = this.f101327m;
        int iHashCode12 = f02 == null ? 0 : f02.hashCode();
        RelateBangumiResourceCard relateBangumiResourceCard = this.f101328n;
        int iHashCode13 = relateBangumiResourceCard == null ? 0 : relateBangumiResourceCard.hashCode();
        s0 s0Var = this.f101329o;
        int iHashCode14 = s0Var == null ? 0 : s0Var.hashCode();
        D0 d02 = this.f101330p;
        int iHashCode15 = d02 == null ? 0 : d02.f100834a.hashCode();
        B0 b02 = this.f101331q;
        if (b02 != null) {
            iHashCode2 = b02.hashCode();
        }
        return ((((((((((((((((((((((((((((iHashCode + iA) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode2;
    }

    @NotNull
    public final String toString() {
        return "RelateCard(type=" + this.f101316a + ", goto=" + this.f101317b + ", basicInfo=" + this.f101318c + ", threePoint=" + this.f101319d + ", cmStock=" + this.f101320e + ", avCard=" + this.f101321f + ", aiCard=" + this.f101322g + ", bangumiAvCard=" + this.h + ", bangumiCard=" + this.f101323i + ", gameCard=" + this.f101324j + ", cmCard=" + this.f101325k + ", liveCard=" + this.f101326l + ", specialCard=" + this.f101327m + ", resourceCard=" + this.f101328n + ", courseCard=" + this.f101329o + ", miniProgramCard=" + this.f101330p + ", historyAVCard=" + this.f101331q + ")";
    }
}
