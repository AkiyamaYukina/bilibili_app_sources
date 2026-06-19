package com.bilibili.tensorflow.model.mem;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/model/mem/OgvOpenMembershipPredictTFClient$requestVipDataAndPredict$1.class */
final class OgvOpenMembershipPredictTFClient$requestVipDataAndPredict$1 extends ContinuationImpl {
    int label;
    Object result;
    final OgvOpenMembershipPredictTFClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvOpenMembershipPredictTFClient$requestVipDataAndPredict$1(OgvOpenMembershipPredictTFClient ogvOpenMembershipPredictTFClient, Continuation<? super OgvOpenMembershipPredictTFClient$requestVipDataAndPredict$1> continuation) {
        super(continuation);
        this.this$0 = ogvOpenMembershipPredictTFClient;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return OgvOpenMembershipPredictTFClient.e(this.this$0, this);
    }
}
