package com.bilibili.tensorflow.model.mem;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/model/mem/VipOpenMembershipPredictTFClient$processUserFeatureLocalDataByTime$1.class */
final class VipOpenMembershipPredictTFClient$processUserFeatureLocalDataByTime$1 extends ContinuationImpl {
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    Object result;
    final VipOpenMembershipPredictTFClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VipOpenMembershipPredictTFClient$processUserFeatureLocalDataByTime$1(VipOpenMembershipPredictTFClient vipOpenMembershipPredictTFClient, Continuation<? super VipOpenMembershipPredictTFClient$processUserFeatureLocalDataByTime$1> continuation) {
        super(continuation);
        this.this$0 = vipOpenMembershipPredictTFClient;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.f(0L, null, this);
    }
}
