package com.bilibili.music.podcast.data;

import androidx.compose.runtime.snapshots.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/data/s.class */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f66495a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f66496b = -1;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f66495a == sVar.f66495a && this.f66496b == sVar.f66496b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f66496b) + (Long.hashCode(this.f66495a) * 31);
    }

    @NotNull
    public final String toString() {
        long j7 = this.f66495a;
        return android.support.v4.media.session.a.a(z.a(j7, "RouteVideoHistory(oid=", ", sid="), this.f66496b, ")");
    }
}
