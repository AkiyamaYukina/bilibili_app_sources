package com.bilibili.ship.theseus.ogv.intro;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CompletableDeferred;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/UnitedActivityComposeContainerService$handleLimitedTimeFreeTicketsComponent$2$3.class */
final class UnitedActivityComposeContainerService$handleLimitedTimeFreeTicketsComponent$2$3 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final com.bilibili.ship.theseus.ogv.intro.limitedtimefree.u $limitedTimeFreeTicketsViewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnitedActivityComposeContainerService$handleLimitedTimeFreeTicketsComponent$2$3(com.bilibili.ship.theseus.ogv.intro.limitedtimefree.u uVar, Continuation<? super UnitedActivityComposeContainerService$handleLimitedTimeFreeTicketsComponent$2$3> continuation) {
        super(1, continuation);
        this.$limitedTimeFreeTicketsViewModel = uVar;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new UnitedActivityComposeContainerService$handleLimitedTimeFreeTicketsComponent$2$3(this.$limitedTimeFreeTicketsViewModel, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CompletableDeferred<Unit> completableDeferred = this.$limitedTimeFreeTicketsViewModel.f93281e;
            this.label = 1;
            if (completableDeferred.await(this) == coroutine_suspended) {
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
