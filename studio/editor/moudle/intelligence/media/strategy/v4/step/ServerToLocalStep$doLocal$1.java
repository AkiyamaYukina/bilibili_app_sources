package com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.step;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/strategy/v4/step/ServerToLocalStep$doLocal$1.class */
final class ServerToLocalStep$doLocal$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServerToLocalStep$doLocal$1(k kVar, Continuation<? super ServerToLocalStep$doLocal$1> continuation) {
        super(continuation);
        this.this$0 = kVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.f(null, 0, this);
    }
}
