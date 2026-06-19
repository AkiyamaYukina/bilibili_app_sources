package com.bilibili.search2.discover;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/discover/SearchDiscoverViewModel$observeDataChanges$2.class */
final class SearchDiscoverViewModel$observeDataChanges$2 extends SuspendLambda implements Function2<n, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final p this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchDiscoverViewModel$observeDataChanges$2(p pVar, Continuation<? super SearchDiscoverViewModel$observeDataChanges$2> continuation) {
        super(2, continuation);
        this.this$0 = pVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SearchDiscoverViewModel$observeDataChanges$2 searchDiscoverViewModel$observeDataChanges$2 = new SearchDiscoverViewModel$observeDataChanges$2(this.this$0, continuation);
        searchDiscoverViewModel$observeDataChanges$2.L$0 = obj;
        return searchDiscoverViewModel$observeDataChanges$2;
    }

    public final Object invoke(n nVar, Continuation<? super Unit> continuation) {
        return create(nVar, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.f86463j.setValue((n) this.L$0);
        return Unit.INSTANCE;
    }
}
