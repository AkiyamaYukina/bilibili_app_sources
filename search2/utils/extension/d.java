package com.bilibili.search2.utils.extension;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/utils/extension/d.class */
@StabilityInferred(parameters = 1)
public final class d<A> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f88822a;

    public d(A a7) {
        this.f88822a = a7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.areEqual(this.f88822a, ((d) obj).f88822a);
    }

    public final int hashCode() {
        A a7 = this.f88822a;
        return a7 == null ? 0 : a7.hashCode();
    }

    @NotNull
    public final String toString() {
        return X0.c.b(new StringBuilder("StateTuple1(a="), this.f88822a, ")");
    }
}
