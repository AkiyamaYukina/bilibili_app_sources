package com.bilibili.ship.theseus.united.player.mediaplay;

import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/l.class */
@StabilityInferred(parameters = 0)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f104527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f104528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.j f104529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final f f104530d;

    public l(long j7, long j8, @NotNull com.bilibili.ship.theseus.keel.player.j jVar, @NotNull f fVar) {
        this.f104527a = j7;
        this.f104528b = j8;
        this.f104529c = jVar;
        this.f104530d = fVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f104527a == lVar.f104527a && this.f104528b == lVar.f104528b && Intrinsics.areEqual(this.f104529c, lVar.f104529c) && Intrinsics.areEqual(this.f104530d, lVar.f104530d);
    }

    public final int hashCode() {
        int iA = C3554n0.a(Long.hashCode(this.f104527a) * 31, 31, this.f104528b);
        return this.f104530d.hashCode() + ((this.f104529c.hashCode() + iA) * 31);
    }

    @NotNull
    public final String toString() {
        return "MediaRunningState(avid=" + this.f104527a + ", cid=" + this.f104528b + ", playable=" + this.f104529c + ", playInitial=" + this.f104530d + ")";
    }
}
