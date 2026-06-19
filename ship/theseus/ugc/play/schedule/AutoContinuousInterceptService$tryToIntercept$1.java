package com.bilibili.ship.theseus.ugc.play.schedule;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/AutoContinuousInterceptService$tryToIntercept$1.class */
final class AutoContinuousInterceptService$tryToIntercept$1 extends ContinuationImpl {
    int label;
    Object result;
    final AutoContinuousInterceptService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoContinuousInterceptService$tryToIntercept$1(AutoContinuousInterceptService autoContinuousInterceptService, Continuation<? super AutoContinuousInterceptService$tryToIntercept$1> continuation) {
        super(continuation);
        this.this$0 = autoContinuousInterceptService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(this);
    }
}
