package com.bilibili.playset.detail.data;

import com.bilibili.playset.detail.data.g;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/ActionHandler$handleChangeFav$6.class */
final class ActionHandler$handleChangeFav$6 extends SuspendLambda implements Function1<Continuation<? super g>, Object> {
    final h $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionHandler$handleChangeFav$6(h hVar, Continuation<? super ActionHandler$handleChangeFav$6> continuation) {
        super(1, continuation);
        this.$state = hVar;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new ActionHandler$handleChangeFav$6(this.$state, continuation);
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
        h hVar = this.$state;
        return new g.c(new k(hVar.f84513a, hVar.f84531t, hVar.f84521j));
    }
}
