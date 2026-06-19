package com.bilibili.player.tangram.basic;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/basic/CompoundPlayStateProviderImpl$associateWith$1.class */
public final class CompoundPlayStateProviderImpl$associateWith$1 extends ContinuationImpl {
    int label;
    Object result;
    final CompoundPlayStateProviderImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompoundPlayStateProviderImpl$associateWith$1(CompoundPlayStateProviderImpl compoundPlayStateProviderImpl, Continuation<? super CompoundPlayStateProviderImpl$associateWith$1> continuation) {
        super(continuation);
        this.this$0 = compoundPlayStateProviderImpl;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.o(null, this);
    }
}
