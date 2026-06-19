package com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.allfilm;

import I.E;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.analytics.C4665g;
import com.bilibili.bson.common.Bson;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/filmlist/floatlayer/allfilm/FilmInLayer.class */
@StabilityInferred(parameters = 0)
@Bson
public final class FilmInLayer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f92684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f92685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f92686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f92687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f92688e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f92689f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f92690g;

    @NotNull
    public final String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final String f92691i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f92692j;

    public FilmInLayer(long j7, @NotNull String str, @NotNull String str2, boolean z6, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull Map<String, String> map) {
        this.f92684a = j7;
        this.f92685b = str;
        this.f92686c = str2;
        this.f92687d = z6;
        this.f92688e = str3;
        this.f92689f = str4;
        this.f92690g = str5;
        this.h = str6;
        this.f92691i = str7;
        this.f92692j = map;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilmInLayer)) {
            return false;
        }
        FilmInLayer filmInLayer = (FilmInLayer) obj;
        return this.f92684a == filmInLayer.f92684a && Intrinsics.areEqual(this.f92685b, filmInLayer.f92685b) && Intrinsics.areEqual(this.f92686c, filmInLayer.f92686c) && this.f92687d == filmInLayer.f92687d && Intrinsics.areEqual(this.f92688e, filmInLayer.f92688e) && Intrinsics.areEqual(this.f92689f, filmInLayer.f92689f) && Intrinsics.areEqual(this.f92690g, filmInLayer.f92690g) && Intrinsics.areEqual(this.h, filmInLayer.h) && Intrinsics.areEqual(this.f92691i, filmInLayer.f92691i) && Intrinsics.areEqual(this.f92692j, filmInLayer.f92692j);
    }

    public final int hashCode() {
        return this.f92692j.hashCode() + E.a(E.a(E.a(E.a(E.a(z.a(E.a(E.a(Long.hashCode(this.f92684a) * 31, 31, this.f92685b), 31, this.f92686c), 31, this.f92687d), 31, this.f92688e), 31, this.f92689f), 31, this.f92690g), 31, this.h), 31, this.f92691i);
    }

    @NotNull
    public final String toString() {
        Map<String, String> map = this.f92692j;
        StringBuilder sb = new StringBuilder("FilmInLayer(seasonId=");
        sb.append(this.f92684a);
        sb.append(", title=");
        sb.append(this.f92685b);
        sb.append(", cover=");
        sb.append(this.f92686c);
        sb.append(", follow=");
        sb.append(this.f92687d);
        sb.append(", link=");
        sb.append(this.f92688e);
        sb.append(", ratingScore=");
        sb.append(this.f92689f);
        sb.append(", rankLabel=");
        sb.append(this.f92690g);
        sb.append(", reason=");
        sb.append(this.h);
        sb.append(", styles=");
        return C4665g.a(sb, this.f92691i, ", report=", map, ")");
    }
}
