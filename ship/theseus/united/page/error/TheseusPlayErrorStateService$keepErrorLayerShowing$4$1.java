package com.bilibili.ship.theseus.united.page.error;

import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.ship.theseus.united.page.floatlayer.FloatLayerManager;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/error/TheseusPlayErrorStateService$keepErrorLayerShowing$4$1.class */
final class TheseusPlayErrorStateService$keepErrorLayerShowing$4$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final RunningUIComponent $runningUIComponent;
    int label;
    final j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusPlayErrorStateService$keepErrorLayerShowing$4$1(j jVar, RunningUIComponent runningUIComponent, Continuation<? super TheseusPlayErrorStateService$keepErrorLayerShowing$4$1> continuation) {
        super(1, continuation);
        this.this$0 = jVar;
        this.$runningUIComponent = runningUIComponent;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new TheseusPlayErrorStateService$keepErrorLayerShowing$4$1(this.this$0, this.$runningUIComponent, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            OnRenderLayerFloatLayerManager onRenderLayerFloatLayerManager = this.this$0.f99630a;
            UIComponent uIComponent = this.$runningUIComponent.a;
            this.label = 1;
            if (FloatLayerManager.c(onRenderLayerFloatLayerManager, uIComponent, this) == coroutine_suspended) {
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
