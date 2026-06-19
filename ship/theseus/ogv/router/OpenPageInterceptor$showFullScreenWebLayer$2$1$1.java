package com.bilibili.ship.theseus.ogv.router;

import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/router/OpenPageInterceptor$showFullScreenWebLayer$2$1$1.class */
public final class OpenPageInterceptor$showFullScreenWebLayer$2$1$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final com.bilibili.ship.theseus.ogv.web.ui.a $uiComponent;
    Object L$0;
    Object L$1;
    int label;
    final OpenPageInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenPageInterceptor$showFullScreenWebLayer$2$1$1(OpenPageInterceptor openPageInterceptor, com.bilibili.ship.theseus.ogv.web.ui.a aVar, Continuation<? super OpenPageInterceptor$showFullScreenWebLayer$2$1$1> continuation) {
        super(1, continuation);
        this.this$0 = openPageInterceptor;
        this.$uiComponent = aVar;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new OpenPageInterceptor$showFullScreenWebLayer$2$1$1(this.this$0, this.$uiComponent, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        c cVar;
        OpenPageInterceptor openPageInterceptor;
        Throwable th;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            openPageInterceptor = (OpenPageInterceptor) this.L$1;
            c cVar2 = (c) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                cVar = cVar2;
                cVar.j(openPageInterceptor, false);
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                cVar = cVar2;
                th = th2;
                cVar.j(openPageInterceptor, false);
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        OpenPageInterceptor openPageInterceptor2 = this.this$0;
        cVar = openPageInterceptor2.f94439d;
        UIComponent<?> uIComponent = this.$uiComponent;
        cVar.j(openPageInterceptor2, true);
        try {
            TheseusFloatLayerService theseusFloatLayerService = openPageInterceptor2.f94436a;
            this.L$0 = cVar;
            this.L$1 = openPageInterceptor2;
            this.label = 1;
            if (theseusFloatLayerService.i(uIComponent, null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            openPageInterceptor = openPageInterceptor2;
            cVar.j(openPageInterceptor, false);
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            openPageInterceptor = openPageInterceptor2;
            th = th3;
            cVar.j(openPageInterceptor, false);
            throw th;
        }
    }
}
