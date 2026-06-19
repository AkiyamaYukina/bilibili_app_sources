package com.bilibili.ship.theseus.ogv.playercontainer;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/playercontainer/OgvDirectorSerialOperationsService$run$1.class */
final class OgvDirectorSerialOperationsService$run$1 extends ContinuationImpl {
    int label;
    Object result;
    final OgvDirectorSerialOperationsService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvDirectorSerialOperationsService$run$1(OgvDirectorSerialOperationsService ogvDirectorSerialOperationsService, Continuation<? super OgvDirectorSerialOperationsService$run$1> continuation) {
        super(continuation);
        this.this$0 = ogvDirectorSerialOperationsService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return OgvDirectorSerialOperationsService.a(this.this$0, this);
    }
}
