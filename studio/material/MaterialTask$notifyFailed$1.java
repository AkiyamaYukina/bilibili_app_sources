package com.bilibili.studio.material;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/MaterialTask$notifyFailed$1.class */
final class MaterialTask$notifyFailed$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    Object result;
    final MaterialTask this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaterialTask$notifyFailed$1(MaterialTask materialTask, Continuation<? super MaterialTask$notifyFailed$1> continuation) {
        super(continuation);
        this.this$0 = materialTask;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return MaterialTask.access$notifyFailed(this.this$0, null, this);
    }
}
