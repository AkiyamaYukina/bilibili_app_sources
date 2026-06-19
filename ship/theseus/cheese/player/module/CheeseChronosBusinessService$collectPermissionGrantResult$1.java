package com.bilibili.ship.theseus.cheese.player.module;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/module/CheeseChronosBusinessService$collectPermissionGrantResult$1.class */
final class CheeseChronosBusinessService$collectPermissionGrantResult$1 extends ContinuationImpl {
    int label;
    Object result;
    final CheeseChronosBusinessService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseChronosBusinessService$collectPermissionGrantResult$1(CheeseChronosBusinessService cheeseChronosBusinessService, Continuation<? super CheeseChronosBusinessService$collectPermissionGrantResult$1> continuation) {
        super(continuation);
        this.this$0 = cheeseChronosBusinessService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return CheeseChronosBusinessService.c(this.this$0, this);
    }
}
