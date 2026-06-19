package com.bilibili.ship.theseus.playlist.api;

import I.E;
import Ou0.a;
import Ou0.c;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.colorspace.A;
import androidx.compose.ui.graphics.e0;
import androidx.core.view.GravityCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.media3.common.G;
import androidx.paging.M;
import c6.O;
import c6.P;
import com.bilibili.bson.common.Bson;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.mobile.BLMobileHumanActionNative;
import com.bilibili.opd.app.bizcommon.context.provider.MallProviderParamsHelper;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/api/MultiTypeMedia.class */
@StabilityInferred(parameters = 0)
@Bson
public final class MultiTypeMedia {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @SerializedName("ogv_info")
    @Nullable
    private final OgvInfo f95213A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @SerializedName("pugv_info")
    @Nullable
    private final PugvInfo f95214B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @SerializedName("forbid_fav")
    private final boolean f95215C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @SerializedName("progress_percent")
    private final double f95216D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @SerializedName("badge")
    @Nullable
    private final Badge f95217E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @NotNull
    public final String f95218F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final boolean f95219G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final boolean f95220H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @SerializedName("show_trans")
    private final boolean f95221I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final boolean f95222J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    @NotNull
    public String f95223K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f95224L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    @NotNull
    public final List<c> f95225M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f95226N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    @Nullable
    public transient ExposureEntry f95227O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f95228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("bv_id")
    @NotNull
    private final String f95229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("cnt_info")
    @Nullable
    private final SocializeInfo f95230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final CoinExtra f95231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("copy_right")
    private final int f95232e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f95233f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f95234g;
    public final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f95235i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f95236j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final String f95237k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f95238l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final String f95239m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f95240n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @SerializedName(MallProviderParamsHelper.ActiveProviderParams.URI_QUERY_PAGE)
    private final int f95241o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final List<Page> f95242p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f95243q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public final Rights f95244r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final String f95245s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f95246t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final String f95247u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f95248v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public final Upper f95249w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f95250x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f95251y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f95252z;

    public MultiTypeMedia() {
        this(0, null, null, null, 0, null, 0L, 0, 0L, 0, null, 0, null, 0L, 0, null, 0L, null, null, 0L, null, 0, null, false, false, 0, null, null, false, 0.0d, null, null, false, false, false, false, null, 0, null, 0, -1, 255);
    }

    public MultiTypeMedia(int i7, @NotNull String str, @Nullable SocializeInfo socializeInfo, @Nullable CoinExtra coinExtra, int i8, @NotNull String str2, long j7, int i9, long j8, int i10, @NotNull String str3, int i11, @NotNull String str4, long j9, int i12, @NotNull List<Page> list, long j10, @Nullable Rights rights, @NotNull String str5, long j11, @NotNull String str6, int i13, @Nullable Upper upper, boolean z6, boolean z7, int i14, @Nullable OgvInfo ogvInfo, @Nullable PugvInfo pugvInfo, boolean z8, double d7, @Nullable Badge badge, @NotNull String str7, boolean z9, boolean z10, boolean z11, boolean z12, @NotNull String str8, int i15, @NotNull List<c> list2, int i16) {
        this.f95228a = i7;
        this.f95229b = str;
        this.f95230c = socializeInfo;
        this.f95231d = coinExtra;
        this.f95232e = i8;
        this.f95233f = str2;
        this.f95234g = j7;
        this.h = i9;
        this.f95235i = j8;
        this.f95236j = i10;
        this.f95237k = str3;
        this.f95238l = i11;
        this.f95239m = str4;
        this.f95240n = j9;
        this.f95241o = i12;
        this.f95242p = list;
        this.f95243q = j10;
        this.f95244r = rights;
        this.f95245s = str5;
        this.f95246t = j11;
        this.f95247u = str6;
        this.f95248v = i13;
        this.f95249w = upper;
        this.f95250x = z6;
        this.f95251y = z7;
        this.f95252z = i14;
        this.f95213A = ogvInfo;
        this.f95214B = pugvInfo;
        this.f95215C = z8;
        this.f95216D = d7;
        this.f95217E = badge;
        this.f95218F = str7;
        this.f95219G = z9;
        this.f95220H = z10;
        this.f95221I = z11;
        this.f95222J = z12;
        this.f95223K = str8;
        this.f95224L = i15;
        this.f95225M = list2;
        this.f95226N = i16;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MultiTypeMedia(int i7, String str, SocializeInfo socializeInfo, CoinExtra coinExtra, int i8, String str2, long j7, int i9, long j8, int i10, String str3, int i11, String str4, long j9, int i12, List list, long j10, Rights rights, String str5, long j11, String str6, int i13, Upper upper, boolean z6, boolean z7, int i14, OgvInfo ogvInfo, PugvInfo pugvInfo, boolean z8, double d7, Badge badge, String str7, boolean z9, boolean z10, boolean z11, boolean z12, String str8, int i15, List list2, int i16, int i17, int i18) {
        PugvInfo pugvInfo2;
        String str9;
        OgvInfo ogvInfo2;
        PugvInfo pugvInfo3;
        i7 = (i17 & 1) != 0 ? 0 : i7;
        String str10 = (i17 & 2) != 0 ? "" : str;
        SocializeInfo socializeInfo2 = (i17 & 4) != 0 ? null : socializeInfo;
        CoinExtra coinExtra2 = (i17 & 8) != 0 ? null : coinExtra;
        i8 = (i17 & 16) != 0 ? 0 : i8;
        str2 = (i17 & 32) != 0 ? "" : str2;
        j7 = (i17 & 64) != 0 ? 0L : j7;
        i9 = (i17 & 128) != 0 ? 0 : i9;
        j8 = (i17 & 256) != 0 ? 0L : j8;
        i10 = (i17 & 512) != 0 ? 0 : i10;
        String str11 = (i17 & 1024) != 0 ? "" : str3;
        i11 = (i17 & 2048) != 0 ? 0 : i11;
        String str12 = (i17 & 4096) != 0 ? "" : str4;
        j9 = (i17 & 8192) != 0 ? 0L : j9;
        i12 = (i17 & 16384) != 0 ? 0 : i12;
        List listEmptyList = (i17 & 32768) != 0 ? CollectionsKt.emptyList() : list;
        j10 = (i17 & 65536) != 0 ? 0L : j10;
        Rights rights2 = (i17 & 131072) != 0 ? null : rights;
        String str13 = (i17 & 262144) != 0 ? "" : str5;
        j11 = (i17 & AccessibilityNodeInfoCompat.ACTION_COLLAPSE) != 0 ? 0L : j11;
        String str14 = (i17 & AccessibilityNodeInfoCompat.ACTION_DISMISS) != 0 ? "" : str6;
        i13 = (i17 & AccessibilityNodeInfoCompat.ACTION_SET_TEXT) != 0 ? 0 : i13;
        Upper upper2 = (i17 & 4194304) != 0 ? null : upper;
        z6 = (i17 & GravityCompat.RELATIVE_LAYOUT_DIRECTION) != 0 ? false : z6;
        z7 = (i17 & 16777216) != 0 ? false : z7;
        i14 = (i17 & BLMobileHumanActionNative.BL_MOBILE_ENABLE_HAND_SKELETON_KEYPOINTS_3D) != 0 ? 0 : i14;
        OgvInfo ogvInfo3 = (i17 & BLMobileHumanActionNative.BL_MOBILE_ENABLE_MULTI_SEGMENT) != 0 ? null : ogvInfo;
        PugvInfo pugvInfo4 = (i17 & BLMobileHumanActionNative.BL_MOBILE_ENABLE_GAZE_DETECT) != 0 ? null : pugvInfo;
        z8 = (i17 & BLMobileHumanActionNative.BL_MOBILE_ENABLE_DYNAMIC_GESTURE) != 0 ? false : z8;
        d7 = (i17 & BLMobileHumanActionNative.BL_MOBILE_ENABLE_AVATAR_HELPER) != 0 ? 0.0d : d7;
        Badge badge2 = (i17 & BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE) != 0 ? null : badge;
        String str15 = (i17 & Integer.MIN_VALUE) != 0 ? "" : str7;
        z9 = (i18 & 1) != 0 ? false : z9;
        z10 = (i18 & 2) != 0 ? false : z10;
        z11 = (i18 & 4) != 0 ? false : z11;
        z12 = (i18 & 8) != 0 ? false : z12;
        String str16 = (i18 & 16) != 0 ? "" : str8;
        i15 = (i18 & 32) != 0 ? 1 : i15;
        if ((i18 & 64) != 0) {
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            if (i13 == 24) {
                if (ogvInfo3 != null) {
                    VideoDimension videoDimension = ogvInfo3.f95258e;
                    listCreateListBuilder.add(new c(ogvInfo3.f95254a, ogvInfo3.f95255b, ogvInfo3.f95256c, ogvInfo3.f95257d, videoDimension == null ? a.f18081a : videoDimension, j7, null, str12, 0, str11, null, null, false, null, 0, 0, null, 261440));
                }
            } else if (i13 != 25) {
                List list3 = listEmptyList;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                Iterator it = list3.iterator();
                int i19 = 0;
                while (true) {
                    int i20 = i19;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    int i21 = i20 + 1;
                    if (i20 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    Page page = (Page) next;
                    arrayList.add(new c(j8, page.f95263d, 0L, 0L, page.f95260a, page.f95261b, page.f95262c, str12, page.h, page.f95267i, null, null, false, null, 0, i21, null, 228364));
                    i19 = i21;
                }
                String str17 = str11;
                ogvInfo2 = ogvInfo3;
                listCreateListBuilder.addAll(arrayList);
                pugvInfo3 = pugvInfo4;
                str9 = str17;
                list2 = CollectionsKt.build(listCreateListBuilder);
                pugvInfo2 = pugvInfo3;
                ogvInfo3 = ogvInfo2;
            } else if (pugvInfo4 != null) {
                VideoDimension videoDimension2 = pugvInfo4.f95294e;
                listCreateListBuilder.add(new c(pugvInfo4.f95290a, pugvInfo4.f95291b, pugvInfo4.f95292c, pugvInfo4.f95293d, videoDimension2 == null ? a.f18081a : videoDimension2, j7, null, str12, 0, str14, pugvInfo4.f95295f, null, false, null, 0, 0, null, 260416));
            }
            PugvInfo pugvInfo5 = pugvInfo4;
            str9 = str11;
            ogvInfo2 = ogvInfo3;
            pugvInfo3 = pugvInfo5;
            list2 = CollectionsKt.build(listCreateListBuilder);
            pugvInfo2 = pugvInfo3;
            ogvInfo3 = ogvInfo2;
        } else {
            pugvInfo2 = pugvInfo4;
            str9 = str11;
        }
        this(i7, str10, socializeInfo2, coinExtra2, i8, str2, j7, i9, j8, i10, str9, i11, str12, j9, i12, listEmptyList, j10, rights2, str13, j11, str14, i13, upper2, z6, z7, i14, ogvInfo3, pugvInfo2, z8, d7, badge2, str15, z9, z10, z11, z12, str16, i15, list2, (i18 & 128) != 0 ? -1 : i16);
    }

    public static MultiTypeMedia a(MultiTypeMedia multiTypeMedia, SocializeInfo socializeInfo, int i7, int i8, boolean z6, boolean z7, int i9, boolean z8, int i10, int i11) {
        int i12 = multiTypeMedia.f95228a;
        String str = multiTypeMedia.f95229b;
        if ((i10 & 4) != 0) {
            socializeInfo = multiTypeMedia.f95230c;
        }
        CoinExtra coinExtra = multiTypeMedia.f95231d;
        int i13 = multiTypeMedia.f95232e;
        String str2 = multiTypeMedia.f95233f;
        long j7 = multiTypeMedia.f95234g;
        if ((i10 & 128) != 0) {
            i7 = multiTypeMedia.h;
        }
        long j8 = multiTypeMedia.f95235i;
        int i14 = multiTypeMedia.f95236j;
        String str3 = multiTypeMedia.f95237k;
        if ((i10 & 2048) != 0) {
            i8 = multiTypeMedia.f95238l;
        }
        String str4 = multiTypeMedia.f95239m;
        long j9 = multiTypeMedia.f95240n;
        int i15 = multiTypeMedia.f95241o;
        List<Page> list = multiTypeMedia.f95242p;
        long j10 = multiTypeMedia.f95243q;
        Rights rights = multiTypeMedia.f95244r;
        String str5 = multiTypeMedia.f95245s;
        long j11 = multiTypeMedia.f95246t;
        String str6 = multiTypeMedia.f95247u;
        int i16 = multiTypeMedia.f95248v;
        Upper upper = multiTypeMedia.f95249w;
        if ((i10 & GravityCompat.RELATIVE_LAYOUT_DIRECTION) != 0) {
            z6 = multiTypeMedia.f95250x;
        }
        if ((16777216 & i10) != 0) {
            z7 = multiTypeMedia.f95251y;
        }
        if ((i10 & BLMobileHumanActionNative.BL_MOBILE_ENABLE_HAND_SKELETON_KEYPOINTS_3D) != 0) {
            i9 = multiTypeMedia.f95252z;
        }
        OgvInfo ogvInfo = multiTypeMedia.f95213A;
        PugvInfo pugvInfo = multiTypeMedia.f95214B;
        boolean z9 = multiTypeMedia.f95215C;
        double d7 = multiTypeMedia.f95216D;
        Badge badge = multiTypeMedia.f95217E;
        String str7 = multiTypeMedia.f95218F;
        boolean z10 = multiTypeMedia.f95219G;
        boolean z11 = multiTypeMedia.f95220H;
        boolean z12 = multiTypeMedia.f95221I;
        if ((i11 & 8) != 0) {
            z8 = multiTypeMedia.f95222J;
        }
        String str8 = multiTypeMedia.f95223K;
        int i17 = multiTypeMedia.f95224L;
        List<c> list2 = multiTypeMedia.f95225M;
        int i18 = multiTypeMedia.f95226N;
        multiTypeMedia.getClass();
        return new MultiTypeMedia(i12, str, socializeInfo, coinExtra, i13, str2, j7, i7, j8, i14, str3, i8, str4, j9, i15, list, j10, rights, str5, j11, str6, i16, upper, z6, z7, i9, ogvInfo, pugvInfo, z9, d7, badge, str7, z10, z11, z12, z8, str8, i17, list2, i18);
    }

    @Nullable
    public final c b() {
        return this.f95219G ? (c) CollectionsKt.firstOrNull(this.f95225M) : this.f95225M.size() == 1 ? (c) CollectionsKt.first(this.f95225M) : null;
    }

    @NotNull
    public final MultiTypeMedia c() {
        SocializeInfo socializeInfo = this.f95230c;
        return a(this, socializeInfo != null ? SocializeInfo.a(socializeInfo, 0, 0, Math.max(socializeInfo.f95315i - 1, 0), 1791) : null, 0, 0, false, false, 0, false, -2053, 255);
    }

    public final long d() {
        return this.f95225M.size() == 1 ? ((c) CollectionsKt.first(this.f95225M)).f18088a : this.f95235i;
    }

    @Nullable
    public final Badge e() {
        return this.f95217E;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiTypeMedia)) {
            return false;
        }
        MultiTypeMedia multiTypeMedia = (MultiTypeMedia) obj;
        return this.f95228a == multiTypeMedia.f95228a && Intrinsics.areEqual(this.f95229b, multiTypeMedia.f95229b) && Intrinsics.areEqual(this.f95230c, multiTypeMedia.f95230c) && Intrinsics.areEqual(this.f95231d, multiTypeMedia.f95231d) && this.f95232e == multiTypeMedia.f95232e && Intrinsics.areEqual(this.f95233f, multiTypeMedia.f95233f) && this.f95234g == multiTypeMedia.f95234g && this.h == multiTypeMedia.h && this.f95235i == multiTypeMedia.f95235i && this.f95236j == multiTypeMedia.f95236j && Intrinsics.areEqual(this.f95237k, multiTypeMedia.f95237k) && this.f95238l == multiTypeMedia.f95238l && Intrinsics.areEqual(this.f95239m, multiTypeMedia.f95239m) && this.f95240n == multiTypeMedia.f95240n && this.f95241o == multiTypeMedia.f95241o && Intrinsics.areEqual(this.f95242p, multiTypeMedia.f95242p) && this.f95243q == multiTypeMedia.f95243q && Intrinsics.areEqual(this.f95244r, multiTypeMedia.f95244r) && Intrinsics.areEqual(this.f95245s, multiTypeMedia.f95245s) && this.f95246t == multiTypeMedia.f95246t && Intrinsics.areEqual(this.f95247u, multiTypeMedia.f95247u) && this.f95248v == multiTypeMedia.f95248v && Intrinsics.areEqual(this.f95249w, multiTypeMedia.f95249w) && this.f95250x == multiTypeMedia.f95250x && this.f95251y == multiTypeMedia.f95251y && this.f95252z == multiTypeMedia.f95252z && Intrinsics.areEqual(this.f95213A, multiTypeMedia.f95213A) && Intrinsics.areEqual(this.f95214B, multiTypeMedia.f95214B) && this.f95215C == multiTypeMedia.f95215C && Double.compare(this.f95216D, multiTypeMedia.f95216D) == 0 && Intrinsics.areEqual(this.f95217E, multiTypeMedia.f95217E) && Intrinsics.areEqual(this.f95218F, multiTypeMedia.f95218F) && this.f95219G == multiTypeMedia.f95219G && this.f95220H == multiTypeMedia.f95220H && this.f95221I == multiTypeMedia.f95221I && this.f95222J == multiTypeMedia.f95222J && Intrinsics.areEqual(this.f95223K, multiTypeMedia.f95223K) && this.f95224L == multiTypeMedia.f95224L && Intrinsics.areEqual(this.f95225M, multiTypeMedia.f95225M) && this.f95226N == multiTypeMedia.f95226N;
    }

    @NotNull
    public final String f() {
        return this.f95229b;
    }

    public final int g() {
        return this.f95232e;
    }

    public final boolean h() {
        return this.f95215C;
    }

    public final int hashCode() {
        int iA = E.a(Integer.hashCode(this.f95228a) * 31, 31, this.f95229b);
        SocializeInfo socializeInfo = this.f95230c;
        int iHashCode = socializeInfo == null ? 0 : socializeInfo.hashCode();
        CoinExtra coinExtra = this.f95231d;
        int iA2 = C3554n0.a(e0.a(I.a(this.f95241o, C3554n0.a(E.a(I.a(this.f95238l, E.a(I.a(this.f95236j, C3554n0.a(I.a(this.h, C3554n0.a(E.a(I.a(this.f95232e, (((iA + iHashCode) * 31) + (coinExtra == null ? 0 : coinExtra.hashCode())) * 31, 31), 31, this.f95233f), 31, this.f95234g), 31), 31, this.f95235i), 31), 31, this.f95237k), 31), 31, this.f95239m), 31, this.f95240n), 31), 31, this.f95242p), 31, this.f95243q);
        Rights rights = this.f95244r;
        int iA3 = I.a(this.f95248v, E.a(C3554n0.a(E.a((iA2 + (rights == null ? 0 : rights.hashCode())) * 31, 31, this.f95245s), 31, this.f95246t), 31, this.f95247u), 31);
        Upper upper = this.f95249w;
        int iA4 = I.a(this.f95252z, z.a(z.a((iA3 + (upper == null ? 0 : upper.hashCode())) * 31, 31, this.f95250x), 31, this.f95251y), 31);
        OgvInfo ogvInfo = this.f95213A;
        int iHashCode2 = ogvInfo == null ? 0 : ogvInfo.hashCode();
        PugvInfo pugvInfo = this.f95214B;
        int iA5 = A.a(this.f95216D, z.a((((iA4 + iHashCode2) * 31) + (pugvInfo == null ? 0 : pugvInfo.hashCode())) * 31, 31, this.f95215C), 31);
        Badge badge = this.f95217E;
        return Integer.hashCode(this.f95226N) + e0.a(I.a(this.f95224L, E.a(z.a(z.a(z.a(z.a(E.a((iA5 + (badge == null ? 0 : badge.hashCode())) * 31, 31, this.f95218F), 31, this.f95219G), 31, this.f95220H), 31, this.f95221I), 31, this.f95222J), 31, this.f95223K), 31), 31, this.f95225M);
    }

    @Nullable
    public final OgvInfo i() {
        return this.f95213A;
    }

    @Nullable
    public final OgvInfo j() {
        return this.f95213A;
    }

    public final double k() {
        return this.f95216D;
    }

    @Nullable
    public final PugvInfo l() {
        return this.f95214B;
    }

    @Nullable
    public final PugvInfo m() {
        return this.f95214B;
    }

    public final boolean n() {
        return this.f95221I;
    }

    @Nullable
    public final SocializeInfo o() {
        return this.f95230c;
    }

    public final int p() {
        return this.f95241o;
    }

    @NotNull
    public final String q() {
        return r() ? "music" : t() ? "ogv" : this.f95248v == 21 ? "ugc_season" : u() ? "pugv" : "ugc";
    }

    public final boolean r() {
        return this.f95248v == 12;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean s() {
        /*
            r3 = this;
            r0 = r3
            boolean r0 = r0.f95219G
            if (r0 != 0) goto L17
            r0 = r3
            int r0 = r0.f95228a
            r4 = r0
            r0 = 1
            r5 = r0
            r0 = r4
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L17
            goto L19
        L17:
            r0 = 0
            r5 = r0
        L19:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.playlist.api.MultiTypeMedia.s():boolean");
    }

    public final boolean t() {
        return this.f95248v == 24;
    }

    @NotNull
    public final String toString() {
        String str = this.f95229b;
        SocializeInfo socializeInfo = this.f95230c;
        int i7 = this.f95232e;
        int i8 = this.f95241o;
        List<Page> list = this.f95242p;
        OgvInfo ogvInfo = this.f95213A;
        PugvInfo pugvInfo = this.f95214B;
        boolean z6 = this.f95215C;
        double d7 = this.f95216D;
        Badge badge = this.f95217E;
        boolean z7 = this.f95221I;
        String str2 = this.f95223K;
        int i9 = this.f95224L;
        List<c> list2 = this.f95225M;
        int i10 = this.f95226N;
        StringBuilder sb = new StringBuilder("MultiTypeMedia(attr=");
        M.a(this.f95228a, ", bvid=", str, ", socializeInfo=", sb);
        sb.append(socializeInfo);
        sb.append(", coin=");
        sb.append(this.f95231d);
        sb.append(", copyright=");
        sb.append(i7);
        sb.append(", cover=");
        sb.append(this.f95233f);
        sb.append(", duration=");
        sb.append(this.f95234g);
        sb.append(", favState=");
        sb.append(this.h);
        sb.append(", id=");
        sb.append(this.f95235i);
        sb.append(", index=");
        sb.append(this.f95236j);
        sb.append(", intro=");
        sb.append(this.f95237k);
        sb.append(", likeState=");
        sb.append(this.f95238l);
        sb.append(", link=");
        sb.append(this.f95239m);
        sb.append(", offset=");
        G.a(i8, this.f95240n, ", totalPage=", sb);
        sb.append(", pages=");
        sb.append(list);
        sb.append(", pubtime=");
        sb.append(this.f95243q);
        sb.append(", rights=");
        sb.append(this.f95244r);
        sb.append(", shortLink=");
        sb.append(this.f95245s);
        sb.append(", tid=");
        sb.append(this.f95246t);
        sb.append(", title=");
        sb.append(this.f95247u);
        sb.append(", type=");
        sb.append(this.f95248v);
        sb.append(", upper=");
        sb.append(this.f95249w);
        sb.append(", expanded=");
        sb.append(this.f95250x);
        sb.append(", selected=");
        sb.append(this.f95251y);
        sb.append(", playingEpisodeIndex=");
        sb.append(this.f95252z);
        sb.append(", ogvExtra=");
        sb.append(ogvInfo);
        sb.append(", pugvExtra=");
        sb.append(pugvInfo);
        sb.append(", forbidFav=");
        sb.append(z6);
        sb.append(", progressPercent=");
        sb.append(d7);
        sb.append(", badge=");
        sb.append(badge);
        sb.append(", displayMediaSize=");
        sb.append(this.f95218F);
        sb.append(", isFromDownload=");
        sb.append(this.f95219G);
        sb.append(", isChargeVideo=");
        P.a(", showTrans=", ", isTranslated=", sb, this.f95220H, z7);
        O4.a.d(", translatedTitle=", str2, ", translatePanelState=", sb, this.f95222J);
        O.b(sb, i9, ", episodes=", list2, ", localIndex=");
        return C4277b.a(i10, ")", sb);
    }

    public final boolean u() {
        return this.f95248v == 25;
    }

    public final boolean v(@NotNull MultiTypeMedia multiTypeMedia) {
        boolean z6 = false;
        if (this.f95235i == multiTypeMedia.f95235i) {
            z6 = false;
            if (this.f95250x == multiTypeMedia.f95250x) {
                z6 = false;
                if ((this.h == 1) == (multiTypeMedia.h == 1)) {
                    z6 = false;
                    if ((this.f95238l == 1) == (multiTypeMedia.f95238l == 1)) {
                        z6 = false;
                        if (this.f95251y == multiTypeMedia.f95251y) {
                            z6 = false;
                            if (this.f95252z == multiTypeMedia.f95252z) {
                                z6 = false;
                                if (this.f95222J == multiTypeMedia.f95222J) {
                                    z6 = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return z6;
    }

    @NotNull
    public final MultiTypeMedia w() {
        SocializeInfo socializeInfo = this.f95230c;
        return a(this, socializeInfo != null ? SocializeInfo.a(socializeInfo, 0, 0, socializeInfo.f95315i + 1, 1791) : null, 0, 1, false, false, 0, false, -2053, 255);
    }

    @NotNull
    public final MultiTypeMedia x(boolean z6) {
        SocializeInfo socializeInfoA;
        SocializeInfo socializeInfo = this.f95230c;
        if (socializeInfo != null) {
            int i7 = socializeInfo.f95309b;
            socializeInfoA = SocializeInfo.a(socializeInfo, z6 ? i7 + 1 : Math.max(0, i7 - 1), 0, 0, 2045);
        } else {
            socializeInfoA = null;
        }
        return a(this, socializeInfoA, z6 ? 1 : 0, 0, false, false, 0, false, -133, 255);
    }
}
