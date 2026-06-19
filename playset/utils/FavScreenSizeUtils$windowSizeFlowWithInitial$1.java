package com.bilibili.playset.utils;

import androidx.activity.ComponentActivity;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/utils/FavScreenSizeUtils$windowSizeFlowWithInitial$1.class */
final class FavScreenSizeUtils$windowSizeFlowWithInitial$1 extends SuspendLambda implements Function2<FlowCollector<? super WindowSizeClass>, Continuation<? super Unit>, Object> {
    final ComponentActivity $this_windowSizeFlowWithInitial;
    private Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavScreenSizeUtils$windowSizeFlowWithInitial$1(ComponentActivity componentActivity, Continuation<? super FavScreenSizeUtils$windowSizeFlowWithInitial$1> continuation) {
        super(2, continuation);
        this.$this_windowSizeFlowWithInitial = componentActivity;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FavScreenSizeUtils$windowSizeFlowWithInitial$1 favScreenSizeUtils$windowSizeFlowWithInitial$1 = new FavScreenSizeUtils$windowSizeFlowWithInitial$1(this.$this_windowSizeFlowWithInitial, continuation);
        favScreenSizeUtils$windowSizeFlowWithInitial$1.L$0 = obj;
        return favScreenSizeUtils$windowSizeFlowWithInitial$1;
    }

    public final Object invoke(FlowCollector<? super WindowSizeClass> flowCollector, Continuation<? super Unit> continuation) {
        return create(flowCollector, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            WindowSizeClass windowSizeClassWindowSize = ScreenAdjustUtilsKt.windowSize(this.$this_windowSizeFlowWithInitial);
            this.label = 1;
            if (flowCollector.emit(windowSizeClassWindowSize, this) == coroutine_suspended) {
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
