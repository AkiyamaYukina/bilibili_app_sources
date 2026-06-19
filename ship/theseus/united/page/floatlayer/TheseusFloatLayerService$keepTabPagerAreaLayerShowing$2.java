package com.bilibili.ship.theseus.united.page.floatlayer;

import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.app.screen.adjust.widget.ScreenAdjustFloatLayerManager;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/TheseusFloatLayerService$keepTabPagerAreaLayerShowing$2.class */
public final class TheseusFloatLayerService$keepTabPagerAreaLayerShowing$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final TheseusFloatLayerService.a $floatLayerConfig;
    final UIComponent<?> $uiComponent;
    int label;
    final TheseusFloatLayerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusFloatLayerService$keepTabPagerAreaLayerShowing$2(UIComponent<?> uIComponent, TheseusFloatLayerService theseusFloatLayerService, TheseusFloatLayerService.a aVar, Continuation<? super TheseusFloatLayerService$keepTabPagerAreaLayerShowing$2> continuation) {
        super(1, continuation);
        this.$uiComponent = uIComponent;
        this.this$0 = theseusFloatLayerService;
        this.$floatLayerConfig = aVar;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new TheseusFloatLayerService$keepTabPagerAreaLayerShowing$2(this.$uiComponent, this.this$0, this.$floatLayerConfig, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            defpackage.a.b("[theseus-united-TheseusFloatLayerService$keepTabPagerAreaLayerShowing$2-invokeSuspend] ", "show tab pager area layer: " + this.$uiComponent, "TheseusFloatLayerService$keepTabPagerAreaLayerShowing$2-invokeSuspend");
            ScreenAdjustFloatLayerManager screenAdjustFloatLayerManager = this.this$0.f99657f;
            i iVarJ = TheseusFloatLayerService.j(this.$uiComponent);
            ScreenAdjustFloatLayerManager.a aVarK = this.this$0.k(this.$floatLayerConfig, 3, false);
            this.label = 1;
            if (screenAdjustFloatLayerManager.d(iVarJ, aVarK, this) == coroutine_suspended) {
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
