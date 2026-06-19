package com.bilibili.player.tangram.playercore;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/SequentialPCSPlayable$runPreloading$1.class */
final class SequentialPCSPlayable$runPreloading$1 extends ContinuationImpl {
    int label;
    Object result;
    final SequentialPCSPlayable this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SequentialPCSPlayable$runPreloading$1(SequentialPCSPlayable sequentialPCSPlayable, Continuation<? super SequentialPCSPlayable$runPreloading$1> continuation) {
        super(continuation);
        this.this$0 = sequentialPCSPlayable;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return SequentialPCSPlayable.M(this.this$0, this);
    }
}
