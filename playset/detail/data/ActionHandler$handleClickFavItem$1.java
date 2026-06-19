package com.bilibili.playset.detail.data;

import com.bilibili.playset.detail.data.d;
import com.bilibili.playset.detail.data.f;
import com.bilibili.playset.detail.data.g;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/ActionHandler$handleClickFavItem$1.class */
final class ActionHandler$handleClickFavItem$1 extends SuspendLambda implements Function1<Continuation<? super g>, Object> {
    final f.g $action;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionHandler$handleClickFavItem$1(f.g gVar, Continuation<? super ActionHandler$handleClickFavItem$1> continuation) {
        super(1, continuation);
        this.$action = gVar;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new ActionHandler$handleClickFavItem$1(this.$action, continuation);
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
        f.g gVar = this.$action;
        return new g.e(new d.a(gVar.f84475a, gVar.f84477c));
    }
}
