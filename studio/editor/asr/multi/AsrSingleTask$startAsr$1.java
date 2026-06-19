package com.bilibili.studio.editor.asr.multi;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/multi/AsrSingleTask$startAsr$1.class */
final class AsrSingleTask$startAsr$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    Object result;
    final AsrSingleTask this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsrSingleTask$startAsr$1(AsrSingleTask asrSingleTask, Continuation<? super AsrSingleTask$startAsr$1> continuation) {
        super(continuation);
        this.this$0 = asrSingleTask;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
