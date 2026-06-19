package com.bilibili.search2.result.base;

import com.bilibili.search2.api.VerticalSearchResult;
import com.bilibili.search2.result.base.i;
import com.bilibili.search2.result.base.q;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/VerticalSearchResultViewModel$onResponseSuspend$1.class */
final class VerticalSearchResultViewModel$onResponseSuspend$1 extends SuspendLambda implements Function3<FlowCollector<? super q>, q, Continuation<? super Unit>, Object> {
    private Object L$0;
    Object L$1;
    int label;
    final y this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalSearchResultViewModel$onResponseSuspend$1(y yVar, Continuation<? super VerticalSearchResultViewModel$onResponseSuspend$1> continuation) {
        super(3, continuation);
        this.this$0 = yVar;
    }

    public final Object invoke(FlowCollector<? super q> flowCollector, q qVar, Continuation<? super Unit> continuation) {
        VerticalSearchResultViewModel$onResponseSuspend$1 verticalSearchResultViewModel$onResponseSuspend$1 = new VerticalSearchResultViewModel$onResponseSuspend$1(this.this$0, continuation);
        verticalSearchResultViewModel$onResponseSuspend$1.L$0 = flowCollector;
        verticalSearchResultViewModel$onResponseSuspend$1.L$1 = qVar;
        return verticalSearchResultViewModel$onResponseSuspend$1.invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object objEmit;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            q qVar = (q) this.L$1;
            if (qVar instanceof q.g.d) {
                y yVar = this.this$0;
                q.g.d dVar = (q.g.d) qVar;
                VerticalSearchResult<?> verticalSearchResult = dVar.f87605a;
                this.L$0 = null;
                this.label = 1;
                yVar.getClass();
                if (BaseSearchResultViewModel.U0(yVar, flowCollector, verticalSearchResult, dVar.f87606b, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (qVar instanceof q.g.c) {
                y yVar2 = this.this$0;
                this.L$0 = null;
                this.label = 2;
                if (yVar2.N0() <= 0) {
                    objEmit = flowCollector.emit(new q.e(new i.a(null)), this);
                    if (objEmit != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objEmit = Unit.INSTANCE;
                    }
                } else {
                    objEmit = flowCollector.emit(new q.f(new k()), this);
                    if (objEmit != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objEmit = Unit.INSTANCE;
                    }
                }
                if (objEmit == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                this.L$0 = null;
                this.label = 3;
                if (flowCollector.emit(qVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i7 != 1 && i7 != 2 && i7 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
