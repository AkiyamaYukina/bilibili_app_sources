package com.bilibili.sistersplayer.p2p.stun;

import com.bilibili.sistersplayer.p2p.stun.StunSocket;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/stun/StunSocket$MyChannel$close$1.class */
public final class StunSocket$MyChannel$close$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    Object result;
    final StunSocket.MyChannel<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StunSocket$MyChannel$close$1(StunSocket.MyChannel<T> myChannel, Continuation<? super StunSocket$MyChannel$close$1> continuation) {
        super(continuation);
        this.this$0 = myChannel;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.close((Continuation<? super Unit>) this);
    }
}
