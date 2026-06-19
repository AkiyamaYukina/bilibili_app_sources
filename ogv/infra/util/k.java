package com.bilibili.ogv.infra.util;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/util/k.class */
@StabilityInferred(parameters = 31)
public final class k<T1, T2, T3, T4, T5> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T1 f67960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T2 f67961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T3 f67962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final T4 f67963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final T5 f67964e;

    public k(T1 t12, T2 t22, T3 t32, T4 t42, T5 t52) {
        this.f67960a = t12;
        this.f67961b = t22;
        this.f67962c = t32;
        this.f67963d = t42;
        this.f67964e = t52;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.areEqual(this.f67960a, kVar.f67960a) && Intrinsics.areEqual(this.f67961b, kVar.f67961b) && Intrinsics.areEqual(this.f67962c, kVar.f67962c) && Intrinsics.areEqual(this.f67963d, kVar.f67963d) && Intrinsics.areEqual(this.f67964e, kVar.f67964e);
    }

    public final int hashCode() {
        int iHashCode = 0;
        T1 t12 = this.f67960a;
        int iHashCode2 = t12 == null ? 0 : t12.hashCode();
        T2 t22 = this.f67961b;
        int iHashCode3 = t22 == null ? 0 : t22.hashCode();
        T3 t32 = this.f67962c;
        int iHashCode4 = t32 == null ? 0 : t32.hashCode();
        T4 t42 = this.f67963d;
        int iHashCode5 = t42 == null ? 0 : t42.hashCode();
        T5 t52 = this.f67964e;
        if (t52 != null) {
            iHashCode = t52.hashCode();
        }
        return (((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Tuple5(e1=");
        sb.append(this.f67960a);
        sb.append(", e2=");
        sb.append(this.f67961b);
        sb.append(", e3=");
        sb.append(this.f67962c);
        sb.append(", e4=");
        sb.append(this.f67963d);
        sb.append(", e5=");
        return X0.c.b(sb, this.f67964e, ")");
    }
}
