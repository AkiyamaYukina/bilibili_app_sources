package com.bilibili.playset.detail.data;

import com.bilibili.playset.detail.data.g;
import com.bilibili.playset.detail.data.r;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/ActionHandler$handleShare$3.class */
final class ActionHandler$handleShare$3 extends SuspendLambda implements Function1<Continuation<? super g>, Object> {
    int label;

    public ActionHandler$handleShare$3(Continuation<? super ActionHandler$handleShare$3> continuation) {
        super(1, continuation);
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new ActionHandler$handleShare$3(continuation);
    }

    public final Object invoke(Continuation<? super g> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return new g.i(r.k.f84568a);
    }
}
