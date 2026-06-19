package com.bilibili.ship.theseus.cheese.biz.modules;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/modules/CheeseDirectorSerialOperationsService$run$1.class */
final class CheeseDirectorSerialOperationsService$run$1 extends ContinuationImpl {
    int label;
    Object result;
    final CheeseDirectorSerialOperationsService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseDirectorSerialOperationsService$run$1(CheeseDirectorSerialOperationsService cheeseDirectorSerialOperationsService, Continuation<? super CheeseDirectorSerialOperationsService$run$1> continuation) {
        super(continuation);
        this.this$0 = cheeseDirectorSerialOperationsService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return CheeseDirectorSerialOperationsService.a(this.this$0, this);
    }
}
