package com.bilibili.pegasus.vm;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pegasus.Action;
import com.bilibili.pegasus.PegasusHolderData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/vm/F.class */
@StabilityInferred(parameters = 0)
public final class F implements Action {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PegasusHolderData f79004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PegasusHolderData f79005b;

    public F(@NotNull PegasusHolderData pegasusHolderData, @NotNull PegasusHolderData pegasusHolderData2) {
        this.f79004a = pegasusHolderData;
        this.f79005b = pegasusHolderData2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f7 = (F) obj;
        return Intrinsics.areEqual(this.f79004a, f7.f79004a) && Intrinsics.areEqual(this.f79005b, f7.f79005b);
    }

    public final int hashCode() {
        return this.f79005b.hashCode() + (this.f79004a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "ReplaceAction(old=" + this.f79004a + ", new=" + this.f79005b + ")";
    }
}
