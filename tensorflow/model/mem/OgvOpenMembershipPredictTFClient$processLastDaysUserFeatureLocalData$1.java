package com.bilibili.tensorflow.model.mem;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/model/mem/OgvOpenMembershipPredictTFClient$processLastDaysUserFeatureLocalData$1.class */
final class OgvOpenMembershipPredictTFClient$processLastDaysUserFeatureLocalData$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    Object result;
    final OgvOpenMembershipPredictTFClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvOpenMembershipPredictTFClient$processLastDaysUserFeatureLocalData$1(OgvOpenMembershipPredictTFClient ogvOpenMembershipPredictTFClient, Continuation<? super OgvOpenMembershipPredictTFClient$processLastDaysUserFeatureLocalData$1> continuation) {
        super(continuation);
        this.this$0 = ogvOpenMembershipPredictTFClient;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return OgvOpenMembershipPredictTFClient.c(this.this$0, this);
    }
}
