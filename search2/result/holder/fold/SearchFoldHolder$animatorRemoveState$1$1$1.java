package com.bilibili.search2.result.holder.fold;

import com.bilibili.search2.result.all.SearchResultAllFragment;
import com.bilibili.search2.result.base.u;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/fold/SearchFoldHolder$animatorRemoveState$1$1$1.class */
public final class SearchFoldHolder$animatorRemoveState$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final SearchResultAllFragment $this_apply;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchFoldHolder$animatorRemoveState$1$1$1(SearchResultAllFragment searchResultAllFragment, Continuation<? super SearchFoldHolder$animatorRemoveState$1$1$1> continuation) {
        super(2, continuation);
        this.$this_apply = searchResultAllFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchFoldHolder$animatorRemoveState$1$1$1(this.$this_apply, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$this_apply.rf().V0(u.b.f87627a);
        return Unit.INSTANCE;
    }
}
