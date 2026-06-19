package com.bilibili.search2.result.base;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.search2.api.BaseSearchItem;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/p.class */
@StabilityInferred(parameters = 0)
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final BaseSearchItem f87573a;

    public p(@NotNull BaseSearchItem baseSearchItem) {
        this.f87573a = baseSearchItem;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && Intrinsics.areEqual(this.f87573a, ((p) obj).f87573a);
    }

    public final int hashCode() {
        return this.f87573a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "RemoveParams(item=" + this.f87573a + ")";
    }
}
