package com.bilibili.pegasus.vm;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pegasus.Action;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: renamed from: com.bilibili.pegasus.vm.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/vm/b.class */
@StabilityInferred(parameters = 1)
public final class C5767b implements Action {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f79052a;

    public C5767b() {
        this(0);
    }

    public C5767b(int i7) {
        this.f79052a = "ClearFeedAction";
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5767b) && Intrinsics.areEqual(this.f79052a, ((C5767b) obj).f79052a);
    }

    public final int hashCode() {
        return this.f79052a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C8770a.a(new StringBuilder("ClearFeedAction(name="), this.f79052a, ")");
    }
}
