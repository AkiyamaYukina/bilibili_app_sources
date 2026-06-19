package com.bilibili.pegasus.vm;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/vm/PegasusViewModel$dispatch$1.class */
final class PegasusViewModel$dispatch$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final PegasusViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PegasusViewModel$dispatch$1(PegasusViewModel pegasusViewModel, Continuation<? super PegasusViewModel$dispatch$1> continuation) {
        super(continuation);
        this.this$0 = pegasusViewModel;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.s(null, this);
    }
}
