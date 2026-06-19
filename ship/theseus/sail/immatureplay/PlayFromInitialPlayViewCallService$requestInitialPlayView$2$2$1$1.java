package com.bilibili.ship.theseus.sail.immatureplay;

import com.bilibili.ship.theseus.united.page.error.j;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/sail/immatureplay/PlayFromInitialPlayViewCallService$requestInitialPlayView$2$2$1$1.class */
final class PlayFromInitialPlayViewCallService$requestInitialPlayView$2$2$1$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final com.bilibili.ship.theseus.united.page.error.b $playErrorState;
    int label;
    final e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayFromInitialPlayViewCallService$requestInitialPlayView$2$2$1$1(e eVar, com.bilibili.ship.theseus.united.page.error.b bVar, Continuation<? super PlayFromInitialPlayViewCallService$requestInitialPlayView$2$2$1$1> continuation) {
        super(1, continuation);
        this.this$0 = eVar;
        this.$playErrorState = bVar;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new PlayFromInitialPlayViewCallService$requestInitialPlayView$2$2$1$1(this.this$0, this.$playErrorState, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            j jVar = this.this$0.f96191c;
            com.bilibili.ship.theseus.united.page.error.b bVar = this.$playErrorState;
            this.label = 1;
            if (jVar.a(bVar, this) == coroutine_suspended) {
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
