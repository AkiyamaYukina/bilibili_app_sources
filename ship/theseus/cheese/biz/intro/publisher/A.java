package com.bilibili.ship.theseus.cheese.biz.intro.publisher;

import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/publisher/A.class */
@StabilityInferred(parameters = 1)
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f89791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f89792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f89793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f89794d;

    public A(long j7, long j8, @NotNull String str, @NotNull String str2) {
        this.f89791a = j7;
        this.f89792b = j8;
        this.f89793c = str;
        this.f89794d = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a7 = (A) obj;
        return this.f89791a == a7.f89791a && this.f89792b == a7.f89792b && Intrinsics.areEqual(this.f89793c, a7.f89793c) && Intrinsics.areEqual(this.f89794d, a7.f89794d);
    }

    public final int hashCode() {
        return this.f89794d.hashCode() + I.E.a(C3554n0.a(Long.hashCode(this.f89791a) * 31, 31, this.f89792b), 31, this.f89793c);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Live(mid=");
        sb.append(this.f89791a);
        sb.append(", roomId=");
        sb.append(this.f89792b);
        sb.append(", uri=");
        sb.append(this.f89793c);
        sb.append(", endPageUri=");
        return C8770a.a(sb, this.f89794d, ")");
    }
}
