package com.bilibili.ship.theseus.united.page.miniplayer;

import androidx.lifecycle.Lifecycle;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/miniplayer/DetailMiniPlayerService$collectBackAction$1$event$1.class */
public final class DetailMiniPlayerService$collectBackAction$1$event$1 extends SuspendLambda implements Function2<Lifecycle.Event, Continuation<? super Boolean>, Object> {
    Object L$0;
    int label;
    final b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailMiniPlayerService$collectBackAction$1$event$1(b bVar, Continuation<? super DetailMiniPlayerService$collectBackAction$1$event$1> continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DetailMiniPlayerService$collectBackAction$1$event$1 detailMiniPlayerService$collectBackAction$1$event$1 = new DetailMiniPlayerService$collectBackAction$1$event$1(this.this$0, continuation);
        detailMiniPlayerService$collectBackAction$1$event$1.L$0 = obj;
        return detailMiniPlayerService$collectBackAction$1$event$1;
    }

    public final Object invoke(Lifecycle.Event event, Continuation<? super Boolean> continuation) {
        return create(event, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Boxing.boxBoolean(((Lifecycle.Event) this.L$0) == Lifecycle.Event.ON_PAUSE && this.this$0.f102049e.isFinishing());
    }
}
