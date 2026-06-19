package com.bilibili.search2.result.base;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/BaseSearchResultViewModel$onSearchResponseSuccess$1.class */
final class BaseSearchResultViewModel$onSearchResponseSuccess$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    Object result;
    final BaseSearchResultViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseSearchResultViewModel$onSearchResponseSuccess$1(BaseSearchResultViewModel baseSearchResultViewModel, Continuation<? super BaseSearchResultViewModel$onSearchResponseSuccess$1> continuation) {
        super(continuation);
        this.this$0 = baseSearchResultViewModel;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return BaseSearchResultViewModel.U0(this.this$0, null, null, null, this);
    }
}
