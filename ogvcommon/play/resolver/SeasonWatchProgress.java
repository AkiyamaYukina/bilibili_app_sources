package com.bilibili.ogvcommon.play.resolver;

import I.E;
import RQ.l;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.B;
import com.bilibili.bson.common.Bson;
import com.bilibili.ogv.infra.gson.DurationFromMillisTypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/resolver/SeasonWatchProgress.class */
@StabilityInferred(parameters = 1)
@Bson
public final class SeasonWatchProgress {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f73223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f73224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @JsonAdapter(DurationFromMillisTypeAdapter.class)
    public final long f73225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f73226d;

    public SeasonWatchProgress(long j7, String str, long j8, long j9) {
        this.f73223a = j7;
        this.f73224b = str;
        this.f73225c = j8;
        this.f73226d = j9;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeasonWatchProgress)) {
            return false;
        }
        SeasonWatchProgress seasonWatchProgress = (SeasonWatchProgress) obj;
        return this.f73223a == seasonWatchProgress.f73223a && Intrinsics.areEqual(this.f73224b, seasonWatchProgress.f73224b) && Duration.equals-impl0(this.f73225c, seasonWatchProgress.f73225c) && this.f73226d == seasonWatchProgress.f73226d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f73226d) + l.a(E.a(Long.hashCode(this.f73223a) * 31, 31, this.f73224b), 31, this.f73225c);
    }

    @NotNull
    public final String toString() {
        String str = Duration.toString-impl(this.f73225c);
        StringBuilder sb = new StringBuilder("SeasonWatchProgress(lastEpId=");
        sb.append(this.f73223a);
        sb.append(", lastEpIndex=");
        B.a(this.f73224b, ", progress=", str, ", lastPlayedCid=", sb);
        return android.support.v4.media.session.a.a(sb, this.f73226d, ")");
    }
}
