package com.bilibili.search2.stardust.expose;

import android.os.SystemClock;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/stardust/expose/f.class */
@StabilityInferred(parameters = 1)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f88750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f88751b;

    public f() {
        this(0);
    }

    public /* synthetic */ f(int i7) {
        this(false, SystemClock.elapsedRealtime());
    }

    public f(boolean z6, long j7) {
        this.f88750a = z6;
        this.f88751b = j7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f88750a == fVar.f88750a && this.f88751b == fVar.f88751b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f88751b) + (Boolean.hashCode(this.f88750a) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PageVisibleState(show=");
        sb.append(this.f88750a);
        sb.append(", lastChangeTimeMs=");
        return android.support.v4.media.session.a.a(sb, this.f88751b, ")");
    }
}
