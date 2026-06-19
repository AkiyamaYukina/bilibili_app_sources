package com.bilibili.search2.result.all;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/SearchResultAllViewModel$toEffectFlow$5.class */
public final class SearchResultAllViewModel$toEffectFlow$5 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final SearchResultAllViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchResultAllViewModel$toEffectFlow$5(SearchResultAllViewModel searchResultAllViewModel, Continuation<? super SearchResultAllViewModel$toEffectFlow$5> continuation) {
        super(continuation);
        this.this$0 = searchResultAllViewModel;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.Y0(null, this);
    }
}
