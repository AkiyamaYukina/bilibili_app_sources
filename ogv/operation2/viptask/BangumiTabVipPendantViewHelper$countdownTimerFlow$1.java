package com.bilibili.ogv.operation2.viptask;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/viptask/BangumiTabVipPendantViewHelper$countdownTimerFlow$1.class */
final class BangumiTabVipPendantViewHelper$countdownTimerFlow$1 extends SuspendLambda implements Function2<FlowCollector<? super Long>, Continuation<? super Unit>, Object> {
    final long $interval;
    final long $totalTime;
    long J$0;
    private Object L$0;
    int label;
    final a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BangumiTabVipPendantViewHelper$countdownTimerFlow$1(long j7, long j8, a aVar, Continuation<? super BangumiTabVipPendantViewHelper$countdownTimerFlow$1> continuation) {
        super(2, continuation);
        this.$totalTime = j7;
        this.$interval = j8;
        this.this$0 = aVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BangumiTabVipPendantViewHelper$countdownTimerFlow$1 bangumiTabVipPendantViewHelper$countdownTimerFlow$1 = new BangumiTabVipPendantViewHelper$countdownTimerFlow$1(this.$totalTime, this.$interval, this.this$0, continuation);
        bangumiTabVipPendantViewHelper$countdownTimerFlow$1.L$0 = obj;
        return bangumiTabVipPendantViewHelper$countdownTimerFlow$1;
    }

    public final Object invoke(FlowCollector<? super Long> flowCollector, Continuation<? super Unit> continuation) {
        return create(flowCollector, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0063 A[PHI: r6 r8
  0x0063: PHI (r6v3 kotlinx.coroutines.flow.FlowCollector) = (r6v1 kotlinx.coroutines.flow.FlowCollector), (r6v4 kotlinx.coroutines.flow.FlowCollector) binds: [B:13:0x0052, B:25:0x00c5] A[DONT_GENERATE, DONT_INLINE]
  0x0063: PHI (r8v2 long) = (r8v0 long), (r8v4 long) binds: [B:13:0x0052, B:25:0x00c5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00af  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00ac -> B:24:0x00b2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.operation2.viptask.BangumiTabVipPendantViewHelper$countdownTimerFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
