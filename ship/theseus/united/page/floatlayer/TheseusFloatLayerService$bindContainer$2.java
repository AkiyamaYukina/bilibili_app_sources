package com.bilibili.ship.theseus.united.page.floatlayer;

import android.widget.FrameLayout;
import com.bilibili.app.screen.adjust.widget.ScreenAdjustFloatLayerManager;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/TheseusFloatLayerService$bindContainer$2.class */
final class TheseusFloatLayerService$bindContainer$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final FrameLayout $container;
    final int $type;
    int label;
    final TheseusFloatLayerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusFloatLayerService$bindContainer$2(TheseusFloatLayerService theseusFloatLayerService, int i7, FrameLayout frameLayout, Continuation<? super TheseusFloatLayerService$bindContainer$2> continuation) {
        super(2, continuation);
        this.this$0 = theseusFloatLayerService;
        this.$type = i7;
        this.$container = frameLayout;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TheseusFloatLayerService$bindContainer$2(this.this$0, this.$type, this.$container, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ScreenAdjustFloatLayerManager screenAdjustFloatLayerManager = this.this$0.f99657f;
            int i8 = this.$type;
            FrameLayout frameLayout = this.$container;
            this.label = 1;
            if (screenAdjustFloatLayerManager.b(i8, frameLayout, this) == coroutine_suspended) {
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
