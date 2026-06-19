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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/ActionHandler$handlePlaylistOverflow$1.class */
final class ActionHandler$handlePlaylistOverflow$1 extends SuspendLambda implements Function1<Continuation<? super g>, Object> {
    final f.q $action;
    final h $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionHandler$handlePlaylistOverflow$1(h hVar, f.q qVar, Continuation<? super ActionHandler$handlePlaylistOverflow$1> continuation) {
        super(1, continuation);
        this.$state = hVar;
        this.$action = qVar;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new ActionHandler$handlePlaylistOverflow$1(this.$state, this.$action, continuation);
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
        boolean z6 = hVar.f84518f;
        f.q qVar = this.$action;
        return new g.e(new d.c(z6, hVar.f84519g, hVar.f84513a, hVar.f84517e, qVar.f84490a, qVar.f84491b));
    }
}
