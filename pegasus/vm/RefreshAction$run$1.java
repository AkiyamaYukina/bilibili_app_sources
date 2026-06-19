package com.bilibili.pegasus.vm;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/vm/RefreshAction$run$1.class */
public final class RefreshAction$run$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    Object result;
    final RefreshAction this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RefreshAction$run$1(RefreshAction refreshAction, Continuation<? super RefreshAction$run$1> continuation) {
        super(continuation);
        this.this$0 = refreshAction;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
