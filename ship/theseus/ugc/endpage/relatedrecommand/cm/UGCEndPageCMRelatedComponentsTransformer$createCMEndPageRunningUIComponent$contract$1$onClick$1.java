package com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.cm;

import com.bilibili.playerbizcommonv2.widget.base.RightInsetWithShadowFunctionWidget;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.IFunctionWidgetServiceKt;
import tv.danmaku.biliplayerv2.widget.AbsFunctionWidget;
import tv.danmaku.biliplayerv2.widget.IFunctionContainer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/relatedrecommand/cm/UGCEndPageCMRelatedComponentsTransformer$createCMEndPageRunningUIComponent$contract$1$onClick$1.class */
public final class UGCEndPageCMRelatedComponentsTransformer$createCMEndPageRunningUIComponent$contract$1$onClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final ScreenModeType $screenModeType;
    final AbsFunctionWidget $widget;
    int label;
    final UGCEndPageCMRelatedComponentsTransformer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UGCEndPageCMRelatedComponentsTransformer$createCMEndPageRunningUIComponent$contract$1$onClick$1(UGCEndPageCMRelatedComponentsTransformer uGCEndPageCMRelatedComponentsTransformer, AbsFunctionWidget absFunctionWidget, ScreenModeType screenModeType, Continuation<? super UGCEndPageCMRelatedComponentsTransformer$createCMEndPageRunningUIComponent$contract$1$onClick$1> continuation) {
        super(2, continuation);
        this.this$0 = uGCEndPageCMRelatedComponentsTransformer;
        this.$widget = absFunctionWidget;
        this.$screenModeType = screenModeType;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UGCEndPageCMRelatedComponentsTransformer$createCMEndPageRunningUIComponent$contract$1$onClick$1(this.this$0, this.$widget, this.$screenModeType, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            AbsFunctionWidgetService absFunctionWidgetService = this.this$0.f96861b;
            AbsFunctionWidget absFunctionWidget = this.$widget;
            RightInsetWithShadowFunctionWidget.a aVar = RightInsetWithShadowFunctionWidget.Companion;
            ScreenModeType screenModeType = this.$screenModeType;
            aVar.getClass();
            IFunctionContainer.LayoutParams layoutParamsA = RightInsetWithShadowFunctionWidget.a.a(screenModeType);
            this.label = 1;
            if (IFunctionWidgetServiceKt.retainFunctionWidget$default(absFunctionWidgetService, absFunctionWidget, layoutParamsA, (Function1) null, this, 4, (Object) null) == coroutine_suspended) {
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
