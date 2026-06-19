package com.bilibili.pegasus.channelv3.movie.relation;

import I.E;
import a5.C3188c;
import androidx.appcompat.app.i;
import androidx.compose.animation.z;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/relation/d.class */
@StabilityInferred(parameters = 0)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f75461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f75462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f75463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public String f75464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f75465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f75466f;

    public d() {
        this(0);
    }

    public d(int i7) {
        this.f75461a = 0L;
        this.f75462b = 0L;
        this.f75463c = 0L;
        this.f75464d = "";
        this.f75465e = true;
        this.f75466f = true;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f75461a == dVar.f75461a && this.f75462b == dVar.f75462b && this.f75463c == dVar.f75463c && Intrinsics.areEqual(this.f75464d, dVar.f75464d) && this.f75465e == dVar.f75465e && this.f75466f == dVar.f75466f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f75466f) + z.a(E.a(C3554n0.a(C3554n0.a(Long.hashCode(this.f75461a) * 31, 31, this.f75462b), 31, this.f75463c), 31, this.f75464d), 31, this.f75465e);
    }

    @NotNull
    public final String toString() {
        long j7 = this.f75461a;
        long j8 = this.f75462b;
        long j9 = this.f75463c;
        String str = this.f75464d;
        boolean z6 = this.f75465e;
        boolean z7 = this.f75466f;
        StringBuilder sbA = androidx.compose.runtime.snapshots.z.a(j7, "ChannelMovieRelationRequestParams(bizId=", ", bizType=");
        sbA.append(j8);
        J1.z.a(j9, ", feedId=", ", offset=", sbA);
        C3188c.a(str, ", pull=", ", hasMore=", sbA, z6);
        return i.a(sbA, z7, ")");
    }
}
