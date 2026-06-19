package com.bilibili.ship.theseus.ugc.intro.profield;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/profield/UgcProfessionalFieldService$reportExposureEvent$1.class */
final class UgcProfessionalFieldService$reportExposureEvent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final UgcProfessionalFieldService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcProfessionalFieldService$reportExposureEvent$1(UgcProfessionalFieldService ugcProfessionalFieldService, Continuation<? super UgcProfessionalFieldService$reportExposureEvent$1> continuation) {
        super(2, continuation);
        this.this$0 = ugcProfessionalFieldService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UgcProfessionalFieldService$reportExposureEvent$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            UgcProfessionalFieldService ugcProfessionalFieldService = this.this$0;
            this.label = 1;
            ugcProfessionalFieldService.getClass();
            BLog.i("UgcProfessionalFieldService-reportMossShow", "[theseus-ugc-UgcProfessionalFieldService-reportMossShow] try report cert moss show.");
            Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new UgcProfessionalFieldService$reportMossShow$2(ugcProfessionalFieldService, null), this);
            if (objWithContext != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objWithContext = Unit.INSTANCE;
            }
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
