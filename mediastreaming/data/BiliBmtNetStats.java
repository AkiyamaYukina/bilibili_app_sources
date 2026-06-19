package com.bilibili.mediastreaming.data;

import androidx.annotation.Keep;
import androidx.compose.animation.n;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.snapshots.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/data/BiliBmtNetStats.class */
@Keep
public final class BiliBmtNetStats {
    private float congestion;
    private long connectTimeUs;
    private long droppedFrameBytes;
    private long droppedFrames;
    private long totalAudioBytes;
    private long totalAudioPackets;
    private long totalBytesSent;
    private long totalVideoBytes;
    private long totalVideoPackets;

    public BiliBmtNetStats(long j7, long j8, long j9, long j10, long j11, long j12, long j13, float f7, long j14) {
        this.totalAudioPackets = j7;
        this.totalVideoPackets = j8;
        this.totalAudioBytes = j9;
        this.totalVideoBytes = j10;
        this.totalBytesSent = j11;
        this.droppedFrames = j12;
        this.droppedFrameBytes = j13;
        this.congestion = f7;
        this.connectTimeUs = j14;
    }

    public static /* synthetic */ BiliBmtNetStats copy$default(BiliBmtNetStats biliBmtNetStats, long j7, long j8, long j9, long j10, long j11, long j12, long j13, float f7, long j14, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j7 = biliBmtNetStats.totalAudioPackets;
        }
        if ((i7 & 2) != 0) {
            j8 = biliBmtNetStats.totalVideoPackets;
        }
        if ((i7 & 4) != 0) {
            j9 = biliBmtNetStats.totalAudioBytes;
        }
        if ((i7 & 8) != 0) {
            j10 = biliBmtNetStats.totalVideoBytes;
        }
        if ((i7 & 16) != 0) {
            j11 = biliBmtNetStats.totalBytesSent;
        }
        if ((i7 & 32) != 0) {
            j12 = biliBmtNetStats.droppedFrames;
        }
        if ((i7 & 64) != 0) {
            j13 = biliBmtNetStats.droppedFrameBytes;
        }
        if ((i7 & 128) != 0) {
            f7 = biliBmtNetStats.congestion;
        }
        if ((i7 & 256) != 0) {
            j14 = biliBmtNetStats.connectTimeUs;
        }
        return biliBmtNetStats.copy(j7, j8, j9, j10, j11, j12, j13, f7, j14);
    }

    public final long component1() {
        return this.totalAudioPackets;
    }

    public final long component2() {
        return this.totalVideoPackets;
    }

    public final long component3() {
        return this.totalAudioBytes;
    }

    public final long component4() {
        return this.totalVideoBytes;
    }

    public final long component5() {
        return this.totalBytesSent;
    }

    public final long component6() {
        return this.droppedFrames;
    }

    public final long component7() {
        return this.droppedFrameBytes;
    }

    public final float component8() {
        return this.congestion;
    }

    public final long component9() {
        return this.connectTimeUs;
    }

    @NotNull
    public final BiliBmtNetStats copy(long j7, long j8, long j9, long j10, long j11, long j12, long j13, float f7, long j14) {
        return new BiliBmtNetStats(j7, j8, j9, j10, j11, j12, j13, f7, j14);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BiliBmtNetStats)) {
            return false;
        }
        BiliBmtNetStats biliBmtNetStats = (BiliBmtNetStats) obj;
        return this.totalAudioPackets == biliBmtNetStats.totalAudioPackets && this.totalVideoPackets == biliBmtNetStats.totalVideoPackets && this.totalAudioBytes == biliBmtNetStats.totalAudioBytes && this.totalVideoBytes == biliBmtNetStats.totalVideoBytes && this.totalBytesSent == biliBmtNetStats.totalBytesSent && this.droppedFrames == biliBmtNetStats.droppedFrames && this.droppedFrameBytes == biliBmtNetStats.droppedFrameBytes && Float.compare(this.congestion, biliBmtNetStats.congestion) == 0 && this.connectTimeUs == biliBmtNetStats.connectTimeUs;
    }

    public final float getCongestion() {
        return this.congestion;
    }

    public final long getConnectTimeUs() {
        return this.connectTimeUs;
    }

    public final long getDroppedFrameBytes() {
        return this.droppedFrameBytes;
    }

    public final long getDroppedFrames() {
        return this.droppedFrames;
    }

    public final long getTotalAudioBytes() {
        return this.totalAudioBytes;
    }

    public final long getTotalAudioPackets() {
        return this.totalAudioPackets;
    }

    public final long getTotalBytesSent() {
        return this.totalBytesSent;
    }

    public final long getTotalVideoBytes() {
        return this.totalVideoBytes;
    }

    public final long getTotalVideoPackets() {
        return this.totalVideoPackets;
    }

    public int hashCode() {
        return Long.hashCode(this.connectTimeUs) + n.a(this.congestion, C3554n0.a(C3554n0.a(C3554n0.a(C3554n0.a(C3554n0.a(C3554n0.a(Long.hashCode(this.totalAudioPackets) * 31, 31, this.totalVideoPackets), 31, this.totalAudioBytes), 31, this.totalVideoBytes), 31, this.totalBytesSent), 31, this.droppedFrames), 31, this.droppedFrameBytes), 31);
    }

    public final void setCongestion(float f7) {
        this.congestion = f7;
    }

    public final void setConnectTimeUs(long j7) {
        this.connectTimeUs = j7;
    }

    public final void setDroppedFrameBytes(long j7) {
        this.droppedFrameBytes = j7;
    }

    public final void setDroppedFrames(long j7) {
        this.droppedFrames = j7;
    }

    public final void setTotalAudioBytes(long j7) {
        this.totalAudioBytes = j7;
    }

    public final void setTotalAudioPackets(long j7) {
        this.totalAudioPackets = j7;
    }

    public final void setTotalBytesSent(long j7) {
        this.totalBytesSent = j7;
    }

    public final void setTotalVideoBytes(long j7) {
        this.totalVideoBytes = j7;
    }

    public final void setTotalVideoPackets(long j7) {
        this.totalVideoPackets = j7;
    }

    @NotNull
    public String toString() {
        long j7 = this.totalAudioPackets;
        long j8 = this.totalVideoPackets;
        long j9 = this.totalAudioBytes;
        long j10 = this.totalVideoBytes;
        long j11 = this.totalBytesSent;
        long j12 = this.droppedFrames;
        long j13 = this.droppedFrameBytes;
        float f7 = this.congestion;
        long j14 = this.connectTimeUs;
        StringBuilder sbA = z.a(j7, "BiliBmtNetStats(totalAudioPackets=", ", totalVideoPackets=");
        sbA.append(j8);
        J1.z.a(j9, ", totalAudioBytes=", ", totalVideoBytes=", sbA);
        sbA.append(j10);
        J1.z.a(j11, ", totalBytesSent=", ", droppedFrames=", sbA);
        sbA.append(j12);
        J1.z.a(j13, ", droppedFrameBytes=", ", congestion=", sbA);
        sbA.append(f7);
        sbA.append(", connectTimeUs=");
        sbA.append(j14);
        sbA.append(")");
        return sbA.toString();
    }
}
