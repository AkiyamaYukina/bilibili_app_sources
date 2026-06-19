package com.bilibili.ship.theseus.cheese.biz.catalog;

import com.bilibili.ship.theseus.cheese.biz.catalog.a;
import eu0.C6985d;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/CheeseCatalogTabFragment$onEpItemClick$1.class */
public final class CheeseCatalogTabFragment$onEpItemClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final C6985d $epData;
    int label;
    final CheeseCatalogTabFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseCatalogTabFragment$onEpItemClick$1(CheeseCatalogTabFragment cheeseCatalogTabFragment, C6985d c6985d, Continuation<? super CheeseCatalogTabFragment$onEpItemClick$1> continuation) {
        super(2, continuation);
        this.this$0 = cheeseCatalogTabFragment;
        this.$epData = c6985d;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheeseCatalogTabFragment$onEpItemClick$1(this.this$0, this.$epData, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.f89131b.f89128x.tryEmit(new a.i(this.$epData));
        return Unit.INSTANCE;
    }
}
