package com.bilibili.search2.result.all;

import com.bilibili.search2.result.base.q;
import com.bilibili.search2.result.base.u;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/SearchResultAllViewModel$toEffectFlow$14.class */
final class SearchResultAllViewModel$toEffectFlow$14 extends SuspendLambda implements Function2<FlowCollector<? super com.bilibili.search2.result.base.q>, Continuation<? super Unit>, Object> {
    final u.a $this_toEffectFlow;
    private Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchResultAllViewModel$toEffectFlow$14(u.a aVar, Continuation<? super SearchResultAllViewModel$toEffectFlow$14> continuation) {
        super(2, continuation);
        this.$this_toEffectFlow = aVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SearchResultAllViewModel$toEffectFlow$14 searchResultAllViewModel$toEffectFlow$14 = new SearchResultAllViewModel$toEffectFlow$14(this.$this_toEffectFlow, continuation);
        searchResultAllViewModel$toEffectFlow$14.L$0 = obj;
        return searchResultAllViewModel$toEffectFlow$14;
    }

    public final Object invoke(FlowCollector<? super com.bilibili.search2.result.base.q> flowCollector, Continuation<? super Unit> continuation) {
        return create(flowCollector, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            com.bilibili.search2.result.base.h hVar = this.$this_toEffectFlow.f87626a;
            q.a.c cVar = new q.a.c(new com.bilibili.search2.result.base.n(hVar.f87549a, true, true, hVar.f87550b, null));
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
