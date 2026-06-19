package com.bilibili.pegasus.vm;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pegasus.Action;
import com.bilibili.pegasus.PegasusHolderData;
import dp0.C6828a;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/vm/B.class */
@StabilityInferred(parameters = 0)
public final class B implements Action {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<PegasusHolderData> f78992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final C6828a f78993b;

    public B(@NotNull List<? extends PegasusHolderData> list, @NotNull C6828a c6828a) {
        this.f78992a = list;
        this.f78993b = c6828a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b7 = (B) obj;
        return Intrinsics.areEqual(this.f78992a, b7.f78992a) && Intrinsics.areEqual(this.f78993b, b7.f78993b);
    }

    public final int hashCode() {
        return this.f78993b.hashCode() + (this.f78992a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "RecreateRecoverAction(items=" + this.f78992a + ", config=" + this.f78993b + ")";
    }
}
