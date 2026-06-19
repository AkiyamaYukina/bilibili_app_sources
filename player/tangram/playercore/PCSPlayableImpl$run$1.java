package com.bilibili.player.tangram.playercore;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/PCSPlayableImpl$run$1.class */
final class PCSPlayableImpl$run$1 extends ContinuationImpl {
    int label;
    Object result;
    final PCSPlayableImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PCSPlayableImpl$run$1(PCSPlayableImpl pCSPlayableImpl, Continuation<? super PCSPlayableImpl$run$1> continuation) {
        super(continuation);
        this.this$0 = pCSPlayableImpl;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.D(this);
    }
}
