package com.bilibili.playset.playlist.search2;

import I.E;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search2/h.class */
@StabilityInferred(parameters = 0)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f85446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PageStatus f85447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<com.bilibili.playset.api.c> f85448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Long f85449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f85450e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f85451f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f85452g;
    public final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f85453i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f85454j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f85455k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f85456l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final String f85457m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f85458n;

    public h(@NotNull String str, @NotNull PageStatus pageStatus, @NotNull List<com.bilibili.playset.api.c> list, @Nullable Long l7, boolean z6, boolean z7, int i7, int i8, int i9, long j7, int i10, int i11, @NotNull String str2, boolean z8) {
        this.f85446a = str;
        this.f85447b = pageStatus;
        this.f85448c = list;
        this.f85449d = l7;
        this.f85450e = z6;
        this.f85451f = z7;
        this.f85452g = i7;
        this.h = i8;
        this.f85453i = i9;
        this.f85454j = j7;
        this.f85455k = i10;
        this.f85456l = i11;
        this.f85457m = str2;
        this.f85458n = z8;
    }

    public static h a(h hVar, PageStatus pageStatus, List list, boolean z6, boolean z7, int i7, int i8, int i9, long j7, int i10, int i11, String str, boolean z8, int i12) {
        String str2 = hVar.f85446a;
        if ((i12 & 2) != 0) {
            pageStatus = hVar.f85447b;
        }
        if ((i12 & 4) != 0) {
            list = hVar.f85448c;
        }
        Long l7 = hVar.f85449d;
        if ((i12 & 16) != 0) {
            z6 = hVar.f85450e;
        }
        if ((i12 & 32) != 0) {
            z7 = hVar.f85451f;
        }
        if ((i12 & 64) != 0) {
            i7 = hVar.f85452g;
        }
        if ((i12 & 128) != 0) {
            i8 = hVar.h;
        }
        if ((i12 & 256) != 0) {
            i9 = hVar.f85453i;
        }
        if ((i12 & 512) != 0) {
            j7 = hVar.f85454j;
        }
        if ((i12 & 1024) != 0) {
            i10 = hVar.f85455k;
        }
        if ((i12 & 2048) != 0) {
            i11 = hVar.f85456l;
        }
        if ((i12 & 4096) != 0) {
            str = hVar.f85457m;
        }
        hVar.getClass();
        return new h(str2, pageStatus, list, l7, z6, z7, i7, i8, i9, j7, i10, i11, str, z8);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.areEqual(this.f85446a, hVar.f85446a) && this.f85447b == hVar.f85447b && Intrinsics.areEqual(this.f85448c, hVar.f85448c) && Intrinsics.areEqual(this.f85449d, hVar.f85449d) && this.f85450e == hVar.f85450e && this.f85451f == hVar.f85451f && this.f85452g == hVar.f85452g && this.h == hVar.h && this.f85453i == hVar.f85453i && this.f85454j == hVar.f85454j && this.f85455k == hVar.f85455k && this.f85456l == hVar.f85456l && Intrinsics.areEqual(this.f85457m, hVar.f85457m) && this.f85458n == hVar.f85458n;
    }

    public final int hashCode() {
        int iA = e0.a((this.f85447b.hashCode() + (this.f85446a.hashCode() * 31)) * 31, 31, this.f85448c);
        Long l7 = this.f85449d;
        return Boolean.hashCode(this.f85458n) + E.a(I.a(this.f85456l, I.a(this.f85455k, C3554n0.a(I.a(this.f85453i, I.a(this.h, I.a(this.f85452g, z.a(z.a((iA + (l7 == null ? 0 : l7.hashCode())) * 31, 31, this.f85450e), 31, this.f85451f), 31), 31), 31), 31, this.f85454j), 31), 31), 31, this.f85457m);
    }

    @NotNull
    public final String toString() {
        List<com.bilibili.playset.api.c> list = this.f85448c;
        StringBuilder sb = new StringBuilder("CollectionSearchState(keyword=");
        sb.append(this.f85446a);
        sb.append(", status=");
        sb.append(this.f85447b);
        sb.append(", searchResultList=");
        sb.append(list);
        sb.append(", mediaId=");
        sb.append(this.f85449d);
        sb.append(", hasMore=");
        sb.append(this.f85450e);
        sb.append(", hasNextPage=");
        sb.append(this.f85451f);
        sb.append(", searchCount=");
        sb.append(this.f85452g);
        sb.append(", pageNum=");
        sb.append(this.h);
        sb.append(", paramPN=");
        sb.append(this.f85453i);
        sb.append(", nextOid=");
        sb.append(this.f85454j);
        sb.append(", nextOtype=");
        sb.append(this.f85455k);
        sb.append(", nextCount=");
        sb.append(this.f85456l);
        sb.append(", hintWords=");
        sb.append(this.f85457m);
        sb.append(", isSearching=");
        return androidx.appcompat.app.i.a(sb, this.f85458n, ")");
    }
}
