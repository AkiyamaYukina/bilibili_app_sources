package com.bilibili.playset.detail.widget;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/widget/CoordinatorContentKt$CoordinatorContent$3$1$performFling$1.class */
public final class CoordinatorContentKt$CoordinatorContent$3$1$performFling$1 extends ContinuationImpl {
    int label;
    Object result;
    final CoordinatorContentKt$CoordinatorContent$3$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoordinatorContentKt$CoordinatorContent$3$1$performFling$1(CoordinatorContentKt$CoordinatorContent$3$1 coordinatorContentKt$CoordinatorContent$3$1, Continuation<? super CoordinatorContentKt$CoordinatorContent$3$1$performFling$1> continuation) {
        super(continuation);
        this.this$0 = coordinatorContentKt$CoordinatorContent$3$1;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.performFling(null, 0.0f, this);
    }
}
