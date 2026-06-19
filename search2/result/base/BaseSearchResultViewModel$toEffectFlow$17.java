package com.bilibili.search2.result.base;

import com.bilibili.search2.result.base.q;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/BaseSearchResultViewModel$toEffectFlow$17.class */
final class BaseSearchResultViewModel$toEffectFlow$17 extends SuspendLambda implements Function2<FlowCollector<? super q>, Continuation<? super Unit>, Object> {
    private Object L$0;
    int label;

    public BaseSearchResultViewModel$toEffectFlow$17(Continuation<? super BaseSearchResultViewModel$toEffectFlow$17> continuation) {
        super(2, continuation);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BaseSearchResultViewModel$toEffectFlow$17 baseSearchResultViewModel$toEffectFlow$17 = new BaseSearchResultViewModel$toEffectFlow$17(continuation);
        baseSearchResultViewModel$toEffectFlow$17.L$0 = obj;
        return baseSearchResultViewModel$toEffectFlow$17;
    }

    public final Object invoke(FlowCollector<? super q> flowCollector, Continuation<? super Unit> continuation) {
        return create(flowCollector, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            q.g.c cVar = new q.g.c(null, "please override effect flow fun", 1);
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
