package com.bilibili.ogv.pub.reserve;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/reserve/VipReserveCacheManager$checkStorageToStartReserveCacheCountdown$2.class */
public final class VipReserveCacheManager$checkStorageToStartReserveCacheCountdown$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;

    public VipReserveCacheManager$checkStorageToStartReserveCacheCountdown$2(Continuation<? super VipReserveCacheManager$checkStorageToStartReserveCacheCountdown$2> continuation) {
        super(2, continuation);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VipReserveCacheManager$checkStorageToStartReserveCacheCountdown$2(continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            MutableSharedFlow<Long> mutableSharedFlow = VipReserveCacheManager.f71650d;
            Long lBoxLong = Boxing.boxLong(VipReserveCacheManager.d());
            this.label = 1;
            if (mutableSharedFlow.emit(lBoxLong, this) == coroutine_suspended) {
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
