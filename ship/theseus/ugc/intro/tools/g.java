package com.bilibili.ship.theseus.ugc.intro.tools;

import N1.o;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/tools/g.class */
@StabilityInferred(parameters = 0)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f97223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<b> f97224b;

    public g(@NotNull String str, @NotNull List<b> list) {
        this.f97223a = str;
        this.f97224b = list;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.areEqual(this.f97223a, gVar.f97223a) && Intrinsics.areEqual(this.f97224b, gVar.f97224b);
    }

    public final int hashCode() {
        return this.f97224b.hashCode() + (this.f97223a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        List<b> list = this.f97224b;
        return o.a(this.f97223a, ", tools=", ")", new StringBuilder("UploaderToolsData(title="), list);
    }
}
