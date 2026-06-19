package com.bilibili.pegasus.page;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/TimeMachineRefreshAction$run$1.class */
public final class TimeMachineRefreshAction$run$1 extends ContinuationImpl {
    int label;
    Object result;
    final TimeMachineRefreshAction this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimeMachineRefreshAction$run$1(TimeMachineRefreshAction timeMachineRefreshAction, Continuation<? super TimeMachineRefreshAction$run$1> continuation) {
        super(continuation);
        this.this$0 = timeMachineRefreshAction;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
