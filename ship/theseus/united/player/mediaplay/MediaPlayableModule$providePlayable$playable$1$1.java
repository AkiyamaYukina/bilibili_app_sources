package com.bilibili.ship.theseus.united.player.mediaplay;

import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import ev0.j;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/MediaPlayableModule$providePlayable$playable$1$1.class */
final class MediaPlayableModule$providePlayable$playable$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final j.a $initial;
    final com.bilibili.ship.theseus.keel.player.j $playable;
    final p $playableStrategy;
    private Object L$0;
    int label;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.mediaplay.MediaPlayableModule$providePlayable$playable$1$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/MediaPlayableModule$providePlayable$playable$1$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super PlayViewUniteReply>, Object> {
        final com.bilibili.ship.theseus.keel.player.j $playable;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(com.bilibili.ship.theseus.keel.player.j jVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$playable = jVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$playable, continuation);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaPlayableModule$providePlayable$playable$1$1(p pVar, j.a aVar, com.bilibili.ship.theseus.keel.player.j jVar, Continuation<? super MediaPlayableModule$providePlayable$playable$1$1> continuation) {
        super(2, continuation);
        this.$playableStrategy = pVar;
        this.$initial = aVar;
        this.$playable = jVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MediaPlayableModule$providePlayable$playable$1$1 mediaPlayableModule$providePlayable$playable$1$1 = new MediaPlayableModule$providePlayable$playable$1$1(this.$playableStrategy, this.$initial, this.$playable, continuation);
        mediaPlayableModule$providePlayable$playable$1$1.L$0 = obj;
        return mediaPlayableModule$providePlayable$playable$1$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            p pVar = this.$playableStrategy;
            ev0.i iVar = this.$initial.f117662f;
            Deferred<PlayViewUniteReply> deferredAsync$default = BuildersKt.async$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$playable, null), 3, (Object) null);
            com.bilibili.ship.theseus.keel.player.j jVar = this.$playable;
            this.label = 1;
            if (pVar.a(iVar, deferredAsync$default, jVar, this) == coroutine_suspended) {
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
