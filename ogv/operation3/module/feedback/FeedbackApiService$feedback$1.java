package com.bilibili.ogv.operation3.module.feedback;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/feedback/FeedbackApiService$feedback$1.class */
final class FeedbackApiService$feedback$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    int I$4;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    Object result;
    final l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackApiService$feedback$1(l lVar, Continuation<? super FeedbackApiService$feedback$1> continuation) {
        super(continuation);
        this.this$0 = lVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, 0, 0, this);
    }
}
