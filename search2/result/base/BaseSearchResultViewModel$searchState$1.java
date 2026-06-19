package com.bilibili.search2.result.base;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/BaseSearchResultViewModel$searchState$1.class */
public final class BaseSearchResultViewModel$searchState$1 extends SuspendLambda implements Function3<SearchState, q, Continuation<? super SearchState>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final BaseSearchResultViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseSearchResultViewModel$searchState$1(BaseSearchResultViewModel baseSearchResultViewModel, Continuation<? super BaseSearchResultViewModel$searchState$1> continuation) {
        super(3, continuation);
        this.this$0 = baseSearchResultViewModel;
    }

    public final Object invoke(SearchState searchState, q qVar, Continuation<? super SearchState> continuation) {
        BaseSearchResultViewModel$searchState$1 baseSearchResultViewModel$searchState$1 = new BaseSearchResultViewModel$searchState$1(this.this$0, continuation);
        baseSearchResultViewModel$searchState$1.L$0 = searchState;
        baseSearchResultViewModel$searchState$1.L$1 = qVar;
        return baseSearchResultViewModel$searchState$1.invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        SearchState searchState = (SearchState) this.L$0;
        q qVar = (q) this.L$1;
        BaseSearchResultViewModel baseSearchResultViewModel = this.this$0;
        baseSearchResultViewModel.T0(baseSearchResultViewModel.f87495b, "partialChange:" + qVar + "  oldState:" + searchState);
        return qVar.b(searchState);
    }
}
