package com.bilibili.ship.theseus.cheese.biz.catalog;

import com.bilibili.ogv.infra.coroutine.SelectKt$selectCancellingUnselected$scope$1;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/CheeseCatalogService$showCourseListPanel$1.class */
final class CheeseCatalogService$showCourseListPanel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final com.bilibili.ship.theseus.cheese.biz.catalog.panels.d $uiComponent;
    int label;
    final CheeseCatalogService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseCatalogService$showCourseListPanel$1(CheeseCatalogService cheeseCatalogService, com.bilibili.ship.theseus.cheese.biz.catalog.panels.d dVar, Continuation<? super CheeseCatalogService$showCourseListPanel$1> continuation) {
        super(2, continuation);
        this.this$0 = cheeseCatalogService;
        this.$uiComponent = dVar;
    }

    private static final Unit invokeSuspend$lambda$0(CheeseCatalogService cheeseCatalogService, com.bilibili.ship.theseus.cheese.biz.catalog.panels.d dVar, com.bilibili.ogv.infra.coroutine.c cVar) {
        cVar.b(new CheeseCatalogService$showCourseListPanel$1$1$1(cheeseCatalogService, dVar, null));
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheeseCatalogService$showCourseListPanel$1(this.this$0, this.$uiComponent, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CheeseCatalogService cheeseCatalogService = this.this$0;
            com.bilibili.ship.theseus.cheese.biz.catalog.panels.d dVar = this.$uiComponent;
            this.label = 1;
            ArrayList arrayList = new ArrayList();
            invokeSuspend$lambda$0(cheeseCatalogService, dVar, new SelectKt$selectCancellingUnselected$scope$1(arrayList));
            if (FlowKt.first(FlowKt.merge(arrayList), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
