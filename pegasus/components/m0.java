package com.bilibili.pegasus.components;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/m0.class */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f77089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function1<Integer, Boolean> f77090b;

    /* JADX WARN: Multi-variable type inference failed */
    public m0(@NotNull String str, @NotNull Function1<? super Integer, Boolean> function1) {
        this.f77089a = str;
        this.f77090b = function1;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return Intrinsics.areEqual(this.f77089a, m0Var.f77089a) && Intrinsics.areEqual(this.f77090b, m0Var.f77090b);
    }

    public final int hashCode() {
        return this.f77090b.hashCode() + (this.f77089a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "RouterBehavior(routerUrl=" + this.f77089a + ", predicate=" + this.f77090b + ")";
    }
}
