package com.bilibili.ship.theseus.united.player.mediaplay;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/MediaPlayableModule$runInteractiveVideo$service$1.class */
final class MediaPlayableModule$runInteractiveVideo$service$1 extends SuspendLambda implements Function2<com.bilibili.ship.theseus.keel.player.j, Continuation<? super Unit>, Object> {
    final com.bilibili.ship.theseus.united.player.history.d $historyServiceFactory;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaPlayableModule$runInteractiveVideo$service$1(com.bilibili.ship.theseus.united.player.history.d dVar, Continuation<? super MediaPlayableModule$runInteractiveVideo$service$1> continuation) {
        super(2, continuation);
        this.$historyServiceFactory = dVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MediaPlayableModule$runInteractiveVideo$service$1 mediaPlayableModule$runInteractiveVideo$service$1 = new MediaPlayableModule$runInteractiveVideo$service$1(this.$historyServiceFactory, continuation);
        mediaPlayableModule$runInteractiveVideo$service$1.L$0 = obj;
        return mediaPlayableModule$runInteractiveVideo$service$1;
    }

    public final Object invoke(com.bilibili.ship.theseus.keel.player.j jVar, Continuation<? super Unit> continuation) {
        return create(jVar, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            com.bilibili.ship.theseus.keel.player.j jVar = (com.bilibili.ship.theseus.keel.player.j) this.L$0;
            com.bilibili.ship.theseus.united.player.history.b bVarA = this.$historyServiceFactory.a(jVar, jVar.f());
            this.label = 1;
            if (bVarA.c(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
