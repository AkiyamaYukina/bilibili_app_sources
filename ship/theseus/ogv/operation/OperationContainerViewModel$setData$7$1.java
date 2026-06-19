package com.bilibili.ship.theseus.ogv.operation;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/operation/OperationContainerViewModel$setData$7$1.class */
public final class OperationContainerViewModel$setData$7$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $it;
    int label;
    final OperationContainerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperationContainerViewModel$setData$7$1(long j7, OperationContainerViewModel operationContainerViewModel, Continuation<? super OperationContainerViewModel$setData$7$1> continuation) {
        super(2, continuation);
        this.$it = j7;
        this.this$0 = operationContainerViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OperationContainerViewModel$setData$7$1(this.$it, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            long j7 = Duration.getInWholeMilliseconds-impl(this.$it);
            this.label = 1;
            if (DelayKt.delay(j7, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.this$0.a();
        return Unit.INSTANCE;
    }
}
