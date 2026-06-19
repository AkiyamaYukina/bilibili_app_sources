package com.bilibili.search2.result.base;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.search2.api.BaseSearchItem;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/m.class */
@StabilityInferred(parameters = 0)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final BaseSearchItem f87560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Object f87561b;

    public m(@NotNull BaseSearchItem baseSearchItem, @Nullable Object obj) {
        this.f87560a = baseSearchItem;
        this.f87561b = obj;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.areEqual(this.f87560a, mVar.f87560a) && Intrinsics.areEqual(this.f87561b, mVar.f87561b);
    }

    public final int hashCode() {
        int iHashCode = this.f87560a.hashCode();
        Object obj = this.f87561b;
        return (iHashCode * 31) + (obj == null ? 0 : obj.hashCode());
    }

    @NotNull
    public final String toString() {
        return "ItemChangeParams(item=" + this.f87560a + ", payloads=" + this.f87561b + ")";
    }
}
