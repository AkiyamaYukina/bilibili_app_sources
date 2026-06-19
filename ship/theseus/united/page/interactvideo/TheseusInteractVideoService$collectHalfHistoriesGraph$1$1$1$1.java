package com.bilibili.ship.theseus.united.page.interactvideo;

import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractVideoService$collectHalfHistoriesGraph$1$1$1$1.class */
public final class TheseusInteractVideoService$collectHalfHistoriesGraph$1$1$1$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final m $uiComponent;
    Object L$0;
    Object L$1;
    int label;
    final TheseusInteractVideoService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusInteractVideoService$collectHalfHistoriesGraph$1$1$1$1(TheseusInteractVideoService theseusInteractVideoService, m mVar, Continuation<? super TheseusInteractVideoService$collectHalfHistoriesGraph$1$1$1$1> continuation) {
        super(1, continuation);
        this.this$0 = theseusInteractVideoService;
        this.$uiComponent = mVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invokeSuspend$lambda$0$0(TheseusInteractVideoService theseusInteractVideoService) {
        return theseusInteractVideoService.f99904u.f() ? 3 : 1;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new TheseusInteractVideoService$collectHalfHistoriesGraph$1$1$1$1(this.this$0, this.$uiComponent, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        com.bilibili.ship.theseus.united.page.screenstate.c cVar;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.L$1;
            com.bilibili.ship.theseus.united.page.screenstate.c cVar2 = (com.bilibili.ship.theseus.united.page.screenstate.c) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                cVar = cVar2;
                cVar.j(str, false);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                th = th;
                cVar = cVar2;
                cVar.j(str, false);
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        final TheseusInteractVideoService theseusInteractVideoService = this.this$0;
        cVar = theseusInteractVideoService.f99901r;
        UIComponent<?> uIComponent = this.$uiComponent;
        cVar.j("TheseusInteractVideoService", true);
        try {
            uIComponent.j(!theseusInteractVideoService.f99904u.f());
            TheseusFloatLayerService theseusFloatLayerService = theseusInteractVideoService.f99899p;
            TheseusFloatLayerService.a aVar = new TheseusFloatLayerService.a(0, 0, new Function0(theseusInteractVideoService) { // from class: com.bilibili.ship.theseus.united.page.interactvideo.r

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final TheseusInteractVideoService f100004a;

                {
                    this.f100004a = theseusInteractVideoService;
                }

                public final Object invoke() {
                    return Integer.valueOf(TheseusInteractVideoService$collectHalfHistoriesGraph$1$1$1$1.invokeSuspend$lambda$0$0(this.f100004a));
                }
            }, 12);
            this.L$0 = cVar;
            this.L$1 = "TheseusInteractVideoService";
            this.label = 1;
            if (theseusFloatLayerService.e(uIComponent, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = "TheseusInteractVideoService";
            cVar.j(str, false);
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            th = th2;
            str = "TheseusInteractVideoService";
            cVar.j(str, false);
            throw th;
        }
    }
}
