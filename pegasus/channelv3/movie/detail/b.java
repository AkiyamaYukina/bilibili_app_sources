package com.bilibili.pegasus.channelv3.movie.detail;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/detail/b.class */
@StabilityInferred(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public List<e> f75361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public String f75362b;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f75361a, bVar.f75361a) && Intrinsics.areEqual(this.f75362b, bVar.f75362b);
    }

    public final int hashCode() {
        List<e> list = this.f75361a;
        return this.f75362b.hashCode() + ((list != null ? list.hashCode() : 0) * 31);
    }
}
