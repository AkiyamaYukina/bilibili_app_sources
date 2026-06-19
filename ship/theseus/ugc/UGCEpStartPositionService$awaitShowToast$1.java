package com.bilibili.ship.theseus.ugc;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/UGCEpStartPositionService$awaitShowToast$1.class */
final class UGCEpStartPositionService$awaitShowToast$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    Object result;
    final j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UGCEpStartPositionService$awaitShowToast$1(j jVar, Continuation<? super UGCEpStartPositionService$awaitShowToast$1> continuation) {
        super(continuation);
        this.this$0 = jVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return j.a(this.this$0, null, 0L, null, this);
    }
}
