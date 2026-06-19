package com.bilibili.ship.theseus.ogv.intro.filmlist;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.analytics.C4665g;
import androidx.room.B;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/filmlist/Film.class */
@StabilityInferred(parameters = 0)
@Bson
public final class Film {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f92662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f92663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f92664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f92665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName(alternate = {"rating_score"}, value = "score")
    @NotNull
    private final String f92666e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f92667f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f92668g;

    public Film(long j7, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull Map<String, String> map) {
        this.f92662a = j7;
        this.f92663b = str;
        this.f92664c = str2;
        this.f92665d = str3;
        this.f92666e = str4;
        this.f92667f = str5;
        this.f92668g = map;
    }

    @NotNull
    public final String a() {
        return this.f92666e;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Film)) {
            return false;
        }
        Film film = (Film) obj;
        return this.f92662a == film.f92662a && Intrinsics.areEqual(this.f92663b, film.f92663b) && Intrinsics.areEqual(this.f92664c, film.f92664c) && Intrinsics.areEqual(this.f92665d, film.f92665d) && Intrinsics.areEqual(this.f92666e, film.f92666e) && Intrinsics.areEqual(this.f92667f, film.f92667f) && Intrinsics.areEqual(this.f92668g, film.f92668g);
    }

    public final int hashCode() {
        return this.f92668g.hashCode() + E.a(E.a(E.a(E.a(E.a(Long.hashCode(this.f92662a) * 31, 31, this.f92663b), 31, this.f92664c), 31, this.f92665d), 31, this.f92666e), 31, this.f92667f);
    }

    @NotNull
    public final String toString() {
        String str = this.f92666e;
        Map<String, String> map = this.f92668g;
        StringBuilder sb = new StringBuilder("Film(seasonId=");
        sb.append(this.f92662a);
        sb.append(", title=");
        sb.append(this.f92663b);
        sb.append(", subtitle=");
        sb.append(this.f92664c);
        sb.append(", cover=");
        B.a(this.f92665d, ", score=", str, ", link=", sb);
        return C4665g.a(sb, this.f92667f, ", report=", map, ")");
    }
}
