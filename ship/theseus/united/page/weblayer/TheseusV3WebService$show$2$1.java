package com.bilibili.ship.theseus.united.page.weblayer;

import com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent;
import com.bilibili.ship.theseus.united.page.weblayer.l;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/TheseusV3WebService$show$2$1.class */
final class TheseusV3WebService$show$2$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final l.a $displayMode;
    final PlayerV3WebGeneralUIComponent $webUiComponent;
    int label;
    final l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusV3WebService$show$2$1(l lVar, PlayerV3WebGeneralUIComponent playerV3WebGeneralUIComponent, l.a aVar, Continuation<? super TheseusV3WebService$show$2$1> continuation) {
        super(1, continuation);
        this.this$0 = lVar;
        this.$webUiComponent = playerV3WebGeneralUIComponent;
        this.$displayMode = aVar;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new TheseusV3WebService$show$2$1(this.this$0, this.$webUiComponent, this.$displayMode, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            l lVar = this.this$0;
            PlayerV3WebGeneralUIComponent playerV3WebGeneralUIComponent = this.$webUiComponent;
            l.a aVar = this.$displayMode;
            this.label = 1;
            if (l.a(lVar, playerV3WebGeneralUIComponent, aVar, this) == coroutine_suspended) {
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
