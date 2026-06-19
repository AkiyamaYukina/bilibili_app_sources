package com.bilibili.ship.theseus.ogv.operation.layout;

import androidx.compose.runtime.MutableState;
import com.bilibili.ship.theseus.ogv.operation.OperationTextVo;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/operation/layout/OperationCardKt$OperationCardI$lambda$0$3$0$5$1$$inlined$ReportOnExposure$1.class */
public final class OperationCardKt$OperationCardI$lambda$0$3$0$5$1$$inlined$ReportOnExposure$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final OperationTextVo $button$inlined;
    final Object $data;
    final MutableState $reported$delegate;
    final g $viewModel$inlined;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperationCardKt$OperationCardI$lambda$0$3$0$5$1$$inlined$ReportOnExposure$1(Object obj, MutableState mutableState, Continuation continuation, g gVar, OperationTextVo operationTextVo) {
        super(2, continuation);
        this.$data = obj;
        this.$reported$delegate = mutableState;
        this.$viewModel$inlined = gVar;
        this.$button$inlined = operationTextVo;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OperationCardKt$OperationCardI$lambda$0$3$0$5$1$$inlined$ReportOnExposure$1(this.$data, this.$reported$delegate, continuation, this.$viewModel$inlined, this.$button$inlined);
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
        this.$viewModel$inlined.f94138a.invoke(this.$button$inlined, Boxing.boxBoolean(false));
        ZW.a.b(this.$reported$delegate);
        return Unit.INSTANCE;
    }
}
