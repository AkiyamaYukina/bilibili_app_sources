package com.bilibili.netquality;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/netquality/NetworkQualityAnalyse$setup$1.class */
final class NetworkQualityAnalyse$setup$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final d<a> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkQualityAnalyse$setup$1(d<a> dVar, Continuation<? super NetworkQualityAnalyse$setup$1> continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NetworkQualityAnalyse$setup$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0041 -> B:14:0x0047). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.netquality.NetworkQualityAnalyse$setup$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
