package com.bilibili.module.vip.mall;

import android.content.Context;
import com.bilibili.vip.VipPrivilegeType;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/mall/VipPurchaseService$checkOrder$2.class */
final class VipPurchaseService$checkOrder$2 extends SuspendLambda implements Function2<FlowCollector<? super Result<? extends VipPayResultInfo>>, Continuation<? super Unit>, Object> {
    final String $appId;
    final Context $context;
    final String $orderId;
    final VipPrivilegeType $privilegeType;
    final VipSkuPlatformUseType $vipSkuPlatformUseType;
    private Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VipPurchaseService$checkOrder$2(VipSkuPlatformUseType vipSkuPlatformUseType, String str, String str2, VipPrivilegeType vipPrivilegeType, Context context, Continuation<? super VipPurchaseService$checkOrder$2> continuation) {
        super(2, continuation);
        this.$vipSkuPlatformUseType = vipSkuPlatformUseType;
        this.$orderId = str;
        this.$appId = str2;
        this.$privilegeType = vipPrivilegeType;
        this.$context = context;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        VipPurchaseService$checkOrder$2 vipPurchaseService$checkOrder$2 = new VipPurchaseService$checkOrder$2(this.$vipSkuPlatformUseType, this.$orderId, this.$appId, this.$privilegeType, this.$context, continuation);
        vipPurchaseService$checkOrder$2.L$0 = obj;
        return vipPurchaseService$checkOrder$2;
    }

    public final Object invoke(FlowCollector<? super Result<VipPayResultInfo>> flowCollector, Continuation<? super Unit> continuation) {
        return create(flowCollector, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws com.bilibili.module.vip.mall.VipPurchaseException.OrderCheckFailed {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.module.vip.mall.VipPurchaseService$checkOrder$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
