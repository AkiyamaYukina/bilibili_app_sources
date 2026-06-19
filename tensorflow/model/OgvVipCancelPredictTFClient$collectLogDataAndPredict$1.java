package com.bilibili.tensorflow.model;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/model/OgvVipCancelPredictTFClient$collectLogDataAndPredict$1.class */
final class OgvVipCancelPredictTFClient$collectLogDataAndPredict$1 extends ContinuationImpl {
    int label;
    Object result;
    final OgvVipCancelPredictTFClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvVipCancelPredictTFClient$collectLogDataAndPredict$1(OgvVipCancelPredictTFClient ogvVipCancelPredictTFClient, Continuation<? super OgvVipCancelPredictTFClient$collectLogDataAndPredict$1> continuation) {
        super(continuation);
        this.this$0 = ogvVipCancelPredictTFClient;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return OgvVipCancelPredictTFClient.a(this.this$0, this);
    }
}
