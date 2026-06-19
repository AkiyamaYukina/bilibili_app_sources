package com.bilibili.pegasus.vm;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pegasus.Action;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: renamed from: com.bilibili.pegasus.vm.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/vm/d.class */
@StabilityInferred(parameters = 1)
public final class C5769d implements Action {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f79054a;

    public C5769d() {
        this(0);
    }

    public C5769d(int i7) {
        this.f79054a = "ClearToastConfigSAction";
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5769d) && Intrinsics.areEqual(this.f79054a, ((C5769d) obj).f79054a);
    }

    public final int hashCode() {
        return this.f79054a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C8770a.a(new StringBuilder("ClearToastConfigSAction(name="), this.f79054a, ")");
    }
}
