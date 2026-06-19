package com.bilibili.ship.theseus.ogv.intro.livereserve;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/livereserve/OgvLiveReserveService$updateLiveReserveBar$1.class */
final class OgvLiveReserveService$updateLiveReserveBar$1 extends ContinuationImpl {
    int label;
    Object result;
    final a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvLiveReserveService$updateLiveReserveBar$1(a aVar, Continuation<? super OgvLiveReserveService$updateLiveReserveBar$1> continuation) {
        super(continuation);
        this.this$0 = aVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objB = this.this$0.b(0L, null, this);
        return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : Result.box-impl(objB);
    }
}
