package com.bilibili.ship.theseus.ugc.chronos;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/chronos/UGCChronosBusinessService$registerChronosBusinessHandler$1.class */
final class UGCChronosBusinessService$registerChronosBusinessHandler$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    Object result;
    final UGCChronosBusinessService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UGCChronosBusinessService$registerChronosBusinessHandler$1(UGCChronosBusinessService uGCChronosBusinessService, Continuation<? super UGCChronosBusinessService$registerChronosBusinessHandler$1> continuation) {
        super(continuation);
        this.this$0 = uGCChronosBusinessService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return UGCChronosBusinessService.a(this.this$0, null, this);
    }
}
