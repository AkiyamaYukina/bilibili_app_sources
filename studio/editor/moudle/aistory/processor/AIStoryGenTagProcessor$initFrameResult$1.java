package com.bilibili.studio.editor.moudle.aistory.processor;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/processor/AIStoryGenTagProcessor$initFrameResult$1.class */
final class AIStoryGenTagProcessor$initFrameResult$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final AIStoryGenTagProcessor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIStoryGenTagProcessor$initFrameResult$1(AIStoryGenTagProcessor aIStoryGenTagProcessor, Continuation<? super AIStoryGenTagProcessor$initFrameResult$1> continuation) {
        super(continuation);
        this.this$0 = aIStoryGenTagProcessor;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AIStoryGenTagProcessor.d(this.this$0, null, this);
    }
}
