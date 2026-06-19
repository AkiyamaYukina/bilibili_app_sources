package com.bilibili.ship.theseus.ugc.watchpoint;

import androidx.lifecycle.Observer;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/watchpoint/WatchPointLayerService$showWatchPointLayer$2$3.class */
final class WatchPointLayerService$showWatchPointLayer$2$3 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final Observer<Boolean> $switchObserver;
    int label;
    final WatchPointLayerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchPointLayerService$showWatchPointLayer$2$3(WatchPointLayerService watchPointLayerService, Observer<Boolean> observer, Continuation<? super WatchPointLayerService$showWatchPointLayer$2$3> continuation) {
        super(1, continuation);
        this.this$0 = watchPointLayerService;
        this.$switchObserver = observer;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new WatchPointLayerService$showWatchPointLayer$2$3(this.this$0, this.$switchObserver, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.f98580e.addSegmentSwitchObserver(this.$switchObserver);
                this.label = 1;
                if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        } catch (Throwable th) {
            this.this$0.f98580e.removeSegmentSwitchObserver(this.$switchObserver);
            throw th;
        }
    }
}
