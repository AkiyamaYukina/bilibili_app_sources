package com.bilibili.ship.theseus.united.page.danmaku;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.send.ShipChainChange;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.remote.IRemoteHandler;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/ChronosBusinessService$notifyChronosDislikeVideoChange$1.class */
final class ChronosBusinessService$notifyChronosDislikeVideoChange$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final ChronosBusinessService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.ChronosBusinessService$notifyChronosDislikeVideoChange$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/ChronosBusinessService$notifyChronosDislikeVideoChange$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        boolean Z$0;
        int label;
        final ChronosBusinessService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ChronosBusinessService chronosBusinessService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = chronosBusinessService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
        }

        public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
            return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            boolean z6 = this.Z$0;
            ShipChainChange.Request request = new ShipChainChange.Request();
            request.setDislikeState(Boxing.boxBoolean(z6));
            IRemoteHandler remoteHandler = this.this$0.f99336g.getRemoteHandler();
            if (remoteHandler != null) {
                remoteHandler.updateRelationshipChainChanged(request);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChronosBusinessService$notifyChronosDislikeVideoChange$1(ChronosBusinessService chronosBusinessService, Continuation<? super ChronosBusinessService$notifyChronosDislikeVideoChange$1> continuation) {
        super(2, continuation);
        this.this$0 = chronosBusinessService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChronosBusinessService$notifyChronosDislikeVideoChange$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ChronosBusinessService chronosBusinessService = this.this$0;
            StateFlow<Boolean> stateFlow = chronosBusinessService.f99339k.f104000i;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(chronosBusinessService, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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
