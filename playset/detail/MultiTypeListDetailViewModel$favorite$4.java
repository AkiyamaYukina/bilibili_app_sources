package com.bilibili.playset.detail;

import com.bilibili.playset.detail.data.g;
import com.bilibili.playset.detail.data.r;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/MultiTypeListDetailViewModel$favorite$4.class */
final class MultiTypeListDetailViewModel$favorite$4 extends SuspendLambda implements Function1<Continuation<? super com.bilibili.playset.detail.data.g>, Object> {
    final Throwable $t;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiTypeListDetailViewModel$favorite$4(Throwable th, Continuation<? super MultiTypeListDetailViewModel$favorite$4> continuation) {
        super(1, continuation);
        this.$t = th;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new MultiTypeListDetailViewModel$favorite$4(this.$t, continuation);
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
        return new g.i(new r.e(this.$t, false));
    }
}
