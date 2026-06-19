package com.bilibili.pegasus.components.interest;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/LowActiveInterestChoosePlugin$showRealtimeInterestChoose$1.class */
final class LowActiveInterestChoosePlugin$showRealtimeInterestChoose$1 extends ContinuationImpl {
    int label;
    Object result;
    final LowActiveInterestChoosePlugin this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LowActiveInterestChoosePlugin$showRealtimeInterestChoose$1(LowActiveInterestChoosePlugin lowActiveInterestChoosePlugin, Continuation<? super LowActiveInterestChoosePlugin$showRealtimeInterestChoose$1> continuation) {
        super(continuation);
        this.this$0 = lowActiveInterestChoosePlugin;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return LowActiveInterestChoosePlugin.b(this.this$0, this);
    }
}
