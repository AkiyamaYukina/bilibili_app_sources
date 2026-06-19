package com.bilibili.pegasus.components.interest.ui.udf.handlers;

import com.bilibili.pegasus.components.interest.ui.udf.actions.Actions;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/udf/handlers/ConfirmHandler$reduce$3.class */
final class ConfirmHandler$reduce$3 extends SuspendLambda implements Function2<FlowCollector<? super Actions>, Continuation<? super Unit>, Object> {
    private Object L$0;
    int label;

    public ConfirmHandler$reduce$3(Continuation<? super ConfirmHandler$reduce$3> continuation) {
        super(2, continuation);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ConfirmHandler$reduce$3 confirmHandler$reduce$3 = new ConfirmHandler$reduce$3(continuation);
        confirmHandler$reduce$3.L$0 = obj;
        return confirmHandler$reduce$3;
    }

    public final Object invoke(FlowCollector<? super Actions> flowCollector, Continuation<? super Unit> continuation) {
        return create(flowCollector, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector2 = (FlowCollector) this.L$0;
            Actions.d dVar = Actions.d.f76421a;
            this.L$0 = flowCollector2;
            this.label = 1;
            flowCollector = flowCollector2;
            if (flowCollector2.emit(dVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            FlowCollector flowCollector3 = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
            flowCollector = flowCollector3;
        }
        Actions.ReportActions.c cVar = new Actions.ReportActions.c(new com.bilibili.pegasus.components.interest.ui.udf.actions.a(1));
        this.L$0 = null;
        this.label = 2;
        if (flowCollector.emit(cVar, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
