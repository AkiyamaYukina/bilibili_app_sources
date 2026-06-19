package com.bilibili.pegasus.vm;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pegasus.Action;
import com.bilibili.pegasus.data.request.PegasusResponseWrapper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.pegasus.vm.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/vm/e.class */
@StabilityInferred(parameters = 0)
public final class C5770e implements Action {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PegasusResponseWrapper f79055a;

    public C5770e(@NotNull PegasusResponseWrapper pegasusResponseWrapper) {
        this.f79055a = pegasusResponseWrapper;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5770e) && Intrinsics.areEqual(this.f79055a, ((C5770e) obj).f79055a);
    }

    public final int hashCode() {
        return this.f79055a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "ErrorHandleAction(response=" + this.f79055a + ")";
    }
}
