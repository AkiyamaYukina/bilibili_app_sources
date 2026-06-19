package com.bilibili.ogv.review.reviewpublish;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/reviewpublish/ReviewSharePosterHelper$getColorFromSource$1.class */
final class ReviewSharePosterHelper$getColorFromSource$1 extends ContinuationImpl {
    float F$0;
    float F$1;
    float F$2;
    float F$3;
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    Object result;
    final h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewSharePosterHelper$getColorFromSource$1(h hVar, Continuation<? super ReviewSharePosterHelper$getColorFromSource$1> continuation) {
        super(continuation);
        this.this$0 = hVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, 0, null, null, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, this);
    }
}
