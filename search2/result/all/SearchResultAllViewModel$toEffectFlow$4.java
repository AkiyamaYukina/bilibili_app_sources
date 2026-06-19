package com.bilibili.search2.result.all;

import com.bilibili.search2.result.base.q;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/SearchResultAllViewModel$toEffectFlow$4.class */
final class SearchResultAllViewModel$toEffectFlow$4 extends SuspendLambda implements Function3<FlowCollector<? super com.bilibili.search2.result.base.q>, Throwable, Continuation<? super Unit>, Object> {
    private Object L$0;
    Object L$1;
    int label;

    public SearchResultAllViewModel$toEffectFlow$4(Continuation<? super SearchResultAllViewModel$toEffectFlow$4> continuation) {
        super(3, continuation);
    }

    public final Object invoke(FlowCollector<? super com.bilibili.search2.result.base.q> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        SearchResultAllViewModel$toEffectFlow$4 searchResultAllViewModel$toEffectFlow$4 = new SearchResultAllViewModel$toEffectFlow$4(continuation);
        searchResultAllViewModel$toEffectFlow$4.L$0 = flowCollector;
        searchResultAllViewModel$toEffectFlow$4.L$1 = th;
        return searchResultAllViewModel$toEffectFlow$4.invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            q.d.a aVar = new q.d.a(O4.d.a("load more failed by ", (Throwable) this.L$1), 1);
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
