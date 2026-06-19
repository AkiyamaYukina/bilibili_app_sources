package com.bilibili.player.tangram.playercore;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/PCSPlayableImpl$resolvingContext$1.class */
final class PCSPlayableImpl$resolvingContext$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    boolean Z$0;
    int label;
    Object result;
    final PCSPlayableImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PCSPlayableImpl$resolvingContext$1(PCSPlayableImpl pCSPlayableImpl, Continuation<? super PCSPlayableImpl$resolvingContext$1> continuation) {
        super(continuation);
        this.this$0 = pCSPlayableImpl;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.N(null, 0, this);
    }
}
