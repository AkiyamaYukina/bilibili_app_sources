package com.bilibili.pegasus.components.interest.ui.udf.handlers;

import com.bilibili.pegasus.components.interest.ui.udf.actions.Actions;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/udf/handlers/FetchSecondHandler$reduce$3.class */
final class FetchSecondHandler$reduce$3 extends SuspendLambda implements Function2<FlowCollector<? super Actions>, Continuation<? super Unit>, Object> {
    private Object L$0;
    int label;

    public FetchSecondHandler$reduce$3(Continuation<? super FetchSecondHandler$reduce$3> continuation) {
        super(2, continuation);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FetchSecondHandler$reduce$3 fetchSecondHandler$reduce$3 = new FetchSecondHandler$reduce$3(continuation);
        fetchSecondHandler$reduce$3.L$0 = obj;
        return fetchSecondHandler$reduce$3;
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
            Actions.d dVar = Actions.d.f76421a;
            this.label = 1;
            if (flowCollector.emit(dVar, this) == coroutine_suspended) {
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
