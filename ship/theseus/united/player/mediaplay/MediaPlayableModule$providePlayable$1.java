package com.bilibili.ship.theseus.united.player.mediaplay;

import com.bilibili.ship.theseus.united.player.mediaplay.f;
import ev0.j;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/MediaPlayableModule$providePlayable$1.class */
final class MediaPlayableModule$providePlayable$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final com.bilibili.ship.theseus.united.player.history.d $historyServiceFactory;
    final j.a $initial;
    final com.bilibili.ship.theseus.keel.player.j $playable;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaPlayableModule$providePlayable$1(j.a aVar, com.bilibili.ship.theseus.keel.player.j jVar, com.bilibili.ship.theseus.united.player.history.d dVar, Continuation<? super MediaPlayableModule$providePlayable$1> continuation) {
        super(2, continuation);
        this.$initial = aVar;
        this.$playable = jVar;
        this.$historyServiceFactory = dVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MediaPlayableModule$providePlayable$1(this.$initial, this.$playable, this.$historyServiceFactory, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            if (m.a(this.$initial.f117660d) && !(this.$initial.f117660d instanceof f.a)) {
                Flow flowTake = FlowKt.take(this.$playable.l(), 2);
                this.label = 1;
                if (FlowKt.collect(flowTake, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        com.bilibili.ship.theseus.united.player.history.d dVar = this.$historyServiceFactory;
        com.bilibili.ship.theseus.keel.player.j jVar = this.$playable;
        com.bilibili.ship.theseus.united.player.history.b bVarA = dVar.a(jVar, jVar.f());
        this.label = 2;
        if (bVarA.c(this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
