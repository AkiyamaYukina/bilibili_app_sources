package com.bilibili.ship.theseus.united.player.oldway;

import com.bilibili.player.tangram.basic.PlayNetworkEnv;
import com.bilibili.ship.theseus.united.player.mediaplay.l;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/UnitedGeminiPlayerCommonActionDelegate$getNetworkEnvFlow$1.class */
public final class UnitedGeminiPlayerCommonActionDelegate$getNetworkEnvFlow$1 extends SuspendLambda implements Function2<l, Continuation<? super Flow<? extends PlayNetworkEnv>>, Object> {
    Object L$0;
    int label;

    public UnitedGeminiPlayerCommonActionDelegate$getNetworkEnvFlow$1(Continuation<? super UnitedGeminiPlayerCommonActionDelegate$getNetworkEnvFlow$1> continuation) {
        super(2, continuation);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UnitedGeminiPlayerCommonActionDelegate$getNetworkEnvFlow$1 unitedGeminiPlayerCommonActionDelegate$getNetworkEnvFlow$1 = new UnitedGeminiPlayerCommonActionDelegate$getNetworkEnvFlow$1(continuation);
        unitedGeminiPlayerCommonActionDelegate$getNetworkEnvFlow$1.L$0 = obj;
        return unitedGeminiPlayerCommonActionDelegate$getNetworkEnvFlow$1;
    }

    public final Object invoke(l lVar, Continuation<? super Flow<? extends PlayNetworkEnv>> continuation) {
        return create(lVar, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r0 = r4
            int r0 = r0.label
            if (r0 != 0) goto L3a
            r0 = r5
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r4
            java.lang.Object r0 = r0.L$0
            com.bilibili.ship.theseus.united.player.mediaplay.l r0 = (com.bilibili.ship.theseus.united.player.mediaplay.l) r0
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L31
            r0 = r5
            com.bilibili.ship.theseus.keel.player.j r0 = r0.f104529c
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L31
            r0 = r5
            kotlinx.coroutines.flow.Flow r0 = r0.e()
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r6
            if (r0 != 0) goto L38
        L31:
            com.bilibili.player.tangram.basic.PlayNetworkEnv$b r0 = com.bilibili.player.tangram.basic.PlayNetworkEnv.b.f79289a
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.flowOf(r0)
            r5 = r0
        L38:
            r0 = r5
            return r0
        L3a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.player.oldway.UnitedGeminiPlayerCommonActionDelegate$getNetworkEnvFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
