package com.bilibili.ship.theseus.united.page.videoquality;

import com.bilibili.playerbizcommonv2.widget.quality.HighDefinitionQualityLoadingComponent;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusPlayerQualityService$showHighDefinitionQualityComponent$2$1.class */
final class TheseusPlayerQualityService$showHighDefinitionQualityComponent$2$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final HighDefinitionQualityLoadingComponent $component;
    Object L$0;
    Object L$1;
    int label;
    final TheseusPlayerQualityService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusPlayerQualityService$showHighDefinitionQualityComponent$2$1(TheseusPlayerQualityService theseusPlayerQualityService, HighDefinitionQualityLoadingComponent highDefinitionQualityLoadingComponent, Continuation<? super TheseusPlayerQualityService$showHighDefinitionQualityComponent$2$1> continuation) {
        super(1, continuation);
        this.this$0 = theseusPlayerQualityService;
        this.$component = highDefinitionQualityLoadingComponent;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new TheseusPlayerQualityService$showHighDefinitionQualityComponent$2$1(this.this$0, this.$component, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        com.bilibili.ship.theseus.united.page.screenstate.c cVar;
        HighDefinitionQualityLoadingComponent highDefinitionQualityLoadingComponent;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            highDefinitionQualityLoadingComponent = (HighDefinitionQualityLoadingComponent) this.L$1;
            com.bilibili.ship.theseus.united.page.screenstate.c cVar2 = (com.bilibili.ship.theseus.united.page.screenstate.c) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                cVar = cVar2;
                cVar.j(highDefinitionQualityLoadingComponent, false);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                cVar = cVar2;
                th = th;
                cVar.j(highDefinitionQualityLoadingComponent, false);
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        TheseusPlayerQualityService theseusPlayerQualityService = this.this$0;
        cVar = theseusPlayerQualityService.f103784l;
        highDefinitionQualityLoadingComponent = this.$component;
        cVar.j(highDefinitionQualityLoadingComponent, true);
        try {
            TheseusFloatLayerService theseusFloatLayerService = theseusPlayerQualityService.f103785m;
            this.L$0 = cVar;
            this.L$1 = highDefinitionQualityLoadingComponent;
            this.label = 1;
            if (theseusFloatLayerService.i(highDefinitionQualityLoadingComponent, null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            cVar.j(highDefinitionQualityLoadingComponent, false);
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            th = th2;
            cVar.j(highDefinitionQualityLoadingComponent, false);
            throw th;
        }
    }
}
