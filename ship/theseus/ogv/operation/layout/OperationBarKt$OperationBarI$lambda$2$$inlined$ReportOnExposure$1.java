package com.bilibili.ship.theseus.ogv.operation.layout;

import androidx.compose.runtime.MutableState;
import com.bilibili.ship.theseus.ogv.operation.OperationActivityVo;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/operation/layout/OperationBarKt$OperationBarI$lambda$2$$inlined$ReportOnExposure$1.class */
public final class OperationBarKt$OperationBarI$lambda$2$$inlined$ReportOnExposure$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Object $data;
    final OperationActivityVo $exposureItem$inlined;
    final MutableState $reported$delegate;
    final e $viewModel$inlined;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperationBarKt$OperationBarI$lambda$2$$inlined$ReportOnExposure$1(Object obj, MutableState mutableState, Continuation continuation, e eVar, OperationActivityVo operationActivityVo) {
        super(2, continuation);
        this.$data = obj;
        this.$reported$delegate = mutableState;
        this.$viewModel$inlined = eVar;
        this.$exposureItem$inlined = operationActivityVo;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OperationBarKt$OperationBarI$lambda$2$$inlined$ReportOnExposure$1(this.$data, this.$reported$delegate, continuation, this.$viewModel$inlined, this.$exposureItem$inlined);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$viewModel$inlined.f94129a.invoke(this.$exposureItem$inlined, Boxing.boxBoolean(true));
        ZW.a.b(this.$reported$delegate);
        return Unit.INSTANCE;
    }
}
