package com.bilibili.pegasus.page;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pegasus.Action;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/B.class */
@StabilityInferred(parameters = 1)
public final class B implements Action {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f78272a;

    public B(@NotNull String str) {
        this.f78272a = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof B) && Intrinsics.areEqual(this.f78272a, ((B) obj).f78272a);
    }

    public final int hashCode() {
        return this.f78272a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C8770a.a(new StringBuilder("TimeMachineLogAction(message="), this.f78272a, ")");
    }
}
