package com.bilibili.mall.kmm.virtumart;

import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/virtumart/MallCoursePageVM$loadData$1.class */
public final class MallCoursePageVM$loadData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Map<String, Object> $requestParams;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final MallCoursePageVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MallCoursePageVM$loadData$1(MallCoursePageVM mallCoursePageVM, Map<String, ? extends Object> map, Continuation<? super MallCoursePageVM$loadData$1> continuation) {
        super(2, continuation);
        this.this$0 = mallCoursePageVM;
        this.$requestParams = map;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MallCoursePageVM$loadData$1(this.this$0, this.$requestParams, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d0 A[Catch: Exception -> 0x007c, CancellationException -> 0x0080, TRY_ENTER, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0080, Exception -> 0x007c, blocks: (B:8:0x0075, B:14:0x0094, B:54:0x0221, B:56:0x022c, B:59:0x0231, B:61:0x023c, B:63:0x0245, B:65:0x0252, B:67:0x025a, B:69:0x0270, B:71:0x027a, B:76:0x028e, B:79:0x029a, B:81:0x02a5, B:85:0x02f7, B:17:0x00ad, B:92:0x032a, B:19:0x00e4, B:36:0x01c0, B:20:0x00eb, B:27:0x0122, B:30:0x0144, B:32:0x014c, B:39:0x01c5, B:41:0x01d0, B:43:0x01da, B:45:0x01e3, B:48:0x01ef, B:50:0x0211, B:88:0x02fc, B:22:0x00f6), top: B:102:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x022c A[Catch: Exception -> 0x007c, CancellationException -> 0x0080, TRY_ENTER, TryCatch #2 {CancellationException -> 0x0080, Exception -> 0x007c, blocks: (B:8:0x0075, B:14:0x0094, B:54:0x0221, B:56:0x022c, B:59:0x0231, B:61:0x023c, B:63:0x0245, B:65:0x0252, B:67:0x025a, B:69:0x0270, B:71:0x027a, B:76:0x028e, B:79:0x029a, B:81:0x02a5, B:85:0x02f7, B:17:0x00ad, B:92:0x032a, B:19:0x00e4, B:36:0x01c0, B:20:0x00eb, B:27:0x0122, B:30:0x0144, B:32:0x014c, B:39:0x01c5, B:41:0x01d0, B:43:0x01da, B:45:0x01e3, B:48:0x01ef, B:50:0x0211, B:88:0x02fc, B:22:0x00f6), top: B:102:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0327  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 905
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.mall.kmm.virtumart.MallCoursePageVM$loadData$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
