package com.bilibili.pegasus.vm;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/vm/LoadMoreAction$run$1.class */
public final class LoadMoreAction$run$1 extends ContinuationImpl {
    int label;
    Object result;
    final LoadMoreAction this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadMoreAction$run$1(LoadMoreAction loadMoreAction, Continuation<? super LoadMoreAction$run$1> continuation) {
        super(continuation);
        this.this$0 = loadMoreAction;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
