package com.bilibili.module.vip.mall;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/mall/VipPurchaseService$requestOrderCheck$2.class */
final class VipPurchaseService$requestOrderCheck$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super VipPayResultInfo>, Object> {
    final String $appId;
    final String $orderId;
    final String $paymentScenario;
    final VipSkuPlatformUseType $vipSkuPlatformUseType;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VipPurchaseService$requestOrderCheck$2(VipSkuPlatformUseType vipSkuPlatformUseType, String str, String str2, String str3, Continuation<? super VipPurchaseService$requestOrderCheck$2> continuation) {
        super(2, continuation);
        this.$vipSkuPlatformUseType = vipSkuPlatformUseType;
        this.$orderId = str;
        this.$appId = str2;
        this.$paymentScenario = str3;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VipPurchaseService$requestOrderCheck$2(this.$vipSkuPlatformUseType, this.$orderId, this.$appId, this.$paymentScenario, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super VipPayResultInfo> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.module.vip.mall.VipPurchaseService$requestOrderCheck$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
