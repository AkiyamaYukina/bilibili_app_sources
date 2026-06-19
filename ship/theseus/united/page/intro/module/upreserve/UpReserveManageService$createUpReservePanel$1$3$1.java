package com.bilibili.ship.theseus.united.page.intro.module.upreserve;

import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/upreserve/UpReserveManageService$createUpReservePanel$1$3$1.class */
public final class UpReserveManageService$createUpReservePanel$1$3$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final TheseusFloatLayerService.a $layerConfig;
    final Ref.ObjectRef<k> $uiComponent;
    int label;
    final j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpReserveManageService$createUpReservePanel$1$3$1(j jVar, Ref.ObjectRef<k> objectRef, TheseusFloatLayerService.a aVar, Continuation<? super UpReserveManageService$createUpReservePanel$1$3$1> continuation) {
        super(1, continuation);
        this.this$0 = jVar;
        this.$uiComponent = objectRef;
        this.$layerConfig = aVar;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new UpReserveManageService$createUpReservePanel$1$3$1(this.this$0, this.$uiComponent, this.$layerConfig, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            TheseusFloatLayerService theseusFloatLayerService = this.this$0.f102002g;
            UIComponent<?> uIComponent = (UIComponent) this.$uiComponent.element;
            TheseusFloatLayerService.a aVar = this.$layerConfig;
            this.label = 1;
            if (theseusFloatLayerService.e(uIComponent, aVar, this) == coroutine_suspended) {
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
