package com.bilibili.ogvvega.tunnel;

import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.snapshots.z;
import androidx.media3.common.G;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvvega/tunnel/HeartbeatConfig.class */
@Bson
public final class HeartbeatConfig {
    private long interval;
    private int maxRetryTimes;
    private long timeout;

    public HeartbeatConfig() {
        this(0L, 0L, 0, 7, null);
    }

    public HeartbeatConfig(long j7, long j8, int i7) {
        this.interval = j7;
        this.timeout = j8;
        this.maxRetryTimes = i7;
    }

    public /* synthetic */ HeartbeatConfig(long j7, long j8, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 30000L : j7, (i8 & 2) != 0 ? 10000L : j8, (i8 & 4) != 0 ? 3 : i7);
    }

    public static /* synthetic */ HeartbeatConfig copy$default(HeartbeatConfig heartbeatConfig, long j7, long j8, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            j7 = heartbeatConfig.interval;
        }
        if ((i8 & 2) != 0) {
            j8 = heartbeatConfig.timeout;
        }
        if ((i8 & 4) != 0) {
            i7 = heartbeatConfig.maxRetryTimes;
        }
        return heartbeatConfig.copy(j7, j8, i7);
    }

    public final long component1() {
        return this.interval;
    }

    public final long component2() {
        return this.timeout;
    }

    public final int component3() {
        return this.maxRetryTimes;
    }

    @NotNull
    public final HeartbeatConfig copy(long j7, long j8, int i7) {
        return new HeartbeatConfig(j7, j8, i7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeartbeatConfig)) {
            return false;
        }
        HeartbeatConfig heartbeatConfig = (HeartbeatConfig) obj;
        return this.interval == heartbeatConfig.interval && this.timeout == heartbeatConfig.timeout && this.maxRetryTimes == heartbeatConfig.maxRetryTimes;
    }

    public final long getInterval() {
        return this.interval;
    }

    public final int getMaxRetryTimes() {
        return this.maxRetryTimes;
    }

    public final long getTimeout() {
        return this.timeout;
    }

    public int hashCode() {
        return Integer.hashCode(this.maxRetryTimes) + C3554n0.a(Long.hashCode(this.interval) * 31, 31, this.timeout);
    }

    public final void setInterval(long j7) {
        this.interval = j7;
    }

    public final void setMaxRetryTimes(int i7) {
        this.maxRetryTimes = i7;
    }

    public final void setTimeout(long j7) {
        this.timeout = j7;
    }

    @NotNull
    public String toString() {
        long j7 = this.interval;
        long j8 = this.timeout;
        int i7 = this.maxRetryTimes;
        StringBuilder sbA = z.a(j7, "HeartbeatConfig(interval=", ", timeout=");
        G.a(i7, j8, ", maxRetryTimes=", sbA);
        sbA.append(")");
        return sbA.toString();
    }
}
