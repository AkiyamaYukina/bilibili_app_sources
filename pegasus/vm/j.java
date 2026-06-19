package com.bilibili.pegasus.vm;

import androidx.compose.animation.core.I;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pegasus.Action;
import com.bilibili.pegasus.PegasusHolderData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/vm/j.class */
@StabilityInferred(parameters = 0)
public final class j implements Action {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<PegasusHolderData> f79064a;

    public j(@NotNull List list) {
        this.f79064a = list;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Intrinsics.areEqual(this.f79064a, ((j) obj).f79064a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + I.a(0, this.f79064a.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        return com.bapis.bilibili.account.interfaces.v1.k.a("InsertItemsAction(items=", ", index=0, enableAnimation=true)", this.f79064a);
    }
}
