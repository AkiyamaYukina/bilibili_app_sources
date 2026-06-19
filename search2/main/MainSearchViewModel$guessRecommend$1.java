package com.bilibili.search2.main;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/MainSearchViewModel$guessRecommend$1.class */
final class MainSearchViewModel$guessRecommend$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    Object result;
    final MainSearchViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainSearchViewModel$guessRecommend$1(MainSearchViewModel mainSearchViewModel, Continuation<? super MainSearchViewModel$guessRecommend$1> continuation) {
        super(continuation);
        this.this$0 = mainSearchViewModel;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objI0 = MainSearchViewModel.I0(this.this$0, null, 0, 0, null, null, null, null, null, this);
        return objI0 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objI0 : Result.box-impl(objI0);
    }
}
