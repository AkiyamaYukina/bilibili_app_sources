package com.bilibili.ship.theseus.united.page;

import com.bilibili.ship.theseus.keel.player.j;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/AutoPlayService$showFirstFrame$1$1$1.class */
public final class AutoPlayService$showFirstFrame$1$1$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    int label;
    final AutoPlayService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoPlayService$showFirstFrame$1$1$1(AutoPlayService autoPlayService, Continuation<? super AutoPlayService$showFirstFrame$1$1$1> continuation) {
        super(1, continuation);
        this.this$0 = autoPlayService;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new AutoPlayService$showFirstFrame$1$1$1(this.this$0, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            StateFlow stateFlowAsStateFlow = FlowKt.asStateFlow(this.this$0.f98787a.f91111e);
            this.label = 1;
            Object objA = com.bilibili.ogv.infra.coroutine.b.a(stateFlowAsStateFlow, this);
            obj = objA;
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                BLog.i("AutoPlayService$showFirstFrame$1$1$1-invokeSuspend", "[theseus-united-AutoPlayService$showFirstFrame$1$1$1-invokeSuspend] dismiss overlay: first frame arrived");
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        this.label = 2;
        if (((j) obj).u(this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        BLog.i("AutoPlayService$showFirstFrame$1$1$1-invokeSuspend", "[theseus-united-AutoPlayService$showFirstFrame$1$1$1-invokeSuspend] dismiss overlay: first frame arrived");
        return Unit.INSTANCE;
    }
}
