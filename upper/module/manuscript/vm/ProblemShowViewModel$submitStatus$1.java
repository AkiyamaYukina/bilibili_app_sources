package com.bilibili.upper.module.manuscript.vm;

import JE0.k;
import com.bilibili.base.BiliContext;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.upper.api.bean.uppercenter.UpperLimitReasons;
import com.bilibili.upper.api.service.UpperCenterApiService;
import eJ0.H;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/vm/ProblemShowViewModel$submitStatus$1.class */
public final class ProblemShowViewModel$submitStatus$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final int $explainEvaluation;
    final int $position;
    final String $reason;
    final String $reasonDetail;
    final long $reasonId;
    int label;
    final ProblemShowViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProblemShowViewModel$submitStatus$1(ProblemShowViewModel problemShowViewModel, long j7, int i7, String str, String str2, int i8, Continuation<? super ProblemShowViewModel$submitStatus$1> continuation) {
        super(2, continuation);
        this.this$0 = problemShowViewModel;
        this.$reasonId = j7;
        this.$explainEvaluation = i7;
        this.$reason = str;
        this.$reasonDetail = str2;
        this.$position = i8;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ProblemShowViewModel$submitStatus$1(this.this$0, this.$reasonId, this.$explainEvaluation, this.$reason, this.$reasonDetail, this.$position, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        boolean zBooleanValue;
        List list;
        UpperLimitReasons.LimitReason limitReason;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                long j7 = this.this$0.h;
                long j8 = this.$reasonId;
                int i8 = this.$explainEvaluation;
                String str = this.$reason;
                String str2 = this.$reasonDetail;
                this.label = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
                cancellableContinuationImpl.initCancellability();
                ((UpperCenterApiService) ServiceGenerator.createService(UpperCenterApiService.class)).submitLimitFeedback(j7, j8, i8, str, str2).enqueue(new k(cancellableContinuationImpl));
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
            zBooleanValue = ((Boolean) obj).booleanValue();
        } catch (Exception e7) {
            zBooleanValue = false;
        }
        if (zBooleanValue) {
            UpperLimitReasons value = this.this$0.f113702b.getValue();
            if (value != null && (list = value.reasons) != null && (limitReason = (UpperLimitReasons.LimitReason) CollectionsKt.getOrNull(list, this.$position)) != null) {
                limitReason.solve = this.$explainEvaluation;
            }
            this.this$0.f113705e.setValue(Boxing.boxInt(this.$position));
            H.a(2131849779, BiliContext.application());
        } else {
            H.a(2131849224, BiliContext.application());
        }
        this.this$0.f113712m = false;
        return Unit.INSTANCE;
    }
}
