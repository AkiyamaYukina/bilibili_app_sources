package com.bilibili.ship.theseus.united.page.danmaku;

import com.bilibili.relation.FollowStateEvent;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.send.VideoDetailStateChange;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.remote.IRemoteHandler;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/ChronosBusinessService$notifyChronosFollowStateChange$2.class */
final class ChronosBusinessService$notifyChronosFollowStateChange$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final ChronosBusinessService this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/ChronosBusinessService$notifyChronosFollowStateChange$2$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChronosBusinessService f99360a;

        public a(ChronosBusinessService chronosBusinessService) {
            this.f99360a = chronosBusinessService;
        }

        public final Object emit(Object obj, Continuation continuation) {
            FollowStateEvent followStateEvent = (FollowStateEvent) obj;
            VideoDetailStateChange.Request request = new VideoDetailStateChange.Request();
            VideoDetailStateChange.FollowState followState = new VideoDetailStateChange.FollowState();
            followState.setMid(String.valueOf(followStateEvent.getUid()));
            followState.setState(Boxing.boxBoolean(followStateEvent.isFollow()));
            request.setFollowStates(CollectionsKt.listOf(followState));
            IRemoteHandler remoteHandler = this.f99360a.f99336g.getRemoteHandler();
            if (remoteHandler != null) {
                remoteHandler.onVideoDetailStateChanged(request);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChronosBusinessService$notifyChronosFollowStateChange$2(ChronosBusinessService chronosBusinessService, Continuation<? super ChronosBusinessService$notifyChronosFollowStateChange$2> continuation) {
        super(2, continuation);
        this.this$0 = chronosBusinessService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChronosBusinessService$notifyChronosFollowStateChange$2(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(com.bilibili.ogv.infra.violet.c.a(FollowStateEvent.class));
            a aVar = new a(this.this$0);
            this.label = 1;
            if (flowDistinctUntilChanged.collect(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
