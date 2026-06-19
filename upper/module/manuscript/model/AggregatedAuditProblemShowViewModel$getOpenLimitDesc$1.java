package com.bilibili.upper.module.manuscript.model;

import JE0.g;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.upper.api.service.UpperCenterApiService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/model/AggregatedAuditProblemShowViewModel$getOpenLimitDesc$1.class */
public final class AggregatedAuditProblemShowViewModel$getOpenLimitDesc$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $aid;
    Object L$0;
    int label;
    final AggregatedAuditProblemShowViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AggregatedAuditProblemShowViewModel$getOpenLimitDesc$1(AggregatedAuditProblemShowViewModel aggregatedAuditProblemShowViewModel, long j7, Continuation<? super AggregatedAuditProblemShowViewModel$getOpenLimitDesc$1> continuation) {
        super(2, continuation);
        this.this$0 = aggregatedAuditProblemShowViewModel;
        this.$aid = j7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AggregatedAuditProblemShowViewModel$getOpenLimitDesc$1(this.this$0, this.$aid, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object result;
        AggregatedAuditProblemShowViewModel aggregatedAuditProblemShowViewModel;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            AggregatedAuditProblemShowViewModel aggregatedAuditProblemShowViewModel2 = this.this$0;
            long j7 = this.$aid;
            this.L$0 = aggregatedAuditProblemShowViewModel2;
            this.label = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            ((UpperCenterApiService) ServiceGenerator.createService(UpperCenterApiService.class)).getOpenDesc(j7).enqueue(new g(cancellableContinuationImpl));
            result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            if (result == coroutine_suspended) {
                return coroutine_suspended;
            }
            aggregatedAuditProblemShowViewModel = aggregatedAuditProblemShowViewModel2;
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aggregatedAuditProblemShowViewModel = (AggregatedAuditProblemShowViewModel) this.L$0;
            ResultKt.throwOnFailure(obj);
            result = obj;
        }
        aggregatedAuditProblemShowViewModel.f113659j = (String) result;
        return Unit.INSTANCE;
    }
}
