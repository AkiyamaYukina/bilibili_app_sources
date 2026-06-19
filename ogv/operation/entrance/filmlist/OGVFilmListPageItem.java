package com.bilibili.ogv.operation.entrance.filmlist;

import I.E;
import a5.C3188c;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u5.C8711a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/filmlist/OGVFilmListPageItem.class */
@StabilityInferred(parameters = 0)
@Bson
public final class OGVFilmListPageItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f70013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f70014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f70015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f70016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f70017e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f70018f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f70019g;

    @NotNull
    public final String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f70020i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final String f70021j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final String f70022k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @SerializedName("follow")
    private final boolean f70023l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f70024m;

    public OGVFilmListPageItem(long j7, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i7, @NotNull String str8, @NotNull String str9, boolean z6, @NotNull Map<String, String> map) {
        this.f70013a = j7;
        this.f70014b = str;
        this.f70015c = str2;
        this.f70016d = str3;
        this.f70017e = str4;
        this.f70018f = str5;
        this.f70019g = str6;
        this.h = str7;
        this.f70020i = i7;
        this.f70021j = str8;
        this.f70022k = str9;
        this.f70023l = z6;
        this.f70024m = map;
    }

    public final boolean a() {
        return this.f70023l;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OGVFilmListPageItem)) {
            return false;
        }
        OGVFilmListPageItem oGVFilmListPageItem = (OGVFilmListPageItem) obj;
        return this.f70013a == oGVFilmListPageItem.f70013a && Intrinsics.areEqual(this.f70014b, oGVFilmListPageItem.f70014b) && Intrinsics.areEqual(this.f70015c, oGVFilmListPageItem.f70015c) && Intrinsics.areEqual(this.f70016d, oGVFilmListPageItem.f70016d) && Intrinsics.areEqual(this.f70017e, oGVFilmListPageItem.f70017e) && Intrinsics.areEqual(this.f70018f, oGVFilmListPageItem.f70018f) && Intrinsics.areEqual(this.f70019g, oGVFilmListPageItem.f70019g) && Intrinsics.areEqual(this.h, oGVFilmListPageItem.h) && this.f70020i == oGVFilmListPageItem.f70020i && Intrinsics.areEqual(this.f70021j, oGVFilmListPageItem.f70021j) && Intrinsics.areEqual(this.f70022k, oGVFilmListPageItem.f70022k) && this.f70023l == oGVFilmListPageItem.f70023l && Intrinsics.areEqual(this.f70024m, oGVFilmListPageItem.f70024m);
    }

    public final int hashCode() {
        return this.f70024m.hashCode() + z.a(E.a(E.a(I.a(this.f70020i, E.a(E.a(E.a(E.a(E.a(E.a(E.a(Long.hashCode(this.f70013a) * 31, 31, this.f70014b), 31, this.f70015c), 31, this.f70016d), 31, this.f70017e), 31, this.f70018f), 31, this.f70019g), 31, this.h), 31), 31, this.f70021j), 31, this.f70022k), 31, this.f70023l);
    }

    @NotNull
    public final String toString() {
        boolean z6 = this.f70023l;
        Map<String, String> map = this.f70024m;
        StringBuilder sb = new StringBuilder("OGVFilmListPageItem(seasonId=");
        sb.append(this.f70013a);
        sb.append(", cover=");
        sb.append(this.f70014b);
        sb.append(", title=");
        sb.append(this.f70015c);
        sb.append(", link=");
        sb.append(this.f70016d);
        sb.append(", styles=");
        sb.append(this.f70017e);
        sb.append(", rankLabel=");
        sb.append(this.f70018f);
        sb.append(", celebrities=");
        sb.append(this.f70019g);
        sb.append(", buttonText=");
        sb.append(this.h);
        sb.append(", percent=");
        sb.append(this.f70020i);
        sb.append(", ratingScore=");
        sb.append(this.f70021j);
        sb.append(", reason=");
        C3188c.a(this.f70022k, ", hasFollowedSeason=", ", report=", sb, z6);
        return C8711a.a(sb, map, ")");
    }
}
