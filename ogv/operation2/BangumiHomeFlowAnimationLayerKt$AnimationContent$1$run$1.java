package com.bilibili.ogv.operation2;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/BangumiHomeFlowAnimationLayerKt$AnimationContent$1$run$1.class */
public final class BangumiHomeFlowAnimationLayerKt$AnimationContent$1$run$1 extends ContinuationImpl {
    int label;
    Object result;
    final BangumiHomeFlowAnimationLayerKt$AnimationContent$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BangumiHomeFlowAnimationLayerKt$AnimationContent$1$run$1(BangumiHomeFlowAnimationLayerKt$AnimationContent$1 bangumiHomeFlowAnimationLayerKt$AnimationContent$1, Continuation<? super BangumiHomeFlowAnimationLayerKt$AnimationContent$1$run$1> continuation) {
        super(continuation);
        this.this$0 = bangumiHomeFlowAnimationLayerKt$AnimationContent$1;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
