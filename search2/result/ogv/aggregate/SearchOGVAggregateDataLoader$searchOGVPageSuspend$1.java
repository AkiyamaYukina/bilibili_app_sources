package com.bilibili.search2.result.ogv.aggregate;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/ogv/aggregate/SearchOGVAggregateDataLoader$searchOGVPageSuspend$1.class */
final class SearchOGVAggregateDataLoader$searchOGVPageSuspend$1 extends ContinuationImpl {
    int label;
    Object result;
    final u this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchOGVAggregateDataLoader$searchOGVPageSuspend$1(u uVar, Continuation<? super SearchOGVAggregateDataLoader$searchOGVPageSuspend$1> continuation) {
        super(continuation);
        this.this$0 = uVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
