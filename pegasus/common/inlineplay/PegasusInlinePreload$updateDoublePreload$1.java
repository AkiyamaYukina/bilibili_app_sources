package com.bilibili.pegasus.common.inlineplay;

import L80.D;
import com.bilibili.app.gemini.base.player.GeminiCommonResolverParams;
import com.bilibili.inline.card.IInlinePlayItem;
import com.bilibili.pegasus.common.inline.PlayerParamsBuilderKt;
import com.bilibili.player.history.MediaHistoryEntry;
import fp0.m;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayer.preload.repository.PreloadAction;
import tv.danmaku.biliplayer.preload.repository.PreloadReportData;
import tv.danmaku.biliplayerv2.service.Video;
import tv.danmaku.videoplayer.coreV2.VideoBizType;
import tv.danmaku.videoplayer.coreV2.transformer.P2PParams;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/common/inlineplay/PegasusInlinePreload$updateDoublePreload$1.class */
final class PegasusInlinePreload$updateDoublePreload$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final List<m> $items;
    int label;
    final g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PegasusInlinePreload$updateDoublePreload$1(List<m> list, g gVar, Continuation<? super PegasusInlinePreload$updateDoublePreload$1> continuation) {
        super(2, continuation);
        this.$items = list;
        this.this$0 = gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.jvm.functions.Function2] */
    public static final PreloadAction invokeSuspend$lambda$0(g gVar, m mVar) {
        GeminiCommonResolverParams resolveParams;
        PreloadAction preloadAction;
        IInlinePlayItem inlinePlayerItem = mVar.getInlinePlayerItem();
        String uri = mVar.getUri();
        gVar.getClass();
        Video.PlayableParams inlinePlayableParams = inlinePlayerItem.getInlinePlayableParams();
        if (inlinePlayableParams == null || (resolveParams = inlinePlayableParams.getResolveParams()) == null) {
            preloadAction = null;
        } else {
            long cid = 0;
            if (resolveParams instanceof GeminiCommonResolverParams) {
                GeminiCommonResolverParams geminiCommonResolverParams = resolveParams;
                if (geminiCommonResolverParams.getRealQuality() == 0) {
                    geminiCommonResolverParams.setRealQuality(32L);
                }
            }
            Video.ReportCommonParams reportCommonParams = inlinePlayableParams.getReportCommonParams();
            String strValueOf = String.valueOf(reportCommonParams != null ? Long.valueOf(reportCommonParams.getCid()) : null);
            Video.ReportCommonParams reportCommonParams2 = inlinePlayableParams.getReportCommonParams();
            long avid = reportCommonParams2 != null ? reportCommonParams2.getAvid() : 0L;
            String from = inlinePlayableParams.getFrom();
            if (from == null || !from.equals("live")) {
                Video.ReportCommonParams reportCommonParams3 = inlinePlayableParams.getReportCommonParams();
                if (reportCommonParams3 != null) {
                    cid = reportCommonParams3.getCid();
                }
            } else {
                Video.ReportCommonParams reportCommonParams4 = inlinePlayableParams.getReportCommonParams();
                if (reportCommonParams4 != null) {
                    cid = reportCommonParams4.getRoomId();
                }
            }
            VideoBizType bizType = inlinePlayableParams.getBizType();
            P2PParams p2PParams = inlinePlayableParams.getP2PParams();
            Video.ReportCommonParams reportCommonParams5 = inlinePlayableParams.getReportCommonParams();
            PreloadReportData preloadReportData = new PreloadReportData(strValueOf, PlayerParamsBuilderKt.SPMID_RECOMMEND, PlayerParamsBuilderKt.SPMID_RECOMMEND, avid, cid, bizType, p2PParams, reportCommonParams5 != null ? reportCommonParams5.getLegacyExtra() : null);
            int progress = new MediaHistoryEntry(gVar.f75648d.b(UB.f.a(inlinePlayableParams.getDisplayParams().getCid()), uri)).getProgress();
            BLog.i("progress id:" + resolveParams.getId() + "  progress=" + progress);
            String flashJsonStr = inlinePlayableParams.getFlashJsonStr();
            String from2 = inlinePlayableParams.getFrom();
            Object obj = null;
            if (from2 != null) {
                obj = null;
                if (from2.equals("live")) {
                    obj = new Object();
                }
            }
            preloadAction = new PreloadAction(flashJsonStr, resolveParams, progress, preloadReportData, 0, 0L, false, false, (Function2) null, obj, new D(preloadReportData, 2, resolveParams, inlinePlayableParams), 496, (DefaultConstructorMarker) null);
        }
        return preloadAction;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PegasusInlinePreload$updateDoublePreload$1(this.$items, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Sequence sequenceAsSequence = CollectionsKt.asSequence(this.$items);
        final g gVar = this.this$0;
        Sequence sequenceMapNotNull = SequencesKt.mapNotNull(sequenceAsSequence, new Function1(gVar) { // from class: com.bilibili.pegasus.common.inlineplay.f

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final g f75645a;

            {
                this.f75645a = gVar;
            }

            public final Object invoke(Object obj2) {
                return PegasusInlinePreload$updateDoublePreload$1.invokeSuspend$lambda$0(this.f75645a, (m) obj2);
            }
        });
        g gVar2 = this.this$0;
        Iterator it = sequenceMapNotNull.iterator();
        while (it.hasNext()) {
            gVar2.addPreloadAction(PlayerParamsBuilderKt.SPMID_RECOMMEND, (PreloadAction) it.next());
        }
        return Unit.INSTANCE;
    }
}
