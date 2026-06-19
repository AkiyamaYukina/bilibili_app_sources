package com.bilibili.upper.module.manuscript.vm;

import JE0.e;
import androidx.lifecycle.MutableLiveData;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.upper.api.bean.uppercenter.UpperLimitReasons;
import com.bilibili.upper.api.service.UpperCenterApiService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/vm/ProblemShowViewModel$getData$1.class */
public final class ProblemShowViewModel$getData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final ProblemShowViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProblemShowViewModel$getData$1(ProblemShowViewModel problemShowViewModel, Continuation<? super ProblemShowViewModel$getData$1> continuation) {
        super(2, continuation);
        this.this$0 = problemShowViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ProblemShowViewModel$getData$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object result;
        MutableLiveData<UpperLimitReasons> mutableLiveData;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                ProblemShowViewModel problemShowViewModel = this.this$0;
                MutableLiveData<UpperLimitReasons> mutableLiveData2 = problemShowViewModel.f113702b;
                long j7 = problemShowViewModel.h;
                this.L$0 = mutableLiveData2;
                this.label = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
                cancellableContinuationImpl.initCancellability();
                ((UpperCenterApiService) ServiceGenerator.createService(UpperCenterApiService.class)).getLimitReasons(j7).enqueue(new e(cancellableContinuationImpl));
                result = cancellableContinuationImpl.getResult();
                if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(this);
                }
                if (result == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableLiveData = mutableLiveData2;
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableLiveData = (MutableLiveData) this.L$0;
                ResultKt.throwOnFailure(obj);
                result = obj;
            }
            mutableLiveData.setValue(result);
        } catch (Exception e7) {
            this.this$0.f113706f.setValue(Boxing.boxBoolean(true));
        }
        return Unit.INSTANCE;
    }
}
