package com.bilibili.mall.kmm.order.combine;

import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/order/combine/MallCombineOrderPageVM$loadData$4.class */
public final class MallCombineOrderPageVM$loadData$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Map<String, Object> $mutableRequestParams;
    Object L$0;
    Object L$1;
    int label;
    final MallCombineOrderPageVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MallCombineOrderPageVM$loadData$4(MallCombineOrderPageVM mallCombineOrderPageVM, Map<String, Object> map, Continuation<? super MallCombineOrderPageVM$loadData$4> continuation) {
        super(2, continuation);
        this.this$0 = mallCombineOrderPageVM;
        this.$mutableRequestParams = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(MallCombineOrderPageVM mallCombineOrderPageVM) {
        BuildersKt.launch$default(mallCombineOrderPageVM.f65645a, (CoroutineContext) null, (CoroutineStart) null, new MallCombineOrderPageVM$loadData$4$1$1(mallCombineOrderPageVM, null), 3, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(String str, MallCombineOrderPageVM mallCombineOrderPageVM) {
        if (str != null) {
            BuildersKt.launch$default(mallCombineOrderPageVM.f65645a, (CoroutineContext) null, (CoroutineStart) null, new MallCombineOrderPageVM$loadData$4$2$1$1(mallCombineOrderPageVM, str, null), 3, (Object) null);
        }
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MallCombineOrderPageVM$loadData$4(this.this$0, this.$mutableRequestParams, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x030b A[Catch: Exception -> 0x009d, CancellationException -> 0x00a2, TryCatch #2 {CancellationException -> 0x00a2, Exception -> 0x009d, blocks: (B:9:0x0096, B:110:0x0562, B:111:0x0566, B:111:0x0566, B:15:0x00b8, B:98:0x04ea, B:17:0x00d1, B:54:0x03c4, B:56:0x03cf, B:63:0x03e7, B:70:0x0402, B:77:0x041d, B:79:0x042a, B:81:0x043c, B:20:0x00ed, B:37:0x02ff, B:39:0x030b, B:41:0x0357, B:43:0x036e, B:21:0x00f4, B:28:0x0171, B:31:0x0297, B:33:0x029f, B:44:0x037c, B:47:0x0389, B:49:0x0393, B:82:0x0477, B:85:0x0484, B:87:0x048e, B:89:0x049c, B:92:0x04ac, B:94:0x04b7, B:99:0x04f9, B:104:0x052a, B:106:0x0535, B:23:0x00ff), top: B:164:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x03cf A[Catch: Exception -> 0x009d, CancellationException -> 0x00a2, TRY_ENTER, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00a2, Exception -> 0x009d, blocks: (B:9:0x0096, B:110:0x0562, B:111:0x0566, B:111:0x0566, B:15:0x00b8, B:98:0x04ea, B:17:0x00d1, B:54:0x03c4, B:56:0x03cf, B:63:0x03e7, B:70:0x0402, B:77:0x041d, B:79:0x042a, B:81:0x043c, B:20:0x00ed, B:37:0x02ff, B:39:0x030b, B:41:0x0357, B:43:0x036e, B:21:0x00f4, B:28:0x0171, B:31:0x0297, B:33:0x029f, B:44:0x037c, B:47:0x0389, B:49:0x0393, B:82:0x0477, B:85:0x0484, B:87:0x048e, B:89:0x049c, B:92:0x04ac, B:94:0x04b7, B:99:0x04f9, B:104:0x052a, B:106:0x0535, B:23:0x00ff), top: B:164:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x049c A[Catch: Exception -> 0x009d, CancellationException -> 0x00a2, TRY_ENTER, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00a2, Exception -> 0x009d, blocks: (B:9:0x0096, B:110:0x0562, B:111:0x0566, B:111:0x0566, B:15:0x00b8, B:98:0x04ea, B:17:0x00d1, B:54:0x03c4, B:56:0x03cf, B:63:0x03e7, B:70:0x0402, B:77:0x041d, B:79:0x042a, B:81:0x043c, B:20:0x00ed, B:37:0x02ff, B:39:0x030b, B:41:0x0357, B:43:0x036e, B:21:0x00f4, B:28:0x0171, B:31:0x0297, B:33:0x029f, B:44:0x037c, B:47:0x0389, B:49:0x0393, B:82:0x0477, B:85:0x0484, B:87:0x048e, B:89:0x049c, B:92:0x04ac, B:94:0x04b7, B:99:0x04f9, B:104:0x052a, B:106:0x0535, B:23:0x00ff), top: B:164:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x04e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 1875
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.mall.kmm.order.combine.MallCombineOrderPageVM$loadData$4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
