package com.bilibili.playset.detail;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/MultiTypeListDetailViewModel$deletePlaylist$1.class */
final class MultiTypeListDetailViewModel$deletePlaylist$1 extends ContinuationImpl {
    long J$0;
    int label;
    Object result;
    final MultiTypeListDetailViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiTypeListDetailViewModel$deletePlaylist$1(MultiTypeListDetailViewModel multiTypeListDetailViewModel, Continuation<? super MultiTypeListDetailViewModel$deletePlaylist$1> continuation) {
        super(continuation);
        this.this$0 = multiTypeListDetailViewModel;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.L0(0L, this);
    }
}
