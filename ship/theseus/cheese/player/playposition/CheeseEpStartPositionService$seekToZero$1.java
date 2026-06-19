package com.bilibili.ship.theseus.cheese.player.playposition;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/playposition/CheeseEpStartPositionService$seekToZero$1.class */
final class CheeseEpStartPositionService$seekToZero$1 extends ContinuationImpl {
    int label;
    Object result;
    final a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseEpStartPositionService$seekToZero$1(a aVar, Continuation<? super CheeseEpStartPositionService$seekToZero$1> continuation) {
        super(continuation);
        this.this$0 = aVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(null, 0L, 0L, 0L, this);
    }
}
