package com.bilibili.pegasus.vm;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pegasus.Action;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/vm/l.class */
@StabilityInferred(parameters = 1)
public final class l implements Action {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f79067a;

    public l(@NotNull String str) {
        this.f79067a = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Intrinsics.areEqual(this.f79067a, ((l) obj).f79067a);
    }

    public final int hashCode() {
        return this.f79067a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C8770a.a(new StringBuilder("LogMessageAction(message="), this.f79067a, ")");
    }
}
