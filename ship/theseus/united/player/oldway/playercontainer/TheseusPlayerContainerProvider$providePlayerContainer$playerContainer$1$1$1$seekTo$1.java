package com.bilibili.ship.theseus.united.player.oldway.playercontainer;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/playercontainer/TheseusPlayerContainerProvider$providePlayerContainer$playerContainer$1$1$1$seekTo$1.class */
public final class TheseusPlayerContainerProvider$providePlayerContainer$playerContainer$1$1$1$seekTo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final boolean $accurate;
    final int $position;
    final com.bilibili.ship.theseus.keel.player.h $theseusKeelPlayer;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusPlayerContainerProvider$providePlayerContainer$playerContainer$1$1$1$seekTo$1(com.bilibili.ship.theseus.keel.player.h hVar, int i7, boolean z6, Continuation<? super TheseusPlayerContainerProvider$providePlayerContainer$playerContainer$1$1$1$seekTo$1> continuation) {
        super(2, continuation);
        this.$theseusKeelPlayer = hVar;
        this.$position = i7;
        this.$accurate = z6;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TheseusPlayerContainerProvider$providePlayerContainer$playerContainer$1$1$1$seekTo$1(this.$theseusKeelPlayer, this.$position, this.$accurate, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            com.bilibili.ship.theseus.keel.player.j jVarJ = this.$theseusKeelPlayer.j();
            if (jVarJ != null) {
                Duration.Companion companion = Duration.Companion;
                long duration = DurationKt.toDuration(this.$position, DurationUnit.MILLISECONDS);
                boolean z6 = this.$accurate;
                this.label = 1;
                Object objC = jVarJ.c(duration, z6, this);
                obj = objC;
                if (objC == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Unit.INSTANCE;
    }
}
