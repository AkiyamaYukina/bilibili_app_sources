package com.bilibili.pegasus.components.interest.ui.udf.actions;

import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/udf/actions/a.class */
@StabilityInferred(parameters = 1)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f76426a;

    public a(int i7) {
        this.f76426a = i7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f76426a == ((a) obj).f76426a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f76426a);
    }

    @NotNull
    public final String toString() {
        return C4277b.a(this.f76426a, ")", new StringBuilder("StepClick(actionType="));
    }
}
