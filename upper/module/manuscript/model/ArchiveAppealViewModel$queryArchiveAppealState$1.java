package com.bilibili.upper.module.manuscript.model;

import JE0.e;
import androidx.lifecycle.MutableLiveData;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.upper.api.bean.uppercenter.UpperLimitReasons;
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
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/model/ArchiveAppealViewModel$queryArchiveAppealState$1.class */
public final class ArchiveAppealViewModel$queryArchiveAppealState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $queryId;
    int label;
    final ArchiveAppealViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArchiveAppealViewModel$queryArchiveAppealState$1(long j7, ArchiveAppealViewModel archiveAppealViewModel, Continuation<? super ArchiveAppealViewModel$queryArchiveAppealState$1> continuation) {
        super(2, continuation);
        this.$queryId = j7;
        this.this$0 = archiveAppealViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ArchiveAppealViewModel$queryArchiveAppealState$1(this.$queryId, this.this$0, continuation);
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
            ((UpperCenterApiService) ServiceGenerator.createService(UpperCenterApiService.class)).getLimitReasons(j7).enqueue(new e(cancellableContinuationImpl));
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
        UpperLimitReasons upperLimitReasons = (UpperLimitReasons) obj;
        MutableLiveData<a> mutableLiveData = this.this$0.f113661c;
        a aVar = new a(this.$queryId, upperLimitReasons.appealURL, upperLimitReasons.appealState);
        BLog.i("ArchiveAppealViewModel", "queryAppealState back, " + aVar);
        mutableLiveData.setValue(aVar);
        return Unit.INSTANCE;
    }
}
