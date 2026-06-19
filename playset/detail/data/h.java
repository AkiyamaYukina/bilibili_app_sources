package com.bilibili.playset.detail.data;

import X1.C3081k;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bilibili.playset.api.MultitypePlaylist;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/h.class */
@StabilityInferred(parameters = 0)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f84513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f84514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<com.bilibili.playset.api.a> f84515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.playset.api.d f84516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MultitypePlaylist.Info f84517e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f84518f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f84519g;
    public final boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f84520i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f84521j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f84522k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f84523l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f84524m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final j f84525n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f84526o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public final Integer f84527p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f84528q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f84529r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f84530s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f84531t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f84532u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f84533v;

    /* JADX WARN: Multi-variable type inference failed */
    public h(long j7, long j8, @NotNull List<? extends com.bilibili.playset.api.a> list, @NotNull com.bilibili.playset.api.d dVar, @NotNull MultitypePlaylist.Info info, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, @NotNull j jVar, boolean z14, @Nullable Integer num, boolean z15, boolean z16, boolean z17, boolean z18, int i7, int i8) {
        this.f84513a = j7;
        this.f84514b = j8;
        this.f84515c = list;
        this.f84516d = dVar;
        this.f84517e = info;
        this.f84518f = z6;
        this.f84519g = z7;
        this.h = z8;
        this.f84520i = z9;
        this.f84521j = z10;
        this.f84522k = z11;
        this.f84523l = z12;
        this.f84524m = z13;
        this.f84525n = jVar;
        this.f84526o = z14;
        this.f84527p = num;
        this.f84528q = z15;
        this.f84529r = z16;
        this.f84530s = z17;
        this.f84531t = z18;
        this.f84532u = i7;
        this.f84533v = i8;
    }

    public static h a(h hVar, long j7, long j8, List list, com.bilibili.playset.api.d dVar, MultitypePlaylist.Info info, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, j jVar, boolean z13, boolean z14, boolean z15, boolean z16, int i7, int i8, int i9) {
        if ((i9 & 1) != 0) {
            j7 = hVar.f84513a;
        }
        if ((i9 & 2) != 0) {
            j8 = hVar.f84514b;
        }
        if ((i9 & 4) != 0) {
            list = hVar.f84515c;
        }
        if ((i9 & 8) != 0) {
            dVar = hVar.f84516d;
        }
        if ((i9 & 16) != 0) {
            info = hVar.f84517e;
        }
        if ((i9 & 32) != 0) {
            z6 = hVar.f84518f;
        }
        if ((i9 & 64) != 0) {
            z7 = hVar.f84519g;
        }
        if ((i9 & 128) != 0) {
            z8 = hVar.h;
        }
        if ((i9 & 256) != 0) {
            z9 = hVar.f84520i;
        }
        if ((i9 & 512) != 0) {
            z10 = hVar.f84521j;
        }
        if ((i9 & 1024) != 0) {
            z11 = hVar.f84522k;
        }
        boolean z17 = hVar.f84523l;
        if ((i9 & 4096) != 0) {
            z12 = hVar.f84524m;
        }
        if ((i9 & 8192) != 0) {
            jVar = hVar.f84525n;
        }
        if ((i9 & 16384) != 0) {
            z13 = hVar.f84526o;
        }
        Integer num = hVar.f84527p;
        if ((65536 & i9) != 0) {
            z14 = hVar.f84528q;
        }
        boolean z18 = hVar.f84529r;
        if ((i9 & 262144) != 0) {
            z15 = hVar.f84530s;
        }
        if ((524288 & i9) != 0) {
            z16 = hVar.f84531t;
        }
        if ((1048576 & i9) != 0) {
            i7 = hVar.f84532u;
        }
        if ((i9 & AccessibilityNodeInfoCompat.ACTION_SET_TEXT) != 0) {
            i8 = hVar.f84533v;
        }
        hVar.getClass();
        return new h(j7, j8, list, dVar, info, z6, z7, z8, z9, z10, z11, z17, z12, jVar, z13, num, z14, z18, z15, z16, i7, i8);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f84513a == hVar.f84513a && this.f84514b == hVar.f84514b && Intrinsics.areEqual(this.f84515c, hVar.f84515c) && Intrinsics.areEqual(this.f84516d, hVar.f84516d) && Intrinsics.areEqual(this.f84517e, hVar.f84517e) && this.f84518f == hVar.f84518f && this.f84519g == hVar.f84519g && this.h == hVar.h && this.f84520i == hVar.f84520i && this.f84521j == hVar.f84521j && this.f84522k == hVar.f84522k && this.f84523l == hVar.f84523l && this.f84524m == hVar.f84524m && Intrinsics.areEqual(this.f84525n, hVar.f84525n) && this.f84526o == hVar.f84526o && Intrinsics.areEqual(this.f84527p, hVar.f84527p) && this.f84528q == hVar.f84528q && this.f84529r == hVar.f84529r && this.f84530s == hVar.f84530s && this.f84531t == hVar.f84531t && this.f84532u == hVar.f84532u && this.f84533v == hVar.f84533v;
    }

    public final int hashCode() {
        int iA = z.a((this.f84525n.hashCode() + z.a(z.a(z.a(z.a(z.a(z.a(z.a(z.a((this.f84517e.hashCode() + ((this.f84516d.hashCode() + e0.a(C3554n0.a(Long.hashCode(this.f84513a) * 31, 31, this.f84514b), 31, this.f84515c)) * 31)) * 31, 31, this.f84518f), 31, this.f84519g), 31, this.h), 31, this.f84520i), 31, this.f84521j), 31, this.f84522k), 31, this.f84523l), 31, this.f84524m)) * 31, 31, this.f84526o);
        Integer num = this.f84527p;
        return Integer.hashCode(this.f84533v) + I.a(this.f84532u, z.a(z.a(z.a(z.a((iA + (num == null ? 0 : num.hashCode())) * 31, 31, this.f84528q), 31, this.f84529r), 31, this.f84530s), 31, this.f84531t), 31);
    }

    @NotNull
    public final String toString() {
        List<com.bilibili.playset.api.a> list = this.f84515c;
        StringBuilder sb = new StringBuilder("MultiTypeListDetailState(playlistId=");
        sb.append(this.f84513a);
        sb.append(", folderMid=");
        C3081k.c(sb, this.f84514b, ", list=", list);
        sb.append(", favoritesTabList=");
        sb.append(this.f84516d);
        sb.append(", basicInfo=");
        sb.append(this.f84517e);
        sb.append(", isPlaylistAuthor=");
        sb.append(this.f84518f);
        sb.append(", isDefaultPlaylist=");
        sb.append(this.f84519g);
        sb.append(", likeState=");
        sb.append(this.h);
        sb.append(", likeEnable=");
        sb.append(this.f84520i);
        sb.append(", favState=");
        sb.append(this.f84521j);
        sb.append(", favEnable=");
        sb.append(this.f84522k);
        sb.append(", followState=");
        sb.append(this.f84523l);
        sb.append(", shareEnable=");
        sb.append(this.f84524m);
        sb.append(", pageState=");
        sb.append(this.f84525n);
        sb.append(", firstFavState=");
        sb.append(this.f84526o);
        sb.append(", loadMoreType=");
        sb.append(this.f84527p);
        sb.append(", hasMore=");
        sb.append(this.f84528q);
        sb.append(", isLoading=");
        sb.append(this.f84529r);
        sb.append(", isIntroExpanded=");
        sb.append(this.f84530s);
        sb.append(", isCreateNewFolder=");
        sb.append(this.f84531t);
        sb.append(", contentMode=");
        sb.append(this.f84532u);
        sb.append(", itemExposeSession=");
        return C4277b.a(this.f84533v, ")", sb);
    }
}
