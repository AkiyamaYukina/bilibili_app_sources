package com.bilibili.mall.kmm.order.combine;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/order/combine/MallCombineOrderPageVM$createOrder$2.class */
public final class MallCombineOrderPageVM$createOrder$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final MallCombineOrderPageVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MallCombineOrderPageVM$createOrder$2(MallCombineOrderPageVM mallCombineOrderPageVM, Continuation<? super MallCombineOrderPageVM$createOrder$2> continuation) {
        super(2, continuation);
        this.this$0 = mallCombineOrderPageVM;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(MallCombineOrderPageVM mallCombineOrderPageVM) {
        BuildersKt.launch$default(mallCombineOrderPageVM.f65645a, (CoroutineContext) null, (CoroutineStart) null, new MallCombineOrderPageVM$createOrder$2$1$1(mallCombineOrderPageVM, null), 3, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(String str, MallCombineOrderPageVM mallCombineOrderPageVM) {
        if (str != null) {
            BuildersKt.launch$default(mallCombineOrderPageVM.f65645a, (CoroutineContext) null, (CoroutineStart) null, new MallCombineOrderPageVM$createOrder$2$2$1$1(mallCombineOrderPageVM, str, null), 3, (Object) null);
        }
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MallCombineOrderPageVM$createOrder$2(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0509 A[Catch: Exception -> 0x00c5, CancellationException -> 0x00ca, TRY_ENTER, TryCatch #2 {CancellationException -> 0x00ca, Exception -> 0x00c5, blocks: (B:10:0x00be, B:145:0x054e, B:146:0x0552, B:146:0x0552, B:16:0x00e0, B:132:0x04d1, B:18:0x00f9, B:88:0x03a2, B:90:0x03ad, B:97:0x03c5, B:104:0x03e0, B:111:0x03fb, B:113:0x0408, B:115:0x041a, B:21:0x0115, B:76:0x034f, B:23:0x012e, B:67:0x02eb, B:70:0x0342, B:26:0x014a, B:56:0x028d, B:28:0x0163, B:47:0x0232, B:50:0x0280, B:30:0x016d, B:37:0x01af, B:40:0x01ef, B:42:0x01f8, B:60:0x02aa, B:62:0x02b4, B:80:0x035e, B:82:0x0369, B:84:0x0394, B:119:0x0463, B:121:0x046e, B:126:0x0491, B:128:0x049e, B:133:0x04d8, B:137:0x04f4, B:139:0x0509, B:141:0x0516, B:32:0x0178), top: B:206:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0280 A[Catch: Exception -> 0x00c5, CancellationException -> 0x00ca, TRY_ENTER, TryCatch #2 {CancellationException -> 0x00ca, Exception -> 0x00c5, blocks: (B:10:0x00be, B:145:0x054e, B:146:0x0552, B:146:0x0552, B:16:0x00e0, B:132:0x04d1, B:18:0x00f9, B:88:0x03a2, B:90:0x03ad, B:97:0x03c5, B:104:0x03e0, B:111:0x03fb, B:113:0x0408, B:115:0x041a, B:21:0x0115, B:76:0x034f, B:23:0x012e, B:67:0x02eb, B:70:0x0342, B:26:0x014a, B:56:0x028d, B:28:0x0163, B:47:0x0232, B:50:0x0280, B:30:0x016d, B:37:0x01af, B:40:0x01ef, B:42:0x01f8, B:60:0x02aa, B:62:0x02b4, B:80:0x035e, B:82:0x0369, B:84:0x0394, B:119:0x0463, B:121:0x046e, B:126:0x0491, B:128:0x049e, B:133:0x04d8, B:137:0x04f4, B:139:0x0509, B:141:0x0516, B:32:0x0178), top: B:206:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0342 A[Catch: Exception -> 0x00c5, CancellationException -> 0x00ca, TRY_ENTER, TryCatch #2 {CancellationException -> 0x00ca, Exception -> 0x00c5, blocks: (B:10:0x00be, B:145:0x054e, B:146:0x0552, B:146:0x0552, B:16:0x00e0, B:132:0x04d1, B:18:0x00f9, B:88:0x03a2, B:90:0x03ad, B:97:0x03c5, B:104:0x03e0, B:111:0x03fb, B:113:0x0408, B:115:0x041a, B:21:0x0115, B:76:0x034f, B:23:0x012e, B:67:0x02eb, B:70:0x0342, B:26:0x014a, B:56:0x028d, B:28:0x0163, B:47:0x0232, B:50:0x0280, B:30:0x016d, B:37:0x01af, B:40:0x01ef, B:42:0x01f8, B:60:0x02aa, B:62:0x02b4, B:80:0x035e, B:82:0x0369, B:84:0x0394, B:119:0x0463, B:121:0x046e, B:126:0x0491, B:128:0x049e, B:133:0x04d8, B:137:0x04f4, B:139:0x0509, B:141:0x0516, B:32:0x0178), top: B:206:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03ad A[Catch: Exception -> 0x00c5, CancellationException -> 0x00ca, TRY_ENTER, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00ca, Exception -> 0x00c5, blocks: (B:10:0x00be, B:145:0x054e, B:146:0x0552, B:146:0x0552, B:16:0x00e0, B:132:0x04d1, B:18:0x00f9, B:88:0x03a2, B:90:0x03ad, B:97:0x03c5, B:104:0x03e0, B:111:0x03fb, B:113:0x0408, B:115:0x041a, B:21:0x0115, B:76:0x034f, B:23:0x012e, B:67:0x02eb, B:70:0x0342, B:26:0x014a, B:56:0x028d, B:28:0x0163, B:47:0x0232, B:50:0x0280, B:30:0x016d, B:37:0x01af, B:40:0x01ef, B:42:0x01f8, B:60:0x02aa, B:62:0x02b4, B:80:0x035e, B:82:0x0369, B:84:0x0394, B:119:0x0463, B:121:0x046e, B:126:0x0491, B:128:0x049e, B:133:0x04d8, B:137:0x04f4, B:139:0x0509, B:141:0x0516, B:32:0x0178), top: B:206:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 1896
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.mall.kmm.order.combine.MallCombineOrderPageVM$createOrder$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
