package com.bilibili.pegasus.page;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pegasus.Action;
import com.bilibili.pegasus.PegasusHolderData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/A.class */
@StabilityInferred(parameters = 0)
public final class A implements Action {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PegasusHolderData f78270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Object f78271b;

    public A(@NotNull PegasusHolderData pegasusHolderData, @Nullable Object obj) {
        this.f78270a = pegasusHolderData;
        this.f78271b = obj;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a7 = (A) obj;
        return Intrinsics.areEqual(this.f78270a, a7.f78270a) && Intrinsics.areEqual(this.f78271b, a7.f78271b);
    }

    public final int hashCode() {
        int iHashCode = this.f78270a.hashCode();
        Object obj = this.f78271b;
        return (iHashCode * 31) + (obj == null ? 0 : obj.hashCode());
    }

    @NotNull
    public final String toString() {
        return "TimeMachineItemChangeAction(item=" + this.f78270a + ", payload=" + this.f78271b + ")";
    }
}
