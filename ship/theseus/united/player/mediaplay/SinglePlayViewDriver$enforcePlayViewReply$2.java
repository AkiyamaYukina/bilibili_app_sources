package com.bilibili.ship.theseus.united.player.mediaplay;

import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/SinglePlayViewDriver$enforcePlayViewReply$2.class */
final class SinglePlayViewDriver$enforcePlayViewReply$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final PlayViewUniteReply $reply;
    private Object L$0;
    int label;
    final SinglePlayViewDriver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SinglePlayViewDriver$enforcePlayViewReply$2(SinglePlayViewDriver singlePlayViewDriver, PlayViewUniteReply playViewUniteReply, Continuation<? super SinglePlayViewDriver$enforcePlayViewReply$2> continuation) {
        super(2, continuation);
        this.this$0 = singlePlayViewDriver;
        this.$reply = playViewUniteReply;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SinglePlayViewDriver$enforcePlayViewReply$2 singlePlayViewDriver$enforcePlayViewReply$2 = new SinglePlayViewDriver$enforcePlayViewReply$2(this.this$0, this.$reply, continuation);
        singlePlayViewDriver$enforcePlayViewReply$2.L$0 = obj;
        return singlePlayViewDriver$enforcePlayViewReply$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.f104508c.a((CoroutineScope) this.L$0, this.$reply);
        return Unit.INSTANCE;
    }
}
