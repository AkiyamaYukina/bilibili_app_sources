package com.bilibili.ship.theseus.united.page.intro.module.relate;

import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/r0.class */
@StabilityInferred(parameters = 1)
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f101371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f101372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C6313f0 f101373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f101374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final C6306c f101375e;

    public r0(long j7, long j8, @NotNull C6313f0 c6313f0, boolean z6, @Nullable C6306c c6306c) {
        this.f101371a = j7;
        this.f101372b = j8;
        this.f101373c = c6313f0;
        this.f101374d = z6;
        this.f101375e = c6306c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return this.f101371a == r0Var.f101371a && this.f101372b == r0Var.f101372b && Intrinsics.areEqual(this.f101373c, r0Var.f101373c) && this.f101374d == r0Var.f101374d && Intrinsics.areEqual(this.f101375e, r0Var.f101375e);
    }

    public final int hashCode() {
        int iA = androidx.compose.animation.z.a((this.f101373c.hashCode() + C3554n0.a(Long.hashCode(this.f101371a) * 31, 31, this.f101372b)) * 31, 31, this.f101374d);
        C6306c c6306c = this.f101375e;
        return iA + (c6306c == null ? 0 : c6306c.hashCode());
    }

    @NotNull
    public final String toString() {
        return "RelateConfig(showM=" + this.f101371a + ", showN=" + this.f101372b + ", pagination=" + this.f101373c + ", loadMore=" + this.f101374d + ", coverDimension=" + this.f101375e + ")";
    }
}
