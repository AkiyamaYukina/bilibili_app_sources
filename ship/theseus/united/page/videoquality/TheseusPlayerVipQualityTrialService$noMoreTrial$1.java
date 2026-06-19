package com.bilibili.ship.theseus.united.page.videoquality;

import com.bilibili.playerbizcommonv2.api.VipTrialApiServiceKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import lv0.C7893a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusPlayerVipQualityTrialService$noMoreTrial$1.class */
public final class TheseusPlayerVipQualityTrialService$noMoreTrial$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final vk.e $trialInfo;
    int label;
    final TheseusPlayerVipQualityTrialService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusPlayerVipQualityTrialService$noMoreTrial$1(vk.e eVar, TheseusPlayerVipQualityTrialService theseusPlayerVipQualityTrialService, Continuation<? super TheseusPlayerVipQualityTrialService$noMoreTrial$1> continuation) {
        super(2, continuation);
        this.$trialInfo = eVar;
        this.this$0 = theseusPlayerVipQualityTrialService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TheseusPlayerVipQualityTrialService$noMoreTrial$1(this.$trialInfo, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            vk.e eVar = this.$trialInfo;
            C7893a.C1318a c1318aC = this.this$0.f103823j.c();
            Long lBoxLong = c1318aC != null ? Boxing.boxLong(c1318aC.f123395a.f123397a) : null;
            this.label = 1;
            if (VipTrialApiServiceKt.b(eVar, lBoxLong, this) == coroutine_suspended) {
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
