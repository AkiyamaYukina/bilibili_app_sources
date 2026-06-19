package com.bilibili.ship.theseus.united.page.videoquality;

import com.bilibili.playerbizcommonv2.widget.base.RightInsetWithShadowFunctionWidget;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.IFunctionWidgetServiceKt;
import tv.danmaku.biliplayerv2.widget.IFunctionContainer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/ShowQualityListImpl$invoke$1$1$1.class */
public final class ShowQualityListImpl$invoke$1$1$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final ScreenModeType $screenModeType;
    final TheseusQualityFunctionWidget $widget;
    int label;
    final ShowQualityListImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShowQualityListImpl$invoke$1$1$1(ShowQualityListImpl showQualityListImpl, TheseusQualityFunctionWidget theseusQualityFunctionWidget, ScreenModeType screenModeType, Continuation<? super ShowQualityListImpl$invoke$1$1$1> continuation) {
        super(1, continuation);
        this.this$0 = showQualityListImpl;
        this.$widget = theseusQualityFunctionWidget;
        this.$screenModeType = screenModeType;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new ShowQualityListImpl$invoke$1$1$1(this.this$0, this.$widget, this.$screenModeType, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            AbsFunctionWidgetService absFunctionWidgetService = this.this$0.f103756d;
            TheseusQualityFunctionWidget theseusQualityFunctionWidget = this.$widget;
            RightInsetWithShadowFunctionWidget.a aVar = RightInsetWithShadowFunctionWidget.Companion;
            ScreenModeType screenModeType = this.$screenModeType;
            aVar.getClass();
            IFunctionContainer.LayoutParams layoutParamsA = RightInsetWithShadowFunctionWidget.a.a(screenModeType);
            this.label = 1;
            if (IFunctionWidgetServiceKt.retainFunctionWidget$default(absFunctionWidgetService, theseusQualityFunctionWidget, layoutParamsA, (Function1) null, this, 4, (Object) null) == coroutine_suspended) {
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
