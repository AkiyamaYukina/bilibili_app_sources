package com.bilibili.ship.theseus.ogv.intro.filmlist;

import I.E;
import M6.f;
import O4.a;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u5.C8711a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/filmlist/OgvFilms.class */
@StabilityInferred(parameters = 0)
@Bson
public final class OgvFilms {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("id")
    private final long f92670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f92671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Upper f92672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f92673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f92674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("seasons")
    @NotNull
    private final List<Film> f92675f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SerializedName("more_playlist")
    private final boolean f92676g;

    @SerializedName("more_playlist_url")
    @NotNull
    private final String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f92677i;

    public OgvFilms(long j7, @NotNull String str, @Nullable Upper upper, @NotNull String str2, @NotNull String str3, @NotNull List<Film> list, boolean z6, @NotNull String str4, @NotNull Map<String, String> map) {
        this.f92670a = j7;
        this.f92671b = str;
        this.f92672c = upper;
        this.f92673d = str2;
        this.f92674e = str3;
        this.f92675f = list;
        this.f92676g = z6;
        this.h = str4;
        this.f92677i = map;
    }

    public final long a() {
        return this.f92670a;
    }

    @NotNull
    public final List<Film> b() {
        return this.f92675f;
    }

    public final boolean c() {
        return this.f92676g;
    }

    @NotNull
    public final String d() {
        return this.h;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OgvFilms)) {
            return false;
        }
        OgvFilms ogvFilms = (OgvFilms) obj;
        return this.f92670a == ogvFilms.f92670a && Intrinsics.areEqual(this.f92671b, ogvFilms.f92671b) && Intrinsics.areEqual(this.f92672c, ogvFilms.f92672c) && Intrinsics.areEqual(this.f92673d, ogvFilms.f92673d) && Intrinsics.areEqual(this.f92674e, ogvFilms.f92674e) && Intrinsics.areEqual(this.f92675f, ogvFilms.f92675f) && this.f92676g == ogvFilms.f92676g && Intrinsics.areEqual(this.h, ogvFilms.h) && Intrinsics.areEqual(this.f92677i, ogvFilms.f92677i);
    }

    public final int hashCode() {
        int iA = E.a(Long.hashCode(this.f92670a) * 31, 31, this.f92671b);
        Upper upper = this.f92672c;
        return this.f92677i.hashCode() + E.a(z.a(e0.a(E.a(E.a((iA + (upper == null ? 0 : upper.hashCode())) * 31, 31, this.f92673d), 31, this.f92674e), 31, this.f92675f), 31, this.f92676g), 31, this.h);
    }

    @NotNull
    public final String toString() {
        long j7 = this.f92670a;
        List<Film> list = this.f92675f;
        boolean z6 = this.f92676g;
        String str = this.h;
        Map<String, String> map = this.f92677i;
        StringBuilder sbA = androidx.compose.runtime.snapshots.z.a(j7, "OgvFilms(filmListId=", ", title=");
        sbA.append(this.f92671b);
        sbA.append(", upper=");
        sbA.append(this.f92672c);
        sbA.append(", desc=");
        sbA.append(this.f92673d);
        sbA.append(", moreTitle=");
        f.a(this.f92674e, ", films=", ", hasMoreFilm=", sbA, list);
        a.d(", moreFilmUrl=", str, ", report=", sbA, z6);
        return C8711a.a(sbA, map, ")");
    }
}
