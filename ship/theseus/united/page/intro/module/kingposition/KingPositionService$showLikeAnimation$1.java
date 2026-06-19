package com.bilibili.ship.theseus.united.page.intro.module.kingposition;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$showLikeAnimation$1.class */
public final class KingPositionService$showLikeAnimation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final KingPositionService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KingPositionService$showLikeAnimation$1(KingPositionService kingPositionService, Continuation<? super KingPositionService$showLikeAnimation$1> continuation) {
        super(2, continuation);
        this.this$0 = kingPositionService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KingPositionService$showLikeAnimation$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            MutableSharedFlow<Unit> mutableSharedFlow = this.this$0.f100366P;
            Unit unit = Unit.INSTANCE;
            this.label = 1;
            if (mutableSharedFlow.emit(unit, this) == coroutine_suspended) {
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
