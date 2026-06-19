package com.bilibili.tensorflow.model;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/model/OgvVipCancelPredictTFClient$collectLogDataAndPredict$2$2$2.class */
final class OgvVipCancelPredictTFClient$collectLogDataAndPredict$2$2$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;

    public OgvVipCancelPredictTFClient$collectLogDataAndPredict$2$2$2(Continuation<? super OgvVipCancelPredictTFClient$collectLogDataAndPredict$2$2$2> continuation) {
        super(2, continuation);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvVipCancelPredictTFClient$collectLogDataAndPredict$2$2$2(continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = OgvVipCancelPredictTFClient.f110759f;
        if (CoroutineScopeKt.isActive(coroutineScope)) {
            CoroutineScopeKt.cancel$default(coroutineScope, (CancellationException) null, 1, (Object) null);
        }
        return Unit.INSTANCE;
    }
}
