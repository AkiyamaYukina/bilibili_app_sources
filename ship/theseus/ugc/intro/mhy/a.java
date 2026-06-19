package com.bilibili.ship.theseus.ugc.intro.mhy;

import N1.o;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/mhy/a.class */
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f97082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<b> f97083b;

    public a(@NotNull String str, @NotNull List<b> list) {
        this.f97082a = str;
        this.f97083b = list;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f97082a, aVar.f97082a) && Intrinsics.areEqual(this.f97083b, aVar.f97083b);
    }

    public final int hashCode() {
        return this.f97083b.hashCode() + (this.f97082a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        List<b> list = this.f97083b;
        return o.a(this.f97082a, ", starRailList=", ")", new StringBuilder("ActivityStarRail(banner="), list);
    }
}
