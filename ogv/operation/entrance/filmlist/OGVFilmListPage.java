package com.bilibili.ogv.operation.entrance.filmlist;

import I.E;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import c6.O;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u5.C8711a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/filmlist/OGVFilmListPage.class */
@StabilityInferred(parameters = 0)
@Bson
public final class OGVFilmListPage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f70000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f70001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f70002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f70003d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f70004e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f70005f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final List<OGVFilmListPageItem> f70006g;
    public final boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final String f70007i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final String f70008j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final String f70009k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final String f70010l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @SerializedName("upInfo")
    @Nullable
    private final FilmListUpInfo f70011m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f70012n;

    public OGVFilmListPage(int i7, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i8, @NotNull List<OGVFilmListPageItem> list, boolean z6, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @Nullable FilmListUpInfo filmListUpInfo, @NotNull Map<String, String> map) {
        this.f70000a = i7;
        this.f70001b = str;
        this.f70002c = str2;
        this.f70003d = str3;
        this.f70004e = str4;
        this.f70005f = i8;
        this.f70006g = list;
        this.h = z6;
        this.f70007i = str5;
        this.f70008j = str6;
        this.f70009k = str7;
        this.f70010l = str8;
        this.f70011m = filmListUpInfo;
        this.f70012n = map;
    }

    @Nullable
    public final FilmListUpInfo a() {
        return this.f70011m;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OGVFilmListPage)) {
            return false;
        }
        OGVFilmListPage oGVFilmListPage = (OGVFilmListPage) obj;
        return this.f70000a == oGVFilmListPage.f70000a && Intrinsics.areEqual(this.f70001b, oGVFilmListPage.f70001b) && Intrinsics.areEqual(this.f70002c, oGVFilmListPage.f70002c) && Intrinsics.areEqual(this.f70003d, oGVFilmListPage.f70003d) && Intrinsics.areEqual(this.f70004e, oGVFilmListPage.f70004e) && this.f70005f == oGVFilmListPage.f70005f && Intrinsics.areEqual(this.f70006g, oGVFilmListPage.f70006g) && this.h == oGVFilmListPage.h && Intrinsics.areEqual(this.f70007i, oGVFilmListPage.f70007i) && Intrinsics.areEqual(this.f70008j, oGVFilmListPage.f70008j) && Intrinsics.areEqual(this.f70009k, oGVFilmListPage.f70009k) && Intrinsics.areEqual(this.f70010l, oGVFilmListPage.f70010l) && Intrinsics.areEqual(this.f70011m, oGVFilmListPage.f70011m) && Intrinsics.areEqual(this.f70012n, oGVFilmListPage.f70012n);
    }

    public final int hashCode() {
        int iA = E.a(E.a(E.a(E.a(z.a(e0.a(I.a(this.f70005f, E.a(E.a(E.a(E.a(Integer.hashCode(this.f70000a) * 31, 31, this.f70001b), 31, this.f70002c), 31, this.f70003d), 31, this.f70004e), 31), 31, this.f70006g), 31, this.h), 31, this.f70007i), 31, this.f70008j), 31, this.f70009k), 31, this.f70010l);
        FilmListUpInfo filmListUpInfo = this.f70011m;
        return this.f70012n.hashCode() + ((iA + (filmListUpInfo == null ? 0 : filmListUpInfo.hashCode())) * 31);
    }

    @NotNull
    public final String toString() {
        List<OGVFilmListPageItem> list = this.f70006g;
        FilmListUpInfo filmListUpInfo = this.f70011m;
        Map<String, String> map = this.f70012n;
        StringBuilder sb = new StringBuilder("OGVFilmListPage(id=");
        sb.append(this.f70000a);
        sb.append(", title=");
        sb.append(this.f70001b);
        sb.append(", bgCover=");
        sb.append(this.f70002c);
        sb.append(", cover=");
        sb.append(this.f70003d);
        sb.append(", watchedText=");
        sb.append(this.f70004e);
        sb.append(", percent=");
        O.b(sb, this.f70005f, ", seasons=", list, ", isFavorite=");
        sb.append(this.h);
        sb.append(", shareUrl=");
        sb.append(this.f70007i);
        sb.append(", shareSubtitle=");
        sb.append(this.f70008j);
        sb.append(", squareUrl=");
        sb.append(this.f70009k);
        sb.append(", topicLink=");
        sb.append(this.f70010l);
        sb.append(", upInfo=");
        sb.append(filmListUpInfo);
        sb.append(", report=");
        return C8711a.a(sb, map, ")");
    }
}
