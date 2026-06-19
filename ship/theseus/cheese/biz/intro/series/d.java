package com.bilibili.ship.theseus.cheese.biz.intro.series;

import androidx.compose.runtime.internal.StabilityInferred;
import eu0.C7004w;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/series/d.class */
@StabilityInferred(parameters = 0)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final C7004w f90105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<e> f90106b;

    public d(@NotNull C7004w c7004w, @NotNull List<e> list) {
        this.f90105a = c7004w;
        this.f90106b = list;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f90105a, dVar.f90105a) && Intrinsics.areEqual(this.f90106b, dVar.f90106b);
    }

    public final int hashCode() {
        return this.f90106b.hashCode() + (this.f90105a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "PugvSeries(nav=" + this.f90105a + ", contents=" + this.f90106b + ")";
    }
}
