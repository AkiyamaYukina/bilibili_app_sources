package com.bilibili.ship.theseus.ogv.operation.layout;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/operation/layout/OperationBarKt$OperationBarI$3$10$1$1.class */
public final class OperationBarKt$OperationBarI$3$10$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final e $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperationBarKt$OperationBarI$3$10$1$1(e eVar, Continuation<? super OperationBarKt$OperationBarI$3$10$1$1> continuation) {
        super(2, continuation);
        this.$viewModel = eVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OperationBarKt$OperationBarI$3$10$1$1(this.$viewModel, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        String strA;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        e eVar = this.$viewModel;
        eVar.f94133e.setValue(Duration.box-impl(Duration.minus-LRDsOJo(eVar.b(), DurationKt.toDuration(1, DurationUnit.SECONDS))));
        if (Duration.getInWholeSeconds-impl(eVar.b()) > 0) {
            strA = e.a(Duration.getInWholeSeconds-impl(eVar.b()));
        } else {
            eVar.f94131c.invoke();
            strA = null;
        }
        eVar.f94134f.setValue(strA);
        return Unit.INSTANCE;
    }
}
