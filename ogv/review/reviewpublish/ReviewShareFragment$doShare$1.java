package com.bilibili.ogv.review.reviewpublish;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/reviewpublish/ReviewShareFragment$doShare$1.class */
final class ReviewShareFragment$doShare$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    Object result;
    final ReviewShareFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewShareFragment$doShare$1(ReviewShareFragment reviewShareFragment, Continuation<? super ReviewShareFragment$doShare$1> continuation) {
        super(continuation);
        this.this$0 = reviewShareFragment;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ReviewShareFragment.hf(this.this$0, this);
    }
}
