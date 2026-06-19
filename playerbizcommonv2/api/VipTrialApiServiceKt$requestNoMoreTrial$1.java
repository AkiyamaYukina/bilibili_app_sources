package com.bilibili.playerbizcommonv2.api;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/api/VipTrialApiServiceKt$requestNoMoreTrial$1.class */
final class VipTrialApiServiceKt$requestNoMoreTrial$1 extends ContinuationImpl {
    int label;
    Object result;

    public VipTrialApiServiceKt$requestNoMoreTrial$1(Continuation<? super VipTrialApiServiceKt$requestNoMoreTrial$1> continuation) {
        super(continuation);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return VipTrialApiServiceKt.b(null, null, this);
    }
}
