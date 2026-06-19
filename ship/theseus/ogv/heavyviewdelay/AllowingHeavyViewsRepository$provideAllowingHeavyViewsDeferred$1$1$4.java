package com.bilibili.ship.theseus.ogv.heavyviewdelay;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.DelayKt;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/heavyviewdelay/AllowingHeavyViewsRepository$provideAllowingHeavyViewsDeferred$1$1$4.class */
public final class AllowingHeavyViewsRepository$provideAllowingHeavyViewsDeferred$1$1$4 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    int label;

    public AllowingHeavyViewsRepository$provideAllowingHeavyViewsDeferred$1$1$4(Continuation<? super AllowingHeavyViewsRepository$provideAllowingHeavyViewsDeferred$1$1$4> continuation) {
        super(1, continuation);
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new AllowingHeavyViewsRepository$provideAllowingHeavyViewsDeferred$1$1$4(continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (DelayKt.delay(2000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        BLog.i("AllowingHeavyViewsRepository$provideAllowingHeavyViewsDeferred$1$1$4-invokeSuspend", "[theseus-ogv-AllowingHeavyViewsRepository$provideAllowingHeavyViewsDeferred$1$1$4-invokeSuspend] Allowing heavy views on deadline.");
        return Unit.INSTANCE;
    }
}
