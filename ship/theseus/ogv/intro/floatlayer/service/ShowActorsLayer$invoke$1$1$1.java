package com.bilibili.ship.theseus.ogv.intro.floatlayer.service;

import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/service/ShowActorsLayer$invoke$1$1$1.class */
public final class ShowActorsLayer$invoke$1$1$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final RunningUIComponent $runningUIComponent;
    Object L$0;
    Object L$1;
    int label;
    final c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShowActorsLayer$invoke$1$1$1(c cVar, RunningUIComponent runningUIComponent, Continuation<? super ShowActorsLayer$invoke$1$1$1> continuation) {
        super(1, continuation);
        this.this$0 = cVar;
        this.$runningUIComponent = runningUIComponent;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new ShowActorsLayer$invoke$1$1$1(this.this$0, this.$runningUIComponent, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        c cVar;
        com.bilibili.ship.theseus.united.page.playingarea.g gVar;
        com.bilibili.ship.theseus.united.page.playingarea.g gVar2;
        Throwable th;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar = (c) this.L$1;
            gVar2 = (com.bilibili.ship.theseus.united.page.playingarea.g) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                gVar = gVar2;
                gVar.j(cVar);
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                th = th2;
                gVar2.j(cVar);
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        cVar = this.this$0;
        gVar = cVar.f92995f;
        RunningUIComponent runningUIComponent = this.$runningUIComponent;
        gVar.f(cVar);
        try {
            TheseusFloatLayerService theseusFloatLayerService = cVar.f92994e;
            UIComponent<?> uIComponent = runningUIComponent.a;
            this.L$0 = gVar;
            this.L$1 = cVar;
            this.label = 1;
            if (theseusFloatLayerService.h(uIComponent, theseusFloatLayerService.f99664n, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            gVar.j(cVar);
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            gVar2 = gVar;
            th = th3;
            gVar2.j(cVar);
            throw th;
        }
    }
}
