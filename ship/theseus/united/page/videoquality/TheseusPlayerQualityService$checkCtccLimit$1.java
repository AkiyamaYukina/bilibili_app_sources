package com.bilibili.ship.theseus.united.page.videoquality;

import com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerVo;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusPlayerQualityService$checkCtccLimit$1.class */
final class TheseusPlayerQualityService$checkCtccLimit$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final RestrictionLayerVo $qualityLimit;
    int label;
    final TheseusPlayerQualityService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusPlayerQualityService$checkCtccLimit$1(TheseusPlayerQualityService theseusPlayerQualityService, RestrictionLayerVo restrictionLayerVo, Continuation<? super TheseusPlayerQualityService$checkCtccLimit$1> continuation) {
        super(2, continuation);
        this.this$0 = theseusPlayerQualityService;
        this.$qualityLimit = restrictionLayerVo;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TheseusPlayerQualityService$checkCtccLimit$1(this.this$0, this.$qualityLimit, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            TheseusPlayerQualityService theseusPlayerQualityService = this.this$0;
            RestrictionLayerVo restrictionLayerVo = this.$qualityLimit;
            this.label = 1;
            if (TheseusPlayerQualityService.a(theseusPlayerQualityService, restrictionLayerVo, this) == coroutine_suspended) {
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
