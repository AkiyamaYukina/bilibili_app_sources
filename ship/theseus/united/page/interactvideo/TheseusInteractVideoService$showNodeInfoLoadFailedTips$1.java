package com.bilibili.ship.theseus.united.page.interactvideo;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.IFunctionWidgetServiceKt;
import tv.danmaku.biliplayerv2.widget.IFunctionContainer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractVideoService$showNodeInfoLoadFailedTips$1.class */
public final class TheseusInteractVideoService$showNodeInfoLoadFailedTips$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final IFunctionContainer.LayoutParams $layoutParams;
    final o $widget;
    int label;
    final TheseusInteractVideoService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusInteractVideoService$showNodeInfoLoadFailedTips$1(TheseusInteractVideoService theseusInteractVideoService, o oVar, IFunctionContainer.LayoutParams layoutParams, Continuation<? super TheseusInteractVideoService$showNodeInfoLoadFailedTips$1> continuation) {
        super(2, continuation);
        this.this$0 = theseusInteractVideoService;
        this.$widget = oVar;
        this.$layoutParams = layoutParams;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TheseusInteractVideoService$showNodeInfoLoadFailedTips$1(this.this$0, this.$widget, this.$layoutParams, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            AbsFunctionWidgetService absFunctionWidgetService = this.this$0.f99890f;
            o oVar = this.$widget;
            IFunctionContainer.LayoutParams layoutParams = this.$layoutParams;
            this.label = 1;
            if (IFunctionWidgetServiceKt.retainFunctionWidget$default(absFunctionWidgetService, oVar, layoutParams, (Function1) null, this, 4, (Object) null) == coroutine_suspended) {
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
