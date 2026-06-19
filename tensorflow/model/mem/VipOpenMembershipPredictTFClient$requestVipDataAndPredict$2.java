package com.bilibili.tensorflow.model.mem;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/model/mem/VipOpenMembershipPredictTFClient$requestVipDataAndPredict$2.class */
final class VipOpenMembershipPredictTFClient$requestVipDataAndPredict$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final CompletableDeferred<String> $result;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VipOpenMembershipPredictTFClient$requestVipDataAndPredict$2(CompletableDeferred<String> completableDeferred, Continuation<? super VipOpenMembershipPredictTFClient$requestVipDataAndPredict$2> continuation) {
        super(2, continuation);
        this.$result = completableDeferred;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VipOpenMembershipPredictTFClient$requestVipDataAndPredict$2(this.$result, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tensorflow.model.mem.VipOpenMembershipPredictTFClient$requestVipDataAndPredict$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
