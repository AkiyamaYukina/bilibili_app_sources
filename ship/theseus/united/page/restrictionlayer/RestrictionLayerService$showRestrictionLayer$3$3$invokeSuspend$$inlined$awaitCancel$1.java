package com.bilibili.ship.theseus.united.page.restrictionlayer;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/RestrictionLayerService$showRestrictionLayer$3$3$invokeSuspend$$inlined$awaitCancel$1.class */
public final class RestrictionLayerService$showRestrictionLayer$3$3$invokeSuspend$$inlined$awaitCancel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final M $layerViewModel$inlined;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RestrictionLayerService$showRestrictionLayer$3$3$invokeSuspend$$inlined$awaitCancel$1(Continuation continuation, M m7) {
        super(2, continuation);
        this.$layerViewModel$inlined = m7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RestrictionLayerService$showRestrictionLayer$3$3$invokeSuspend$$inlined$awaitCancel$1(continuation, this.$layerViewModel$inlined);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        } catch (Throwable th) {
            BLog.i("RestrictionLayerService$showRestrictionLayer$3$3$invokeSuspend$$inlined$awaitCancel$1-invokeSuspend", "[theseus-united-RestrictionLayerService$showRestrictionLayer$3$3$invokeSuspend$$inlined$awaitCancel$1-invokeSuspend] countdown canceled.");
            this.$layerViewModel$inlined.m();
            throw th;
        }
    }
}
