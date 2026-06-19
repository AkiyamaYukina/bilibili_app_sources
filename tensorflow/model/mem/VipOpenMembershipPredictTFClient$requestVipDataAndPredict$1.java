package com.bilibili.tensorflow.model.mem;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/model/mem/VipOpenMembershipPredictTFClient$requestVipDataAndPredict$1.class */
final class VipOpenMembershipPredictTFClient$requestVipDataAndPredict$1 extends ContinuationImpl {
    int label;
    Object result;
    final VipOpenMembershipPredictTFClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VipOpenMembershipPredictTFClient$requestVipDataAndPredict$1(VipOpenMembershipPredictTFClient vipOpenMembershipPredictTFClient, Continuation<? super VipOpenMembershipPredictTFClient$requestVipDataAndPredict$1> continuation) {
        super(continuation);
        this.this$0 = vipOpenMembershipPredictTFClient;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return VipOpenMembershipPredictTFClient.b(this.this$0, this);
    }
}
