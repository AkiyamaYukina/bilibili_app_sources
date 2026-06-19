package com.bilibili.ship.theseus.united.page.videoquality;

import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusPlayerQualityService$showLoadingAnimation$5$1$1.class */
public final class TheseusPlayerQualityService$showLoadingAnimation$5$1$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final Ref.ObjectRef<UIComponent<?>> $uiComponent;
    Object L$0;
    Object L$1;
    int label;
    final TheseusPlayerQualityService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusPlayerQualityService$showLoadingAnimation$5$1$1(TheseusPlayerQualityService theseusPlayerQualityService, Ref.ObjectRef<UIComponent<?>> objectRef, Continuation<? super TheseusPlayerQualityService$showLoadingAnimation$5$1$1> continuation) {
        super(1, continuation);
        this.this$0 = theseusPlayerQualityService;
        this.$uiComponent = objectRef;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new TheseusPlayerQualityService$showLoadingAnimation$5$1$1(this.this$0, this.$uiComponent, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        com.bilibili.ship.theseus.united.page.screenstate.c cVar;
        Object obj2;
        com.bilibili.ship.theseus.united.page.screenstate.c cVar2;
        Throwable th;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = this.L$1;
            cVar2 = (com.bilibili.ship.theseus.united.page.screenstate.c) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                cVar = cVar2;
                cVar.j(obj2, false);
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                th = th2;
                cVar2.j(obj2, false);
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        TheseusPlayerQualityService theseusPlayerQualityService = this.this$0;
        cVar = theseusPlayerQualityService.f103784l;
        Ref.ObjectRef<UIComponent<?>> objectRef = this.$uiComponent;
        Object obj3 = objectRef.element;
        cVar.j(obj3, true);
        try {
            TheseusFloatLayerService theseusFloatLayerService = theseusPlayerQualityService.f103785m;
            UIComponent<?> uIComponent = (UIComponent) objectRef.element;
            this.L$0 = cVar;
            this.L$1 = obj3;
            this.label = 1;
            if (theseusFloatLayerService.i(uIComponent, null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj2 = obj3;
            cVar.j(obj2, false);
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            obj2 = obj3;
            cVar2 = cVar;
            th = th3;
            cVar2.j(obj2, false);
            throw th;
        }
    }
}
