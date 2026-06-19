package com.bilibili.tensorflow.model.mem;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/model/mem/OgvOpenMembershipPredictTFClient$startOpenMembershipPredict$1.class */
public final class OgvOpenMembershipPredictTFClient$startOpenMembershipPredict$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;

    public OgvOpenMembershipPredictTFClient$startOpenMembershipPredict$1(Continuation<? super OgvOpenMembershipPredictTFClient$startOpenMembershipPredict$1> continuation) {
        super(2, continuation);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvOpenMembershipPredictTFClient$startOpenMembershipPredict$1(continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r9 = r0
            r0 = r5
            int r0 = r0.label
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L30
            r0 = r7
            r1 = 1
            if (r0 == r1) goto L29
            r0 = r7
            r1 = 2
            if (r0 != r1) goto L1f
            r0 = r6
            kotlin.ResultKt.throwOnFailure(r0)
            goto La5
        L1f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L29:
            r0 = r6
            kotlin.ResultKt.throwOnFailure(r0)
            goto L54
        L30:
            r0 = r6
            kotlin.ResultKt.throwOnFailure(r0)
            com.bilibili.tensorflow.model.mem.OgvOpenMembershipPredictTFClient r0 = com.bilibili.tensorflow.model.mem.OgvOpenMembershipPredictTFClient.f110788a
            r6 = r0
            boolean r0 = com.bilibili.tensorflow.model.mem.OgvOpenMembershipPredictTFClient.g()
            if (r0 == 0) goto La5
            r0 = r5
            r1 = 1
            r0.label = r1
            r0 = r6
            r1 = r5
            java.lang.Object r0 = com.bilibili.tensorflow.model.mem.OgvOpenMembershipPredictTFClient.a(r0, r1)
            r8 = r0
            r0 = r8
            r6 = r0
            r0 = r8
            r1 = r9
            if (r0 != r1) goto L54
            r0 = r9
            return r0
        L54:
            r0 = r6
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            com.bilibili.tensorflow.model.mem.OgvOpenMembershipPredictTFClient.h = r0
            boolean r0 = com.bilibili.tensorflow.model.mem.OgvOpenMembershipPredictTFClient.f110793f
            if (r0 != 0) goto La5
            com.bilibili.lib.accountinfo.BiliAccountInfo$Companion r0 = com.bilibili.lib.accountinfo.BiliAccountInfo.Companion
            com.bilibili.lib.accountinfo.BiliAccountInfo r0 = r0.get()
            com.bilibili.lib.accountinfo.model.AccountInfo r0 = r0.getAccountInfoFromCache()
            r6 = r0
            r0 = r6
            if (r0 == 0) goto La5
            r0 = r6
            long r0 = r0.getMid()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto La5
            r0 = r6
            com.bilibili.lib.accountinfo.model.VipUserInfo r0 = r0.getVipInfo()
            r6 = r0
            r0 = r6
            if (r0 == 0) goto La5
            r0 = r6
            boolean r0 = r0.isEffectiveVip()
            if (r0 != 0) goto La5
            r0 = 1
            com.bilibili.tensorflow.model.mem.OgvOpenMembershipPredictTFClient.f110793f = r0
            com.bilibili.tensorflow.model.mem.OgvOpenMembershipPredictTFClient r0 = com.bilibili.tensorflow.model.mem.OgvOpenMembershipPredictTFClient.f110788a
            r6 = r0
            r0 = r5
            r1 = 2
            r0.label = r1
            r0 = r6
            r1 = r5
            java.lang.Object r0 = com.bilibili.tensorflow.model.mem.OgvOpenMembershipPredictTFClient.e(r0, r1)
            r1 = r9
            if (r0 != r1) goto La5
            r0 = r9
            return r0
        La5:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tensorflow.model.mem.OgvOpenMembershipPredictTFClient$startOpenMembershipPredict$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
