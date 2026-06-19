package com.bilibili.mall.kmm.order;

import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/order/MallOrderInfoPageVM$loadData$4.class */
public final class MallOrderInfoPageVM$loadData$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Map<String, Object> $requestParams;
    Object L$0;
    Object L$1;
    int label;
    final MallOrderInfoPageVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MallOrderInfoPageVM$loadData$4(MallOrderInfoPageVM mallOrderInfoPageVM, Map<String, ? extends Object> map, Continuation<? super MallOrderInfoPageVM$loadData$4> continuation) {
        super(2, continuation);
        this.this$0 = mallOrderInfoPageVM;
        this.$requestParams = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(MallOrderInfoPageVM mallOrderInfoPageVM) {
        BuildersKt.launch$default(mallOrderInfoPageVM.f65618a, (CoroutineContext) null, (CoroutineStart) null, new MallOrderInfoPageVM$loadData$4$1$1(mallOrderInfoPageVM, null), 3, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(String str, MallOrderInfoPageVM mallOrderInfoPageVM) {
        if (str != null) {
            BuildersKt.launch$default(mallOrderInfoPageVM.f65618a, (CoroutineContext) null, (CoroutineStart) null, new MallOrderInfoPageVM$loadData$4$2$1$1(mallOrderInfoPageVM, str, null), 3, (Object) null);
        }
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MallOrderInfoPageVM$loadData$4(this.this$0, this.$requestParams, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x019e A[Catch: Exception -> 0x0099, CancellationException -> 0x009e, TryCatch #2 {CancellationException -> 0x009e, Exception -> 0x0099, blocks: (B:9:0x0092, B:112:0x0402, B:113:0x0406, B:113:0x0406, B:15:0x00b4, B:100:0x0394, B:17:0x00cd, B:56:0x0272, B:58:0x027d, B:65:0x0295, B:72:0x02b0, B:79:0x02cb, B:81:0x02d8, B:83:0x02ea, B:20:0x00e9, B:44:0x021c, B:21:0x00f0, B:28:0x012c, B:32:0x016b, B:34:0x0174, B:36:0x019e, B:38:0x01d4, B:40:0x01e9, B:48:0x0233, B:50:0x023e, B:52:0x0262, B:87:0x0333, B:89:0x033e, B:94:0x0356, B:96:0x0361, B:101:0x03a3, B:106:0x03c9, B:108:0x03d5, B:23:0x00fb), top: B:166:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x027d A[Catch: Exception -> 0x0099, CancellationException -> 0x009e, TRY_ENTER, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x009e, Exception -> 0x0099, blocks: (B:9:0x0092, B:112:0x0402, B:113:0x0406, B:113:0x0406, B:15:0x00b4, B:100:0x0394, B:17:0x00cd, B:56:0x0272, B:58:0x027d, B:65:0x0295, B:72:0x02b0, B:79:0x02cb, B:81:0x02d8, B:83:0x02ea, B:20:0x00e9, B:44:0x021c, B:21:0x00f0, B:28:0x012c, B:32:0x016b, B:34:0x0174, B:36:0x019e, B:38:0x01d4, B:40:0x01e9, B:48:0x0233, B:50:0x023e, B:52:0x0262, B:87:0x0333, B:89:0x033e, B:94:0x0356, B:96:0x0361, B:101:0x03a3, B:106:0x03c9, B:108:0x03d5, B:23:0x00fb), top: B:166:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0391  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 1469
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.mall.kmm.order.MallOrderInfoPageVM$loadData$4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
