package com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.step2;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/strategy/v4/step2/ServerFilterStepV2$process$1.class */
public final class ServerFilterStepV2$process$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    Object result;
    final ServerFilterStepV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServerFilterStepV2$process$1(ServerFilterStepV2 serverFilterStepV2, Continuation<? super ServerFilterStepV2$process$1> continuation) {
        super(continuation);
        this.this$0 = serverFilterStepV2;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(null, this);
    }
}
