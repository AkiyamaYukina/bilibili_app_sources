package com.bilibili.upper.module.manuscript.vm;

import androidx.lifecycle.MutableLiveData;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.upper.api.bean.manuscript.ArchivePre;
import com.bilibili.upper.api.service.UpperCenterApiService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/vm/ManuscriptListViewModel$getDataFromNet$1.class */
public final class ManuscriptListViewModel$getDataFromNet$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final ManuscriptListViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManuscriptListViewModel$getDataFromNet$1(ManuscriptListViewModel manuscriptListViewModel, Continuation<? super ManuscriptListViewModel$getDataFromNet$1> continuation) {
        super(2, continuation);
        this.this$0 = manuscriptListViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ManuscriptListViewModel$getDataFromNet$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object result;
        MutableLiveData<ArchivePre> mutableLiveData;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            MutableLiveData<ArchivePre> mutableLiveData2 = this.this$0.f113678c;
            this.L$0 = mutableLiveData2;
            this.label = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            BiliCall archivePre = ((UpperCenterApiService) ServiceGenerator.createService(UpperCenterApiService.class)).getArchivePre(1);
            if (archivePre != null) {
                archivePre.enqueue(new a(cancellableContinuationImpl));
            }
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
        ManuscriptListViewModel manuscriptListViewModel = this.this$0;
        manuscriptListViewModel.getClass();
        BuildersKt.launch$default(manuscriptListViewModel.f29514a, Dispatchers.getIO(), (CoroutineStart) null, new ManuscriptListViewModel$saveDataInLocal$1(manuscriptListViewModel, null), 2, (Object) null);
        return Unit.INSTANCE;
    }
}
