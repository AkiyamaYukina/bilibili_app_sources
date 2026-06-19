package com.bilibili.pegasus.vm;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pegasus.PegasusHolderData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/vm/n.class */
@StabilityInferred(parameters = 0)
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final fp0.p f79070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<PegasusHolderData> f79071b;

    public n(@NotNull fp0.p pVar, @NotNull List<? extends PegasusHolderData> list) {
        this.f79070a = pVar;
        this.f79071b = list;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.areEqual(this.f79070a, nVar.f79070a) && Intrinsics.areEqual(this.f79071b, nVar.f79071b);
    }

    public final int hashCode() {
        return this.f79071b.hashCode() + (this.f79070a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "ManualRefreshRecoverState(recoverStripItem=" + this.f79070a + ", foldedCards=" + this.f79071b + ")";
    }
}
