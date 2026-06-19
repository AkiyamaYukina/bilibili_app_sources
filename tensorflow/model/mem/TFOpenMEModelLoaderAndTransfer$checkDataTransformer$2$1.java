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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/model/mem/TFOpenMEModelLoaderAndTransfer$checkDataTransformer$2$1.class */
final class TFOpenMEModelLoaderAndTransfer$checkDataTransformer$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    int label;

    public TFOpenMEModelLoaderAndTransfer$checkDataTransformer$2$1(Continuation<? super TFOpenMEModelLoaderAndTransfer$checkDataTransformer$2$1> continuation) {
        super(2, continuation);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TFOpenMEModelLoaderAndTransfer$checkDataTransformer$2$1(continuation);
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
        c cVar = c.f110805a;
        if (c.f110810f != null) {
            return Boxing.boxBoolean(true);
        }
        File file = c.f110808d;
        if (file == null) {
            return Boxing.boxBoolean(false);
        }
        com.bilibili.tensorflow.utils.b bVar = new com.bilibili.tensorflow.utils.b(new InputStreamReader(new FileInputStream(file)));
        c.f110810f = bVar;
        bVar.a();
        return Boxing.boxBoolean(true);
    }
}
