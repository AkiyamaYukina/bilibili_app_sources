package com.bilibili.ship.theseus.ugc.intro.ai;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ai/UgcAiFeedbackService$showEndPageFeedback$1.class */
final class UgcAiFeedbackService$showEndPageFeedback$1 extends ContinuationImpl {
    int label;
    Object result;
    final UgcAiFeedbackService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcAiFeedbackService$showEndPageFeedback$1(UgcAiFeedbackService ugcAiFeedbackService, Continuation<? super UgcAiFeedbackService$showEndPageFeedback$1> continuation) {
        super(continuation);
        this.this$0 = ugcAiFeedbackService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(this);
    }
}
