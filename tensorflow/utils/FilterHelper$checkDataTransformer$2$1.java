package com.bilibili.tensorflow.utils;

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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/utils/FilterHelper$checkDataTransformer$2$1.class */
final class FilterHelper$checkDataTransformer$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    int label;
    final c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilterHelper$checkDataTransformer$2$1(c cVar, Continuation<? super FilterHelper$checkDataTransformer$2$1> continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FilterHelper$checkDataTransformer$2$1(this.this$0, continuation);
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
        c cVar = this.this$0;
        if (cVar.f110818b != null) {
            return Boxing.boxBoolean(true);
        }
        cVar.f110818b = new b(new InputStreamReader(new FileInputStream(this.this$0.f110817a)));
        b bVar = this.this$0.f110818b;
        if (bVar != null) {
            bVar.a();
        }
        return Boxing.boxBoolean(true);
    }
}
