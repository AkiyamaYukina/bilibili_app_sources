package com.bilibili.ship.theseus.ogv.playercontainer;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.send.ShipChainChange;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.send.VideoDetailStateChange;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.remote.IRemoteHandler;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/playercontainer/OgvChronosBusinessService$notifyChronosFollowSeasonChange$2.class */
final class OgvChronosBusinessService$notifyChronosFollowSeasonChange$2 extends SuspendLambda implements Function2<com.bilibili.community.follow.b, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final OgvChronosBusinessService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvChronosBusinessService$notifyChronosFollowSeasonChange$2(OgvChronosBusinessService ogvChronosBusinessService, Continuation<? super OgvChronosBusinessService$notifyChronosFollowSeasonChange$2> continuation) {
        super(2, continuation);
        this.this$0 = ogvChronosBusinessService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OgvChronosBusinessService$notifyChronosFollowSeasonChange$2 ogvChronosBusinessService$notifyChronosFollowSeasonChange$2 = new OgvChronosBusinessService$notifyChronosFollowSeasonChange$2(this.this$0, continuation);
        ogvChronosBusinessService$notifyChronosFollowSeasonChange$2.L$0 = obj;
        return ogvChronosBusinessService$notifyChronosFollowSeasonChange$2;
    }

    public final Object invoke(com.bilibili.community.follow.b bVar, Continuation<? super Unit> continuation) {
        return create(bVar, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        com.bilibili.community.follow.b bVar = (com.bilibili.community.follow.b) this.L$0;
        ShipChainChange.Request request = new ShipChainChange.Request();
        request.setFollowSeasonState(Boxing.boxBoolean(bVar.a));
        IRemoteHandler remoteHandler = this.this$0.f94285l.getRemoteHandler();
        if (remoteHandler != null) {
            remoteHandler.updateRelationshipChainChanged(request);
        }
        VideoDetailStateChange.Request request2 = new VideoDetailStateChange.Request();
        OgvChronosBusinessService ogvChronosBusinessService = this.this$0;
        VideoDetailStateChange.ReserveState reserveState = new VideoDetailStateChange.ReserveState();
        reserveState.setId(String.valueOf(ogvChronosBusinessService.f94279e.f94449a));
        reserveState.setType(Boxing.boxInt(4));
        reserveState.setState(Boxing.boxBoolean(bVar.a));
        request2.setReserveState(reserveState);
        IRemoteHandler remoteHandler2 = this.this$0.f94285l.getRemoteHandler();
        if (remoteHandler2 != null) {
            remoteHandler2.onVideoDetailStateChanged(request2);
        }
        return Unit.INSTANCE;
    }
}
