package com.bilibili.ogv.review.reviewpublish;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/reviewpublish/ReviewSharePosterHelper$loadBitmap$1.class */
final class ReviewSharePosterHelper$loadBitmap$1 extends ContinuationImpl {
    int label;
    Object result;
    final h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewSharePosterHelper$loadBitmap$1(h hVar, Continuation<? super ReviewSharePosterHelper$loadBitmap$1> continuation) {
        super(continuation);
        this.this$0 = hVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, 0, 0, null, this);
    }
}
