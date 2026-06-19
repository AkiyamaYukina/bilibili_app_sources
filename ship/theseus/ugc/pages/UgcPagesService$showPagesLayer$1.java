package com.bilibili.ship.theseus.ugc.pages;

import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/pages/UgcPagesService$showPagesLayer$1.class */
final class UgcPagesService$showPagesLayer$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final UgcPagesService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcPagesService$showPagesLayer$1(UgcPagesService ugcPagesService, Continuation<? super UgcPagesService$showPagesLayer$1> continuation) {
        super(2, continuation);
        this.this$0 = ugcPagesService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UgcPagesService$showPagesLayer$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        com.bilibili.ship.theseus.united.page.playingarea.g gVar;
        String str;
        com.bilibili.ship.theseus.united.page.playingarea.g gVar2;
        Throwable th;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.L$1;
            gVar2 = (com.bilibili.ship.theseus.united.page.playingarea.g) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                gVar = gVar2;
                gVar.j(str);
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                th = th2;
                gVar2.j(str);
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        UgcPagesService ugcPagesService = this.this$0;
        gVar = ugcPagesService.f98006i;
        gVar.f("ugc_episodes_list");
        try {
            TheseusFloatLayerService theseusFloatLayerService = ugcPagesService.f98005g;
            UIComponent<?> uIComponent = (UIComponent) ugcPagesService.f98012o.getValue();
            this.L$0 = gVar;
            this.L$1 = "ugc_episodes_list";
            this.label = 1;
            if (theseusFloatLayerService.h(uIComponent, theseusFloatLayerService.f99664n, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = "ugc_episodes_list";
            gVar.j(str);
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            str = "ugc_episodes_list";
            gVar2 = gVar;
            th = th3;
            gVar2.j(str);
            throw th;
        }
    }
}
