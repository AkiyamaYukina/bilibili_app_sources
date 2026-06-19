package com.bilibili.pegasus.vm;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pegasus.Action;
import com.bilibili.pegasus.PegasusHolderData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/vm/h.class */
@StabilityInferred(parameters = 0)
public final class h implements Action {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PegasusHolderData f79061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f79062b;

    public h(@NotNull PegasusHolderData pegasusHolderData, int i7) {
        this.f79061a = pegasusHolderData;
        this.f79062b = i7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.areEqual(this.f79061a, hVar.f79061a) && this.f79062b == hVar.f79062b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f79062b) + (this.f79061a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "InsertAction(item=" + this.f79061a + ", index=" + this.f79062b + ")";
    }
}
