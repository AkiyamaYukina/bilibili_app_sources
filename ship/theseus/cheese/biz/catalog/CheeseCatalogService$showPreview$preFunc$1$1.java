package com.bilibili.ship.theseus.cheese.biz.catalog;

import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/CheeseCatalogService$showPreview$preFunc$1$1.class */
final class CheeseCatalogService$showPreview$preFunc$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final com.bilibili.ship.theseus.cheese.biz.catalog.panels.i $uiComponent;
    Object L$0;
    Object L$1;
    int label;
    final CheeseCatalogService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseCatalogService$showPreview$preFunc$1$1(CheeseCatalogService cheeseCatalogService, com.bilibili.ship.theseus.cheese.biz.catalog.panels.i iVar, Continuation<? super CheeseCatalogService$showPreview$preFunc$1$1> continuation) {
        super(2, continuation);
        this.this$0 = cheeseCatalogService;
        this.$uiComponent = iVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheeseCatalogService$showPreview$preFunc$1$1(this.this$0, this.$uiComponent, continuation);
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
            com.bilibili.ship.theseus.united.page.playingarea.g gVar3 = (com.bilibili.ship.theseus.united.page.playingarea.g) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                gVar = gVar3;
                gVar.j(str);
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                th = th2;
                gVar2 = gVar3;
                gVar2.j(str);
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        CheeseCatalogService cheeseCatalogService = this.this$0;
        gVar = cheeseCatalogService.f89117m;
        com.bilibili.ship.theseus.cheese.biz.catalog.panels.i iVar = this.$uiComponent;
        gVar.f("CheeseCatalogService");
        try {
            TheseusFloatLayerService theseusFloatLayerService = cheeseCatalogService.f89116l;
            this.L$0 = gVar;
            this.L$1 = "CheeseCatalogService";
            this.label = 1;
            if (theseusFloatLayerService.h(iVar, theseusFloatLayerService.f99664n, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = "CheeseCatalogService";
            gVar.j(str);
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            str = "CheeseCatalogService";
            gVar2 = gVar;
            th = th3;
            gVar2.j(str);
            throw th;
        }
    }
}
