package com.bilibili.ship.theseus.united.page.ctcc;

import com.bapis.bilibili.app.playerunite.v1.PlayQnEventReply;
import com.bapis.bilibili.app.playerunite.v1.PlayQnEventReq;
import com.bapis.bilibili.app.playerunite.v1.PlayerMoss;
import com.bapis.bilibili.app.playerunite.v1.PlayeruniteMossKtxKt;
import com.bapis.bilibili.playershared.CanWatchQnReason;
import com.bilibili.lib.media.resource.PlayIndex;
import com.bilibili.lib.moss.api.CallOptions;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/ctcc/TheseusCtccReportServiceKt$reportPlayQnEvent$2$1.class */
final class TheseusCtccReportServiceKt$reportPlayQnEvent$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super PlayQnEventReply>, Object> {
    final long $avid;
    final long $cid;
    final int $qn;
    final PlayIndex.CanWatchReason $reason;
    final Map<String, String> $reportParams;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusCtccReportServiceKt$reportPlayQnEvent$2$1(long j7, long j8, int i7, PlayIndex.CanWatchReason canWatchReason, Map<String, String> map, Continuation<? super TheseusCtccReportServiceKt$reportPlayQnEvent$2$1> continuation) {
        super(2, continuation);
        this.$avid = j7;
        this.$cid = j8;
        this.$qn = i7;
        this.$reason = canWatchReason;
        this.$reportParams = map;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TheseusCtccReportServiceKt$reportPlayQnEvent$2$1(this.$avid, this.$cid, this.$qn, this.$reason, this.$reportParams, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super PlayQnEventReply> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            PlayQnEventReq.b bVarNewBuilder = PlayQnEventReq.newBuilder();
            long j7 = this.$avid;
            long j8 = this.$cid;
            int i8 = this.$qn;
            PlayIndex.CanWatchReason canWatchReason = this.$reason;
            Map<String, String> map = this.$reportParams;
            bVarNewBuilder.setAid(j7);
            bVarNewBuilder.setCid(j8);
            bVarNewBuilder.setQn(i8);
            bVarNewBuilder.setReason(CanWatchQnReason.forNumber(canWatchReason.ordinal()));
            Map<String, String> mapEmptyMap = map;
            if (map == null) {
                mapEmptyMap = MapsKt.emptyMap();
            }
            bVarNewBuilder.putAllReportParams(mapEmptyMap);
            PlayQnEventReq playQnEventReqBuild = bVarNewBuilder.build();
            PlayerMoss playerMoss = new PlayerMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null);
            this.label = 1;
            Object objSuspendPlayQnEvent = PlayeruniteMossKtxKt.suspendPlayQnEvent(playerMoss, playQnEventReqBuild, this);
            obj = objSuspendPlayQnEvent;
            if (objSuspendPlayQnEvent == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
