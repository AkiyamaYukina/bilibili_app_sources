package com.bilibili.ship.theseus.cheese.biz.bottomcontainer;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/bottomcontainer/CheeseBottomContainerService$reqFavorite$1.class */
final class CheeseBottomContainerService$reqFavorite$1 extends ContinuationImpl {
    int label;
    Object result;
    final CheeseBottomContainerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseBottomContainerService$reqFavorite$1(CheeseBottomContainerService cheeseBottomContainerService, Continuation<? super CheeseBottomContainerService$reqFavorite$1> continuation) {
        super(continuation);
        this.this$0 = cheeseBottomContainerService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return CheeseBottomContainerService.b(this.this$0, false, this);
    }
}
