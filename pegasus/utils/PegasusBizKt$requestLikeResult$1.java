package com.bilibili.pegasus.utils;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/utils/PegasusBizKt$requestLikeResult$1.class */
final class PegasusBizKt$requestLikeResult$1 extends ContinuationImpl {
    int label;
    Object result;

    public PegasusBizKt$requestLikeResult$1(Continuation<? super PegasusBizKt$requestLikeResult$1> continuation) {
        super(continuation);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return u.a(null, false, null, null, null, this);
    }
}
