package com.bilibili.search2.result;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/SearchShortUrlDataLoader$searchShortLinkSuspend$1.class */
final class SearchShortUrlDataLoader$searchShortLinkSuspend$1 extends ContinuationImpl {
    int label;
    Object result;
    final v this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchShortUrlDataLoader$searchShortLinkSuspend$1(v vVar, Continuation<? super SearchShortUrlDataLoader$searchShortLinkSuspend$1> continuation) {
        super(continuation);
        this.this$0 = vVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
