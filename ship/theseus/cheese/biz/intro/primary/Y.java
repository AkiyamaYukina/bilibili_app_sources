package com.bilibili.ship.theseus.cheese.biz.intro.primary;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/Y.class */
@StabilityInferred(parameters = 0)
public final class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f89701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<X> f89702b;

    public Y(int i7, @NotNull List<X> list) {
        this.f89701a = i7;
        this.f89702b = list;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y)) {
            return false;
        }
        Y y6 = (Y) obj;
        return this.f89701a == y6.f89701a && Intrinsics.areEqual(this.f89702b, y6.f89702b);
    }

    public final int hashCode() {
        return this.f89702b.hashCode() + (Integer.hashCode(this.f89701a) * 31);
    }

    @NotNull
    public final String toString() {
        return K7.N.a(new StringBuilder("PugvSeasonPrimarySellPointInfo(type="), this.f89701a, ", sellPoints=", this.f89702b, ")");
    }
}
