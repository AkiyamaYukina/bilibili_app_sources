package com.bilibili.playset.detail;

import com.bilibili.playset.detail.data.g;
import com.bilibili.playset.detail.data.r;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/MultiTypeListDetailViewModel$clearInvalidVideo$4.class */
final class MultiTypeListDetailViewModel$clearInvalidVideo$4 extends SuspendLambda implements Function1<Continuation<? super com.bilibili.playset.detail.data.g>, Object> {
    int label;

    public MultiTypeListDetailViewModel$clearInvalidVideo$4(Continuation<? super MultiTypeListDetailViewModel$clearInvalidVideo$4> continuation) {
        super(1, continuation);
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new MultiTypeListDetailViewModel$clearInvalidVideo$4(continuation);
    }

    public final Object invoke(Continuation<? super com.bilibili.playset.detail.data.g> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return new g.i(new r.b(false));
    }
}
