package com.bilibili.ship.theseus.ogv.media;

import com.bilibili.player.tangram.basic.WithVideoProgress;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/media/OgvEpStartToastService$onActionToastClick$1.class */
final class OgvEpStartToastService$onActionToastClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final uk.b $historyInfo;
    final com.bilibili.ship.theseus.united.player.mediaplay.c $masterPieceOffset;
    final WithVideoProgress $playable;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvEpStartToastService$onActionToastClick$1(uk.b bVar, WithVideoProgress withVideoProgress, com.bilibili.ship.theseus.united.player.mediaplay.c cVar, Continuation<? super OgvEpStartToastService$onActionToastClick$1> continuation) {
        super(2, continuation);
        this.$historyInfo = bVar;
        this.$playable = withVideoProgress;
        this.$masterPieceOffset = cVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvEpStartToastService$onActionToastClick$1(this.$historyInfo, this.$playable, this.$masterPieceOffset, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Duration.Companion companion = Duration.Companion;
            uk.b bVar = this.$historyInfo;
            long duration = DurationKt.toDuration(bVar != null ? bVar.a : 0L, DurationUnit.SECONDS);
            WithVideoProgress withVideoProgress = this.$playable;
            Duration.Companion companion2 = Duration.Companion;
            long j7 = Duration.compareTo-LRDsOJo(duration, companion2.getZERO-UwyO8pc()) > 0 ? Duration.plus-LRDsOJo(duration, this.$masterPieceOffset.f104512a) : companion2.getZERO-UwyO8pc();
            this.label = 1;
            if (withVideoProgress.c(j7, false, this) == coroutine_suspended) {
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
