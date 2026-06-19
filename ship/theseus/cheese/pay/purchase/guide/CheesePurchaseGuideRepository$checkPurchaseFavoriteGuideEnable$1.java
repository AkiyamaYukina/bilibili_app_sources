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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/pay/purchase/guide/CheesePurchaseGuideRepository$checkPurchaseFavoriteGuideEnable$1.class */
public final class CheesePurchaseGuideRepository$checkPurchaseFavoriteGuideEnable$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $id;
    Object L$0;
    int label;
    final CheesePurchaseGuideRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheesePurchaseGuideRepository$checkPurchaseFavoriteGuideEnable$1(CheesePurchaseGuideRepository cheesePurchaseGuideRepository, String str, Continuation<? super CheesePurchaseGuideRepository$checkPurchaseFavoriteGuideEnable$1> continuation) {
        super(2, continuation);
        this.this$0 = cheesePurchaseGuideRepository;
        this.$id = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheesePurchaseGuideRepository$checkPurchaseFavoriteGuideEnable$1(this.this$0, this.$id, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        CheesePurchaseGuideRepository cheesePurchaseGuideRepository;
        CheesePurchaseGuideRepository cheesePurchaseGuideRepository2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        boolean z6 = false;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            long j7 = ((tv.danmaku.bili.widget.preference.a) this.this$0.f90523b.getValue()).a.getLong("purchase_favorite_guide_last_show_time", 0L);
            long jCurrentTimeMillis = System.currentTimeMillis();
            cheesePurchaseGuideRepository = this.this$0;
            cheesePurchaseGuideRepository2 = cheesePurchaseGuideRepository;
            if (jCurrentTimeMillis - j7 > 86400000) {
                String str = this.$id;
                this.L$0 = cheesePurchaseGuideRepository;
                this.label = 1;
                cheesePurchaseGuideRepository.getClass();
                obj = BuildersKt.withContext(Dispatchers.getIO(), new CheesePurchaseGuideRepository$isSeasonIdExist$2(cheesePurchaseGuideRepository, str, false, null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            cheesePurchaseGuideRepository2.f90526e = z6;
            return Unit.INSTANCE;
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        cheesePurchaseGuideRepository = (CheesePurchaseGuideRepository) this.L$0;
        ResultKt.throwOnFailure(obj);
        if (((Boolean) obj).booleanValue()) {
            cheesePurchaseGuideRepository2 = cheesePurchaseGuideRepository;
        } else {
            z6 = true;
            cheesePurchaseGuideRepository2 = cheesePurchaseGuideRepository;
        }
        cheesePurchaseGuideRepository2.f90526e = z6;
        return Unit.INSTANCE;
    }
}
