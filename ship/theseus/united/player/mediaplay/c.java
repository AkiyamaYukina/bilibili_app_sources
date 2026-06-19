package com.bilibili.ship.theseus.united.player.mediaplay;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.time.Duration;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/c.class */
@StabilityInferred(parameters = 1)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f104512a;

    public c(long j7) {
        this.f104512a = j7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Duration.equals-impl0(this.f104512a, ((c) obj).f104512a);
    }

    public final int hashCode() {
        return Duration.hashCode-impl(this.f104512a);
    }

    @NotNull
    public final String toString() {
        return android.support.v4.media.a.a("MasterPieceOffset(offset=", Duration.toString-impl(this.f104512a), ")");
    }
}
