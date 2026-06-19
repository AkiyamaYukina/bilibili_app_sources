package com.bilibili.mall.kmm.virtumart;

import ih0.C7577d;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/virtumart/MallCoursePageVM$playItemInfo$1.class */
public final class MallCoursePageVM$playItemInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final C7577d $itemInfo;
    Object L$0;
    Object L$1;
    int label;
    final MallCoursePageVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MallCoursePageVM$playItemInfo$1(MallCoursePageVM mallCoursePageVM, C7577d c7577d, Continuation<? super MallCoursePageVM$playItemInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = mallCoursePageVM;
        this.$itemInfo = c7577d;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MallCoursePageVM$playItemInfo$1(this.this$0, this.$itemInfo, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0215  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 648
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.mall.kmm.virtumart.MallCoursePageVM$playItemInfo$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
