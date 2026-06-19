package com.bilibili.ship.theseus.ugc.intro.iframe;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/iframe/a.class */
@StabilityInferred(parameters = 1)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f97019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f97020b;

    public a(@NotNull String str, double d7) {
        this.f97019a = str;
        this.f97020b = d7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f97019a, aVar.f97019a) && Double.compare(this.f97020b, aVar.f97020b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f97020b) + (this.f97019a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("IframeConf(url=");
        sb.append(this.f97019a);
        sb.append(", aspectRatio=");
        return z4.b.a(sb, this.f97020b, ")");
    }
}
