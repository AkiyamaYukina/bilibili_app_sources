package com.bilibili.ship.theseus.ogv.ep;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/ep/OgvInMediaPlayService$handleInMediaState$1.class */
final class OgvInMediaPlayService$handleInMediaState$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvInMediaPlayService$handleInMediaState$1(c cVar, Continuation<? super OgvInMediaPlayService$handleInMediaState$1> continuation) {
        super(continuation);
        this.this$0 = cVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return c.a(this.this$0, null, this);
    }
}
