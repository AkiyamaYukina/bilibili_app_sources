package com.bilibili.tensorflow.model;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/model/OgvVipCancelPredictTFClient$collectLogDataAndPredict$2$emit$1.class */
public final class OgvVipCancelPredictTFClient$collectLogDataAndPredict$2$emit$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final OgvVipCancelPredictTFClient$collectLogDataAndPredict$2<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OgvVipCancelPredictTFClient$collectLogDataAndPredict$2$emit$1(OgvVipCancelPredictTFClient$collectLogDataAndPredict$2<? super T> ogvVipCancelPredictTFClient$collectLogDataAndPredict$2, Continuation<? super OgvVipCancelPredictTFClient$collectLogDataAndPredict$2$emit$1> continuation) {
        super(continuation);
        this.this$0 = ogvVipCancelPredictTFClient$collectLogDataAndPredict$2;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, (Continuation<? super Unit>) this);
    }
}
