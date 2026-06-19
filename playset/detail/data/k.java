package com.bilibili.playset.detail.data;

import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/k.class */
@StabilityInferred(parameters = 1)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f84541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f84542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f84543c;

    public k(long j7, boolean z6, boolean z7) {
        this.f84541a = j7;
        this.f84542b = z6;
        this.f84543c = z7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f84541a == kVar.f84541a && this.f84542b == kVar.f84542b && this.f84543c == kVar.f84543c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f84543c) + z.a(z.a(Long.hashCode(this.f84541a) * 31, 31, false), 31, this.f84542b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("FirstFavSetResult(playlistId=");
        sb.append(this.f84541a);
        sb.append(", isDelete=false, isCreateNewFolder=");
        sb.append(this.f84542b);
        sb.append(", hasFav=");
        return androidx.appcompat.app.i.a(sb, this.f84543c, ")");
    }
}
