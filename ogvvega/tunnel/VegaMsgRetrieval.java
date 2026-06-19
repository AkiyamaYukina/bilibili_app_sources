package com.bilibili.ogvvega.tunnel;

import androidx.compose.runtime.snapshots.z;
import com.bapis.bilibili.vega.deneb.v1.MessagePullsReply;
import com.bilibili.lib.moss.api.MossException;
import com.bilibili.ogvvega.protobuf.ProtoAny;
import com.bilibili.ogvvega.protobuf.ProtoBufEncoder;
import com.google.protobuf.Any;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvvega/tunnel/VegaMsgRetrieval.class */
public final class VegaMsgRetrieval {

    @Nullable
    private VegaFrameVO cachedVegaFrameVo;
    private long latestMsgSeqId;

    @NotNull
    private final IVegaMessageInteraction vegaMessageInteraction;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvvega/tunnel/VegaMsgRetrieval$OnMsgRetrieveListener.class */
    public interface OnMsgRetrieveListener {
        void onMsgRetrieved(@NotNull List<VegaFrameVO> list);
    }

    public VegaMsgRetrieval(@NotNull IVegaMessageInteraction iVegaMessageInteraction) {
        this.vegaMessageInteraction = iVegaMessageInteraction;
    }

    private final void onRetrievalMessageFailed(long j7, long j8, int i7, int i8) {
        ReportersKt.tunnelEventReport$default(ReportersKt.REPORT_EVENT_COMPENSATION_FETCH_FAILED, MapsKt.mapOf(new Pair[]{TuplesKt.to("start_seq_id", String.valueOf(j7)), TuplesKt.to("end_seq_id", String.valueOf(j8)), TuplesKt.to("page_size", String.valueOf(i7)), TuplesKt.to("page_index", String.valueOf(i8))}), 0, 4, null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.bilibili.lib.moss.api.MossException */
    private final void retrieveMessages(long j7, long j8, int i7, int i8, Map<TargetPath, Subscription> map) {
        MessagePullsReply messagePullsReplyRetrieveVegaMessages;
        boolean hasNext = true;
        while (hasNext) {
            try {
                messagePullsReplyRetrieveVegaMessages = VegaMsgRetrievalGRPCService.INSTANCE.retrieveVegaMessages(j7, j8, i8, i7);
            } catch (MossException e7) {
                BLog.w("VegaMsgRetrieval-retrieveMessages", "[ogv-vega-VegaMsgRetrieval-retrieveMessages] vegaOpt moss pullMessages", e7);
                onRetrievalMessageFailed(j7, j8, i8, i7);
                messagePullsReplyRetrieveVegaMessages = null;
            }
            if (messagePullsReplyRetrieveVegaMessages == null) {
                sendCachedMessage(map);
                return;
            }
            sendRetrievalMessages(messagePullsReplyRetrieveVegaMessages, map);
            hasNext = messagePullsReplyRetrieveVegaMessages.getHasNext();
            if (hasNext) {
                i7++;
            } else {
                sendCachedMessage(map);
            }
        }
    }

    private final void sendCachedMessage(Map<TargetPath, Subscription> map) {
        VegaFrameVO vegaFrameVO;
        if (VegaGrpcBidiTunnel.INSTANCE.vegaConnected$ogv_vega_release() && (vegaFrameVO = this.cachedVegaFrameVo) != null) {
            onNextVegaMessage(map, vegaFrameVO);
            this.vegaMessageInteraction.sendAck(vegaFrameVO);
        }
    }

    private final void sendRetrievalMessages(MessagePullsReply messagePullsReply, Map<TargetPath, Subscription> map) {
        Iterator it = messagePullsReply.getDataList().iterator();
        while (it.hasNext()) {
            onNextVegaMessage(map, (VegaFrameVO) ProtoBufEncoder.INSTANCE.decode(((Any) it.next()).getValue().toByteArray(), VegaFrameVO.class));
        }
    }

    public final void checkAndRetrieveMessageWhenReconnect(@NotNull Map<TargetPath, Subscription> map) {
        this.cachedVegaFrameVo = null;
        retrieveMessages(this.latestMsgSeqId + 1, 0L, 1, 100, map);
    }

    public final void checkAndRetrieveWhenDiscontinuous(long j7, @NotNull Map<TargetPath, Subscription> map, @NotNull VegaFrameVO vegaFrameVO) {
        long j8 = this.latestMsgSeqId;
        VegaFrameVO vegaFrameVO2 = this.cachedVegaFrameVo;
        StringBuilder sbA = z.a(j7, "vegaOpt checkAndRetrieveWhenDiscontinuous, seqId = ", ", latestMsgSeqId = ");
        sbA.append(j8);
        sbA.append(" cacheVegaFrameVo = ");
        sbA.append(vegaFrameVO2);
        defpackage.a.b("[ogv-vega-VegaMsgRetrieval-checkAndRetrieveWhenDiscontinuous] ", sbA.toString(), "VegaMsgRetrieval-checkAndRetrieveWhenDiscontinuous");
        long j9 = this.latestMsgSeqId;
        if (j7 <= j9) {
            return;
        }
        this.cachedVegaFrameVo = vegaFrameVO;
        retrieveMessages(j9 + 1, j7 - 1, 1, 100, map);
    }

    public final boolean checkSeqIdIsContinuous(long j7) {
        long j8 = this.latestMsgSeqId;
        StringBuilder sbA = z.a(j7, "vegaOpt checkSeqIdIsContinuous seqId:", " latestSeqId:");
        sbA.append(j8);
        defpackage.a.b("[ogv-vega-VegaMsgRetrieval-checkSeqIdIsContinuous] ", sbA.toString(), "VegaMsgRetrieval-checkSeqIdIsContinuous");
        return j7 <= this.latestMsgSeqId + 1;
    }

    public final void onNextVegaMessage(@NotNull Map<TargetPath, Subscription> map, @NotNull VegaFrameVO vegaFrameVO) {
        this.latestMsgSeqId = vegaFrameVO.getOption().getSequence();
        for (Map.Entry<TargetPath, Subscription> entry : map.entrySet()) {
            TargetPath key = entry.getKey();
            Subscription value = entry.getValue();
            if (Intrinsics.areEqual(key.getKey(), vegaFrameVO.getRoutePath()) && Intrinsics.areEqual(key.getSubBiz(), vegaFrameVO.getSubBiz())) {
                try {
                    value.getSubscriber().onNext(ProtoAny.Companion.unpack(vegaFrameVO.getBody(), value.getSubscriber().getClazz()));
                } catch (Exception e7) {
                    com.bilibili.ogv.infra.util.e.b(e7);
                }
            }
        }
    }

    public final void reset() {
        this.latestMsgSeqId = 0L;
    }
}
