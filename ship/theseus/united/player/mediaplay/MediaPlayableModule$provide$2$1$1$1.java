package com.bilibili.ship.theseus.united.player.mediaplay;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/MediaPlayableModule$provide$2$1$1$1.class */
public final class MediaPlayableModule$provide$2$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final com.bilibili.ship.theseus.keel.player.f $it;
    final com.bilibili.ship.theseus.keel.player.q<?> $this_RunWithVideoPiece;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaPlayableModule$provide$2$1$1$1(com.bilibili.ship.theseus.keel.player.f fVar, com.bilibili.ship.theseus.keel.player.q<?> qVar, Continuation<MediaPlayableModule$provide$2$1$1$1> continuation) {
        super(2, continuation);
        this.$it = fVar;
        this.$this_RunWithVideoPiece = qVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MediaPlayableModule$provide$2$1$1$1(this.$it, this.$this_RunWithVideoPiece, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            com.bilibili.ship.theseus.keel.player.f fVar = this.$it;
            com.bilibili.ship.theseus.keel.player.q<?> qVar = this.$this_RunWithVideoPiece;
            this.label = 1;
            if (fVar.a(qVar, this) == coroutine_suspended) {
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
