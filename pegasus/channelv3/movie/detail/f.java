package com.bilibili.pegasus.channelv3.movie.detail;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/detail/f.class */
@StabilityInferred(parameters = 0)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public String f75375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public String f75376b;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(f.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.f75375a, fVar.f75375a) && Intrinsics.areEqual(this.f75376b, fVar.f75376b);
    }

    public final int hashCode() {
        return this.f75376b.hashCode() + (this.f75375a.hashCode() * 31);
    }
}
