package com.bilibili.pegasus.vm;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pegasus.Action;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/vm/E.class */
@StabilityInferred(parameters = 1)
public final class E implements Action {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f79003a;

    public E() {
        this(0);
    }

    public E(int i7) {
        this.f79003a = "RemoveBottomNotAttachAction";
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof E) && Intrinsics.areEqual(this.f79003a, ((E) obj).f79003a);
    }

    public final int hashCode() {
        return this.f79003a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C8770a.a(new StringBuilder("RemoveBottomNotAttachAction(name="), this.f79003a, ")");
    }
}
