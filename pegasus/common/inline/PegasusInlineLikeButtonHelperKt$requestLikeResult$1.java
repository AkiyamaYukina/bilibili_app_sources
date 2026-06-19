package com.bilibili.pegasus.common.inline;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/common/inline/PegasusInlineLikeButtonHelperKt$requestLikeResult$1.class */
final class PegasusInlineLikeButtonHelperKt$requestLikeResult$1 extends ContinuationImpl {
    int label;
    Object result;

    public PegasusInlineLikeButtonHelperKt$requestLikeResult$1(Continuation<? super PegasusInlineLikeButtonHelperKt$requestLikeResult$1> continuation) {
        super(continuation);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return x.a(null, false, null, null, null, this);
    }
}
