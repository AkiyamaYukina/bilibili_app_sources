package com.bilibili.search2.result.base;

import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/h.class */
@StabilityInferred(parameters = 0)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f87549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f87550b;

    public h(int i7, int i8) {
        this.f87549a = i7;
        this.f87550b = i8;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f87549a == hVar.f87549a && Intrinsics.areEqual((Object) null, (Object) null) && this.f87550b == hVar.f87550b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f87550b) + (Integer.hashCode(this.f87549a) * 961);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("BatchChangeParams(position=");
        sb.append(this.f87549a);
        sb.append(", payloads=null, range=");
        return C4277b.a(this.f87550b, ")", sb);
    }
}
