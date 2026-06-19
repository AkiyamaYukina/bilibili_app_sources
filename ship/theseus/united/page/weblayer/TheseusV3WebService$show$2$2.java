package com.bilibili.ship.theseus.united.page.weblayer;

import com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/TheseusV3WebService$show$2$2.class */
final class TheseusV3WebService$show$2$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final Ref.ObjectRef<String> $finishReason;
    final PlayerV3WebGeneralUIComponent $webUiComponent;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusV3WebService$show$2$2(PlayerV3WebGeneralUIComponent playerV3WebGeneralUIComponent, Ref.ObjectRef<String> objectRef, Continuation<? super TheseusV3WebService$show$2$2> continuation) {
        super(1, continuation);
        this.$webUiComponent = playerV3WebGeneralUIComponent;
        this.$finishReason = objectRef;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new TheseusV3WebService$show$2$2(this.$webUiComponent, this.$finishReason, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            MutableSharedFlow mutableSharedFlow = this.$webUiComponent.f82102k;
            this.label = 1;
            if (FlowKt.first(mutableSharedFlow, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        if (Intrinsics.areEqual(this.$finishReason.element, "scope_cancelled")) {
            this.$finishReason.element = "close_action";
        }
        return Unit.INSTANCE;
    }
}
