package com.bilibili.ship.theseus.cheese.biz.intro.primary;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/T.class */
@StabilityInferred(parameters = 1)
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f89687a;

    public T(@NotNull String str) {
        this.f89687a = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof T) && Intrinsics.areEqual(this.f89687a, ((T) obj).f89687a);
    }

    public final int hashCode() {
        return this.f89687a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C8770a.a(new StringBuilder("PugvSeasonPrimaryCustomInfo(expiryInfo="), this.f89687a, ")");
    }
}
