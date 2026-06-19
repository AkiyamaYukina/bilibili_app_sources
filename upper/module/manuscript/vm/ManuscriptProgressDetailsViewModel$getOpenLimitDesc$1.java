package com.bilibili.upper.module.manuscript.vm;

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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/vm/ManuscriptProgressDetailsViewModel$getOpenLimitDesc$1.class */
public final class ManuscriptProgressDetailsViewModel$getOpenLimitDesc$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $aid;
    Object L$0;
    int label;
    final ManuscriptProgressDetailsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManuscriptProgressDetailsViewModel$getOpenLimitDesc$1(ManuscriptProgressDetailsViewModel manuscriptProgressDetailsViewModel, long j7, Continuation<? super ManuscriptProgressDetailsViewModel$getOpenLimitDesc$1> continuation) {
        super(2, continuation);
        this.this$0 = manuscriptProgressDetailsViewModel;
        this.$aid = j7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ManuscriptProgressDetailsViewModel$getOpenLimitDesc$1(this.this$0, this.$aid, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object result;
        ManuscriptProgressDetailsViewModel manuscriptProgressDetailsViewModel;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ManuscriptProgressDetailsViewModel manuscriptProgressDetailsViewModel2 = this.this$0;
            long j7 = this.$aid;
            this.L$0 = manuscriptProgressDetailsViewModel2;
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
            manuscriptProgressDetailsViewModel = manuscriptProgressDetailsViewModel2;
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            manuscriptProgressDetailsViewModel = (ManuscriptProgressDetailsViewModel) this.L$0;
            ResultKt.throwOnFailure(obj);
            result = obj;
        }
        manuscriptProgressDetailsViewModel.f113695r = (String) result;
        return Unit.INSTANCE;
    }
}
