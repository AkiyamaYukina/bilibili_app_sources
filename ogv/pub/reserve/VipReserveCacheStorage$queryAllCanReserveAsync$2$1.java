package com.bilibili.ogv.pub.reserve;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/reserve/VipReserveCacheStorage$queryAllCanReserveAsync$2$1.class */
final class VipReserveCacheStorage$queryAllCanReserveAsync$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends l>>, Object> {
    final f $dao;
    final Boolean $isAsc;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VipReserveCacheStorage$queryAllCanReserveAsync$2$1(Boolean bool, f fVar, Continuation<? super VipReserveCacheStorage$queryAllCanReserveAsync$2$1> continuation) {
        super(2, continuation);
        this.$isAsc = bool;
        this.$dao = fVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VipReserveCacheStorage$queryAllCanReserveAsync$2$1(this.$isAsc, this.$dao, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<l>> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Boolean bool = this.$isAsc;
        return bool == null ? this.$dao.g() : this.$dao.h(bool.booleanValue());
    }
}
