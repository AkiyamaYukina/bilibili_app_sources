package com.bilibili.pegasus.page;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pegasus.Action;
import com.bilibili.pegasus.PegasusHolderData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/P.class */
@StabilityInferred(parameters = 0)
public final class P implements Action {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PegasusHolderData f78309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f78310b = true;

    public P(PegasusHolderData pegasusHolderData) {
        this.f78309a = pegasusHolderData;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p7 = (P) obj;
        return Intrinsics.areEqual(this.f78309a, p7.f78309a) && this.f78310b == p7.f78310b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f78310b) + (this.f78309a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "TimeMachineRemoveAction(item=" + this.f78309a + ", enableAnimation=" + this.f78310b + ")";
    }
}
