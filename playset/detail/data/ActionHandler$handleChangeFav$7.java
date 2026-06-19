package com.bilibili.playset.detail.data;

import com.bilibili.playset.detail.data.g;
import com.bilibili.playset.detail.data.l;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/ActionHandler$handleChangeFav$7.class */
final class ActionHandler$handleChangeFav$7 extends SuspendLambda implements Function1<Continuation<? super g>, Object> {
    int label;

    public ActionHandler$handleChangeFav$7(Continuation<? super ActionHandler$handleChangeFav$7> continuation) {
        super(1, continuation);
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new ActionHandler$handleChangeFav$7(continuation);
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
        return new g.b(l.c.f84550a);
    }
}
