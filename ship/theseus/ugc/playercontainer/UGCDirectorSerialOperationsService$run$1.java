package com.bilibili.ship.theseus.ugc.playercontainer;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playercontainer/UGCDirectorSerialOperationsService$run$1.class */
final class UGCDirectorSerialOperationsService$run$1 extends ContinuationImpl {
    int label;
    Object result;
    final UGCDirectorSerialOperationsService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UGCDirectorSerialOperationsService$run$1(UGCDirectorSerialOperationsService uGCDirectorSerialOperationsService, Continuation<? super UGCDirectorSerialOperationsService$run$1> continuation) {
        super(continuation);
        this.this$0 = uGCDirectorSerialOperationsService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return UGCDirectorSerialOperationsService.a(this.this$0, this);
    }
}
