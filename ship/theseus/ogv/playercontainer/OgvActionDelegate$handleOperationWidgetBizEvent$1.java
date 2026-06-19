package com.bilibili.ship.theseus.ogv.playercontainer;

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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/playercontainer/OgvActionDelegate$handleOperationWidgetBizEvent$1.class */
public final class OgvActionDelegate$handleOperationWidgetBizEvent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final IFunctionContainer.LayoutParams $layoutParams;
    final j $widget;
    int label;
    final OgvActionDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvActionDelegate$handleOperationWidgetBizEvent$1(OgvActionDelegate ogvActionDelegate, j jVar, IFunctionContainer.LayoutParams layoutParams, Continuation<? super OgvActionDelegate$handleOperationWidgetBizEvent$1> continuation) {
        super(2, continuation);
        this.this$0 = ogvActionDelegate;
        this.$widget = jVar;
        this.$layoutParams = layoutParams;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvActionDelegate$handleOperationWidgetBizEvent$1(this.this$0, this.$widget, this.$layoutParams, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            AbsFunctionWidgetService absFunctionWidgetService = this.this$0.f94258a;
            j jVar = this.$widget;
            IFunctionContainer.LayoutParams layoutParams = this.$layoutParams;
            this.label = 1;
            if (IFunctionWidgetServiceKt.retainFunctionWidget$default(absFunctionWidgetService, jVar, layoutParams, (Function1) null, this, 4, (Object) null) == coroutine_suspended) {
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
