package com.bilibili.ship.theseus.cheese.biz.intro.studyrecord;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/studyrecord/CheeseStudyCompletedLayerService$startCountdown$1.class */
final class CheeseStudyCompletedLayerService$startCountdown$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    Object result;
    final CheeseStudyCompletedLayerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseStudyCompletedLayerService$startCountdown$1(CheeseStudyCompletedLayerService cheeseStudyCompletedLayerService, Continuation<? super CheeseStudyCompletedLayerService$startCountdown$1> continuation) {
        super(continuation);
        this.this$0 = cheeseStudyCompletedLayerService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, 0, null, this);
    }
}
