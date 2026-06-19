package com.bilibili.ship.theseus.keel.player;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/keel/player/TheseusPlayableImpl$run$1.class */
final class TheseusPlayableImpl$run$1 extends ContinuationImpl {
    int label;
    Object result;
    final k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusPlayableImpl$run$1(k kVar, Continuation<? super TheseusPlayableImpl$run$1> continuation) {
        super(continuation);
        this.this$0 = kVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.D(this);
    }
}
