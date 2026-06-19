package com.bilibili.ship.theseus.cheese.biz.intro.zone;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.account.interfaces.v1.k;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/zone/c.class */
@StabilityInferred(parameters = 0)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<d> f90315a;

    public c(@NotNull List<d> list) {
        this.f90315a = list;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.areEqual(this.f90315a, ((c) obj).f90315a);
    }

    public final int hashCode() {
        return this.f90315a.hashCode();
    }

    @NotNull
    public final String toString() {
        return k.a("PugvZone(contents=", ")", this.f90315a);
    }
}
