package com.bilibili.ship.theseus.cheese.biz.intro.primary;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/X.class */
@StabilityInferred(parameters = 1)
public final class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f89699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f89700b;

    public X(@NotNull String str, @NotNull String str2) {
        this.f89699a = str;
        this.f89700b = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X)) {
            return false;
        }
        X x6 = (X) obj;
        return Intrinsics.areEqual(this.f89699a, x6.f89699a) && Intrinsics.areEqual(this.f89700b, x6.f89700b);
    }

    public final int hashCode() {
        return this.f89700b.hashCode() + (this.f89699a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PugvSeasonPrimarySellPoint(title=");
        sb.append(this.f89699a);
        sb.append(", detail=");
        return C8770a.a(sb, this.f89700b, ")");
    }
}
