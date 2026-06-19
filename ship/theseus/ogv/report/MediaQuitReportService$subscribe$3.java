package com.bilibili.ship.theseus.ogv.report;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/report/MediaQuitReportService$subscribe$3.class */
final class MediaQuitReportService$subscribe$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaQuitReportService$subscribe$3(c cVar, Continuation<? super MediaQuitReportService$subscribe$3> continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MediaQuitReportService$subscribe$3(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r8 = r0
            r0 = r4
            int r0 = r0.label
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L30
            r0 = r6
            r1 = 1
            if (r0 == r1) goto L29
            r0 = r6
            r1 = 2
            if (r0 != r1) goto L1f
            r0 = r5
            kotlin.ResultKt.throwOnFailure(r0)
            goto L71
        L1f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L29:
            r0 = r5
            kotlin.ResultKt.throwOnFailure(r0)
            goto L58
        L30:
            r0 = r5
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r4
            com.bilibili.ship.theseus.ogv.report.c r0 = r0.this$0
            com.bilibili.ship.theseus.keel.player.h r0 = r0.f94397b
            kotlinx.coroutines.flow.MutableStateFlow<com.bilibili.ship.theseus.keel.player.j> r0 = r0.f91111e
            kotlinx.coroutines.flow.StateFlow r0 = kotlinx.coroutines.flow.FlowKt.asStateFlow(r0)
            r5 = r0
            r0 = r4
            r1 = 1
            r0.label = r1
            r0 = r5
            r1 = r4
            java.lang.Object r0 = com.bilibili.ogv.infra.coroutine.b.a(r0, r1)
            r7 = r0
            r0 = r7
            r5 = r0
            r0 = r7
            r1 = r8
            if (r0 != r1) goto L58
            r0 = r8
            return r0
        L58:
            r0 = r5
            com.bilibili.ship.theseus.keel.player.j r0 = (com.bilibili.ship.theseus.keel.player.j) r0
            r5 = r0
            r0 = r4
            r1 = 2
            r0.label = r1
            r0 = r5
            r1 = r4
            java.lang.Object r0 = r0.u(r1)
            r1 = r8
            if (r0 != r1) goto L71
            r0 = r8
            return r0
        L71:
            r0 = r4
            com.bilibili.ship.theseus.ogv.report.c r0 = r0.this$0
            com.bilibili.ship.theseus.ogv.report.d r0 = r0.f94400e
            r5 = r0
            r0 = r5
            boolean r0 = r0.f94404d
            if (r0 == 0) goto L88
            r0 = r5
            com.bilibili.ship.theseus.ogv.report.d$c r0 = r0.f94403c
            r1 = 1
            r0.f94419f = r1
        L88:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.report.MediaQuitReportService$subscribe$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
