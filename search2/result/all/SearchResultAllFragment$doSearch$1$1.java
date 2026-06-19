package com.bilibili.search2.result.all;

import android.content.Context;
import com.bilibili.search2.result.base.u;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/SearchResultAllFragment$doSearch$1$1.class */
public final class SearchResultAllFragment$doSearch$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final com.bilibili.search2.result.base.v $it;
    int label;
    final SearchResultAllFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchResultAllFragment$doSearch$1$1(SearchResultAllFragment searchResultAllFragment, com.bilibili.search2.result.base.v vVar, Continuation<? super SearchResultAllFragment$doSearch$1$1> continuation) {
        super(2, continuation);
        this.this$0 = searchResultAllFragment;
        this.$it = vVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchResultAllFragment$doSearch$1$1(this.this$0, this.$it, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            SearchResultAllFragment searchResultAllFragment = this.this$0;
            MutableSharedFlow<com.bilibili.search2.result.base.u> mutableSharedFlow = searchResultAllFragment.f87474d;
            com.bilibili.search2.result.base.v vVar = this.$it;
            Context context = searchResultAllFragment.getContext();
            u.e eVar = new u.e(vVar, context != null ? com.bilibili.search2.component.e.g(context) : false);
            this.label = 1;
            if (mutableSharedFlow.emit(eVar, this) == coroutine_suspended) {
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
