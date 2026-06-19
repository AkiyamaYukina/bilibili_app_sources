package com.bilibili.pegasus.vm;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pegasus.Action;
import com.bilibili.pegasus.PegasusHolderData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/vm/D.class */
@StabilityInferred(parameters = 0)
public final class D implements Action {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PegasusHolderData f79001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f79002b;

    public D(@NotNull PegasusHolderData pegasusHolderData, boolean z6) {
        this.f79001a = pegasusHolderData;
        this.f79002b = z6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d7 = (D) obj;
        return Intrinsics.areEqual(this.f79001a, d7.f79001a) && this.f79002b == d7.f79002b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f79002b) + (this.f79001a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "RemoveAction(item=" + this.f79001a + ", enableAnimation=" + this.f79002b + ")";
    }
}
