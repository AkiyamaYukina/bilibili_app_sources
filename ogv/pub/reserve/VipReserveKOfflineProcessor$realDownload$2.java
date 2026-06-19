package com.bilibili.ogv.pub.reserve;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/reserve/VipReserveKOfflineProcessor$realDownload$2.class */
final class VipReserveKOfflineProcessor$realDownload$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final List<Cj1.c> $models;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VipReserveKOfflineProcessor$realDownload$2(List<Cj1.c> list, Continuation<? super VipReserveKOfflineProcessor$realDownload$2> continuation) {
        super(2, continuation);
        this.$models = list;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VipReserveKOfflineProcessor$realDownload$2(this.$models, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            video.biz.offline.base.facade.a aVar = video.biz.offline.base.facade.b.a;
            List<Cj1.c> list = this.$models;
            this.label = 1;
            if (aVar.c(list, this) == coroutine_suspended) {
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
