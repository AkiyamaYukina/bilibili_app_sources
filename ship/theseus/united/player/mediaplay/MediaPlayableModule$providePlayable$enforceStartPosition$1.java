package com.bilibili.ship.theseus.united.player.mediaplay;

import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import ev0.j;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/MediaPlayableModule$providePlayable$enforceStartPosition$1.class */
final class MediaPlayableModule$providePlayable$enforceStartPosition$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final j.a $initial;
    final Deferred<PlayViewUniteReply> $playViewReplyDeferred;
    final com.bilibili.ship.theseus.keel.player.j $playable;
    final p $playableStrategy;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaPlayableModule$providePlayable$enforceStartPosition$1(p pVar, j.a aVar, Deferred<PlayViewUniteReply> deferred, com.bilibili.ship.theseus.keel.player.j jVar, Continuation<? super MediaPlayableModule$providePlayable$enforceStartPosition$1> continuation) {
        super(2, continuation);
        this.$playableStrategy = pVar;
        this.$initial = aVar;
        this.$playViewReplyDeferred = deferred;
        this.$playable = jVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MediaPlayableModule$providePlayable$enforceStartPosition$1(this.$playableStrategy, this.$initial, this.$playViewReplyDeferred, this.$playable, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            p pVar = this.$playableStrategy;
            ev0.i iVar = this.$initial.f117662f;
            Deferred<PlayViewUniteReply> deferred = this.$playViewReplyDeferred;
            com.bilibili.ship.theseus.keel.player.j jVar = this.$playable;
            this.label = 1;
            if (pVar.a(iVar, deferred, jVar, this) == coroutine_suspended) {
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
