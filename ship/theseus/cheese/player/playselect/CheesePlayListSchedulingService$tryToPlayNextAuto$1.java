package com.bilibili.ship.theseus.cheese.player.playselect;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/playselect/CheesePlayListSchedulingService$tryToPlayNextAuto$1.class */
final class CheesePlayListSchedulingService$tryToPlayNextAuto$1 extends ContinuationImpl {
    int label;
    Object result;
    final b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheesePlayListSchedulingService$tryToPlayNextAuto$1(b bVar, Continuation<? super CheesePlayListSchedulingService$tryToPlayNextAuto$1> continuation) {
        super(continuation);
        this.this$0 = bVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
