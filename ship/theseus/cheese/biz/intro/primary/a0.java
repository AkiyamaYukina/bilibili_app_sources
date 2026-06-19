package com.bilibili.ship.theseus.cheese.biz.intro.primary;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/a0.class */
@StabilityInferred(parameters = 1)
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f89707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f89708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f89709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f89710d;

    public a0(long j7, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        this.f89707a = j7;
        this.f89708b = str;
        this.f89709c = str2;
        this.f89710d = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f89707a == a0Var.f89707a && Intrinsics.areEqual(this.f89708b, a0Var.f89708b) && Intrinsics.areEqual(this.f89709c, a0Var.f89709c) && Intrinsics.areEqual(this.f89710d, a0Var.f89710d);
    }

    public final int hashCode() {
        return this.f89710d.hashCode() + I.E.a(I.E.a(Long.hashCode(this.f89707a) * 31, 31, this.f89708b), 31, this.f89709c);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("StatInfo(value=");
        sb.append(this.f89707a);
        sb.append(", text=");
        sb.append(this.f89708b);
        sb.append(", pureText=");
        sb.append(this.f89709c);
        sb.append(", icon=");
        return C8770a.a(sb, this.f89710d, ")");
    }
}
