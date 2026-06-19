package com.bilibili.pegasus.vm;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pegasus.Action;
import com.bilibili.pegasus.PegasusHolderData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.pegasus.vm.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/vm/f.class */
@StabilityInferred(parameters = 0)
public final class C5771f implements Action {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PegasusHolderData f79056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<PegasusHolderData> f79057b;

    public C5771f(@NotNull PegasusHolderData pegasusHolderData, @NotNull List<? extends PegasusHolderData> list) {
        this.f79056a = pegasusHolderData;
        this.f79057b = list;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5771f)) {
            return false;
        }
        C5771f c5771f = (C5771f) obj;
        return Intrinsics.areEqual(this.f79056a, c5771f.f79056a) && Intrinsics.areEqual(this.f79057b, c5771f.f79057b);
    }

    public final int hashCode() {
        return this.f79057b.hashCode() + (this.f79056a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "ExpandRecoverAction(recoverStripItem=" + this.f79056a + ", foldedCards=" + this.f79057b + ")";
    }
}
