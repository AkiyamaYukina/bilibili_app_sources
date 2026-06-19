package com.bilibili.sistersplayer.p2p.stun;

import com.bilibili.sistersplayer.p2p.stun.StunClient;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/stun/StunClient$Companion$Create$1.class */
public final class StunClient$Companion$Create$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final StunClient.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StunClient$Companion$Create$1(StunClient.Companion companion, Continuation<? super StunClient$Companion$Create$1> continuation) {
        super(continuation);
        this.this$0 = companion;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.Create(this);
    }
}
