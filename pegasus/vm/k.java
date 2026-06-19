package com.bilibili.pegasus.vm;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pegasus.Action;
import com.bilibili.pegasus.PegasusHolderData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/vm/k.class */
@StabilityInferred(parameters = 0)
public final class k implements Action {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PegasusHolderData f79065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Object f79066b;

    public k(@NotNull PegasusHolderData pegasusHolderData, @Nullable Object obj) {
        this.f79065a = pegasusHolderData;
        this.f79066b = obj;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.areEqual(this.f79065a, kVar.f79065a) && Intrinsics.areEqual(this.f79066b, kVar.f79066b);
    }

    public final int hashCode() {
        int iHashCode = this.f79065a.hashCode();
        Object obj = this.f79066b;
        return (iHashCode * 31) + (obj == null ? 0 : obj.hashCode());
    }

    @NotNull
    public final String toString() {
        return "ItemChangeAction(item=" + this.f79065a + ", payload=" + this.f79066b + ")";
    }
}
