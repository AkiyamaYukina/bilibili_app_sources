package com.bilibili.ship.theseus.united.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/bean/f.class */
@StabilityInferred(parameters = 1)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f98760a;

    public f(long j7) {
        this.f98760a = j7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f98760a == ((f) obj).f98760a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f98760a);
    }

    @NotNull
    public final String toString() {
        return android.support.v4.media.session.a.a(new StringBuilder("UGCClipParams(clipId="), this.f98760a, ")");
    }
}
