package com.bilibili.mediastreaming.data;

import J1.z;
import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.compose.foundation.C3554n0;
import androidx.compose.ui.graphics.colorspace.A;
import androidx.core.app.o;
import androidx.media3.exoplayer.C4690e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z4.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/data/BiliSrtNetStats.class */
@Keep
public final class BiliSrtNetStats {
    private double avgMbpsSendRate;
    private double avgRtt;
    private int errorCode;
    private double maxRtt;
    private double mbpsSendRate;
    private long monitorCount;
    private int pktRcvLossTotal;
    private long pktRcvTotal;
    private long pktSentTotal;
    private int pktSndLossTotal;
    private double rtt;
    private int socketStatus;

    @NotNull
    private BiliSocketStatus socketStatusEnum;
    private long totalRetrans;

    public BiliSrtNetStats(int i7, @NotNull BiliSocketStatus biliSocketStatus, long j7, long j8, int i8, int i9, long j9, double d7, double d8, double d9, double d10, double d11, int i10, long j10) {
        this.socketStatus = i7;
        this.socketStatusEnum = biliSocketStatus;
        this.pktSentTotal = j7;
        this.pktRcvTotal = j8;
        this.pktRcvLossTotal = i8;
        this.pktSndLossTotal = i9;
        this.totalRetrans = j9;
        this.rtt = d7;
        this.maxRtt = d8;
        this.avgRtt = d9;
        this.mbpsSendRate = d10;
        this.avgMbpsSendRate = d11;
        this.errorCode = i10;
        this.monitorCount = j10;
    }

    public static /* synthetic */ BiliSrtNetStats copy$default(BiliSrtNetStats biliSrtNetStats, int i7, BiliSocketStatus biliSocketStatus, long j7, long j8, int i8, int i9, long j9, double d7, double d8, double d9, double d10, double d11, int i10, long j10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i7 = biliSrtNetStats.socketStatus;
        }
        if ((i11 & 2) != 0) {
            biliSocketStatus = biliSrtNetStats.socketStatusEnum;
        }
        if ((i11 & 4) != 0) {
            j7 = biliSrtNetStats.pktSentTotal;
        }
        if ((i11 & 8) != 0) {
            j8 = biliSrtNetStats.pktRcvTotal;
        }
        if ((i11 & 16) != 0) {
            i8 = biliSrtNetStats.pktRcvLossTotal;
        }
        if ((i11 & 32) != 0) {
            i9 = biliSrtNetStats.pktSndLossTotal;
        }
        if ((i11 & 64) != 0) {
            j9 = biliSrtNetStats.totalRetrans;
        }
        if ((i11 & 128) != 0) {
            d7 = biliSrtNetStats.rtt;
        }
        if ((i11 & 256) != 0) {
            d8 = biliSrtNetStats.maxRtt;
        }
        if ((i11 & 512) != 0) {
            d9 = biliSrtNetStats.avgRtt;
        }
        if ((i11 & 1024) != 0) {
            d10 = biliSrtNetStats.mbpsSendRate;
        }
        if ((i11 & 2048) != 0) {
            d11 = biliSrtNetStats.avgMbpsSendRate;
        }
        if ((i11 & 4096) != 0) {
            i10 = biliSrtNetStats.errorCode;
        }
        if ((i11 & 8192) != 0) {
            j10 = biliSrtNetStats.monitorCount;
        }
        return biliSrtNetStats.copy(i7, biliSocketStatus, j7, j8, i8, i9, j9, d7, d8, d9, d10, d11, i10, j10);
    }

    public final int component1() {
        return this.socketStatus;
    }

    public final double component10() {
        return this.avgRtt;
    }

    public final double component11() {
        return this.mbpsSendRate;
    }

    public final double component12() {
        return this.avgMbpsSendRate;
    }

    public final int component13() {
        return this.errorCode;
    }

    public final long component14() {
        return this.monitorCount;
    }

    @NotNull
    public final BiliSocketStatus component2() {
        return this.socketStatusEnum;
    }

    public final long component3() {
        return this.pktSentTotal;
    }

    public final long component4() {
        return this.pktRcvTotal;
    }

    public final int component5() {
        return this.pktRcvLossTotal;
    }

    public final int component6() {
        return this.pktSndLossTotal;
    }

    public final long component7() {
        return this.totalRetrans;
    }

    public final double component8() {
        return this.rtt;
    }

    public final double component9() {
        return this.maxRtt;
    }

    @NotNull
    public final BiliSrtNetStats copy(int i7, @NotNull BiliSocketStatus biliSocketStatus, long j7, long j8, int i8, int i9, long j9, double d7, double d8, double d9, double d10, double d11, int i10, long j10) {
        return new BiliSrtNetStats(i7, biliSocketStatus, j7, j8, i8, i9, j9, d7, d8, d9, d10, d11, i10, j10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BiliSrtNetStats)) {
            return false;
        }
        BiliSrtNetStats biliSrtNetStats = (BiliSrtNetStats) obj;
        return this.socketStatus == biliSrtNetStats.socketStatus && this.socketStatusEnum == biliSrtNetStats.socketStatusEnum && this.pktSentTotal == biliSrtNetStats.pktSentTotal && this.pktRcvTotal == biliSrtNetStats.pktRcvTotal && this.pktRcvLossTotal == biliSrtNetStats.pktRcvLossTotal && this.pktSndLossTotal == biliSrtNetStats.pktSndLossTotal && this.totalRetrans == biliSrtNetStats.totalRetrans && Double.compare(this.rtt, biliSrtNetStats.rtt) == 0 && Double.compare(this.maxRtt, biliSrtNetStats.maxRtt) == 0 && Double.compare(this.avgRtt, biliSrtNetStats.avgRtt) == 0 && Double.compare(this.mbpsSendRate, biliSrtNetStats.mbpsSendRate) == 0 && Double.compare(this.avgMbpsSendRate, biliSrtNetStats.avgMbpsSendRate) == 0 && this.errorCode == biliSrtNetStats.errorCode && this.monitorCount == biliSrtNetStats.monitorCount;
    }

    public final double getAvgMbpsSendRate() {
        return this.avgMbpsSendRate;
    }

    public final double getAvgRtt() {
        return this.avgRtt;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final double getMaxRtt() {
        return this.maxRtt;
    }

    public final double getMbpsSendRate() {
        return this.mbpsSendRate;
    }

    public final long getMonitorCount() {
        return this.monitorCount;
    }

    public final int getPktRcvLossTotal() {
        return this.pktRcvLossTotal;
    }

    public final long getPktRcvTotal() {
        return this.pktRcvTotal;
    }

    public final long getPktSentTotal() {
        return this.pktSentTotal;
    }

    public final int getPktSndLossTotal() {
        return this.pktSndLossTotal;
    }

    public final double getRtt() {
        return this.rtt;
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
        return Long.hashCode(this.monitorCount) + I.a(this.errorCode, A.a(this.avgMbpsSendRate, A.a(this.mbpsSendRate, A.a(this.avgRtt, A.a(this.maxRtt, A.a(this.rtt, C3554n0.a(I.a(this.pktSndLossTotal, I.a(this.pktRcvLossTotal, C3554n0.a(C3554n0.a((this.socketStatusEnum.hashCode() + (Integer.hashCode(this.socketStatus) * 31)) * 31, 31, this.pktSentTotal), 31, this.pktRcvTotal), 31), 31), 31, this.totalRetrans), 31), 31), 31), 31), 31), 31);
    }

    public final void setAvgMbpsSendRate(double d7) {
        this.avgMbpsSendRate = d7;
    }

    public final void setAvgRtt(double d7) {
        this.avgRtt = d7;
    }

    public final void setErrorCode(int i7) {
        this.errorCode = i7;
    }

    public final void setMaxRtt(double d7) {
        this.maxRtt = d7;
    }

    public final void setMbpsSendRate(double d7) {
        this.mbpsSendRate = d7;
    }

    public final void setMonitorCount(long j7) {
        this.monitorCount = j7;
    }

    public final void setPktRcvLossTotal(int i7) {
        this.pktRcvLossTotal = i7;
    }

    public final void setPktRcvTotal(long j7) {
        this.pktRcvTotal = j7;
    }

    public final void setPktSentTotal(long j7) {
        this.pktSentTotal = j7;
    }

    public final void setPktSndLossTotal(int i7) {
        this.pktSndLossTotal = i7;
    }

    public final void setRtt(double d7) {
        this.rtt = d7;
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
        long j7 = this.pktSentTotal;
        long j8 = this.pktRcvTotal;
        int i8 = this.pktRcvLossTotal;
        int i9 = this.pktSndLossTotal;
        long j9 = this.totalRetrans;
        double d7 = this.rtt;
        double d8 = this.maxRtt;
        double d9 = this.avgRtt;
        double d10 = this.mbpsSendRate;
        double d11 = this.avgMbpsSendRate;
        int i10 = this.errorCode;
        long j10 = this.monitorCount;
        StringBuilder sb = new StringBuilder("BiliSrtNetStats(socketStatus=");
        sb.append(i7);
        sb.append(", socketStatusEnum=");
        sb.append(biliSocketStatus);
        sb.append(", pktSentTotal=");
        sb.append(j7);
        z.a(j8, ", pktRcvTotal=", ", pktRcvLossTotal=", sb);
        C4690e.a(i8, i9, ", pktSndLossTotal=", ", totalRetrans=", sb);
        sb.append(j9);
        a.a(sb, ", rtt=", d7, ", maxRtt=");
        sb.append(d8);
        a.a(sb, ", avgRtt=", d9, ", mbpsSendRate=");
        sb.append(d10);
        a.a(sb, ", avgMbpsSendRate=", d11, ", errorCode=");
        o.b(i10, j10, ", monitorCount=", sb);
        sb.append(")");
        return sb.toString();
    }
}
