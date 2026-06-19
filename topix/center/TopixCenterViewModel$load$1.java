package com.bilibili.topix.center;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/center/TopixCenterViewModel$load$1.class */
final class TopixCenterViewModel$load$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final boolean $isRefresh;
    int label;
    final E this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopixCenterViewModel$load$1(E e7, boolean z6, Continuation<? super TopixCenterViewModel$load$1> continuation) {
        super(2, continuation);
        this.this$0 = e7;
        this.$isRefresh = z6;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TopixCenterViewModel$load$1(this.this$0, this.$isRefresh, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x01d3 A[Catch: Exception -> 0x0290, TRY_ENTER, TryCatch #0 {Exception -> 0x0290, blocks: (B:6:0x001a, B:29:0x00e7, B:32:0x00fb, B:35:0x010a, B:38:0x011a, B:40:0x012b, B:42:0x0135, B:44:0x0146, B:46:0x015e, B:49:0x016b, B:51:0x017d, B:53:0x0188, B:55:0x019c, B:57:0x01aa, B:59:0x01c2, B:64:0x01dc, B:66:0x01ea, B:68:0x01f1, B:70:0x0237, B:72:0x024c, B:74:0x0261, B:76:0x0285, B:62:0x01d3, B:47:0x0165, B:10:0x002f, B:12:0x004a, B:14:0x0057, B:16:0x0082, B:18:0x0090, B:24:0x00aa, B:22:0x00a2), top: B:86:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 748
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.topix.center.TopixCenterViewModel$load$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
