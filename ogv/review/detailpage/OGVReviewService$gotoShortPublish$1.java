package com.bilibili.ogv.review.detailpage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/detailpage/OGVReviewService$gotoShortPublish$1.class */
final class OGVReviewService$gotoShortPublish$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final OGVReviewService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OGVReviewService$gotoShortPublish$1(OGVReviewService oGVReviewService, Continuation<? super OGVReviewService$gotoShortPublish$1> continuation) {
        super(continuation);
        this.this$0 = oGVReviewService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(false, null, this);
    }
}
