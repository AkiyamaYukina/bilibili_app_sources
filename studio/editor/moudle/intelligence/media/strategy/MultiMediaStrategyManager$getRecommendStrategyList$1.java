package com.bilibili.studio.editor.moudle.intelligence.media.strategy;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/strategy/MultiMediaStrategyManager$getRecommendStrategyList$1.class */
final class MultiMediaStrategyManager$getRecommendStrategyList$1 extends ContinuationImpl {
    int label;
    Object result;
    final b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiMediaStrategyManager$getRecommendStrategyList$1(b bVar, Continuation<? super MultiMediaStrategyManager$getRecommendStrategyList$1> continuation) {
        super(continuation);
        this.this$0 = bVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(0, this, false);
    }
}
