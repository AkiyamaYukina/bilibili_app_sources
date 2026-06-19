package com.bilibili.player.tangram.basic;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/basic/ResolveAndPlayPlayable$run$1.class */
final class ResolveAndPlayPlayable$run$1 extends ContinuationImpl {
    int label;
    Object result;
    final ResolveAndPlayPlayable<e> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResolveAndPlayPlayable$run$1(ResolveAndPlayPlayable<e> resolveAndPlayPlayable, Continuation<? super ResolveAndPlayPlayable$run$1> continuation) {
        super(continuation);
        this.this$0 = resolveAndPlayPlayable;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.D(this);
    }
}
