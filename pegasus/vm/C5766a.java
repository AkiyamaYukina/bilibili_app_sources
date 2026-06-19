package com.bilibili.pegasus.vm;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pegasus.Action;
import com.bilibili.pegasus.data.request.PegasusResponseWrapper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.pegasus.vm.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/vm/a.class */
@StabilityInferred(parameters = 0)
public final class C5766a implements Action {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PegasusResponseWrapper f79051a;

    public C5766a(@NotNull PegasusResponseWrapper pegasusResponseWrapper) {
        this.f79051a = pegasusResponseWrapper;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5766a) && Intrinsics.areEqual(this.f79051a, ((C5766a) obj).f79051a);
    }

    public final int hashCode() {
        return this.f79051a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "CacheHandleAction(response=" + this.f79051a + ")";
    }
}
