package com.bilibili.ogv.operation.entrance.filmlist;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/filmlist/FilmListUpInfo.class */
@StabilityInferred(parameters = 1)
@Bson
public final class FilmListUpInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f69983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f69984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f69985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f69986d;

    public FilmListUpInfo(long j7, @NotNull String str, @NotNull String str2, boolean z6) {
        this.f69983a = j7;
        this.f69984b = str;
        this.f69985c = str2;
        this.f69986d = z6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilmListUpInfo)) {
            return false;
        }
        FilmListUpInfo filmListUpInfo = (FilmListUpInfo) obj;
        return this.f69983a == filmListUpInfo.f69983a && Intrinsics.areEqual(this.f69984b, filmListUpInfo.f69984b) && Intrinsics.areEqual(this.f69985c, filmListUpInfo.f69985c) && this.f69986d == filmListUpInfo.f69986d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f69986d) + E.a(E.a(Long.hashCode(this.f69983a) * 31, 31, this.f69984b), 31, this.f69985c);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("FilmListUpInfo(mid=");
        sb.append(this.f69983a);
        sb.append(", uname=");
        sb.append(this.f69984b);
        sb.append(", avatar=");
        sb.append(this.f69985c);
        sb.append(", isFollow=");
        return androidx.appcompat.app.i.a(sb, this.f69986d, ")");
    }
}
