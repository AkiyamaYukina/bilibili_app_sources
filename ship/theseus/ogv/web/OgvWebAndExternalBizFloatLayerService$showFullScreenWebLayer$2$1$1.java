package com.bilibili.ship.theseus.ogv.web;

import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/web/OgvWebAndExternalBizFloatLayerService$showFullScreenWebLayer$2$1$1.class */
public final class OgvWebAndExternalBizFloatLayerService$showFullScreenWebLayer$2$1$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final com.bilibili.ship.theseus.ogv.web.ui.a $uiComponent;
    Object L$0;
    Object L$1;
    int label;
    final b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvWebAndExternalBizFloatLayerService$showFullScreenWebLayer$2$1$1(b bVar, com.bilibili.ship.theseus.ogv.web.ui.a aVar, Continuation<? super OgvWebAndExternalBizFloatLayerService$showFullScreenWebLayer$2$1$1> continuation) {
        super(1, continuation);
        this.this$0 = bVar;
        this.$uiComponent = aVar;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new OgvWebAndExternalBizFloatLayerService$showFullScreenWebLayer$2$1$1(this.this$0, this.$uiComponent, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        c cVar;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.L$1;
            c cVar2 = (c) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                cVar = cVar2;
                cVar.j(str, false);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                cVar = cVar2;
                th = th;
                cVar.j(str, false);
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        b bVar = this.this$0;
        cVar = bVar.f94919d;
        UIComponent<?> uIComponent = this.$uiComponent;
        cVar.j("fullScreenWeb", true);
        try {
            TheseusFloatLayerService theseusFloatLayerService = bVar.f94916a;
            this.L$0 = cVar;
            this.L$1 = "fullScreenWeb";
            this.label = 1;
            if (theseusFloatLayerService.i(uIComponent, null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = "fullScreenWeb";
            cVar.j(str, false);
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            th = th2;
            str = "fullScreenWeb";
            cVar.j(str, false);
            throw th;
        }
    }
}
