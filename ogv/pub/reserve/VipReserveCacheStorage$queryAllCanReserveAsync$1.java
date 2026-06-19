package com.bilibili.ogv.pub.reserve;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/reserve/VipReserveCacheStorage$queryAllCanReserveAsync$1.class */
final class VipReserveCacheStorage$queryAllCanReserveAsync$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    Object result;
    final VipReserveCacheStorage this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VipReserveCacheStorage$queryAllCanReserveAsync$1(VipReserveCacheStorage vipReserveCacheStorage, Continuation<? super VipReserveCacheStorage$queryAllCanReserveAsync$1> continuation) {
        super(continuation);
        this.this$0 = vipReserveCacheStorage;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, this);
    }
}
