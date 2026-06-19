package com.bilibili.ship.theseus.cheese.biz.intro.primary;

import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/CheesePrimaryService$runCouponFloatLayer$1$1$2.class */
public final class CheesePrimaryService$runCouponFloatLayer$1$1$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final RunningUIComponent $runningUIComponent;
    Object L$0;
    Object L$1;
    int label;
    final CheesePrimaryService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheesePrimaryService$runCouponFloatLayer$1$1$2(CheesePrimaryService cheesePrimaryService, RunningUIComponent runningUIComponent, Continuation<? super CheesePrimaryService$runCouponFloatLayer$1$1$2> continuation) {
        super(1, continuation);
        this.this$0 = cheesePrimaryService;
        this.$runningUIComponent = runningUIComponent;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new CheesePrimaryService$runCouponFloatLayer$1$1$2(this.this$0, this.$runningUIComponent, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        com.bilibili.ship.theseus.united.page.playingarea.g gVar;
        RunningUIComponent runningUIComponent;
        com.bilibili.ship.theseus.united.page.playingarea.g gVar2;
        Throwable th;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            runningUIComponent = (RunningUIComponent) this.L$1;
            gVar2 = (com.bilibili.ship.theseus.united.page.playingarea.g) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                gVar = gVar2;
                gVar.j(runningUIComponent);
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                th = th2;
                gVar2.j(runningUIComponent);
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        CheesePrimaryService cheesePrimaryService = this.this$0;
        gVar = cheesePrimaryService.f89595g;
        RunningUIComponent runningUIComponent2 = this.$runningUIComponent;
        gVar.f(runningUIComponent2);
        try {
            TheseusFloatLayerService theseusFloatLayerService = cheesePrimaryService.f89594f;
            UIComponent<?> uIComponent = runningUIComponent2.a;
            this.L$0 = gVar;
            this.L$1 = runningUIComponent2;
            this.label = 1;
            if (theseusFloatLayerService.f(uIComponent, theseusFloatLayerService.f99664n, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            runningUIComponent = runningUIComponent2;
            gVar.j(runningUIComponent);
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            runningUIComponent = runningUIComponent2;
            gVar2 = gVar;
            th = th3;
            gVar2.j(runningUIComponent);
            throw th;
        }
    }
}
