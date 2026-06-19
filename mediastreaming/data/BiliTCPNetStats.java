package com.bilibili.mediastreaming.data;

import N1.c;
import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.compose.foundation.C3554n0;
import androidx.compose.ui.graphics.colorspace.A;
import androidx.media3.common.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z4.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/data/BiliTCPNetStats.class */
@Keep
public final class BiliTCPNetStats {
    private double avgRtt;
    private int maxPktRcvLoss;
    private int maxRetrans;
    private double maxRtt;
    private long monitorCount;
    private double rtt;
    private long sendBytes;
    private int socketStatus;

    @NotNull
    private BiliSocketStatus socketStatusEnum;
    private long totalRetrans;

    public BiliTCPNetStats(int i7, @NotNull BiliSocketStatus biliSocketStatus, long j7, int i8, int i9, long j8, double d7, double d8, double d9, long j9) {
        this.socketStatus = i7;
        this.socketStatusEnum = biliSocketStatus;
        this.sendBytes = j7;
        this.maxPktRcvLoss = i8;
        this.maxRetrans = i9;
        this.totalRetrans = j8;
        this.rtt = d7;
        this.avgRtt = d8;
        this.maxRtt = d9;
        this.monitorCount = j9;
    }

    public static /* synthetic */ BiliTCPNetStats copy$default(BiliTCPNetStats biliTCPNetStats, int i7, BiliSocketStatus biliSocketStatus, long j7, int i8, int i9, long j8, double d7, double d8, double d9, long j9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i7 = biliTCPNetStats.socketStatus;
        }
        if ((i10 & 2) != 0) {
            biliSocketStatus = biliTCPNetStats.socketStatusEnum;
        }
        if ((i10 & 4) != 0) {
            j7 = biliTCPNetStats.sendBytes;
        }
        if ((i10 & 8) != 0) {
            i8 = biliTCPNetStats.maxPktRcvLoss;
        }
        if ((i10 & 16) != 0) {
            i9 = biliTCPNetStats.maxRetrans;
        }
        if ((i10 & 32) != 0) {
            j8 = biliTCPNetStats.totalRetrans;
        }
        if ((i10 & 64) != 0) {
            d7 = biliTCPNetStats.rtt;
        }
        if ((i10 & 128) != 0) {
            d8 = biliTCPNetStats.avgRtt;
        }
        if ((i10 & 256) != 0) {
            d9 = biliTCPNetStats.maxRtt;
        }
        if ((i10 & 512) != 0) {
            j9 = biliTCPNetStats.monitorCount;
        }
        return biliTCPNetStats.copy(i7, biliSocketStatus, j7, i8, i9, j8, d7, d8, d9, j9);
    }

    public final int component1() {
        return this.socketStatus;
    }

    public final long component10() {
        return this.monitorCount;
    }

    @NotNull
    public final BiliSocketStatus component2() {
        return this.socketStatusEnum;
    }

    public final long component3() {
        return this.sendBytes;
    }

    public final int component4() {
        return this.maxPktRcvLoss;
    }

    public final int component5() {
        return this.maxRetrans;
    }

    public final long component6() {
        return this.totalRetrans;
    }

    public final double component7() {
        return this.rtt;
    }

    public final double component8() {
        return this.avgRtt;
    }

    public final double component9() {
        return this.maxRtt;
    }

    @NotNull
    public final BiliTCPNetStats copy(int i7, @NotNull BiliSocketStatus biliSocketStatus, long j7, int i8, int i9, long j8, double d7, double d8, double d9, long j9) {
        return new BiliTCPNetStats(i7, biliSocketStatus, j7, i8, i9, j8, d7, d8, d9, j9);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BiliTCPNetStats)) {
            return false;
        }
        BiliTCPNetStats biliTCPNetStats = (BiliTCPNetStats) obj;
        return this.socketStatus == biliTCPNetStats.socketStatus && this.socketStatusEnum == biliTCPNetStats.socketStatusEnum && this.sendBytes == biliTCPNetStats.sendBytes && this.maxPktRcvLoss == biliTCPNetStats.maxPktRcvLoss && this.maxRetrans == biliTCPNetStats.maxRetrans && this.totalRetrans == biliTCPNetStats.totalRetrans && Double.compare(this.rtt, biliTCPNetStats.rtt) == 0 && Double.compare(this.avgRtt, biliTCPNetStats.avgRtt) == 0 && Double.compare(this.maxRtt, biliTCPNetStats.maxRtt) == 0 && this.monitorCount == biliTCPNetStats.monitorCount;
    }

    public final double getAvgRtt() {
        return this.avgRtt;
    }

    public final int getMaxPktRcvLoss() {
        return this.maxPktRcvLoss;
    }

    public final int getMaxRetrans() {
        return this.maxRetrans;
    }

    public final double getMaxRtt() {
        return this.maxRtt;
    }

    public final long getMonitorCount() {
        return this.monitorCount;
    }

    public final double getRtt() {
        return this.rtt;
    }

    public final long getSendBytes() {
        return this.sendBytes;
    }

    public final int getSocketStatus() {
        return this.socketStatus;
    }

    @NotNull
    public final BiliSocketStatus getSocketStatusEnum() {
        return this.socketStatusEnum;
    }

    public final long getTotalRetrans() {
        return this.totalRetrans;
    }

    public int hashCode() {
        return Long.hashCode(this.monitorCount) + A.a(this.maxRtt, A.a(this.avgRtt, A.a(this.rtt, C3554n0.a(I.a(this.maxRetrans, I.a(this.maxPktRcvLoss, C3554n0.a((this.socketStatusEnum.hashCode() + (Integer.hashCode(this.socketStatus) * 31)) * 31, 31, this.sendBytes), 31), 31), 31, this.totalRetrans), 31), 31), 31);
    }

    public final void setAvgRtt(double d7) {
        this.avgRtt = d7;
    }

    public final void setMaxPktRcvLoss(int i7) {
        this.maxPktRcvLoss = i7;
    }

    public final void setMaxRetrans(int i7) {
        this.maxRetrans = i7;
    }

    public final void setMaxRtt(double d7) {
        this.maxRtt = d7;
    }

    public final void setMonitorCount(long j7) {
        this.monitorCount = j7;
    }

    public final void setRtt(double d7) {
        this.rtt = d7;
    }

    public final void setSendBytes(long j7) {
        this.sendBytes = j7;
    }

    public final void setSocketStatus(int i7) {
        this.socketStatus = i7;
    }

    public final void setSocketStatusEnum(@NotNull BiliSocketStatus biliSocketStatus) {
        this.socketStatusEnum = biliSocketStatus;
    }

    public final void setTotalRetrans(long j7) {
        this.totalRetrans = j7;
    }

    @NotNull
    public String toString() {
        int i7 = this.socketStatus;
        BiliSocketStatus biliSocketStatus = this.socketStatusEnum;
        long j7 = this.sendBytes;
        int i8 = this.maxPktRcvLoss;
        int i9 = this.maxRetrans;
        long j8 = this.totalRetrans;
        double d7 = this.rtt;
        double d8 = this.avgRtt;
        double d9 = this.maxRtt;
        long j9 = this.monitorCount;
        StringBuilder sb = new StringBuilder("BiliTCPNetStats(socketStatus=");
        sb.append(i7);
        sb.append(", socketStatusEnum=");
        sb.append(biliSocketStatus);
        sb.append(", sendBytes=");
        G.a(i8, j7, ", maxPktRcvLoss=", sb);
        c.a(i9, ", maxRetrans=", ", totalRetrans=", sb);
        sb.append(j8);
        a.a(sb, ", rtt=", d7, ", avgRtt=");
        sb.append(d8);
        a.a(sb, ", maxRtt=", d9, ", monitorCount=");
        return android.support.v4.media.session.a.a(sb, j9, ")");
    }
}
