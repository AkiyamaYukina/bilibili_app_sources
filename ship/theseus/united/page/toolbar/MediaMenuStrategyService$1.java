package com.bilibili.ship.theseus.united.page.toolbar;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/MediaMenuStrategyService$1.class */
final class MediaMenuStrategyService$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final C6423g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaMenuStrategyService$1(C6423g c6423g, Continuation<? super MediaMenuStrategyService$1> continuation) {
        super(2, continuation);
        this.this$0 = c6423g;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MediaMenuStrategyService$1(this.this$0, continuation);
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
                C6423g c6423g = this.this$0;
                j jVar = c6423g.f103389c;
                if (jVar.f103399c != null) {
                    return Unit.INSTANCE;
                }
                jVar.f103399c = c6423g.f103388b;
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
            C6423g c6423g2 = this.this$0;
            if (Intrinsics.areEqual(c6423g2.f103389c.f103399c, c6423g2.f103388b)) {
                this.this$0.f103389c.f103399c = null;
            }
            throw th;
        }
    }
}
