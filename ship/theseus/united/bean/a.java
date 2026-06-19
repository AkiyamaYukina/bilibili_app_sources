package com.bilibili.ship.theseus.united.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/bean/a.class */
@StabilityInferred(parameters = 1)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f98739a;

    public a(long j7) {
        this.f98739a = j7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f98739a == ((a) obj).f98739a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f98739a);
    }

    @NotNull
    public final String toString() {
        return android.support.v4.media.session.a.a(new StringBuilder("CheeseClipParams(clipId="), this.f98739a, ")");
    }
}
