package com.bilibili.tensorflow.model.mem;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/model/mem/OgvOpenMembershipPredictTFClient$requestVipDataAndPredict$2$emit$1.class */
public final class OgvOpenMembershipPredictTFClient$requestVipDataAndPredict$2$emit$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    Object result;
    final OgvOpenMembershipPredictTFClient$requestVipDataAndPredict$2<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OgvOpenMembershipPredictTFClient$requestVipDataAndPredict$2$emit$1(OgvOpenMembershipPredictTFClient$requestVipDataAndPredict$2<? super T> ogvOpenMembershipPredictTFClient$requestVipDataAndPredict$2, Continuation<? super OgvOpenMembershipPredictTFClient$requestVipDataAndPredict$2$emit$1> continuation) {
        super(continuation);
        this.this$0 = ogvOpenMembershipPredictTFClient$requestVipDataAndPredict$2;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, (Continuation<? super Unit>) this);
    }
}
