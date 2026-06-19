package com.bilibili.studio.videocompile.internal.strategy;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videocompile/internal/strategy/H265Strategy$checkHevcEnable$1.class */
final class H265Strategy$checkHevcEnable$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    Object result;

    public H265Strategy$checkHevcEnable$1(Continuation<? super H265Strategy$checkHevcEnable$1> continuation) {
        super(continuation);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return H265Strategy.a(null, null, this);
    }
}
