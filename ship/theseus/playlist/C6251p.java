package com.bilibili.ship.theseus.playlist;

import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/p.class */
@StabilityInferred(parameters = 0)
public final class C6251p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SuspendLambda f95828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f95829b;

    public C6251p(int i7, @NotNull Function2 function2) {
        this.f95828a = (SuspendLambda) function2;
        this.f95829b = i7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6251p)) {
            return false;
        }
        C6251p c6251p = (C6251p) obj;
        return Intrinsics.areEqual(this.f95828a, c6251p.f95828a) && this.f95829b == c6251p.f95829b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f95829b) + (this.f95828a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaylistAutoSchedulingInterceptorWrapper(interceptor=");
        sb.append(this.f95828a);
        sb.append(", priority=");
        return C4277b.a(this.f95829b, ")", sb);
    }
}
