package com.bilibili.ship.theseus.cheese.biz.catalog;

import com.bilibili.ship.theseus.cheese.biz.catalog.panels.i;
import eu0.C6991j;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/CheeseCatalogService$showPreview$preFunc$1$2.class */
final class CheeseCatalogService$showPreview$preFunc$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final i.a $state;
    final C6991j $ware;
    int label;
    final CheeseCatalogService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseCatalogService$showPreview$preFunc$1$2(C6991j c6991j, CheeseCatalogService cheeseCatalogService, i.a aVar, Continuation<? super CheeseCatalogService$showPreview$preFunc$1$2> continuation) {
        super(2, continuation);
        this.$ware = c6991j;
        this.this$0 = cheeseCatalogService;
        this.$state = aVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheeseCatalogService$showPreview$preFunc$1$2(this.$ware, this.this$0, this.$state, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) throws kotlin.NoWhenBranchMatchedException {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r8 = r0
            r0 = r4
            int r0 = r0.label
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L30
            r0 = r6
            r1 = 1
            if (r0 == r1) goto L29
            r0 = r6
            r1 = 2
            if (r0 != r1) goto L1f
            r0 = r5
            kotlin.ResultKt.throwOnFailure(r0)
            goto La8
        L1f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L29:
            r0 = r5
            kotlin.ResultKt.throwOnFailure(r0)
            goto L68
        L30:
            r0 = r5
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r4
            eu0.j r0 = r0.$ware
            boolean r0 = r0.b()
            if (r0 == 0) goto L8b
            r0 = r4
            com.bilibili.ship.theseus.cheese.biz.catalog.CheeseCatalogService r0 = r0.this$0
            com.bilibili.ship.theseus.cheese.biz.catalog.CheeseCatalogRepository r0 = r0.f89120p
            r5 = r0
            r0 = r4
            com.bilibili.ship.theseus.cheese.biz.catalog.panels.i$a r0 = r0.$state
            eu0.j r0 = r0.f89220a
            java.lang.String r0 = r0.f117546f
            r7 = r0
            r0 = r4
            r1 = 1
            r0.label = r1
            r0 = r5
            r1 = r7
            r2 = r4
            java.lang.Object r0 = r0.a(r1, r2)
            r7 = r0
            r0 = r7
            r5 = r0
            r0 = r7
            r1 = r8
            if (r0 != r1) goto L68
            r0 = r8
            return r0
        L68:
            r0 = r5
            java.lang.String r0 = (java.lang.String) r0
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L79
            r0 = r4
            com.bilibili.ship.theseus.cheese.biz.catalog.panels.i$a r0 = r0.$state
            r1 = r5
            r0.f89223d = r1
        L79:
            r0 = r4
            com.bilibili.ship.theseus.cheese.biz.catalog.panels.i$a r0 = r0.$state
            androidx.compose.runtime.MutableState<com.bilibili.ship.theseus.cheese.biz.catalog.panels.Status> r0 = r0.f89221b
            com.bilibili.ship.theseus.cheese.biz.catalog.panels.Status r1 = com.bilibili.ship.theseus.cheese.biz.catalog.panels.Status.Finished
            r0.setValue(r1)
            goto La8
        L8b:
            r0 = r4
            com.bilibili.ship.theseus.cheese.biz.catalog.CheeseCatalogService r0 = r0.this$0
            r5 = r0
            r0 = r4
            com.bilibili.ship.theseus.cheese.biz.catalog.panels.i$a r0 = r0.$state
            r7 = r0
            r0 = r4
            r1 = 2
            r0.label = r1
            r0 = r5
            r1 = r7
            r2 = r4
            java.lang.Object r0 = com.bilibili.ship.theseus.cheese.biz.catalog.CheeseCatalogService.a(r0, r1, r2)
            r1 = r8
            if (r0 != r1) goto La8
            r0 = r8
            return r0
        La8:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.catalog.CheeseCatalogService$showPreview$preFunc$1$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
