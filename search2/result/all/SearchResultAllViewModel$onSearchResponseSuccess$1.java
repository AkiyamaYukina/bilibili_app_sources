package com.bilibili.search2.result.all;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/SearchResultAllViewModel$onSearchResponseSuccess$1.class */
final class SearchResultAllViewModel$onSearchResponseSuccess$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    Object result;
    final SearchResultAllViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchResultAllViewModel$onSearchResponseSuccess$1(SearchResultAllViewModel searchResultAllViewModel, Continuation<? super SearchResultAllViewModel$onSearchResponseSuccess$1> continuation) {
        super(continuation);
        this.this$0 = searchResultAllViewModel;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.l1(null, null, false, false, null, null, null, this);
    }
}
