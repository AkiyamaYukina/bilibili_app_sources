package com.bilibili.ship.theseus.ogv.videocard;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videocard/OgvVideoCardWidget$bind$1.class */
final class OgvVideoCardWidget$bind$1 extends ContinuationImpl {
    int label;
    Object result;
    final j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvVideoCardWidget$bind$1(j jVar, Continuation<? super OgvVideoCardWidget$bind$1> continuation) {
        super(continuation);
        this.this$0 = jVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, this);
    }
}
