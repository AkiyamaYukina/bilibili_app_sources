package com.bilibili.pegasus.page;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pegasus.Action;
import com.bilibili.pegasus.PegasusHolderData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/y.class */
@StabilityInferred(parameters = 0)
public final class y implements Action {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PegasusHolderData f78453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f78454b;

    public y(@NotNull PegasusHolderData pegasusHolderData, int i7) {
        this.f78453a = pegasusHolderData;
        this.f78454b = i7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Intrinsics.areEqual(this.f78453a, yVar.f78453a) && this.f78454b == yVar.f78454b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f78454b) + (this.f78453a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "TimeMachineInsertAction(item=" + this.f78453a + ", index=" + this.f78454b + ")";
    }
}
