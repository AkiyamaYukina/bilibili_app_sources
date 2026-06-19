package com.bilibili.pegasus.components;

import com.bilibili.pegasus.Action;
import com.bilibili.pegasus.Store;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mp0.C8028c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/s0.class */
public final class s0 implements com.bilibili.pegasus.n<C8028c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Action f77163a;

    public s0(@NotNull Action action) {
        this.f77163a = action;
    }

    @Nullable
    public final Object a(@NotNull Store<C8028c> store, @NotNull Continuation<? super Action> continuation) {
        return this.f77163a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s0) && Intrinsics.areEqual(this.f77163a, ((s0) obj).f77163a);
    }

    public final int hashCode() {
        return this.f77163a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "YieldAction(inner=" + this.f77163a + ")";
    }
}
