package com.bilibili.ogvvega.tunnel;

import I.E;
import androidx.compose.animation.z;
import androidx.compose.foundation.C3554n0;
import com.bilibili.ad.adview.liveroom.answer.fragment.vm.v;
import com.bilibili.ad.adview.pegasus.banner.topview.res.n;
import com.bilibili.ogvvega.protobuf.annotation.FieldNumber;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvvega/tunnel/FrameOptionVO.class */
public final class FrameOptionVO {

    @FieldNumber(6)
    @NotNull
    private final String ackOrigin;

    @FieldNumber(4)
    private final boolean isAck;

    @FieldNumber(7)
    private final long mid;

    @FieldNumber(2)
    @NotNull
    private String reqId;

    @FieldNumber(3)
    private long sequence;

    @FieldNumber(5)
    @NotNull
    private final StatusVO status;

    @FieldNumber(1)
    private final long vegaId;

    public FrameOptionVO() {
        this(0L, "", 0L, false, new StatusVO(), "", 0L);
    }

    public FrameOptionVO(long j7, @NotNull String str, long j8, boolean z6, @NotNull StatusVO statusVO, @NotNull String str2, long j9) {
        this.vegaId = j7;
        this.reqId = str;
        this.sequence = j8;
        this.isAck = z6;
        this.status = statusVO;
        this.ackOrigin = str2;
        this.mid = j9;
    }

    public static /* synthetic */ FrameOptionVO copy$default(FrameOptionVO frameOptionVO, long j7, String str, long j8, boolean z6, StatusVO statusVO, String str2, long j9, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j7 = frameOptionVO.vegaId;
        }
        if ((i7 & 2) != 0) {
            str = frameOptionVO.reqId;
        }
        if ((i7 & 4) != 0) {
            j8 = frameOptionVO.sequence;
        }
        if ((i7 & 8) != 0) {
            z6 = frameOptionVO.isAck;
        }
        if ((i7 & 16) != 0) {
            statusVO = frameOptionVO.status;
        }
        if ((i7 & 32) != 0) {
            str2 = frameOptionVO.ackOrigin;
        }
        if ((i7 & 64) != 0) {
            j9 = frameOptionVO.mid;
        }
        return frameOptionVO.copy(j7, str, j8, z6, statusVO, str2, j9);
    }

    public final long component1() {
        return this.vegaId;
    }

    @NotNull
    public final String component2() {
        return this.reqId;
    }

    public final long component3() {
        return this.sequence;
    }

    public final boolean component4() {
        return this.isAck;
    }

    @NotNull
    public final StatusVO component5() {
        return this.status;
    }

    @NotNull
    public final String component6() {
        return this.ackOrigin;
    }

    public final long component7() {
        return this.mid;
    }

    @NotNull
    public final FrameOptionVO copy(long j7, @NotNull String str, long j8, boolean z6, @NotNull StatusVO statusVO, @NotNull String str2, long j9) {
        return new FrameOptionVO(j7, str, j8, z6, statusVO, str2, j9);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrameOptionVO)) {
            return false;
        }
        FrameOptionVO frameOptionVO = (FrameOptionVO) obj;
        return this.vegaId == frameOptionVO.vegaId && Intrinsics.areEqual(this.reqId, frameOptionVO.reqId) && this.sequence == frameOptionVO.sequence && this.isAck == frameOptionVO.isAck && Intrinsics.areEqual(this.status, frameOptionVO.status) && Intrinsics.areEqual(this.ackOrigin, frameOptionVO.ackOrigin) && this.mid == frameOptionVO.mid;
    }

    @NotNull
    public final String getAckOrigin() {
        return this.ackOrigin;
    }

    public final long getMid() {
        return this.mid;
    }

    @NotNull
    public final String getReqId() {
        return this.reqId;
    }

    public final long getSequence() {
        return this.sequence;
    }

    @NotNull
    public final StatusVO getStatus() {
        return this.status;
    }

    public final long getVegaId() {
        return this.vegaId;
    }

    public int hashCode() {
        return Long.hashCode(this.mid) + E.a((this.status.hashCode() + z.a(C3554n0.a(E.a(Long.hashCode(this.vegaId) * 31, 31, this.reqId), 31, this.sequence), 31, this.isAck)) * 31, 31, this.ackOrigin);
    }

    public final boolean isAck() {
        return this.isAck;
    }

    public final void setReqId(@NotNull String str) {
        this.reqId = str;
    }

    public final void setSequence(long j7) {
        this.sequence = j7;
    }

    @NotNull
    public String toString() {
        long j7 = this.vegaId;
        String str = this.reqId;
        long j8 = this.sequence;
        boolean z6 = this.isAck;
        StatusVO statusVO = this.status;
        String str2 = this.ackOrigin;
        long j9 = this.mid;
        StringBuilder sbA = n.a(j7, "FrameOptionVO(vegaId=", ", reqId=", str);
        J1.z.a(j8, ", sequence=", ", isAck=", sbA);
        sbA.append(z6);
        sbA.append(", status=");
        sbA.append(statusVO);
        sbA.append(", ackOrigin=");
        v.a(j9, str2, ", mid=", sbA);
        sbA.append(")");
        return sbA.toString();
    }
}
