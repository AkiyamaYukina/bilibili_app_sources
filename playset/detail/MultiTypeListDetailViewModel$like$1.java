package com.bilibili.playset.detail;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/MultiTypeListDetailViewModel$like$1.class */
final class MultiTypeListDetailViewModel$like$1 extends ContinuationImpl {
    int I$0;
    int label;
    Object result;
    final MultiTypeListDetailViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiTypeListDetailViewModel$like$1(MultiTypeListDetailViewModel multiTypeListDetailViewModel, Continuation<? super MultiTypeListDetailViewModel$like$1> continuation) {
        super(continuation);
        this.this$0 = multiTypeListDetailViewModel;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.Q0(0L, 0, 0L, null, null, null, this);
    }
}
