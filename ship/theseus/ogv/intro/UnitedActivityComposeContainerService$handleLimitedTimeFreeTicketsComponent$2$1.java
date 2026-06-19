package com.bilibili.ship.theseus.ogv.intro;

import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/UnitedActivityComposeContainerService$handleLimitedTimeFreeTicketsComponent$2$1.class */
final class UnitedActivityComposeContainerService$handleLimitedTimeFreeTicketsComponent$2$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final com.bilibili.ship.theseus.ogv.intro.limitedtimefree.u $limitedTimeFreeTicketsViewModel;
    int label;
    final UnitedActivityComposeContainerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnitedActivityComposeContainerService$handleLimitedTimeFreeTicketsComponent$2$1(com.bilibili.ship.theseus.ogv.intro.limitedtimefree.u uVar, UnitedActivityComposeContainerService unitedActivityComposeContainerService, Continuation<? super UnitedActivityComposeContainerService$handleLimitedTimeFreeTicketsComponent$2$1> continuation) {
        super(1, continuation);
        this.$limitedTimeFreeTicketsViewModel = uVar;
        this.this$0 = unitedActivityComposeContainerService;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new UnitedActivityComposeContainerService$handleLimitedTimeFreeTicketsComponent$2$1(this.$limitedTimeFreeTicketsViewModel, this.this$0, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Unit unit;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            com.bilibili.ship.theseus.ogv.intro.limitedtimefree.u uVar = this.$limitedTimeFreeTicketsViewModel;
            unit = null;
            if (!((Boolean) uVar.h.getValue()).booleanValue()) {
                uVar = null;
            }
            if (uVar != null) {
                TheseusFloatLayerService theseusFloatLayerService = this.this$0.f92280b;
                com.bilibili.ship.theseus.ogv.intro.limitedtimefree.t tVar = new com.bilibili.ship.theseus.ogv.intro.limitedtimefree.t(uVar);
                this.label = 1;
                if (theseusFloatLayerService.d(tVar, theseusFloatLayerService.f99664n, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return unit;
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        unit = Unit.INSTANCE;
        return unit;
    }
}
