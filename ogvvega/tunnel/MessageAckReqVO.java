package com.bilibili.ogvvega.tunnel;

import I.E;
import androidx.room.B;
import com.bilibili.ogvvega.protobuf.annotation.FieldNumber;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvvega/tunnel/MessageAckReqVO.class */
public final class MessageAckReqVO {

    @FieldNumber(3)
    @NotNull
    private final String origin;

    @FieldNumber(2)
    @NotNull
    private final String reqId;

    @FieldNumber(5)
    private final long seqId;

    @FieldNumber(4)
    @NotNull
    private final String targetPath;

    @FieldNumber(1)
    @NotNull
    private final String vegaId;

    private MessageAckReqVO() {
        this("", "", "", "", 0L);
    }

    public MessageAckReqVO(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j7) {
        this.vegaId = str;
        this.reqId = str2;
        this.origin = str3;
        this.targetPath = str4;
        this.seqId = j7;
    }

    public static /* synthetic */ MessageAckReqVO copy$default(MessageAckReqVO messageAckReqVO, String str, String str2, String str3, String str4, long j7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = messageAckReqVO.vegaId;
        }
        if ((i7 & 2) != 0) {
            str2 = messageAckReqVO.reqId;
        }
        if ((i7 & 4) != 0) {
            str3 = messageAckReqVO.origin;
        }
        if ((i7 & 8) != 0) {
            str4 = messageAckReqVO.targetPath;
        }
        if ((i7 & 16) != 0) {
            j7 = messageAckReqVO.seqId;
        }
        return messageAckReqVO.copy(str, str2, str3, str4, j7);
    }

    @NotNull
    public final String component1() {
        return this.vegaId;
    }

    @NotNull
    public final String component2() {
        return this.reqId;
    }

    @NotNull
    public final String component3() {
        return this.origin;
    }

    @NotNull
    public final String component4() {
        return this.targetPath;
    }

    public final long component5() {
        return this.seqId;
    }

    @NotNull
    public final MessageAckReqVO copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j7) {
        return new MessageAckReqVO(str, str2, str3, str4, j7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageAckReqVO)) {
            return false;
        }
        MessageAckReqVO messageAckReqVO = (MessageAckReqVO) obj;
        return Intrinsics.areEqual(this.vegaId, messageAckReqVO.vegaId) && Intrinsics.areEqual(this.reqId, messageAckReqVO.reqId) && Intrinsics.areEqual(this.origin, messageAckReqVO.origin) && Intrinsics.areEqual(this.targetPath, messageAckReqVO.targetPath) && this.seqId == messageAckReqVO.seqId;
    }

    @NotNull
    public final String getOrigin() {
        return this.origin;
    }

    @NotNull
    public final String getReqId() {
        return this.reqId;
    }

    public final long getSeqId() {
        return this.seqId;
    }

    @NotNull
    public final String getTargetPath() {
        return this.targetPath;
    }

    @NotNull
    public final String getVegaId() {
        return this.vegaId;
    }

    public int hashCode() {
        return Long.hashCode(this.seqId) + E.a(E.a(E.a(this.vegaId.hashCode() * 31, 31, this.reqId), 31, this.origin), 31, this.targetPath);
    }

    @NotNull
    public String toString() {
        String str = this.vegaId;
        String str2 = this.reqId;
        String str3 = this.origin;
        String str4 = this.targetPath;
        long j7 = this.seqId;
        StringBuilder sbA = G0.b.a("MessageAckReqVO(vegaId=", str, ", reqId=", str2, ", origin=");
        B.a(str3, ", targetPath=", str4, ", seqId=", sbA);
        return android.support.v4.media.session.a.a(sbA, j7, ")");
    }
}
