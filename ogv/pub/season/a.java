package com.bilibili.ogv.pub.season;

import com.google.gson.annotations.JsonAdapter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/season/a.class */
@JsonAdapter(nullSafe = false, value = OgvSeasonTypeTypeAdapterFactory.class)
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f71775b = new a(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f71776c = new a(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f71777d = new a(3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f71778e = new a(4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f71779f = new a(5);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f71780g = new a(7);

    @NotNull
    public static final a h = new a(9);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final a f71781i = new a(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f71782a;

    public a(int i7) {
        this.f71782a = i7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f71782a == ((a) obj).f71782a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f71782a);
    }

    @NotNull
    public final String toString() {
        return String.valueOf(this.f71782a);
    }
}
