package com.bilibili.player.tangram.playercore;

import com.bilibili.player.tangram.playercore.PCSFacadeImpl$currentPositionFlow$1$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/PCSFacadeImpl$currentPositionFlow$1$1$1$emit_VtjQ1oo$1.class */
public final class PCSFacadeImpl$currentPositionFlow$1$1$1$emit_VtjQ1oo$1 extends ContinuationImpl {
    int label;
    Object result;
    final PCSFacadeImpl$currentPositionFlow$1$1.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PCSFacadeImpl$currentPositionFlow$1$1$1$emit_VtjQ1oo$1(PCSFacadeImpl$currentPositionFlow$1$1.AnonymousClass1<? super T> anonymousClass1, Continuation<? super PCSFacadeImpl$currentPositionFlow$1$1$1$emit_VtjQ1oo$1> continuation) {
        super(continuation);
        this.this$0 = anonymousClass1;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(0L, (Continuation<? super Unit>) this);
    }
}
