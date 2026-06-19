package com.bilibili.ship.theseus.united.page.screenstate;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.YieldKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/screenstate/TheseusScreenStateService$widgetStateChangeListener$1$updateOrientationLock$1.class */
final class TheseusScreenStateService$widgetStateChangeListener$1$updateOrientationLock$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final boolean $dismiss;
    int label;
    final TheseusScreenStateService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusScreenStateService$widgetStateChangeListener$1$updateOrientationLock$1(boolean z6, TheseusScreenStateService theseusScreenStateService, Continuation<? super TheseusScreenStateService$widgetStateChangeListener$1$updateOrientationLock$1> continuation) {
        super(2, continuation);
        this.$dismiss = z6;
        this.this$0 = theseusScreenStateService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TheseusScreenStateService$widgetStateChangeListener$1$updateOrientationLock$1(this.$dismiss, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$dismiss) {
                this.label = 1;
                if (YieldKt.yield(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.this$0.f102953a.j("LockedFromPlayerContainer", !r0.f102961j.changeOrientationEnable());
        return Unit.INSTANCE;
    }
}
