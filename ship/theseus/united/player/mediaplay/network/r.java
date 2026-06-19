package com.bilibili.ship.theseus.united.player.mediaplay.network;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/network/r.class */
@StabilityInferred(parameters = 1)
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f104600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final s f104601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final q f104602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f104603d;

    public r(long j7, @Nullable s sVar, @Nullable q qVar, boolean z6) {
        this.f104600a = j7;
        this.f104601b = sVar;
        this.f104602c = qVar;
        this.f104603d = z6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f104600a == rVar.f104600a && Intrinsics.areEqual(this.f104601b, rVar.f104601b) && Intrinsics.areEqual(this.f104602c, rVar.f104602c) && this.f104603d == rVar.f104603d;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f104600a);
        int iHashCode2 = 0;
        s sVar = this.f104601b;
        int iHashCode3 = sVar == null ? 0 : sVar.hashCode();
        q qVar = this.f104602c;
        if (qVar != null) {
            iHashCode2 = qVar.hashCode();
        }
        return Boolean.hashCode(this.f104603d) + (((((iHashCode * 31) + iHashCode3) * 31) + iHashCode2) * 31);
    }

    @NotNull
    public final String toString() {
        return "TFInfo(tipsId=" + this.f104600a + ", toast=" + this.f104601b + ", panel=" + this.f104602c + ", isNewUser=" + this.f104603d + ")";
    }
}
