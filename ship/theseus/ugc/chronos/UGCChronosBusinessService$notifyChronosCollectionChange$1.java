package com.bilibili.ship.theseus.ugc.chronos;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.send.VideoDetailStateChange;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.remote.IRemoteHandler;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/chronos/UGCChronosBusinessService$notifyChronosCollectionChange$1.class */
final class UGCChronosBusinessService$notifyChronosCollectionChange$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final UGCChronosBusinessService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.chronos.UGCChronosBusinessService$notifyChronosCollectionChange$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/chronos/UGCChronosBusinessService$notifyChronosCollectionChange$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<VideoDetailStateChange.CheckInState, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final UGCChronosBusinessService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UGCChronosBusinessService uGCChronosBusinessService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = uGCChronosBusinessService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(VideoDetailStateChange.CheckInState checkInState, Continuation<? super Unit> continuation) {
            return create(checkInState, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            VideoDetailStateChange.CheckInState checkInState = (VideoDetailStateChange.CheckInState) this.L$0;
            VideoDetailStateChange.Request request = new VideoDetailStateChange.Request();
            request.setClockInState(checkInState);
            IRemoteHandler remoteHandler = this.this$0.f96441c.getRemoteHandler();
            if (remoteHandler != null) {
                remoteHandler.onVideoDetailStateChanged(request);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UGCChronosBusinessService$notifyChronosCollectionChange$1(UGCChronosBusinessService uGCChronosBusinessService, Continuation<? super UGCChronosBusinessService$notifyChronosCollectionChange$1> continuation) {
        super(2, continuation);
        this.this$0 = uGCChronosBusinessService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UGCChronosBusinessService$notifyChronosCollectionChange$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            UGCChronosBusinessService uGCChronosBusinessService = this.this$0;
            SharedFlow<VideoDetailStateChange.CheckInState> sharedFlow = uGCChronosBusinessService.f96448k.h;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(uGCChronosBusinessService, null);
            this.label = 1;
            if (FlowKt.collectLatest(sharedFlow, anonymousClass1, this) == coroutine_suspended) {
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
