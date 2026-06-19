package com.bilibili.ship.theseus.united.page.intro.module.season;

import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonPanelService$showSeasonPanel2$2$1.class */
final class UnitedSeasonPanelService$showSeasonPanel2$2$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final C6360w $uiComponent;
    int label;
    final UnitedSeasonPanelService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnitedSeasonPanelService$showSeasonPanel2$2$1(C6360w c6360w, UnitedSeasonPanelService unitedSeasonPanelService, Continuation<? super UnitedSeasonPanelService$showSeasonPanel2$2$1> continuation) {
        super(1, continuation);
        this.$uiComponent = c6360w;
        this.this$0 = unitedSeasonPanelService;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new UnitedSeasonPanelService$showSeasonPanel2$2$1(this.$uiComponent, this.this$0, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            this.$uiComponent.j(!this.this$0.f101605p.f());
            TheseusFloatLayerService theseusFloatLayerService = this.this$0.f101600k;
            C6360w c6360w = this.$uiComponent;
            this.label = 1;
            if (theseusFloatLayerService.h(c6360w, null, this) == coroutine_suspended) {
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
