package com.bilibili.playset.editor.utils;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/editor/utils/h.class */
@StabilityInferred(parameters = 1)
public final class h<A> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f84860a;

    public h(A a7) {
        this.f84860a = a7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.areEqual(this.f84860a, ((h) obj).f84860a);
    }

    public final int hashCode() {
        A a7 = this.f84860a;
        return a7 == null ? 0 : a7.hashCode();
    }

    @NotNull
    public final String toString() {
        return X0.c.b(new StringBuilder("StateTuple1(a="), this.f84860a, ")");
    }
}
