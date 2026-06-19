package com.bilibili.ship.theseus.united.player.mediaplay;

import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/MediaPlayableModule$providePlayable$playable$4$1.class */
final class MediaPlayableModule$providePlayable$playable$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super PlayViewUniteReply>, Object> {
    final com.bilibili.ship.theseus.keel.player.j $playable;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaPlayableModule$providePlayable$playable$4$1(com.bilibili.ship.theseus.keel.player.j jVar, Continuation<? super MediaPlayableModule$providePlayable$playable$4$1> continuation) {
        super(2, continuation);
        this.$playable = jVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MediaPlayableModule$providePlayable$playable$4$1(this.$playable, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super PlayViewUniteReply> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow<PlayViewUniteReply> flowG = this.$playable.g();
            this.label = 1;
            Object objFirst = FlowKt.first(flowG, this);
            obj = objFirst;
            if (objFirst == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
