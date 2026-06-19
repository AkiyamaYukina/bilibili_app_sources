package com.bilibili.ship.theseus.cheese.biz.catalog;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/CheeseCatalogService$gotoLiveRoom$2.class */
final class CheeseCatalogService$gotoLiveRoom$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $epId;
    int label;
    final CheeseCatalogService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseCatalogService$gotoLiveRoom$2(CheeseCatalogService cheeseCatalogService, long j7, Continuation<? super CheeseCatalogService$gotoLiveRoom$2> continuation) {
        super(2, continuation);
        this.this$0 = cheeseCatalogService;
        this.$epId = j7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheeseCatalogService$gotoLiveRoom$2(this.this$0, this.$epId, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CheeseCatalogRepository cheeseCatalogRepository = this.this$0.f89120p;
            long j7 = this.$epId;
            this.label = 1;
            Object objB = cheeseCatalogRepository.b(j7, this);
            obj = objB;
            if (objB == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        String str = (String) obj;
        if (str != null) {
            qV.a.a(this.this$0.f89107b, str, "");
        }
        return Unit.INSTANCE;
    }
}
