package com.bilibili.pegasus.page;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pegasus.Action;
import com.bilibili.pegasus.PegasusHolderData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/Q.class */
@StabilityInferred(parameters = 0)
public final class Q implements Action {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PegasusHolderData f78311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PegasusHolderData f78312b;

    public Q(@NotNull PegasusHolderData pegasusHolderData, @NotNull PegasusHolderData pegasusHolderData2) {
        this.f78311a = pegasusHolderData;
        this.f78312b = pegasusHolderData2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q7 = (Q) obj;
        return Intrinsics.areEqual(this.f78311a, q7.f78311a) && Intrinsics.areEqual(this.f78312b, q7.f78312b);
    }

    public final int hashCode() {
        return this.f78312b.hashCode() + (this.f78311a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "TimeMachineReplaceAction(old=" + this.f78311a + ", new=" + this.f78312b + ")";
    }
}
