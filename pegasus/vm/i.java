package com.bilibili.pegasus.vm;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pegasus.Action;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/vm/i.class */
@StabilityInferred(parameters = 1)
public final class i implements Action {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f79063a;

    public i() {
        this(0);
    }

    public i(int i7) {
        this.f79063a = "InsertFooterLoadingAction";
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Intrinsics.areEqual(this.f79063a, ((i) obj).f79063a);
    }

    public final int hashCode() {
        return this.f79063a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C8770a.a(new StringBuilder("InsertFooterLoadingAction(name="), this.f79063a, ")");
    }
}
