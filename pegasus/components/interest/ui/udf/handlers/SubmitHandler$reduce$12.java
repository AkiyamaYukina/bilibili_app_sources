package com.bilibili.pegasus.components.interest.ui.udf.handlers;

import Do0.a;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/udf/handlers/SubmitHandler$reduce$12.class */
final class SubmitHandler$reduce$12 extends SuspendLambda implements Function2<FlowCollector<? super Do0.a>, Continuation<? super Unit>, Object> {
    private Object L$0;
    int label;

    public SubmitHandler$reduce$12(Continuation<? super SubmitHandler$reduce$12> continuation) {
        super(2, continuation);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SubmitHandler$reduce$12 submitHandler$reduce$12 = new SubmitHandler$reduce$12(continuation);
        submitHandler$reduce$12.L$0 = obj;
        return submitHandler$reduce$12;
    }

    public final Object invoke(FlowCollector<? super Do0.a> flowCollector, Continuation<? super Unit> continuation) {
        return create(flowCollector, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            this.L$0 = flowCollector;
            this.label = 1;
            if (YieldKt.yield(this) == coroutine_suspended) {
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
            FlowCollector flowCollector2 = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
            flowCollector = flowCollector2;
        }
        a.C0021a c0021a = new a.C0021a(4, Boxing.boxBoolean(false), Boxing.boxBoolean(true), null);
        this.L$0 = null;
        this.label = 2;
        if (flowCollector.emit(c0021a, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
