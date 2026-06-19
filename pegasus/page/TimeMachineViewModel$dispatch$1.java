package com.bilibili.pegasus.page;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/TimeMachineViewModel$dispatch$1.class */
final class TimeMachineViewModel$dispatch$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final TimeMachineViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimeMachineViewModel$dispatch$1(TimeMachineViewModel timeMachineViewModel, Continuation<? super TimeMachineViewModel$dispatch$1> continuation) {
        super(continuation);
        this.this$0 = timeMachineViewModel;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.s(null, this);
    }
}
