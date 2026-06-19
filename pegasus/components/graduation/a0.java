package com.bilibili.pegasus.components.graduation;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/a0.class */
@StabilityInferred(parameters = 1)
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f76103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f76104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f76105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f76106d;

    public a0(int i7, String str) {
        boolean zB = t0.b(i7, str);
        boolean zC = t0.c(i7);
        this.f76103a = i7;
        this.f76104b = str;
        this.f76105c = zB;
        this.f76106d = zC;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f76103a == a0Var.f76103a && Intrinsics.areEqual(this.f76104b, a0Var.f76104b) && this.f76105c == a0Var.f76105c && this.f76106d == a0Var.f76106d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f76106d) + androidx.compose.animation.z.a(I.E.a(Integer.hashCode(this.f76103a) * 31, 31, this.f76104b), 31, this.f76105c);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("GraduationSeasonYearOption(id=");
        sb.append(this.f76103a);
        sb.append(", title=");
        sb.append(this.f76104b);
        sb.append(", noAge=");
        sb.append(this.f76105c);
        sb.append(", notGraduated=");
        return androidx.appcompat.app.i.a(sb, this.f76106d, ")");
    }
}
