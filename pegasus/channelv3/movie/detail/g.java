package com.bilibili.pegasus.channelv3.movie.detail;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/detail/g.class */
@StabilityInferred(parameters = 0)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public String f75377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public String f75378b;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(g.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.areEqual(this.f75377a, gVar.f75377a) && Intrinsics.areEqual(this.f75378b, gVar.f75378b);
    }

    public final int hashCode() {
        return this.f75378b.hashCode() + (this.f75377a.hashCode() * 31);
    }
}
