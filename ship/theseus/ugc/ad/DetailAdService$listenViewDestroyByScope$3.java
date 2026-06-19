package com.bilibili.ship.theseus.ugc.ad;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/ad/DetailAdService$listenViewDestroyByScope$3.class */
final class DetailAdService$listenViewDestroyByScope$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final DetailAdService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailAdService$listenViewDestroyByScope$3(DetailAdService detailAdService, Continuation<? super DetailAdService$listenViewDestroyByScope$3> continuation) {
        super(2, continuation);
        this.this$0 = detailAdService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DetailAdService$listenViewDestroyByScope$3(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        } catch (Throwable th) {
            this.this$0.f96249D = false;
            throw th;
        }
    }
}
