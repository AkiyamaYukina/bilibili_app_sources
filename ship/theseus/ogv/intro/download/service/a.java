package com.bilibili.ship.theseus.ogv.intro.download.service;

import I.E;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/service/a.class */
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f92393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f92394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ogv.pub.season.a f92395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final OgvEpisode f92396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f92397e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f92398f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f92399g;

    @NotNull
    public final String h;

    public a(@NotNull String str, @NotNull String str2, @NotNull com.bilibili.ogv.pub.season.a aVar, @NotNull OgvEpisode ogvEpisode, int i7, boolean z6, int i8, @NotNull String str3) {
        this.f92393a = str;
        this.f92394b = str2;
        this.f92395c = aVar;
        this.f92396d = ogvEpisode;
        this.f92397e = i7;
        this.f92398f = z6;
        this.f92399g = i8;
        this.h = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f92393a, aVar.f92393a) && Intrinsics.areEqual(this.f92394b, aVar.f92394b) && Intrinsics.areEqual(this.f92395c, aVar.f92395c) && Intrinsics.areEqual(this.f92396d, aVar.f92396d) && this.f92397e == aVar.f92397e && this.f92398f == aVar.f92398f && this.f92399g == aVar.f92399g && Intrinsics.areEqual(this.h, aVar.h);
    }

    public final int hashCode() {
        int iA = I.a(this.f92395c.f71782a, E.a(this.f92393a.hashCode() * 31, 31, this.f92394b), 31);
        return this.h.hashCode() + I.a(this.f92399g, z.a(I.a(this.f92397e, (this.f92396d.hashCode() + iA) * 31, 31), 31, this.f92398f), 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ClientDownloadModel(seasonId=");
        sb.append(this.f92393a);
        sb.append(", title=");
        sb.append(this.f92394b);
        sb.append(", seasonType=");
        sb.append(this.f92395c);
        sb.append(", episode=");
        sb.append(this.f92396d);
        sb.append(", videoQuality=");
        sb.append(this.f92397e);
        sb.append(", isDolby=");
        sb.append(this.f92398f);
        sb.append(", networkType=");
        sb.append(this.f92399g);
        sb.append(", cover=");
        return C8770a.a(sb, this.h, ")");
    }
}
