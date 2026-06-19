package com.bilibili.pegasus.channelv3.movie.head;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/head/p.class */
@StabilityInferred(parameters = 0)
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f75449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public String f75450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f75451c;

    public p() {
        this(0);
    }

    public p(int i7) {
        this.f75449a = 0L;
        this.f75450b = "";
        this.f75451c = false;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f75449a == pVar.f75449a && Intrinsics.areEqual(this.f75450b, pVar.f75450b) && this.f75451c == pVar.f75451c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f75451c) + E.a(Long.hashCode(this.f75449a) * 31, 31, this.f75450b);
    }

    @NotNull
    public final String toString() {
        long j7 = this.f75449a;
        String str = this.f75450b;
        boolean z6 = this.f75451c;
        StringBuilder sbA = com.bilibili.ad.adview.pegasus.banner.topview.res.n.a(j7, "ChannelSubscribedParams(channelId=", ", movieTitle=", str);
        sbA.append(", subscribed=");
        sbA.append(z6);
        sbA.append(")");
        return sbA.toString();
    }
}
