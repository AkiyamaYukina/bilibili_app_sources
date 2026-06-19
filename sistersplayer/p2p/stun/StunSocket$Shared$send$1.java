package com.bilibili.sistersplayer.p2p.stun;

import com.bilibili.sistersplayer.p2p.stun.StunSocket;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/stun/StunSocket$Shared$send$1.class */
public final class StunSocket$Shared$send$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    Object result;
    final StunSocket.Shared this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StunSocket$Shared$send$1(StunSocket.Shared shared, Continuation<? super StunSocket$Shared$send$1> continuation) {
        super(continuation);
        this.this$0 = shared;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.send(null, null, this);
    }
}
