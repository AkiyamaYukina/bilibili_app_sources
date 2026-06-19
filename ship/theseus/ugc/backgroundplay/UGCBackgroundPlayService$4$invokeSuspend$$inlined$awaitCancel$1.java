package com.bilibili.ship.theseus.ugc.backgroundplay;

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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/backgroundplay/UGCBackgroundPlayService$4$invokeSuspend$$inlined$awaitCancel$1.class */
public final class UGCBackgroundPlayService$4$invokeSuspend$$inlined$awaitCancel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final UGCBackgroundPlayService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UGCBackgroundPlayService$4$invokeSuspend$$inlined$awaitCancel$1(Continuation continuation, UGCBackgroundPlayService uGCBackgroundPlayService) {
        super(2, continuation);
        this.this$0 = uGCBackgroundPlayService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UGCBackgroundPlayService$4$invokeSuspend$$inlined$awaitCancel$1(continuation, this.this$0);
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
            UGCBackgroundPlayService uGCBackgroundPlayService = this.this$0;
            uGCBackgroundPlayService.f96303b.f98997f = false;
            BLog.i("UGCBackgroundPlayService-removeListener", "[theseus-ugc-UGCBackgroundPlayService-removeListener] removeListener");
            uGCBackgroundPlayService.f96312l.removePlayerSettingChangeObserver(uGCBackgroundPlayService.f96315o);
            uGCBackgroundPlayService.h.unregisterPlayerProgressRangeObserver(uGCBackgroundPlayService.f96316p);
            throw th;
        }
    }
}
