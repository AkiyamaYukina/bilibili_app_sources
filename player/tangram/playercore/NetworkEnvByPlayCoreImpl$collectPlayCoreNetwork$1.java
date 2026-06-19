package com.bilibili.player.tangram.playercore;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/NetworkEnvByPlayCoreImpl$collectPlayCoreNetwork$1.class */
final class NetworkEnvByPlayCoreImpl$collectPlayCoreNetwork$1 extends ContinuationImpl {
    int label;
    Object result;
    final C5776d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkEnvByPlayCoreImpl$collectPlayCoreNetwork$1(C5776d c5776d, Continuation<? super NetworkEnvByPlayCoreImpl$collectPlayCoreNetwork$1> continuation) {
        super(continuation);
        this.this$0 = c5776d;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(this);
    }
}
