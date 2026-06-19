package com.bilibili.pegasus.components.recover;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pegasus.Action;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/recover/i.class */
@StabilityInferred(parameters = 1)
public final class i implements Action {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final i f77158a = new i();

    public final boolean equals(@Nullable Object obj) {
        return this == obj || (obj instanceof i);
    }

    public final int hashCode() {
        return -754633791;
    }

    @NotNull
    public final String toString() {
        return "ExpandRecoverStripAction";
    }
}
