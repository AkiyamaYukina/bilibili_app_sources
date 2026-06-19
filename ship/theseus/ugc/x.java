package com.bilibili.ship.theseus.ugc;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/x.class */
@StabilityInferred(parameters = 1)
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f98722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f98723b;

    public x() {
        this(false, 0L);
    }

    public x(boolean z6, long j7) {
        this.f98722a = z6;
        this.f98723b = j7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f98722a == xVar.f98722a && this.f98723b == xVar.f98723b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f98723b) + (Boolean.hashCode(this.f98722a) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("UgcSeasonConfData(seasonUnfold=");
        sb.append(this.f98722a);
        sb.append(", foldTime=");
        return android.support.v4.media.session.a.a(sb, this.f98723b, ")");
    }
}
