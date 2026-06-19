package com.bilibili.upper.module.manuscript.model;

import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.upper.api.bean.uppercenter.AppealReason;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/model/ArchiveAppealViewModel$queryAppealState$1.class */
public final class ArchiveAppealViewModel$queryAppealState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $queryId;
    int label;
    final ArchiveAppealViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArchiveAppealViewModel$queryAppealState$1(long j7, ArchiveAppealViewModel archiveAppealViewModel, Continuation<? super ArchiveAppealViewModel$queryAppealState$1> continuation) {
        super(2, continuation);
        this.$queryId = j7;
        this.this$0 = archiveAppealViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ArchiveAppealViewModel$queryAppealState$1(this.$queryId, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            long j7 = this.$queryId;
            this.label = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            ((UpperCenterApiService) ServiceGenerator.createService(UpperCenterApiService.class)).getAppealReasons(j7).enqueue(new JE0.d(cancellableContinuationImpl));
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            obj = result;
            if (result == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.this$0.f113662d.setValue((AppealReason) obj);
        return Unit.INSTANCE;
    }
}
