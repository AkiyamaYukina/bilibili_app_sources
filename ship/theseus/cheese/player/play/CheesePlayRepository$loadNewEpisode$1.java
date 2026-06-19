package com.bilibili.ship.theseus.cheese.player.play;

import com.bilibili.lib.projection.ProjectionClient;
import eu0.C6985d;
import ev0.i;
import ev0.l;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.YieldKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/play/CheesePlayRepository$loadNewEpisode$1.class */
final class CheesePlayRepository$loadNewEpisode$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final C6985d $ep;
    final i $landingPosition;
    final l $sharedPlayData;
    final int $trigger;
    int label;
    final CheesePlayRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheesePlayRepository$loadNewEpisode$1(CheesePlayRepository cheesePlayRepository, C6985d c6985d, i iVar, l lVar, int i7, Continuation<? super CheesePlayRepository$loadNewEpisode$1> continuation) {
        super(2, continuation);
        this.this$0 = cheesePlayRepository;
        this.$ep = c6985d;
        this.$landingPosition = iVar;
        this.$sharedPlayData = lVar;
        this.$trigger = i7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheesePlayRepository$loadNewEpisode$1(this.this$0, this.$ep, this.$landingPosition, this.$sharedPlayData, this.$trigger, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ProjectionClient projectionClientA = this.this$0.f90676e.a();
            if (projectionClientA != null) {
                projectionClientA.stop();
            }
            this.label = 1;
            if (YieldKt.yield(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.this$0.h(this.$ep, this.$landingPosition, this.$sharedPlayData, this.$trigger);
        return Unit.INSTANCE;
    }
}
