package com.bilibili.ship.theseus.ugc.intro.ai;

import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.weblayer.TheseusWebUIComponent;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ai/UgcAiFeedbackService$showFeedbackLayer$1$1$1.class */
public final class UgcAiFeedbackService$showFeedbackLayer$1$1$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final TheseusFloatLayerService.a $layerConfig;
    final TheseusWebUIComponent $uiComponent;
    Object L$0;
    Object L$1;
    int label;
    final UgcAiFeedbackService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcAiFeedbackService$showFeedbackLayer$1$1$1(UgcAiFeedbackService ugcAiFeedbackService, TheseusWebUIComponent theseusWebUIComponent, TheseusFloatLayerService.a aVar, Continuation<? super UgcAiFeedbackService$showFeedbackLayer$1$1$1> continuation) {
        super(1, continuation);
        this.this$0 = ugcAiFeedbackService;
        this.$uiComponent = theseusWebUIComponent;
        this.$layerConfig = aVar;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new UgcAiFeedbackService$showFeedbackLayer$1$1$1(this.this$0, this.$uiComponent, this.$layerConfig, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        com.bilibili.ship.theseus.united.page.screenstate.c cVar;
        String str;
        com.bilibili.ship.theseus.united.page.screenstate.c cVar2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.L$1;
            com.bilibili.ship.theseus.united.page.screenstate.c cVar3 = (com.bilibili.ship.theseus.united.page.screenstate.c) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                cVar = cVar3;
                cVar.j(str, false);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                cVar2 = cVar3;
                th = th;
                cVar2.j(str, false);
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        UgcAiFeedbackService ugcAiFeedbackService = this.this$0;
        cVar = ugcAiFeedbackService.f96943f;
        UIComponent<?> uIComponent = this.$uiComponent;
        TheseusFloatLayerService.a aVar = this.$layerConfig;
        cVar.j("UgcAiFeedbackService", true);
        try {
            ugcAiFeedbackService.f96954r = false;
            TheseusFloatLayerService theseusFloatLayerService = ugcAiFeedbackService.f96940c;
            this.L$0 = cVar;
            this.L$1 = "UgcAiFeedbackService";
            this.label = 1;
            if (theseusFloatLayerService.e(uIComponent, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = "UgcAiFeedbackService";
            cVar.j(str, false);
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            th = th2;
            str = "UgcAiFeedbackService";
            cVar2 = cVar;
            cVar2.j(str, false);
            throw th;
        }
    }
}
