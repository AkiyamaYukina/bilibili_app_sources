package com.bilibili.ship.theseus.cheese.biz.catalog;

import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/CheeseCatalogService$showCourseListPanel$1$1$1.class */
public final class CheeseCatalogService$showCourseListPanel$1$1$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final com.bilibili.ship.theseus.cheese.biz.catalog.panels.d $uiComponent;
    Object L$0;
    Object L$1;
    int label;
    final CheeseCatalogService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseCatalogService$showCourseListPanel$1$1$1(CheeseCatalogService cheeseCatalogService, com.bilibili.ship.theseus.cheese.biz.catalog.panels.d dVar, Continuation<? super CheeseCatalogService$showCourseListPanel$1$1$1> continuation) {
        super(1, continuation);
        this.this$0 = cheeseCatalogService;
        this.$uiComponent = dVar;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new CheeseCatalogService$showCourseListPanel$1$1$1(this.this$0, this.$uiComponent, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        com.bilibili.ship.theseus.united.page.playingarea.g gVar;
        String str;
        com.bilibili.ship.theseus.united.page.playingarea.g gVar2;
        String str2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) this.L$1;
            gVar2 = (com.bilibili.ship.theseus.united.page.playingarea.g) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                gVar = gVar2;
                gVar.j(str2);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                str = str2;
                th = th;
                gVar2.j(str);
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        CheeseCatalogService cheeseCatalogService = this.this$0;
        gVar = cheeseCatalogService.f89117m;
        UIComponent<?> uIComponent = this.$uiComponent;
        gVar.f("CheeseCatalogService");
        try {
            uIComponent.j(!cheeseCatalogService.f89125u.f());
            TheseusFloatLayerService theseusFloatLayerService = cheeseCatalogService.f89116l;
            this.L$0 = gVar;
            this.L$1 = "CheeseCatalogService";
            this.label = 1;
            if (theseusFloatLayerService.h(uIComponent, null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            str2 = "CheeseCatalogService";
            gVar.j(str2);
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            th = th2;
            str = "CheeseCatalogService";
            gVar2 = gVar;
            gVar2.j(str);
            throw th;
        }
    }
}
