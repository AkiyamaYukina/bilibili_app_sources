package com.bilibili.pegasus.channelv3.movie.video;

import I.E;
import a5.C3188c;
import androidx.appcompat.app.i;
import androidx.compose.animation.z;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/video/a.class */
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f75489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f75490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f75491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public String f75492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f75493e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f75494f;

    public a() {
        this(0);
    }

    public a(int i7) {
        this.f75489a = 0L;
        this.f75490b = 0L;
        this.f75491c = 0L;
        this.f75492d = "";
        this.f75493e = true;
        this.f75494f = true;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f75489a == aVar.f75489a && this.f75490b == aVar.f75490b && this.f75491c == aVar.f75491c && Intrinsics.areEqual(this.f75492d, aVar.f75492d) && this.f75493e == aVar.f75493e && this.f75494f == aVar.f75494f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f75494f) + z.a(E.a(C3554n0.a(C3554n0.a(Long.hashCode(this.f75489a) * 31, 31, this.f75490b), 31, this.f75491c), 31, this.f75492d), 31, this.f75493e);
    }

    @NotNull
    public final String toString() {
        long j7 = this.f75489a;
        long j8 = this.f75490b;
        long j9 = this.f75491c;
        String str = this.f75492d;
        boolean z6 = this.f75493e;
        boolean z7 = this.f75494f;
        StringBuilder sbA = androidx.compose.runtime.snapshots.z.a(j7, "ChannelMovieInlineRequestParams(bizId=", ", bizType=");
        sbA.append(j8);
        J1.z.a(j9, ", feedId=", ", offset=", sbA);
        C3188c.a(str, ", pull=", ", hasMore=", sbA, z6);
        return i.a(sbA, z7, ")");
    }
}
