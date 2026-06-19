package com.bilibili.ogv.infra.util;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/util/j.class */
@StabilityInferred(parameters = 15)
public final class j<T1, T2, T3, T4> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T1 f67956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T2 f67957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T3 f67958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final T4 f67959d;

    public j(T1 t12, T2 t22, T3 t32, T4 t42) {
        this.f67956a = t12;
        this.f67957b = t22;
        this.f67958c = t32;
        this.f67959d = t42;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f67956a, jVar.f67956a) && Intrinsics.areEqual(this.f67957b, jVar.f67957b) && Intrinsics.areEqual(this.f67958c, jVar.f67958c) && Intrinsics.areEqual(this.f67959d, jVar.f67959d);
    }

    public final int hashCode() {
        int iHashCode = 0;
        T1 t12 = this.f67956a;
        int iHashCode2 = t12 == null ? 0 : t12.hashCode();
        T2 t22 = this.f67957b;
        int iHashCode3 = t22 == null ? 0 : t22.hashCode();
        T3 t32 = this.f67958c;
        int iHashCode4 = t32 == null ? 0 : t32.hashCode();
        T4 t42 = this.f67959d;
        if (t42 != null) {
            iHashCode = t42.hashCode();
        }
        return (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Tuple4(e1=");
        sb.append(this.f67956a);
        sb.append(", e2=");
        sb.append(this.f67957b);
        sb.append(", e3=");
        sb.append(this.f67958c);
        sb.append(", e4=");
        return X0.c.b(sb, this.f67959d, ")");
    }
}
