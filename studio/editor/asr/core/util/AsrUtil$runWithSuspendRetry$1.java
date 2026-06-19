package com.bilibili.studio.editor.asr.core.util;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/core/util/AsrUtil$runWithSuspendRetry$1.class */
final class AsrUtil$runWithSuspendRetry$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    int label;
    Object result;
    final a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsrUtil$runWithSuspendRetry$1(a aVar, Continuation<? super AsrUtil$runWithSuspendRetry$1> continuation) {
        super(continuation);
        this.this$0 = aVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(0, null, this);
    }
}
