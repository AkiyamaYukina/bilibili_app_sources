package com.bilibili.playset.detail;

import com.bilibili.playset.detail.data.g;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/MultiTypeListDetailViewModel$toTop$2.class */
final class MultiTypeListDetailViewModel$toTop$2 extends SuspendLambda implements Function1<Continuation<? super com.bilibili.playset.detail.data.g>, Object> {
    int label;

    public MultiTypeListDetailViewModel$toTop$2(Continuation<? super MultiTypeListDetailViewModel$toTop$2> continuation) {
        super(1, continuation);
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new MultiTypeListDetailViewModel$toTop$2(continuation);
    }

    public final Object invoke(Continuation<? super com.bilibili.playset.detail.data.g> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.bilibili.playset.detail.data.r, java.lang.Object] */
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return new g.i(new Object());
    }
}
