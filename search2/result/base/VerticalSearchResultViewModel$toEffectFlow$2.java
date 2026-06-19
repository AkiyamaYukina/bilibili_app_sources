package com.bilibili.search2.result.base;

import com.bilibili.search2.result.base.q;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/VerticalSearchResultViewModel$toEffectFlow$2.class */
final class VerticalSearchResultViewModel$toEffectFlow$2 extends SuspendLambda implements Function3<FlowCollector<? super q>, Throwable, Continuation<? super Unit>, Object> {
    private Object L$0;
    Object L$1;
    int label;

    public VerticalSearchResultViewModel$toEffectFlow$2(Continuation<? super VerticalSearchResultViewModel$toEffectFlow$2> continuation) {
        super(3, continuation);
    }

    public final Object invoke(FlowCollector<? super q> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        VerticalSearchResultViewModel$toEffectFlow$2 verticalSearchResultViewModel$toEffectFlow$2 = new VerticalSearchResultViewModel$toEffectFlow$2(continuation);
        verticalSearchResultViewModel$toEffectFlow$2.L$0 = flowCollector;
        verticalSearchResultViewModel$toEffectFlow$2.L$1 = th;
        return verticalSearchResultViewModel$toEffectFlow$2.invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            q.d.a aVar = new q.d.a(O4.d.a("load vertical failed by ", (Throwable) this.L$1), 1);
            this.L$0 = null;
            this.label = 1;
            if (flowCollector.emit(aVar, this) == coroutine_suspended) {
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
