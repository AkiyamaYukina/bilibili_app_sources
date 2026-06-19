package com.bilibili.ship.theseus.ogv.skipheadtail;

import com.bilibili.ship.theseus.keel.player.j;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/skipheadtail/SkippingOpEdService$seekToClipEnd$1.class */
public final class SkippingOpEdService$seekToClipEnd$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $clipEndTime;
    int label;
    final SkippingOpEdService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkippingOpEdService$seekToClipEnd$1(SkippingOpEdService skippingOpEdService, long j7, Continuation<? super SkippingOpEdService$seekToClipEnd$1> continuation) {
        super(2, continuation);
        this.this$0 = skippingOpEdService;
        this.$clipEndTime = j7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SkippingOpEdService$seekToClipEnd$1(this.this$0, this.$clipEndTime, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            j jVar = this.this$0.f94515b;
            long j7 = Duration.getInWholeMilliseconds-impl(this.$clipEndTime);
            this.label = 1;
            if (jVar.y(j7, false, this) == coroutine_suspended) {
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
