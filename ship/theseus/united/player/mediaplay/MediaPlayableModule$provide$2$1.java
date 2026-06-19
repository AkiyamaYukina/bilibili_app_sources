package com.bilibili.ship.theseus.united.player.mediaplay;

import java.util.Iterator;
import java.util.Set;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/MediaPlayableModule$provide$2$1.class */
final class MediaPlayableModule$provide$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Set<com.bilibili.ship.theseus.keel.player.f> $tasks;
    final com.bilibili.ship.theseus.keel.player.q<?> $this_RunWithVideoPiece;
    private Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaPlayableModule$provide$2$1(Set<com.bilibili.ship.theseus.keel.player.f> set, com.bilibili.ship.theseus.keel.player.q<?> qVar, Continuation<MediaPlayableModule$provide$2$1> continuation) {
        super(2, continuation);
        this.$tasks = set;
        this.$this_RunWithVideoPiece = qVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MediaPlayableModule$provide$2$1 mediaPlayableModule$provide$2$1 = new MediaPlayableModule$provide$2$1(this.$tasks, this.$this_RunWithVideoPiece, continuation);
        mediaPlayableModule$provide$2$1.L$0 = obj;
        return mediaPlayableModule$provide$2$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        Set<com.bilibili.ship.theseus.keel.player.f> set = this.$tasks;
        com.bilibili.ship.theseus.keel.player.q<?> qVar = this.$this_RunWithVideoPiece;
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new MediaPlayableModule$provide$2$1$1$1((com.bilibili.ship.theseus.keel.player.f) it.next(), qVar, null), 3, (Object) null);
        }
        return Unit.INSTANCE;
    }
}
