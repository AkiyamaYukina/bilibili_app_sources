package com.bilibili.player.tangram.basic;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/basic/ResolveAndPlayPlayable$seekTo$1.class */
public final class ResolveAndPlayPlayable$seekTo$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final ResolveAndPlayPlayable<InnerPlayer> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResolveAndPlayPlayable$seekTo$1(ResolveAndPlayPlayable<InnerPlayer> resolveAndPlayPlayable, Continuation<? super ResolveAndPlayPlayable$seekTo$1> continuation) {
        super(continuation);
        this.this$0 = resolveAndPlayPlayable;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(0L, false, (Continuation<? super Boolean>) this);
    }
}
