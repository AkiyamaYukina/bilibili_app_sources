package com.bilibili.ship.theseus.ugc.backgroundplay.enforceBackgroundPlay;

import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/backgroundplay/enforceBackgroundPlay/UgcBackgroundPlayDialogService$keepEnforceBackgroundPlayLayerShowing$2$1.class */
final class UgcBackgroundPlayDialogService$keepEnforceBackgroundPlayLayerShowing$2$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final RunningUIComponent $component;
    int label;
    final UgcBackgroundPlayDialogService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcBackgroundPlayDialogService$keepEnforceBackgroundPlayLayerShowing$2$1(UgcBackgroundPlayDialogService ugcBackgroundPlayDialogService, RunningUIComponent runningUIComponent, Continuation<? super UgcBackgroundPlayDialogService$keepEnforceBackgroundPlayLayerShowing$2$1> continuation) {
        super(1, continuation);
        this.this$0 = ugcBackgroundPlayDialogService;
        this.$component = runningUIComponent;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new UgcBackgroundPlayDialogService$keepEnforceBackgroundPlayLayerShowing$2$1(this.this$0, this.$component, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            TheseusFloatLayerService theseusFloatLayerService = this.this$0.f96333f;
            UIComponent<?> uIComponent = this.$component.a;
            this.label = 1;
            if (theseusFloatLayerService.f(uIComponent, theseusFloatLayerService.f99664n, this) == coroutine_suspended) {
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
