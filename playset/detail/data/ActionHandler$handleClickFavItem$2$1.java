package com.bilibili.playset.detail.data;

import com.bilibili.playset.detail.data.g;
import com.bilibili.playset.detail.data.l;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/ActionHandler$handleClickFavItem$2$1.class */
final class ActionHandler$handleClickFavItem$2$1 extends SuspendLambda implements Function1<Continuation<? super g>, Object> {
    final String $link;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionHandler$handleClickFavItem$2$1(String str, Continuation<? super ActionHandler$handleClickFavItem$2$1> continuation) {
        super(1, continuation);
        this.$link = str;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new ActionHandler$handleClickFavItem$2$1(this.$link, continuation);
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
        return new g.b(new l.b(this.$link, true));
    }
}
