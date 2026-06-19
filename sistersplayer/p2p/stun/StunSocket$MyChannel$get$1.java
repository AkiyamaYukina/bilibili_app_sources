package com.bilibili.sistersplayer.p2p.stun;

import com.bilibili.sistersplayer.p2p.stun.StunSocket;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/stun/StunSocket$MyChannel$get$1.class */
public final class StunSocket$MyChannel$get$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    Object result;
    final StunSocket.MyChannel<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StunSocket$MyChannel$get$1(StunSocket.MyChannel<T> myChannel, Continuation<? super StunSocket$MyChannel$get$1> continuation) {
        super(continuation);
        this.this$0 = myChannel;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.get(0, (Continuation<? super T>) this);
    }
}
