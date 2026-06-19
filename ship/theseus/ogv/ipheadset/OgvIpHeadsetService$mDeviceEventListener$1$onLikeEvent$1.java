package com.bilibili.ship.theseus.ogv.ipheadset;

import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/ipheadset/OgvIpHeadsetService$mDeviceEventListener$1$onLikeEvent$1.class */
public final class OgvIpHeadsetService$mDeviceEventListener$1$onLikeEvent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Context $context;
    final Function0<Unit> $onLikeSuccess;
    int label;
    final OgvIpHeadsetService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvIpHeadsetService$mDeviceEventListener$1$onLikeEvent$1(OgvIpHeadsetService ogvIpHeadsetService, Context context, Function0<Unit> function0, Continuation<? super OgvIpHeadsetService$mDeviceEventListener$1$onLikeEvent$1> continuation) {
        super(2, continuation);
        this.this$0 = ogvIpHeadsetService;
        this.$context = context;
        this.$onLikeSuccess = function0;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvIpHeadsetService$mDeviceEventListener$1$onLikeEvent$1(this.this$0, this.$context, this.$onLikeSuccess, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0192  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 451
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.ipheadset.OgvIpHeadsetService$mDeviceEventListener$1$onLikeEvent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
