package com.bilibili.pegasus.page;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pegasus.Action;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/z.class */
@StabilityInferred(parameters = 1)
public final class z implements Action {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f78455a;

    public z() {
        this(0);
    }

    public z(int i7) {
        this.f78455a = "TmInsertFooterLoading";
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && Intrinsics.areEqual(this.f78455a, ((z) obj).f78455a);
    }

    public final int hashCode() {
        return this.f78455a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C8770a.a(new StringBuilder("TimeMachineInsertFooterLoadingAction(name="), this.f78455a, ")");
    }
}
