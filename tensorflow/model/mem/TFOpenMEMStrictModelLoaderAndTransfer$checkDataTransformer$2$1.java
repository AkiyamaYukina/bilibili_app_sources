package com.bilibili.tensorflow.model.mem;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/model/mem/TFOpenMEMStrictModelLoaderAndTransfer$checkDataTransformer$2$1.class */
final class TFOpenMEMStrictModelLoaderAndTransfer$checkDataTransformer$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    int label;

    public TFOpenMEMStrictModelLoaderAndTransfer$checkDataTransformer$2$1(Continuation<? super TFOpenMEMStrictModelLoaderAndTransfer$checkDataTransformer$2$1> continuation) {
        super(2, continuation);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TFOpenMEMStrictModelLoaderAndTransfer$checkDataTransformer$2$1(continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws IOException {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        b bVar = b.f110799a;
        if (b.f110803e != null) {
            return Boxing.boxBoolean(true);
        }
        File file = b.f110802d;
        if (file == null) {
            return Boxing.boxBoolean(false);
        }
        com.bilibili.tensorflow.utils.b bVar2 = new com.bilibili.tensorflow.utils.b(new InputStreamReader(new FileInputStream(file)));
        b.f110803e = bVar2;
        bVar2.a();
        return Boxing.boxBoolean(true);
    }
}
