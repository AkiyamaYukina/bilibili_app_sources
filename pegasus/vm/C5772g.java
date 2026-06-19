package com.bilibili.pegasus.vm;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pegasus.Action;
import com.bilibili.pegasus.PegasusHolderData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.pegasus.vm.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/vm/g.class */
@StabilityInferred(parameters = 0)
public final class C5772g implements Action {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<PegasusHolderData> f79058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final fp0.p f79059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<PegasusHolderData> f79060c;

    public C5772g(@NotNull List list, @NotNull fp0.p pVar, @NotNull List list2) {
        this.f79058a = list;
        this.f79059b = pVar;
        this.f79060c = list2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5772g)) {
            return false;
        }
        C5772g c5772g = (C5772g) obj;
        return Intrinsics.areEqual(this.f79058a, c5772g.f79058a) && Intrinsics.areEqual(this.f79059b, c5772g.f79059b) && Intrinsics.areEqual(this.f79060c, c5772g.f79060c);
    }

    public final int hashCode() {
        int iHashCode = this.f79058a.hashCode();
        return this.f79060c.hashCode() + ((this.f79059b.hashCode() + (iHashCode * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "FoldRecoverAction(foldedCards=" + this.f79058a + ", recoverStripItem=" + this.f79059b + ", allOldCards=" + this.f79060c + ")";
    }
}
