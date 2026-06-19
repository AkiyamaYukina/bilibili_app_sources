package com.bilibili.ship.theseus.cheese.biz.intro.primary;

import com.bilibili.ship.theseus.cheese.biz.intro.primary.C6081b;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/CheesePrimaryComponent$SceneCoupon$1$1$2$1$1.class */
final class CheesePrimaryComponent$SceneCoupon$1$1$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $remainingDuration;
    int label;
    final C6081b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheesePrimaryComponent$SceneCoupon$1$1$2$1$1(long j7, C6081b c6081b, Continuation<? super CheesePrimaryComponent$SceneCoupon$1$1$2$1$1> continuation) {
        super(2, continuation);
        this.$remainingDuration = j7;
        this.this$0 = c6081b;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheesePrimaryComponent$SceneCoupon$1$1$2$1$1(this.$remainingDuration, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            if (Duration.compareTo-LRDsOJo(this.$remainingDuration, Duration.Companion.getZERO-UwyO8pc()) <= 0) {
                MutableSharedFlow<C6081b.a> mutableSharedFlow = this.this$0.f89713b;
                C6081b.a.j jVar = C6081b.a.j.f89725a;
                this.label = 1;
                if (mutableSharedFlow.emit(jVar, this) == coroutine_suspended) {
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
