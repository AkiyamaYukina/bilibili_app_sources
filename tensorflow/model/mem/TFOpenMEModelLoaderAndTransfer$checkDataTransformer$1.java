package com.bilibili.tensorflow.model.mem;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/model/mem/TFOpenMEModelLoaderAndTransfer$checkDataTransformer$1.class */
final class TFOpenMEModelLoaderAndTransfer$checkDataTransformer$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TFOpenMEModelLoaderAndTransfer$checkDataTransformer$1(c cVar, Continuation<? super TFOpenMEModelLoaderAndTransfer$checkDataTransformer$1> continuation) {
        super(continuation);
        this.this$0 = cVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        c cVar = this.this$0;
        c cVar2 = c.f110805a;
        return cVar.a(this);
    }
}
