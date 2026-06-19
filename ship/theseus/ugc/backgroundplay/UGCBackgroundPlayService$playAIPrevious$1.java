package com.bilibili.ship.theseus.ugc.backgroundplay;

import com.bilibili.ship.theseus.keel.player.j;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/backgroundplay/UGCBackgroundPlayService$playAIPrevious$1.class */
public final class UGCBackgroundPlayService$playAIPrevious$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final UGCBackgroundPlayService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UGCBackgroundPlayService$playAIPrevious$1(UGCBackgroundPlayService uGCBackgroundPlayService, Continuation<? super UGCBackgroundPlayService$playAIPrevious$1> continuation) {
        super(2, continuation);
        this.this$0 = uGCBackgroundPlayService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UGCBackgroundPlayService$playAIPrevious$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            j jVarJ = this.this$0.f96313m.j();
            if (jVarJ != null) {
                this.label = 1;
                if (jVarJ.a(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
