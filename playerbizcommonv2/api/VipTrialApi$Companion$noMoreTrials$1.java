package com.bilibili.playerbizcommonv2.api;

import com.bilibili.playerbizcommonv2.api.e;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/api/VipTrialApi$Companion$noMoreTrials$1.class */
final class VipTrialApi$Companion$noMoreTrials$1 extends ContinuationImpl {
    int label;
    Object result;
    final e.a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VipTrialApi$Companion$noMoreTrials$1(e.a aVar, Continuation<? super VipTrialApi$Companion$noMoreTrials$1> continuation) {
        super(continuation);
        this.this$0 = aVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(0, null, null, this);
    }
}
