package com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/strategy/v4/ServerStrategyManagerNew$forceGenerateIfEmpty$1.class */
final class ServerStrategyManagerNew$forceGenerateIfEmpty$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    Object result;
    final ServerStrategyManagerNew this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServerStrategyManagerNew$forceGenerateIfEmpty$1(ServerStrategyManagerNew serverStrategyManagerNew, Continuation<? super ServerStrategyManagerNew$forceGenerateIfEmpty$1> continuation) {
        super(continuation);
        this.this$0 = serverStrategyManagerNew;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.e(this);
    }
}
