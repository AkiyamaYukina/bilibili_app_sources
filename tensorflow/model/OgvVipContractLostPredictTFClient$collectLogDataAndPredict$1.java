package com.bilibili.tensorflow.model;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/model/OgvVipContractLostPredictTFClient$collectLogDataAndPredict$1.class */
final class OgvVipContractLostPredictTFClient$collectLogDataAndPredict$1 extends ContinuationImpl {
    int label;
    Object result;
    final OgvVipContractLostPredictTFClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvVipContractLostPredictTFClient$collectLogDataAndPredict$1(OgvVipContractLostPredictTFClient ogvVipContractLostPredictTFClient, Continuation<? super OgvVipContractLostPredictTFClient$collectLogDataAndPredict$1> continuation) {
        super(continuation);
        this.this$0 = ogvVipContractLostPredictTFClient;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(this);
    }
}
