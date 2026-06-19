package com.bilibili.ship.theseus.cheese.biz.intro.primary;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/U.class */
@StabilityInferred(parameters = 1)
public final class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f89688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f89689b;

    public U(@NotNull String str, @NotNull String str2) {
        this.f89688a = str;
        this.f89689b = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U)) {
            return false;
        }
        U u7 = (U) obj;
        return Intrinsics.areEqual(this.f89688a, u7.f89688a) && Intrinsics.areEqual(this.f89689b, u7.f89689b);
    }

    public final int hashCode() {
        return this.f89689b.hashCode() + (this.f89688a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PugvSeasonPrimaryHotRank(text=");
        sb.append(this.f89688a);
        sb.append(", link=");
        return C8770a.a(sb, this.f89689b, ")");
    }
}
