package com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.allfilm;

import K7.L;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/filmlist/floatlayer/allfilm/OgvAllFilms.class */
@StabilityInferred(parameters = 0)
@Bson
public final class OgvAllFilms {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f92694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f92695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("seasons")
    @NotNull
    private final List<FilmInLayer> f92696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f92697d;

    public OgvAllFilms(boolean z6, @NotNull String str, @NotNull Map map, @NotNull List list) {
        this.f92694a = str;
        this.f92695b = z6;
        this.f92696c = list;
        this.f92697d = map;
    }

    @NotNull
    public final List<FilmInLayer> a() {
        return this.f92696c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OgvAllFilms)) {
            return false;
        }
        OgvAllFilms ogvAllFilms = (OgvAllFilms) obj;
        return Intrinsics.areEqual(this.f92694a, ogvAllFilms.f92694a) && this.f92695b == ogvAllFilms.f92695b && Intrinsics.areEqual(this.f92696c, ogvAllFilms.f92696c) && Intrinsics.areEqual(this.f92697d, ogvAllFilms.f92697d);
    }

    public final int hashCode() {
        return this.f92697d.hashCode() + e0.a(z.a(this.f92694a.hashCode() * 31, 31, this.f92695b), 31, this.f92696c);
    }

    @NotNull
    public final String toString() {
        List<FilmInLayer> list = this.f92696c;
        Map<String, String> map = this.f92697d;
        StringBuilder sb = new StringBuilder("OgvAllFilms(title=");
        sb.append(this.f92694a);
        sb.append(", isFavorite=");
        L.b(sb, this.f92695b, ", films=", list, ", report=");
        return C8711a.a(sb, map, ")");
    }
}
