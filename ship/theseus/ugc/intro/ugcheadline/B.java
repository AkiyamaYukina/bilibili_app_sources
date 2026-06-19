package com.bilibili.ship.theseus.ugc.intro.ugcheadline;

import I.E;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/B.class */
@StabilityInferred(parameters = 1)
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f97230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f97231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f97232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f97233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f97234e;

    public B(long j7, long j8, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        this.f97230a = j7;
        this.f97231b = j8;
        this.f97232c = str;
        this.f97233d = str2;
        this.f97234e = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b7 = (B) obj;
        return this.f97230a == b7.f97230a && this.f97231b == b7.f97231b && Intrinsics.areEqual(this.f97232c, b7.f97232c) && Intrinsics.areEqual(this.f97233d, b7.f97233d) && Intrinsics.areEqual(this.f97234e, b7.f97234e);
    }

    public final int hashCode() {
        return this.f97234e.hashCode() + E.a(E.a(C3554n0.a(Long.hashCode(this.f97230a) * 31, 31, this.f97231b), 31, this.f97232c), 31, this.f97233d);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewMaterial(oid=");
        sb.append(this.f97230a);
        sb.append(", mid=");
        sb.append(this.f97231b);
        sb.append(", title=");
        sb.append(this.f97232c);
        sb.append(", author=");
        sb.append(this.f97233d);
        sb.append(", jumpUrl=");
        return C8770a.a(sb, this.f97234e, ")");
    }
}
