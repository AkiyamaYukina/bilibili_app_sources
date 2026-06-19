package com.bilibili.studio.editor.asr.multi.step;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/multi/step/StepExtract$startExtractAudioInner$1.class */
final class StepExtract$startExtractAudioInner$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    Object result;
    final b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StepExtract$startExtractAudioInner$1(b bVar, Continuation<? super StepExtract$startExtractAudioInner$1> continuation) {
        super(continuation);
        this.this$0 = bVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, this);
    }
}
