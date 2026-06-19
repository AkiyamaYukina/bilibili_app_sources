package com.bilibili.pegasus.components.graduation;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/GraduationSeasonShareHelper$loadShareBackgroundBitmap$1.class */
final class GraduationSeasonShareHelper$loadShareBackgroundBitmap$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    Object result;
    final W this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraduationSeasonShareHelper$loadShareBackgroundBitmap$1(W w7, Continuation<? super GraduationSeasonShareHelper$loadShareBackgroundBitmap$1> continuation) {
        super(continuation);
        this.this$0 = w7;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return W.b(this.this$0, null, this);
    }
}
