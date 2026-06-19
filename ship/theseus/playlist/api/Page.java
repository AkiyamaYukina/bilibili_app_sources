package com.bilibili.ship.theseus.playlist.api;

import I.E;
import M6.f;
import androidx.compose.animation.core.I;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import com.bilibili.bson.common.Bson;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/api/Page.class */
@StabilityInferred(parameters = 0)
@Bson
public final class Page {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final VideoDimension f95260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f95261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f95262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f95263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f95264e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f95265f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final List<Meta> f95266g;
    public final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final String f95267i;

    public Page() {
        throw null;
    }

    public Page(VideoDimension videoDimension, long j7, String str, long j8, String str2, String str3, List list, int i7, String str4, int i8) {
        j7 = (i8 & 2) != 0 ? 0L : j7;
        str = (i8 & 4) != 0 ? "" : str;
        j8 = (i8 & 8) != 0 ? 0L : j8;
        str2 = (i8 & 16) != 0 ? "" : str2;
        str3 = (i8 & 32) != 0 ? "" : str3;
        list = (i8 & 64) != 0 ? CollectionsKt.emptyList() : list;
        i7 = (i8 & 128) != 0 ? 0 : i7;
        str4 = (i8 & 256) != 0 ? "" : str4;
        this.f95260a = videoDimension;
        this.f95261b = j7;
        this.f95262c = str;
        this.f95263d = j8;
        this.f95264e = str2;
        this.f95265f = str3;
        this.f95266g = list;
        this.h = i7;
        this.f95267i = str4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Page)) {
            return false;
        }
        Page page = (Page) obj;
        return Intrinsics.areEqual(this.f95260a, page.f95260a) && this.f95261b == page.f95261b && Intrinsics.areEqual(this.f95262c, page.f95262c) && this.f95263d == page.f95263d && Intrinsics.areEqual(this.f95264e, page.f95264e) && Intrinsics.areEqual(this.f95265f, page.f95265f) && Intrinsics.areEqual(this.f95266g, page.f95266g) && this.h == page.h && Intrinsics.areEqual(this.f95267i, page.f95267i);
    }

    public final int hashCode() {
        return this.f95267i.hashCode() + I.a(this.h, e0.a(E.a(E.a(C3554n0.a(E.a(C3554n0.a(this.f95260a.hashCode() * 31, 31, this.f95261b), 31, this.f95262c), 31, this.f95263d), 31, this.f95264e), 31, this.f95265f), 31, this.f95266g), 31);
    }

    @NotNull
    public final String toString() {
        List<Meta> list = this.f95266g;
        StringBuilder sb = new StringBuilder("Page(dimension=");
        sb.append(this.f95260a);
        sb.append(", duration=");
        sb.append(this.f95261b);
        sb.append(", from=");
        sb.append(this.f95262c);
        sb.append(", id=");
        sb.append(this.f95263d);
        sb.append(", intro=");
        sb.append(this.f95264e);
        sb.append(", link=");
        f.a(this.f95265f, ", metas=", ", page=", sb, list);
        sb.append(this.h);
        sb.append(", title=");
        return C8770a.a(sb, this.f95267i, ")");
    }
}
