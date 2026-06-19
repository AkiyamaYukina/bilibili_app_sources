package com.bilibili.lib.push;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/RedDotHelper$interceptByExp$1.class */
final class RedDotHelper$interceptByExp$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final A this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RedDotHelper$interceptByExp$1(A a7, Continuation<? super RedDotHelper$interceptByExp$1> continuation) {
        super(continuation);
        this.this$0 = a7;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, this);
    }
}
