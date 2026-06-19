package com.bilibili.upper.module.manuscript.vm;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/vm/ProblemShowViewModel$queryAppealState$1.class */
public final class ProblemShowViewModel$queryAppealState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final ProblemShowViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProblemShowViewModel$queryAppealState$1(ProblemShowViewModel problemShowViewModel, Continuation<? super ProblemShowViewModel$queryAppealState$1> continuation) {
        super(2, continuation);
        this.this$0 = problemShowViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ProblemShowViewModel$queryAppealState$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:21:0x009e
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r10 = r0
            r0 = r4
            int r0 = r0.label
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L24
            r0 = r6
            r1 = 1
            if (r0 != r1) goto L1a
            r0 = r5
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Exception -> L9e
            goto L8a
        L1a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L24:
            r0 = r5
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r4
            com.bilibili.upper.module.manuscript.vm.ProblemShowViewModel r0 = r0.this$0     // Catch: java.lang.Exception -> L9e
            long r0 = r0.h     // Catch: java.lang.Exception -> L9e
            r7 = r0
            r0 = r4
            r1 = 1
            r0.label = r1     // Catch: java.lang.Exception -> L9e
            kotlinx.coroutines.CancellableContinuationImpl r0 = new kotlinx.coroutines.CancellableContinuationImpl     // Catch: java.lang.Exception -> L9e
            r9 = r0
            r0 = r9
            r1 = r4
            kotlin.coroutines.Continuation r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r1)     // Catch: java.lang.Exception -> L9e
            r2 = 1
            r0.<init>(r1, r2)     // Catch: java.lang.Exception -> L9e
            r0 = r9
            r0.initCancellability()     // Catch: java.lang.Exception -> L9e
            java.lang.Class<com.bilibili.upper.api.service.UpperCenterApiService> r0 = com.bilibili.upper.api.service.UpperCenterApiService.class
            java.lang.Object r0 = com.bilibili.okretro.ServiceGenerator.createService(r0)     // Catch: java.lang.Exception -> L9e
            com.bilibili.upper.api.service.UpperCenterApiService r0 = (com.bilibili.upper.api.service.UpperCenterApiService) r0     // Catch: java.lang.Exception -> L9e
            r1 = r7
            com.bilibili.okretro.call.BiliCall r0 = r0.getAppealReasons(r1)     // Catch: java.lang.Exception -> L9e
            r5 = r0
            JE0.d r0 = new JE0.d     // Catch: java.lang.Exception -> L9e
            r11 = r0
            r0 = r11
            r1 = r9
            r0.<init>(r1)     // Catch: java.lang.Exception -> L9e
            r0 = r5
            r1 = r11
            r0.enqueue(r1)     // Catch: java.lang.Exception -> L9e
            r0 = r9
            java.lang.Object r0 = r0.getResult()     // Catch: java.lang.Exception -> L9e
            r9 = r0
            r0 = r9
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch: java.lang.Exception -> L9e
            if (r0 != r1) goto L7d
            r0 = r4
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)     // Catch: java.lang.Exception -> L9e
        L7d:
            r0 = r9
            r5 = r0
            r0 = r9
            r1 = r10
            if (r0 != r1) goto L8a
            r0 = r10
            return r0
        L8a:
            r0 = r5
            com.bilibili.upper.api.bean.uppercenter.AppealReason r0 = (com.bilibili.upper.api.bean.uppercenter.AppealReason) r0     // Catch: java.lang.Exception -> L9e
            r5 = r0
            r0 = r4
            com.bilibili.upper.module.manuscript.vm.ProblemShowViewModel r0 = r0.this$0     // Catch: java.lang.Exception -> L9e
            androidx.lifecycle.MutableLiveData<com.bilibili.upper.api.bean.uppercenter.AppealReason> r0 = r0.f113707g     // Catch: java.lang.Exception -> L9e
            r1 = r5
            r0.setValue(r1)     // Catch: java.lang.Exception -> L9e
        L9a:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Exception -> L9e
            return r0
        L9e:
            r5 = move-exception
            goto L9a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.manuscript.vm.ProblemShowViewModel$queryAppealState$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
