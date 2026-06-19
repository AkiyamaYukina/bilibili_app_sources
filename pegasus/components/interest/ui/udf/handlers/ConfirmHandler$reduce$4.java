package com.bilibili.pegasus.components.interest.ui.udf.handlers;

import com.bilibili.pegasus.components.interest.ui.udf.actions.Actions;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/udf/handlers/ConfirmHandler$reduce$4.class */
final class ConfirmHandler$reduce$4 extends SuspendLambda implements Function2<FlowCollector<? super Actions>, Continuation<? super Unit>, Object> {
    private Object L$0;
    int label;

    public ConfirmHandler$reduce$4(Continuation<? super ConfirmHandler$reduce$4> continuation) {
        super(2, continuation);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ConfirmHandler$reduce$4 confirmHandler$reduce$4 = new ConfirmHandler$reduce$4(continuation);
        confirmHandler$reduce$4.L$0 = obj;
        return confirmHandler$reduce$4;
    }

    public final Object invoke(FlowCollector<? super Actions> flowCollector, Continuation<? super Unit> continuation) {
        return create(flowCollector, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Actions.c cVar = Actions.c.f76420a;
            this.label = 1;
            if (flowCollector.emit(cVar, this) == coroutine_suspended) {
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
