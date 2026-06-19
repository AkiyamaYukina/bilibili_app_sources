package com.bilibili.pegasus.page;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pegasus.Action;
import com.bilibili.pegasus.data.request.PegasusResponseWrapper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.pegasus.page.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/o.class */
@StabilityInferred(parameters = 0)
public final class C5726o implements Action {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PegasusResponseWrapper f78430a;

    public C5726o(@NotNull PegasusResponseWrapper pegasusResponseWrapper) {
        this.f78430a = pegasusResponseWrapper;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5726o) && Intrinsics.areEqual(this.f78430a, ((C5726o) obj).f78430a);
    }

    public final int hashCode() {
        return this.f78430a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "TimeMachineErrorAction(response=" + this.f78430a + ")";
    }
}
