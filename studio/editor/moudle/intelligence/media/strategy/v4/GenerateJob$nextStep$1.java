package com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/strategy/v4/GenerateJob$nextStep$1.class */
public final class GenerateJob$nextStep$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    Object result;
    final GenerateJob this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenerateJob$nextStep$1(GenerateJob generateJob, Continuation<? super GenerateJob$nextStep$1> continuation) {
        super(continuation);
        this.this$0 = generateJob;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
