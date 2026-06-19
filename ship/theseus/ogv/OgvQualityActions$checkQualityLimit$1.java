package com.bilibili.ship.theseus.ogv;

import com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerVo;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/OgvQualityActions$checkQualityLimit$1.class */
public final class OgvQualityActions$checkQualityLimit$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final RestrictionLayerVo $qualityLimit;
    int label;
    final OgvQualityActions this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvQualityActions$checkQualityLimit$1(OgvQualityActions ogvQualityActions, RestrictionLayerVo restrictionLayerVo, Continuation<? super OgvQualityActions$checkQualityLimit$1> continuation) {
        super(2, continuation);
        this.this$0 = ogvQualityActions;
        this.$qualityLimit = restrictionLayerVo;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvQualityActions$checkQualityLimit$1(this.this$0, this.$qualityLimit, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            OgvQualityActions ogvQualityActions = this.this$0;
            RestrictionLayerVo restrictionLayerVo = this.$qualityLimit;
            this.label = 1;
            if (OgvQualityActions.h(ogvQualityActions, restrictionLayerVo, this) == coroutine_suspended) {
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
