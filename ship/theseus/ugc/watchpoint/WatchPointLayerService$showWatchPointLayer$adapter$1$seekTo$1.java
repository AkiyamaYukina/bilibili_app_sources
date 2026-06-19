package com.bilibili.ship.theseus.ugc.watchpoint;

import com.bilibili.ship.theseus.keel.player.i;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/watchpoint/WatchPointLayerService$showWatchPointLayer$adapter$1$seekTo$1.class */
final class WatchPointLayerService$showWatchPointLayer$adapter$1$seekTo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final int $position;
    int label;
    final WatchPointLayerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchPointLayerService$showWatchPointLayer$adapter$1$seekTo$1(WatchPointLayerService watchPointLayerService, int i7, Continuation<? super WatchPointLayerService$showWatchPointLayer$adapter$1$seekTo$1> continuation) {
        super(2, continuation);
        this.this$0 = watchPointLayerService;
        this.$position = i7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WatchPointLayerService$showWatchPointLayer$adapter$1$seekTo$1(this.this$0, this.$position, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            com.bilibili.ship.theseus.keel.player.h hVar = this.this$0.f98577b;
            long j7 = this.$position;
            this.label = 1;
            if (i.a(hVar, j7, this) == coroutine_suspended) {
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
