package com.bilibili.ogv.operation2;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/BangumiHomeFlowAnimationLayer$awaitAllowingToScroll$1.class */
final class BangumiHomeFlowAnimationLayer$awaitAllowingToScroll$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    Object result;
    final j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BangumiHomeFlowAnimationLayer$awaitAllowingToScroll$1(j jVar, Continuation<? super BangumiHomeFlowAnimationLayer$awaitAllowingToScroll$1> continuation) {
        super(continuation);
        this.this$0 = jVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
