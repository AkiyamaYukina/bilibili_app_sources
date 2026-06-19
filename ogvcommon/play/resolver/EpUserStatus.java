package com.bilibili.ogvcommon.play.resolver;

import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/resolver/EpUserStatus.class */
@StabilityInferred(parameters = 1)
@Bson
public final class EpUserStatus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f73204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f73205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final SeasonWatchProgress f73206c;

    public EpUserStatus(boolean z6, boolean z7, @NotNull SeasonWatchProgress seasonWatchProgress) {
        this.f73204a = z6;
        this.f73205b = z7;
        this.f73206c = seasonWatchProgress;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EpUserStatus)) {
            return false;
        }
        EpUserStatus epUserStatus = (EpUserStatus) obj;
        return this.f73204a == epUserStatus.f73204a && this.f73205b == epUserStatus.f73205b && Intrinsics.areEqual(this.f73206c, epUserStatus.f73206c);
    }

    public final int hashCode() {
        return this.f73206c.hashCode() + z.a(Boolean.hashCode(this.f73204a) * 31, 31, this.f73205b);
    }

    @NotNull
    public final String toString() {
        return "EpUserStatus(payCheck=" + this.f73204a + ", sponsored=" + this.f73205b + ", watchProgress=" + this.f73206c + ")";
    }
}
