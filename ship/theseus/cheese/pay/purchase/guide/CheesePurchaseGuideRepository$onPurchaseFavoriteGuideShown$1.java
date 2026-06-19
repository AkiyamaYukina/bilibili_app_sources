package com.bilibili.ship.theseus.cheese.pay.purchase.guide;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/pay/purchase/guide/CheesePurchaseGuideRepository$onPurchaseFavoriteGuideShown$1.class */
public final class CheesePurchaseGuideRepository$onPurchaseFavoriteGuideShown$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $id;
    int label;
    final CheesePurchaseGuideRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheesePurchaseGuideRepository$onPurchaseFavoriteGuideShown$1(CheesePurchaseGuideRepository cheesePurchaseGuideRepository, String str, Continuation<? super CheesePurchaseGuideRepository$onPurchaseFavoriteGuideShown$1> continuation) {
        super(2, continuation);
        this.this$0 = cheesePurchaseGuideRepository;
        this.$id = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheesePurchaseGuideRepository$onPurchaseFavoriteGuideShown$1(this.this$0, this.$id, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CheesePurchaseGuideRepository cheesePurchaseGuideRepository = this.this$0;
            String str = this.$id;
            this.label = 1;
            cheesePurchaseGuideRepository.getClass();
            if (BuildersKt.withContext(Dispatchers.getIO(), new CheesePurchaseGuideRepository$isSeasonIdExist$2(cheesePurchaseGuideRepository, str, true, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        ((tv.danmaku.bili.widget.preference.a) this.this$0.f90523b.getValue()).o("purchase_favorite_guide_last_show_time", System.currentTimeMillis());
        return Unit.INSTANCE;
    }
}
