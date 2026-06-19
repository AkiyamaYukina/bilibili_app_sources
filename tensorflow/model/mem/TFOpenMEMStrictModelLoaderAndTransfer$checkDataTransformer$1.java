package com.bilibili.tensorflow.model.mem;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/model/mem/TFOpenMEMStrictModelLoaderAndTransfer$checkDataTransformer$1.class */
final class TFOpenMEMStrictModelLoaderAndTransfer$checkDataTransformer$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TFOpenMEMStrictModelLoaderAndTransfer$checkDataTransformer$1(b bVar, Continuation<? super TFOpenMEMStrictModelLoaderAndTransfer$checkDataTransformer$1> continuation) {
        super(continuation);
        this.this$0 = bVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        b bVar = this.this$0;
        b bVar2 = b.f110799a;
        return bVar.a(this);
    }
}
