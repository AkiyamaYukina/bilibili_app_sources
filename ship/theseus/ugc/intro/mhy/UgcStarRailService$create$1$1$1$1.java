package com.bilibili.ship.theseus.ugc.intro.mhy;

import com.bilibili.app.comm.servercomm.ServerClock;
import com.bilibili.ship.theseus.ugc.intro.mhy.d;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/mhy/UgcStarRailService$create$1$1$1$1.class */
public final class UgcStarRailService$create$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final b $rail;
    final a $starRail;
    final MutableStateFlow<d.C0840d> $stateFlow;
    int label;
    final UgcStarRailService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcStarRailService$create$1$1$1$1(b bVar, a aVar, MutableStateFlow<d.C0840d> mutableStateFlow, UgcStarRailService ugcStarRailService, Continuation<? super UgcStarRailService$create$1$1$1$1> continuation) {
        super(2, continuation);
        this.$rail = bVar;
        this.$starRail = aVar;
        this.$stateFlow = mutableStateFlow;
        this.this$0 = ugcStarRailService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UgcStarRailService$create$1$1$1$1(this.$rail, this.$starRail, this.$stateFlow, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            long jNow = ServerClock.now();
            this.label = 1;
            if (DelayKt.delay((this.$rail.f97087d * ((long) 1000)) - jNow, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                UgcStarRailService.b(this.$starRail, this.$stateFlow, this.this$0);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        this.$rail.f97088e = 2;
        this.label = 2;
        if (YieldKt.yield(this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        UgcStarRailService.b(this.$starRail, this.$stateFlow, this.this$0);
        return Unit.INSTANCE;
    }
}
