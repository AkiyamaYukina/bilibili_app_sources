package com.bilibili.search2.result.all;

import com.bilibili.search2.result.base.SearchState;
import com.bilibili.search2.result.base.i;
import com.bilibili.search2.result.base.q;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/SearchResultAllViewModel$onSearchResponseSuspend$1.class */
final class SearchResultAllViewModel$onSearchResponseSuspend$1 extends SuspendLambda implements Function3<FlowCollector<? super com.bilibili.search2.result.base.q>, com.bilibili.search2.result.base.q, Continuation<? super Unit>, Object> {
    private Object L$0;
    Object L$1;
    int label;
    final SearchResultAllViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchResultAllViewModel$onSearchResponseSuspend$1(SearchResultAllViewModel searchResultAllViewModel, Continuation<? super SearchResultAllViewModel$onSearchResponseSuspend$1> continuation) {
        super(3, continuation);
        this.this$0 = searchResultAllViewModel;
    }

    public final Object invoke(FlowCollector<? super com.bilibili.search2.result.base.q> flowCollector, com.bilibili.search2.result.base.q qVar, Continuation<? super Unit> continuation) {
        SearchResultAllViewModel$onSearchResponseSuspend$1 searchResultAllViewModel$onSearchResponseSuspend$1 = new SearchResultAllViewModel$onSearchResponseSuspend$1(this.this$0, continuation);
        searchResultAllViewModel$onSearchResponseSuspend$1.L$0 = flowCollector;
        searchResultAllViewModel$onSearchResponseSuspend$1.L$1 = qVar;
        return searchResultAllViewModel$onSearchResponseSuspend$1.invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            com.bilibili.search2.result.base.q qVar = (com.bilibili.search2.result.base.q) this.L$1;
            if (qVar instanceof q.d.c) {
                SearchResultAllViewModel searchResultAllViewModel = this.this$0;
                q.d.c cVar = (q.d.c) qVar;
                com.bilibili.search2.result.base.v vVar = cVar.f87595c;
                boolean z6 = vVar.f87645c;
                this.L$0 = null;
                this.label = 1;
                if (searchResultAllViewModel.l1(flowCollector, qVar, z6, vVar.f87646d, cVar.f87593a, null, vVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (!(qVar instanceof q.d.e)) {
                this.L$0 = null;
                this.label = 4;
                if (flowCollector.emit(qVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (((SearchState) this.this$0.f87499f.getValue()).getPage() == 0) {
                q.e eVar = new q.e(new i.a(null));
                this.L$0 = null;
                this.label = 2;
                if (flowCollector.emit(eVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                q.f fVar = new q.f(new com.bilibili.search2.result.base.k());
                this.L$0 = null;
                this.label = 3;
                if (flowCollector.emit(fVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i7 != 1 && i7 != 2 && i7 != 3 && i7 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
